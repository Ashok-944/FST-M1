package Activity;

public class Activity3 {

	public static void main(String[] args) {
		double ageInSeconds = 1000000000;
        double earthYearSeconds = 31557600.0;

        System.out.printf("On Earth: %.2f years%n", ageInSeconds / earthYearSeconds);
        System.out.printf("On Mercury: %.2f years%n", ageInSeconds / (0.2408467 * earthYearSeconds));
        System.out.printf("On Venus: %.2f years%n", ageInSeconds / (0.61519726 * earthYearSeconds));
        System.out.printf("On Mars: %.2f years%n", ageInSeconds / (1.8808158 * earthYearSeconds));
        System.out.printf("On Jupiter: %.2f years%n", ageInSeconds / (11.862615 * earthYearSeconds));
        System.out.printf("On Saturn: %.2f years%n", ageInSeconds / (29.447498 * earthYearSeconds));
        System.out.printf("On Uranus: %.2f years%n", ageInSeconds / (84.016846 * earthYearSeconds));
        System.out.printf("On Neptune: %.2f years%n", ageInSeconds / (164.79132 * earthYearSeconds));

	}

}
