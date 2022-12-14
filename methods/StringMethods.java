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

		return inputString1.length();

	}

	public String lastFiveCharacters(String inputString1, int value) throws UserDefinedException {
		int length1 = lengthOfString(inputString1);
		if (value < length1) {
			int characters = length1 - value;

			return inputString1.substring(characters);
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

	}

	public String concatWithoutSpace(String input) throws UserDefinedException {
		checkString(input);
		return input.replace(" ", "");

	}

	public boolean startWithMethod(String input, String input2) throws UserDefinedException {
		checkString(input);
		return input.startsWith(input2);

	}

	public boolean endsWithMethod(String input, String input2) throws UserDefinedException {
		checkString(input);

		return input.endsWith(input2);

	}

	public boolean ignoreCase(String input, String input2) throws UserDefinedException {
		checkString(input);
		return input.equalsIgnoreCase(input2);

	}

	public boolean equalsMethod(String input, String input2) {
		return input.contentEquals(input2);
	}

	public String reverse(String input) throws UserDefinedException {
		int length = lengthOfString(input);

		String input2 = "";
		for (int i = length - 1; i >= 0; i--) {
			input2 += input.charAt(i);
		}
		return input2;
	}

	public String upperCase(String input) throws UserDefinedException {
		checkString(input);

		return input.toUpperCase();

	}

	public String replace(String inputString1, int numberOfCharacters, String inputString11) throws UserDefinedException {

		return inputString1.replace(firstThreeCharacters(inputString1, numberOfCharacters), inputString11);

	}

	public String trim(String inputString1) throws UserDefinedException {
		checkString(inputString1);
		return inputString1.trim();

	}

	public String[] split(String inputString1) throws UserDefinedException {
		checkString(inputString1);

		return inputString1.split(" ");
	}

	public char[] convertStringToCharArray(String inputString1) {
		int length = inputString1.length();
		char[] arr = new char[length];
		for (int i = 0; i < length; i++) {
			arr[i] = inputString1.charAt(i);
		}
		return arr;
	}

	public String getStringValue() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the inputString");

		return scan.nextLine();
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

		return inputString1.lastIndexOf(ch);
	}

	public String lowerCase(String inputString1) throws UserDefinedException {
		checkString(inputString1);

		return inputString1.toLowerCase();

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
				System.out.println(inputString1);
				try {
					System.out.println("Length of string " + method.lengthOfString(inputString1));
				} catch (UserDefinedException e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
				break;

			case 2:
				inputString1 = method.getStringValue();
				char[] arr = method.convertStringToCharArray(inputString1);

				for (char ch : arr) {
					System.out.println(ch);
				}
				break;

			case 3:
				inputString1 = method.getStringValue();
				System.out.println("Enter the position of character");
				int position = scan.nextInt();
				try {
					System.out.println("The pen ultimate  character: " + method.findPenUltimate(inputString1, position));
				} catch (UserDefinedException e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
				break;

			case 4:
				inputString1 = method.getStringValue();
				System.out.println("Enter the character for number of occurences");
				char ch = scan.next().charAt(0);
				System.out.println("The occurences of letter is " + method.findOccurencesOfLetter(inputString1, ch));
				break;

			case 5:
				inputString1 = method.getStringValue();
				System.out.println("Enter the character to find the greatest position");
				char ch1 = scan.next().charAt(0);
				try {
					System.out.println("The greatest position of character is " + method.findGreatestPosition(inputString1, ch1));
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
					System.out.println("The last five characters of given string is " + method.lastFiveCharacters(inputString1, value1));
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
					System.out.println("The first three characters is " + method.firstThreeCharacters(inputString1, numOfCharacters));
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
					System.out.println("After the characters replaced: " + method.replace(inputString1, numberOfCharacters, inputString11));
				} catch (UserDefinedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 9:
				inputString1 = method.getStringValue();
				inputString11 = method.getStringValue();
				try {
					System.out.println("Starts with : " + method.startWithMethod(inputString1, inputString11));
				} catch (UserDefinedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 10:
				inputString1 = method.getStringValue();
				inputString11 = method.getStringValue();
				try {
					System.out.println("Ends with : " + method.endsWithMethod(inputString1, inputString11));
				} catch (UserDefinedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 11:
				inputString1 = method.getStringValue();
				try {
					System.out.println("The upper case of string: " + method.upperCase(inputString1));
				} catch (UserDefinedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			case 12:
				inputString1 = method.getStringValue();
				try {
					System.out.println("The lower case of string: " + method.lowerCase(inputString1));
				} catch (UserDefinedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			case 13:
				inputString1 = method.getStringValue();
				try {
					System.out.println("The reverse of string: " + method.reverse(inputString1));
				} catch (UserDefinedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			case 14:
				System.out.println("String :" + method.getStringValue());
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

				try {
					System.out.println("After concatenation without space :" + method.concatWithoutSpace(inputString1));
				} catch (UserDefinedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 16:
				inputString1 = method.getStringValue();
				try {
					String[] inputArray = method.split(inputString1);
					for (String input : inputArray) {
						System.out.println(input);
					}
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
					System.out.println("After merging : " + method.mergeWithHyphen(array, inputString1));
				} catch (UserDefinedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 18:
				inputString1 = method.getStringValue();
				inputString11 = method.getStringValue();
				try {
					System.out.println("Ignore case : " + method.ignoreCase(inputString1, inputString11));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 19:
				inputString1 = method.getStringValue();
				inputString11 = method.getStringValue();
				System.out.println("Equals method :" + method.equalsMethod(inputString1, inputString11));
				break;

			case 20:
				inputString1 = method.getStringValue();
				try {
					System.out.println("After trim:" + method.trim(inputString1));
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
