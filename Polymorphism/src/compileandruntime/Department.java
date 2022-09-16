//$Id$
package compileandruntime;

import java.util.Scanner;

public class Department extends College {

	public void print(String department) {
		System.out.println("Department name is " + department);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = scan.nextLine();
		System.out.println("Enter the address of the college");
		String address = scan.nextLine();
		System.out.println("Enter the id");
		String id = scan.nextLine();

		College cge = new College();
		cge.print(name);

		College dep = new Department();
		dep.print(name);
		College stu = new Student();
		stu.print(id);
		cge.collegeDetails(name, address);
		cge.collegeDetails(name, id, address);

	}
}
