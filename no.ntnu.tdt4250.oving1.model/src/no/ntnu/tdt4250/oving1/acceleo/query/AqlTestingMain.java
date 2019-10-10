package no.ntnu.tdt4250.oving1.acceleo.query;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.acceleo.query.runtime.EvaluationResult;
import org.eclipse.acceleo.query.runtime.IQueryBuilderEngine;
import org.eclipse.acceleo.query.runtime.IQueryBuilderEngine.AstResult;
import org.eclipse.acceleo.query.runtime.IQueryEnvironment;
import org.eclipse.acceleo.query.runtime.IQueryEvaluationEngine;
import org.eclipse.acceleo.query.runtime.Query;
import org.eclipse.acceleo.query.runtime.QueryEvaluation;
import org.eclipse.acceleo.query.runtime.impl.QueryBuilderEngine;
import org.eclipse.emf.ecore.EcorePackage;

public class AqlTestingMain {

	public static void main(String[] args) {
		testAqlWorks();
	}
	
	public static void testAqlWorks() {
		IQueryEnvironment env = Query.newEnvironmentWithDefaultServices(null);
		IQueryEvaluationEngine engine = QueryEvaluation.newEngine(env);

		IQueryBuilderEngine builder = new QueryBuilderEngine(env);
		AstResult astResult = builder.build("self.name");

		Map<String, Object> variables = new HashMap<>();
		variables.put("self", EcorePackage.eINSTANCE);
		EvaluationResult evaluationResult = engine.eval(astResult, variables);

		System.out.println(evaluationResult.getResult());
	}
}
