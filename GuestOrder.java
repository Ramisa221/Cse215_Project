package application;

import java.util.ArrayList;
import java.util.Scanner;



	public class GuestOrder {
		// TODO Auto-generated constructor stub
		public String IdTable;
		ArrayList<Food>EatList=new ArrayList<Food>();
		public float TotalPayment;
		public String getIdTable() {
			return IdTable;
		}
		public void setIdTable(String idTable) {
			IdTable = idTable;
		}
		
		
		public void setEatList(Food food) {
			EatList. add(food);
		}
		public float getTotalPayment() {
			return TotalPayment;
		}
		public void setTotalPayment(float totalPayment) {
			TotalPayment = totalPayment;
		}
		public void input() {
			Scanner bp=new Scanner (System.in);
			System.out.println("Table number:");
			IdTable =bp.nextLine();
			
		}
		public void Print() {
			System.out.println("-------------------------------------");
			System.out.println("Table Number"+this.IdTable+"Total Payment"+this.TotalPayment);
			for(Food m:this.EatList) {
				System.out.println("Selected Food is:"+m.Name);
				
			}
			System.out.println();
		}
		
		
		
	}
	


