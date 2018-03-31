package iterator.dinercafemerger;

public class MenuTestDrive {

	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenuObj = new PancakeHouseMenu();
		DinerMenu dinerMenuObj = new DinerMenu();
		CafeMenu cafeMenuObj = new CafeMenu();

		Waitress waitress = new Waitress(pancakeHouseMenuObj, dinerMenuObj, cafeMenuObj);
		waitress.printMenu();
	}

}
