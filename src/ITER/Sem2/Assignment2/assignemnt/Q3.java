package ITER.Sem2.Assignment2.assignemnt;

import java.util.Scanner;

class product{
	int prodId;
	int price;
	int quantity;
	
	static int totalPrice = 0;
	
	product(int prodid, int price, int quantity){
		this.prodId = prodid;
		this.price = price;
		this.quantity = quantity;
		totalPrice += price * quantity;
	}
	
	public void display() {
		System.out.println("product ID: " + prodId + "  Price: " + price + "  quantity: " +quantity);
	}
}
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		product[] pra = new product[5];

		for (int i = 0; i<5; i++){
			int proid = sc.nextInt();
			int price = sc.nextInt();
			int quantity = sc.nextInt();

			pra[i] = new product(proid, price, quantity);
		}

		for (int i = 0; i < 5; i++) {
			pra[i].display();
		}
		
		System.out.println(" \n\ntotal price of all items is " + (product.totalPrice));

	}

}
