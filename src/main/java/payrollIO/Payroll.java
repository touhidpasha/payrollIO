package payrollIO;

import java.io.File;
import java.io.IOException;
import java.nio.*;
import java.nio.file.*;
import java.util.Scanner;

public class Payroll {
	Scanner sc = new Scanner(System.in);
	int salary;
	String id, name;

	public void readInfo() {
		System.out.println("Enter employee id");
		id = sc.nextLine();
		System.out.println("Enter employee name");
		name = sc.nextLine();
		System.out.println("Enter employee salary");
		salary = sc.nextInt();
	}

	public void writeInfoToConsole() {
		System.out.println("Enter employee id is " + id);
		System.out.println("Enter employee name is " + name);
		System.out.println("Enter employee id is " + salary);

	}
	
	public void fileOperations() {
//		
//		try {
////			Path path=Paths.get("/home/touhidpasha/eclipse-workspace/payrollIO/emplyeedetails");//creating directory
////			Path p;
////			p = Files.createDirectory(path);
////			System.out.println("Directory has been created at "+p.toString());
//	
//		
//			Path path1=Paths.get("/home/touhidpasha/eclipse-workspace/payrollIO/emplyeedetails/data.txt");//creating file in above directory
//            Path p1=Files.createFile(path1);
//            System.out.println("File has been created at "+p1.toString());
//		
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        

        String dirName = "/home/touhidpasha/eclipse-workspace/payrollIO/emplyeedetails";

        try {
        	System.out.println("list of  files are");
			Files.list(new File(dirName).toPath())
			        .forEach(path -> {
			            System.out.println(path);
			        });
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	public static void main(String args[]) {
		Payroll obj = new Payroll();
		//obj.readInfo();
		//obj.writeInfoToConsole();
		obj.fileOperations();
	}
}
