package CIE;
import java.util.Scanner;
public class Student{
	protected String usn=new String();
	protected String name=new String();
	protected int sem;
	public void inputStudentDetails(){
		System.out.println("Enter Details of students:");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter USN:");
		usn=s.nextLine();
		System.out.println("Enter Name:");
		name=s.nextLine();
		System.out.println("Enter Semester:");
		sem=s.nextInt();
	}
	public void displayStudentDetails(){
		System.out.println("USN: "+usn);
		System.out.println("Name: "+name);
		System.out.println("Semester: "+sem);
	}
}