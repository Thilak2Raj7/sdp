//$Id$
package project;

import java.util.Map;
import java.util.Scanner;

public class Runner {
	String key1 = "";
	String value1 = "";
	static Scanner scan = new Scanner(System.in);
	static HashMapLogic logic = new HashMapLogic();

	public Map<Object, Object> addString() throws UserException {

		System.out.println("Enter the number of pairs");
		try {

			int pairs = scan.nextInt();
			for (int i = 0; i < pairs; i++) {
				scan.nextLine();
				System.out.println("Enter the key");
				String key = scan.nextLine();
				System.out.println("Enter the value");
				String value = scan.nextLine();
				logic.checkString(key);
				logic.checkString(value);
				logic.addString(key, value);
			}
		} catch (UserException e) {
			throw new UserException("Input mismatch found!");
		}
		return logic.map;
	}

	public void checkKey() throws UserException {
		scan.nextLine();

		System.out.println("Enter the key want to check");
		String key = scan.nextLine();

		System.out.println(logic.checkKey(key));

	}

	public void checkValue() throws UserException {
		scan.nextLine();

		System.out.println("Enter the value");
		String value = scan.nextLine();

		System.out.println(logic.checkValue(value));

	}

	public Map<Object, Object> getMapDetails() throws UserException {
		scan.nextLine();

		System.out.println("Enter the key");
		key1 = scan.nextLine();

		System.out.println("Enter the value1");
		value1 = scan.nextLine();
		return logic.map;
	}

	public void replaceValue() throws UserException {
		getMapDetails();
		System.out.println(logic.replaceValue(key1, value1));

	}

	public void replace() throws UserException {
		// scan.nextLine();
		getMapDetails();
		System.out.println(logic.replace(key1, value1));

	}

	public void remove() throws UserException {
		System.out.println(logic.remove());
	}

	public void putIfAbsent() throws UserException {
		getMapDetails();
		System.out.println(logic.putIfAbsent(key1, value1));

	}

	public void getDefaultValue() throws UserException {
		getMapDetails();
		System.out.println(logic.getDefaultValue(key1, value1));

	}

	public void newMap() throws UserException {

		System.out.println(logic.newMap());
	}

	public static void main(String[] args) {
		int option = 0;

		Runner run = new Runner();

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
				Map<Object, Object> map1 = logic.map;
				System.out.println(logic.getSize(map1));
				break;
			case 2:
				try {
					System.out.println(run.addString());
				} catch (UserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 3:
				try {
					run.replace();
				} catch (UserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				try {
					run.replaceValue();
				} catch (UserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 5:
				try {
					run.checkKey();
				} catch (UserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 6:
				try {
					run.checkValue();
				} catch (UserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 7:
				try {
					run.remove();
				} catch (UserException e) {

					e.printStackTrace();
				}
				break;
			case 8:
				try {
					run.putIfAbsent();
				} catch (UserException e) {

					e.printStackTrace();

				}
				break;
			case 9:
				try {
					run.getDefaultValue();
				} catch (UserException e) {

					e.printStackTrace();
				}
				break;
			case 10:
				try {
					run.newMap();
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
