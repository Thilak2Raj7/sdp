//$Id$
package project;

import java.util.Map;
import java.util.Scanner;

public class Runner {
	String key1 = "";
	String value1 = "";

	public Map<Object, Object> addString(Scanner scan, HashMapLogic logic) throws UserException {

		Map<Object, Object> map = logic.createMap();
		System.out.println("Enter the number of pairs");
		int pairs = scan.nextInt();
		for (int i = 0; i < pairs; i++) {
			scan.nextLine();
			System.out.println("Enter the key");
			String key = scan.nextLine();
			System.out.println("Enter the value");
			String value = scan.nextLine();
			logic.checkString(key);
			logic.checkString(value);
			logic.addString(map, key, value);
		}
		return map;
	}

	public void checkKey(Scanner scan, HashMapLogic logic) throws UserException {
		scan.nextLine();
		Map<Object, Object> map1 = addString(scan, logic);
		System.out.println("Enter the key want to check");
		String key = scan.nextLine();

		System.out.println(logic.checkKey(map1, key));

	}

	public void checkValue(Scanner scan, HashMapLogic logic) throws UserException {
		scan.nextLine();
		Map<Object, Object> map1 = addString(scan, logic);
		System.out.println("Enter the value");
		String value = scan.nextLine();

		System.out.println(logic.checkValue(map1, value));

	}

	public Map<Object, Object> getMapDetails(Scanner scan, HashMapLogic logic) throws UserException {
		// scan.nextLine();
		Map<Object, Object> map = addString(scan, logic);
		System.out.println("Enter the key");
		key1 = scan.nextLine();

		System.out.println("Enter the value1");
		value1 = scan.nextLine();
		return map;
	}

	public void replaceValue(Scanner scan, HashMapLogic logic) throws UserException {

		System.out.println(logic.replaceValue(getMapDetails(scan, logic), key1, value1));

	}

	public void replace(Scanner scan, HashMapLogic logic) throws UserException {
		// scan.nextLine();
		System.out.println(logic.replace(getMapDetails(scan, logic), key1, value1));

	}

	public void remove(Scanner scan, HashMapLogic logic) throws UserException {
		System.out.println(logic.remove(addString(scan, logic)));
	}

	public void putIfAbsent(Scanner scan, HashMapLogic logic) throws UserException {
		Map<Object, Object> map1 = getMapDetails(scan, logic);
		System.out.println(logic.putIfAbsent(map1, key1, value1));

	}

	public void getDefaultValue(Scanner scan, HashMapLogic logic) throws UserException {

		Map<Object, Object> map1 = getMapDetails(scan, logic);
		System.out.println(logic.getDefaultValue(map1, key1, value1));

	}

	public void newMap(Scanner scan, HashMapLogic logic) throws UserException {
		Map<Object, Object> map1 = addString(scan, logic);
		System.out.println(logic.newMap(map1));
	}

	public static void main(String[] args) {
		int option = 0;
		HashMapLogic logic = new HashMapLogic();
		Runner run = new Runner();
		Scanner scan = new Scanner(System.in);
		boolean value = true;
		while (value) {
			System.out.println("1.Create HashMap and get Size \n" + "2.String map \n" + "3.Replace value\n" + "4.Replace value if value matches \n" + "5.Check key is present \n" + "6.Check value is present \n" + "7.Clear map \n" + "8.Put if absent " + "9.get or default value \n" + "10.copy map to new map");
			System.out.println("Enter the option to perform");
			try {
				option = scan.nextInt();
			} catch (Exception e) {
				System.out.println("Enter the valid option");

			}
			switch (option) {
			case 1:
				Map<Object, Object> map = logic.createMap();
				System.out.println(map);
				System.out.println(logic.getSize(map));
				break;
			case 2:
				try {
					System.out.println(run.addString(scan, logic));
				} catch (UserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 3:
				try {
					run.replace(scan, logic);
				} catch (UserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				try {
					run.replaceValue(scan, logic);
				} catch (UserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 5:
				try {
					run.checkKey(scan, logic);
				} catch (UserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 6:
				try {
					run.checkValue(scan, logic);
				} catch (UserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 7:
				try {
					run.remove(scan, logic);
				} catch (UserException e) {

					e.printStackTrace();
				}
				break;
			case 8:
				try {
					run.putIfAbsent(scan, logic);
				} catch (UserException e) {

					e.printStackTrace();

				}
				break;
			case 9:
				try {
					run.getDefaultValue(scan, logic);
				} catch (UserException e) {

					e.printStackTrace();
				}
				break;
			case 10:
				try {
					run.newMap(scan, logic);
				} catch (UserException e) {

					e.printStackTrace();
				}
				break;
			default:
				value = false;
				System.out.println("Invalid option");
			}
		}

	}
}
