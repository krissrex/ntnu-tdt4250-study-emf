package no.ntnu.tdt4250.oving3.generator.html.services;

import java.util.Random;

public class CssService {

	private final Random random = new Random();
	
	public String createRandomCssRgb() {
		int red, green, blue = 0;
		red = random.nextInt(256);
		green = random.nextInt(256);
		blue = random.nextInt(256);
		return String.format("rgb(%s, %s, %s)", red, green, blue);
	}
}
