package javademos.abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
		womenGameCalculator.hesapla();
		womenGameCalculator.gameOver();
		
		GameCalculator gameCalculators = new WomenGameCalculator();

	}

}
