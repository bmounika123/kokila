package billing;

import java.util.Scanner;

public class supcls {
	String Customer_name;
	String Address;
	int mobile_no;
	public void customer() {
		Scanner s;
		s=new Scanner(System.in);
		System.out.println("ENTER CUSTOMER DETAILS");
		System.out.println("Enter customer name");
		Customer_name=s.next();
		System.out.println("Enter customer Address");
		Address=s.next();
		System.out.println("Enter customer Mobile number");
		mobile_no=s.nextInt();
		System.out.println("********************************************");
		
	}
	public void display1() {
		System.out.println("*******CUSTOMER DETAILS*******");
		System.out.println("Enter customer name:"+Customer_name);
		System.out.println("Enter customer address:"+Address);
		System.out.println("Enter mobile number:"+mobile_no);
		System.out.println("*******************************");
	}

}
