package templatemethod.barista;

public class Coffee extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Dripping coffe through filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

}
