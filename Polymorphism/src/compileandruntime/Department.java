//$Id$
package compileandruntime;

import java.util.Scanner;

public class Department extends College {

	public void departmentName(String department) {
		System.out.println("Department name  " + department);
	}

	public void print(String department) {
		System.out.println("Department name is " + department);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = scan.nextLine();
		System.out.println("Enter the address of the college");
		String address = scan.nextLine();
		System.out.println("Enter the  student id");
		String id = scan.nextLine();
		System.out.println("Enter the department name");
		String departmentName = scan.nextLine();
		College stu = new Student();
		stu.print(id);

	}
}
