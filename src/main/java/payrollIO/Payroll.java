package payrollIO;

import java.util.Scanner;

public class Payroll {
	Scanner sc=new Scanner(System.in);
int salary;
String id,name;
public void readInfo() {
	System.out.println("Enter employee id");
	id=sc.nextLine();
	System.out.println("Enter employee name");
	name=sc.nextLine();
	System.out.println("Enter employee salary");
	salary=sc.nextInt();
}
public void writeInfoToConsole() {
	System.out.println("Enter employee id is "+id);
	System.out.println("Enter employee name is "+name);
	System.out.println("Enter employee id is "+salary);

}
public static void main(String []args) {
	Payroll obj=new Payroll();
	obj.readInfo();
	obj.writeInfoToConsole();
}
}
