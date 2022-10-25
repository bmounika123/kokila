package billing;

import java.util.Scanner;

public class sub extends supcls implements interfacekids,interfacemen,interfacewomen{
	int order_id;
	String order_name;
	int Quantity;
	int order_price;
	int total_price;
	public void category() {
		System.out.println("********************************");
		System.out.println("select 1 for kids");
		System.out.println("select 2 for men");
		System.out.println("select 3 for women ");
		Scanner s;
		s=new Scanner(System.in);
		int i;
		i=s.nextInt();
		switch (i){
		case 1:
			System.out.println("kids");
			break;
		case 2:
			System.out.println("men");
			break;
		case 3:
			System.out.println("women");
			break;
		}
		
	}
	public void Selection() {
		System.out.println("****choose costume style*****");
		System.out.println("select1 for traditional wear");
		System.out.println("select2 for western wear");
		System.out.println("select3 for party wear");
		System.out.println("select4 for daily wear");
		Scanner s;
		s= new Scanner(System.in);
		int i;
		i=s.nextInt();
		switch (i){
		case 1:
			System.out.println("traditional wear");
			break;
		case 2:
			System.out.println("western wear");
			break;
		case 3:
			System.out.println("party wear");
			break;
		case 4:
			System.out.println("daily wear");
			break;

		}
			
		}
	public void Order() {
		System.out.println("***************************");
		System.out.println("Enter order details");
		Scanner s;
		s=new Scanner(System.in);
		System.out.println("enter order id");
		order_id=s.nextInt();
		System.out.println("enter order name");
		order_name=s.next();
		System.out.println("enter order quantity");
		Quantity=s.nextInt();
		System.out.println("enter order price");
		order_price=s.nextInt();
		
		
	}
	public void display() {
		System.out.println("***********************************");
		System.out.println("*******ORDER DETAILS***************");
		System.out.println("                                ");
		System.out.println("order id:"+order_id);
		System.out.println("order name:"+order_name);
		System.out.println("order Quantity:"+Quantity);
		System.out.println("order price:"+order_price);
		total_price=Quantity*order_price;
		System.out.println("total price:"+total_price);
		System.out.println("                                          ");
		System.out.println("*********VISIT AGAIN****************");
		


}
}
