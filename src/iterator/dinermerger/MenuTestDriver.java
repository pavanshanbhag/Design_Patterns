package iterator.dinermerger;

public class MenuTestDriver {

	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenuObj = new PancakeHouseMenu();
		DinerMenu dinerMenuObj = new DinerMenu();

		Waitress waitress = new Waitress(pancakeHouseMenuObj, dinerMenuObj);
		waitress.printMenu();

	}

}
