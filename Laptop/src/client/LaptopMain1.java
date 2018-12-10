package client;

import java.util.Scanner;

import entity.Customer;
import entity.Laptop;
import validation.CustomerValidation;

public class LaptopMain1 {

	public static void main(String[] args)
	{
		
		Laptop lp=new Laptop();
		Customer cust=new Customer();
		Scanner sc=new Scanner(System.in);
		CustomerValidation cv=new CustomerValidation();
		
		System.out.println("Enter customer name:");
		String custName=sc.nextLine();
		String cn=cv.validateCustName();
	
		
		
		
	}
}
