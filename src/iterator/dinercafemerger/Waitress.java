package iterator.dinercafemerger;

import java.util.Iterator;

public class Waitress {

	Menu pancakeHouseMenu;
	Menu dinerMenu;
	Menu cafeMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenuObj, Menu dinerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenuObj;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}

	public void printMenu() {
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
		Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();

		System.out.println("Menu\n ---- \n BREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);
		System.out.println("\nDinner");
		printMenu(cafeIterator);
	}

	public void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getName() + ", ");
			System.out.println(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
