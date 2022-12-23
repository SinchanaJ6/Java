package com.student;

import java.util.Scanner;

public class MainStudent {
  public static void main(String[] args) {
	  System.out.println("prathibha v g");
	  Scanner sc=new Scanner(System.in);
	  Studentmgtimpl s=new Studentmgtimpl();
	while(true)
	{
		
		System.out.println("enter your choice");
		int i=sc.nextInt();
		switch(i) {
		case 1:
			s.addStudent();
			break;
		case 2:
			String id=sc.next();
			s.displayStudent(id);
			break;
		case 3:
			s.dispalyallStudent();
			break;
		case 4:
			String id1=sc.next();
			s.removeStudent(id1);
			break;
		case 5:
			s.removeallStudent();
			break;
		case 6:
			s.updateStudent();
			break;
		case 7:
			s.sortStudent();
			break;
		default :
			System.out.println("invalid choice");
		}
	}
}
  
}
