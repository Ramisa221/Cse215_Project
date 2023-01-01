package application;

import java.util.ArrayList;
import java.util.Scanner;

import javafx.scene.control.Spinner;
import java.util.Scanner;
public class ManageFood {
	ArrayList<Food>FoodList=new ArrayList<>();
	ArrayList<GuestOrder>guestsorder=new ArrayList<>();
	Food Food;
	public GuestOrder GuestOrder;
	public int SelectFood;
	public ManageFood() {
		
	}
	Scanner bp=new Scanner(System.in);
	public void pd() {
		System.out.println("Enter food number to add in menu:");
		int n=Integer.parseInt(bp.nextLine());
		for(int i=0;i<n;i++) {
			Food food=new Food();
			food.input();
			FoodList.add(food);
		}
		
	}
	public void Print() {
		for(int i=0;i<FoodList.size();i++) {
			System.out.println((i+1)+"."+FoodList.get(i).detail());
		}
		
	}
	public void Price() {
		
		float PriceFood=0;
		float TotalPayment=0;
		int number;
		GuestOrder guest=new GuestOrder();
		guest.input();
		guestsorder.add(guest);
		for(int i=0;i<=10;i++) {
		System.out.println("Select Food:"+(i+1));
		SelectFood=bp.nextInt();
		if(SelectFood==0) {
			guest.setTotalPayment(TotalPayment);
			System.out.println("Total Payment:");
			System.out.println(TotalPayment);
			System.out.println("Thank You");
			
		}else {
			System.out.println("Enter number:");
			number=bp.nextInt();
			Food food =FoodList.get(SelectFood-1);
			guest.setEatList(food);
			PriceFood=food.Price*number;
		     }
		TotalPayment+=PriceFood;
		System.out.println("Order finish:");
		System.out.println("Payment"+(i+1)+"is");
		System.out.println(" "+PriceFood);
		System.out.println("Finish Order enter o");
		
		
		}
		
		}
	public void PrintOrder() {
		for(int i=0;i<guestsorder.size();i++) {
			guestsorder.get(i).Print();
		}
		}
	
	public void search() {
		Scanner bp=new Scanner (System.in);
		String idtable;
		int up=0;
		System.out.println(" Enter Table number payment:");
		idtable =bp.nextLine();
		for(int i=0;i<guestsorder.size();i++) {
			if(guestsorder.get(i).getIdTable().equalsIgnoreCase(idtable)) {
			guestsorder.get(i).Print();
			up++;
			}
		}
		if(up==0) {
			System.out.println("No table number "+idtable);
		}
		}
	public String editName() {
		System.out.println("Enter edit name:");
		return bp.nextLine();
	}
	
	public float editPrice() {
		System.out.println("Enter edit price:");
		return bp.nextFloat();
	}
	
		public void EditFood() {
			String foodname;
			int up=0;
			System.out.println("Enter food name to fix:");
			foodname =bp.nextLine();
			for(int i=0;i<FoodList.size();i++) {
				if(FoodList.get(i).getName().equals(foodname)) {
					up++;
					FoodList.get(i).setName(editName());
					FoodList.get(i).setPrice(editPrice());
					break;
				}
				if(up==0) {
					System.out.println("no food name is "+foodname);
				}
			}
			
			
		}
		
		public void DeleatFood() {
			String deleatfood;
			int up=0;
			
			System.out.println("Enter food name to deleat:");
			deleatfood =bp.nextLine();
			for(int i=0;i<FoodList.size();i++) {
				if(FoodList.get(i).getName().equals(deleatfood)) {
					up++;
					FoodList.remove(i);
					System.out.println("Remove Finish");
					break;
				}
				if(up==0) {
					System.out.println("no food name is "+deleatfood);
				}
			}
			
			
		}
		
}




	
			
			
			
			
			
			
		
		

		
		
		
		
	
	
	

