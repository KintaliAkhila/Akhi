package entity;

import java.util.Scanner;

public class Laptop {
	
  public static String laptopModelName;
  public static int laptopModelNo;
  public static int laptopPrice;
  public static void main(String[] args)  {
		
		Scanner sc=new Scanner(System.in);
		
	     System.out.println("Enter Model Name");
	      laptopModelName=sc.nextLine();
	     
	     System.out.println("enter Model Number");
	      laptopModelNo=sc.nextInt();
	     
	     System.out.println("Enter Price");
	     laptopPrice=sc.nextInt();
  }
   public int getLaptopModelNo() 
   {
	return laptopModelNo;
   }
  public void setLaptopModelNo(int laptopModelNo) 
  {
	  this.laptopModelNo = laptopModelNo;
  }

  public String getLaptopModelName()
  {
	  return laptopModelName;
  }
  public void setLaptopModelName(String laptopModelName) 
  {
	  this.laptopModelName = laptopModelName;
  }
  public int getLaptopPrice()
  {
	  return laptopPrice;
  }
  public void setLaptopPrice(int laptopPrice) 
  {
	  this.laptopPrice = laptopPrice;
  }
  

}
