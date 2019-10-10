# Exercise 1 - NTNU studies

This ECore model will model NTNU studies for 
[MTDT](https://www.ntnu.no/studier/mtdt/oppbygning#year=2016&programmeCode=MTDT),
[MIDT](https://www.ntnu.no/studier/midt/oppbygning#year=2018&programmeCode=MIDT&dir=MIDTPRU-18),
[MSIT](https://www.ntnu.no/studier/msit/oppbygning#year=2019&programmeCode=MSIT&dir=MSIT-SWE-19).

Open the project in _'Eclipse for DSL Developers'_ with some extra EMF plugins.

The documentation/tutorial for Object Constraint Language (OCL) are found at https://help.eclipse.org/2019-06/index.jsp  
For the OclInEcore plugin: https://wiki.eclipse.org/OCL/OCLinEcore#Registration  
Some helpful stuff at [https://wiki.eclipse.org/EMF/FAQ#I_want_to_use_EMF.2C_SDO.2C_or_XSD_in_my_standalone_project.2C_or_include_only_a_working_subset_of_the_code._What_libraries_.28jar_files.29_do_I_need_in_my_CLASSPATH.3F](eclipse wiki).  
Acceleo AQL documentation: https://www.eclipse.org/acceleo/documentation/


![uml of ecore](docs/studies.ecore.png)


## Acceleo query language for validation, derivation and operation delegates

To initialize Acceleo, this is put into the generated `StudiesPackageImpl`:

```java
    static {
        initAcceleo();
    }

    /**
     * Initializes Acceleo for use in validations and derivations defined with ecore
     * annotations and AQL.
     */
    public static void initAcceleo() {
        System.out.println("Registering Acceleo AQL delegates.");

        // Validation
        ValidationDelegate.Registry.INSTANCE.put(AstPackage.eNS_URI, new AQLValidationDelegate()); // NS_URI is the uri
                                                                                                   // set in the
                                                                                                   // annotation

        // Derived features
        EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(AstPackage.eNS_URI,
                new AQLSettingDelegateFactory());
        SettingDelegate.Factory.Registry.INSTANCE.put(AstPackage.eNS_URI, new AQLSettingDelegateFactory());
        // Operations
        EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(AstPackage.eNS_URI,
                new AQLInvocationDelegateFactory());
        // Queries
        QueryDelegate.Factory.Registry.INSTANCE.put(AstPackage.eNS_URI, new AQLQueryDelegateFactory());
    }
```

It has to run early, before package registration it seems. This all seems so horribly undocumented.
(The only documentation you get is this: [Not acceleo](https://help.eclipse.org/kepler/index.jsp?topic=%2Forg.eclipse.ocl.doc%2Fhelp%2FDelegates.html),
[some old bug that was closed without solution](https://bugs.eclipse.org/bugs/show_bug.cgi?id=420208),
[old thread referring to the bug](https://www.eclipse.org/forums/index.php/t/561711/) ).

Oh and Ecore Enums have a `.name` property that only works in the ecore editor when doing AQL, not in the actual AQL evaluation in standalone java.
The error is a missing service for `aqlFeatureAccess(no.tdt...YourEnum, java.lang.String)` for the `self.name` on the enum...

### Where is the documentation?

The only time `AQLValidationDelegate` is mentioned on the internet is 
a unit test and [this course's commit log](https://gitlab.stud.idi.ntnu.no/TDT4250/examples/commit/adae5cd1d649f85712e9d07f67177eec802ebc43)
No seriously, you get 5 google results.

Thankfully the `AQLValidationDelegate` is super helpfull:

```
/**
 * A validation delegate supporting AQL.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
```

Great! Now you are good to go.

Jokes aside, the only source on the entire internet for how to register this, is
a unit test: https://git.eclipse.org/c/acceleo/org.eclipse.acceleo.git/tree/query/tests/org.eclipse.acceleo.query.ide.tests/src/org/eclipse/acceleo/query/ide/tests/delegates/DelegatesRegistrationTests.java
.  
Thank god someone bothered to write tests.

#### Registration Timing

The timing of when to register delegates is only documented by the bugzilla report.
Some articles come *close* to explaining the registry, like [oclInEcore](https://wiki.eclipse.org/OCL/OCLinEcore#Standalone),
but again is missing the timing.

Do it early.
This is too late:

```java
public void testGetInstanceName() {
        StudiesPackageImpl.initAcceleo();
```

It will give a nullpointer, because somewhere during initialization, 
your Ecore model decided to use a delegate, which causes a null pointer exception.

This is fine:

```java
	/**
	 * @generated NOT
     */
    @Override
    protected void setUp() throws Exception {
        StudiesPackageImpl.initAcceleo();
        setFixture(StudiesFactory.eINSTANCE.createCourseInstance());
    }
```

So just do it early, like in the package impl, as shown at the top of this readme.



