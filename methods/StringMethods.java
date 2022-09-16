package methods;
//$Id$

import java.util.Scanner;

import exception.UserDefinedException;

public class StringMethods {
	public void checkString(String inputString1) throws UserDefinedException {
		if (inputString1.isEmpty() || inputString1 == null) {
			throw new UserDefinedException("String should not be null or empty");
		}

	}

	public int lengthOfString(String inputString1) throws UserDefinedException {
		checkString(inputString1);
		int length = inputString1.length();
		return length;

	}

	public String lastFiveCharacters(String inputString1, int value) throws UserDefinedException {
		int length1 = lengthOfString(inputString1);
		if (value < length1) {
			int characters = length1 - value;

			String inputString11 = inputString1.substring(characters);
			return inputString11;
		} else {
			throw new UserDefinedException("The value is greater than length of inputString1ing");
		}
	}

	public String firstThreeCharacters(String inputString1, int numOfCharacters) throws UserDefinedException {
		int length = lengthOfString(inputString1);
		if (numOfCharacters < 0 && numOfCharacters > length) {
			throw new UserDefinedException("Number of characters should not less than zero and greater than length of inputString1ing");
		}
		return inputString1.substring(0, numOfCharacters);

		// return inputString11;
	}

	public void concatWithoutSpace(String input) throws UserDefinedException {
		checkString(input);
		System.out.println(input.replace(" ", ""));

	}

	public void startWithMethod(String input, String s2) throws UserDefinedException {
		checkString(input);
		System.out.println(input.startsWith(s2));

	}

	public void endsWithMethod(String input, String s2) throws UserDefinedException {
		checkString(input);

		System.out.println(input.endsWith(s2));

	}

	public void ignoreCase(String input, String s2) throws UserDefinedException {
		checkString(input);
		System.out.println(input.equalsIgnoreCase(s2));

	}

	public void equalsMethod(String input, String s2) {
		if (input.equals(s2)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	public String reverse(String input) throws UserDefinedException {
		int length = lengthOfString(input);

		String s2 = "";
		for (int i = length - 1; i >= 0; i--) {
			s2 += input.charAt(i);
		}
		return s2;
	}

	public String upperCase(String input) throws UserDefinedException {
		checkString(input);
		String inputString1 = input.toUpperCase();
		return inputString1;

	}

	public String replace(String inputString1, int numberOfCharacters, String inputString11) throws UserDefinedException {
		String inputString12 = firstThreeCharacters(inputString1, numberOfCharacters);

		String inputString13 = inputString1.replace(inputString12, inputString11);
		return inputString13;

	}

	public void trim(String inputString1) throws UserDefinedException {
		checkString(inputString1);
		System.out.println(inputString1.trim());

	}

	public void split(String inputString1) throws UserDefinedException {
		checkString(inputString1);
		String[] array = inputString1.split(" ");
		for (String input : array) {
			System.out.println(input);
		}
	}

	public void convertStringToCharArray(String inputString1) {
		int length = inputString1.length();
		char[] arr = new char[length];
		for (int i = 0; i < length; i++) {
			arr[i] = inputString1.charAt(i);
		}
		for (int i = 0; i < length; i++) {
			System.out.println(arr[i]);
		}
	}

	public String getStringValue() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the inputString");
		String inputString1 = scan.nextLine();
		return inputString1;
	}

	public char findPenUltimate(String inputString1, int position) throws UserDefinedException {
		int length = lengthOfString(inputString1);
		if (position <= length && position > 0) {
			char ch = inputString1.charAt(position - 1);
			return ch;

		} else {
			throw new UserDefinedException("Position should be less than length of the string");
		}
	}

	public int findOccurencesOfLetter(String inputString1, char ch) {
		int countOfCharacter = 0;
		for (int i = 0; i < inputString1.length(); i++) {
			if (inputString1.charAt(i) == ch) {
				countOfCharacter++;
			}
		}
		return countOfCharacter;
	}

	public int findGreatestPosition(String inputString1, char ch) throws UserDefinedException {
		checkString(inputString1);
		int position = inputString1.lastIndexOf(ch);
		return position;
	}

	public String lowerCase(String inputString1) throws UserDefinedException {
		checkString(inputString1);
		String inputString11 = inputString1.toLowerCase();
		return inputString11;

	}

	public String mergeWithHyphen(String[] array, String symbol) throws UserDefinedException {
		int length = array.length;
		String inputString11 = "";
		for (int i = 0; i < length - 1; i++) {
			checkString(array[i]);
			inputString11 += array[i] + symbol;
		}
		inputString11 += array[length - 1];
		return inputString11;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		String inputString1 = "";

		StringMethods method = new StringMethods();
		boolean value = true;
		System.out.println("1.Length of inputString \n " + "2.Convert inputString to character array \n" + "3.Find the Pen ultimate character \n" + "4.Find the occurenece of character\n" + "5.Find the greatest position of character\n" + "6.Print the last 5 character\n" + "7.Print the first 3 characxter\n" + "8.Replace the first 3 character\n" + "9.String starts with\n" + "10.String ends with\n" + "11.Convert into lower case\n" + "12.Convert into upper case\n" + "13.Reverse a inputString\n" + "14.Accept a multiple inputString\n" + "15.Accept a multiple inputString and concatenate without space\n" + "16.Convert inputString1ing into inputStringarray\n" + "17.Convert Multiple inputString as single inputString\n" + "18.Ignore case \n" + "19.Equals \n" + "20.Trim\n");

		while (value) {
			try {
				System.out.println("Enter the option to perform operation");
				num = scan.nextInt();
			} catch (Exception e) {
				System.out.println("Number is not valid");
			}
			switch (num) {
			case 1:
				inputString1 = method.getStringValue();
				try {
					System.out.println(method.lengthOfString(inputString1));
				} catch (UserDefinedException e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
				break;

			case 2:
				inputString1 = method.getStringValue();
				method.convertStringToCharArray(inputString1);
				break;

			case 3:
				inputString1 = method.getStringValue();
				System.out.println("Enter the position of character");
				int position = scan.nextInt();
				try {
					System.out.println(method.findPenUltimate(inputString1, position));
				} catch (UserDefinedException e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
				break;

			case 4:
				inputString1 = method.getStringValue();
				System.out.println("Enter the character for number of occurences");
				char ch = scan.next().charAt(0);
				System.out.println(method.findOccurencesOfLetter(inputString1, ch));
				break;

			case 5:
				inputString1 = method.getStringValue();
				System.out.println("Enter the character to find the greatest position");
				char ch1 = scan.next().charAt(0);
				try {
					System.out.println(method.findGreatestPosition(inputString1, ch1));
				} catch (UserDefinedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;

			case 6:
				inputString1 = method.getStringValue();
				System.out.println("Enter the value");
				int value1 = scan.nextInt();
				try {
					System.out.println(method.lastFiveCharacters(inputString1, value1));
				} catch (UserDefinedException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				break;
			case 7:
				inputString1 = method.getStringValue();
				System.out.println("Enter the number of characters");
				int numOfCharacters = scan.nextInt();
				try {
					System.out.println(method.firstThreeCharacters(inputString1, numOfCharacters));
				} catch (UserDefinedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 8:
				inputString1 = method.getStringValue();
				String inputString11 = method.getStringValue();
				System.out.println("Enter the number of characters");
				int numberOfCharacters = scan.nextInt();
				try {
					System.out.println(method.replace(inputString1, numberOfCharacters, inputString11));
				} catch (UserDefinedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 9:
				inputString1 = method.getStringValue();
				inputString11 = method.getStringValue();
				try {
					method.startWithMethod(inputString1, inputString11);
				} catch (UserDefinedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 10:
				inputString1 = method.getStringValue();
				inputString11 = method.getStringValue();
				try {
					method.endsWithMethod(inputString1, inputString11);
				} catch (UserDefinedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 11:
				inputString1 = method.getStringValue();
				try {
					System.out.println(method.upperCase(inputString1));
				} catch (UserDefinedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			case 12:
				inputString1 = method.getStringValue();
				try {
					System.out.println(method.lowerCase(inputString1));
				} catch (UserDefinedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			case 13:
				inputString1 = method.getStringValue();
				try {
					System.out.println(method.reverse(inputString1));
				} catch (UserDefinedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			case 14:
				inputString1 = method.getStringValue();
				try {
					method.checkString(inputString1);
				} catch (UserDefinedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println(inputString1);

				break;

			case 15:
				inputString1 = method.getStringValue();
				System.out.println("Enter the inputString1ing");
				String inputString12 = scan.nextLine();
				try {
					method.concatWithoutSpace(inputString1);
				} catch (UserDefinedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 16:
				inputString1 = method.getStringValue();
				try {
					method.split(inputString1);
				} catch (UserDefinedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 17:
				System.out.println("Enter the length of array");
				int length = scan.nextInt();
				String[] array = new String[length];
				for (int i = 0; i < length; i++) {
					array[i] = method.getStringValue();
				}
				inputString1 = method.getStringValue();
				try {
					System.out.println(method.mergeWithHyphen(array, inputString1));
				} catch (UserDefinedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 18:
				inputString1 = method.getStringValue();
				inputString11 = method.getStringValue();
				try {
					method.ignoreCase(inputString1, inputString11);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 19:
				inputString1 = method.getStringValue();
				inputString11 = method.getStringValue();
				method.equalsMethod(inputString1, inputString11);
				break;

			case 20:
				inputString1 = method.getStringValue();
				try {
					method.trim(inputString1);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("Entered value is invalid");
				value = false;
			}
		}
	}

}
