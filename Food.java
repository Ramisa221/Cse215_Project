package application;

import java.util.Scanner;

public class Food {

	
		public String Name;
		public float Price;
		public Food(String Name,float Price) {
			// TODO Auto-generated constructor stub
			this.Name = Name;
			this.Price = Price;
		}
		public Food() {
			
		}
		public void input() {
			Scanner bp=new Scanner (System.in);
			System.out.println("Enter food name:");
			Name=bp.nextLine();
			System.out.println("Enter price of food:");
			Price=bp.nextFloat();
		}
		public void Payment() {
			System.out.println("Price:"+Price);
		}
		public String detail() {
			return Name+"   "+Price;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public float getPrice() {
			return Price;
		}
		public void setPrice(float price) {
			Price = price;
		}

	}


