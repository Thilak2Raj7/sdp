//$Id$
package compileandruntime;

public class Student extends Department {
	public void print(String id) {

		super.collegeName();
		super.collegeDetails();
		super.departmentName("Visual Communication");
		System.out.println("Student Id name is " + id);
	}
}
