package application;

import java.util.ArrayList;
import java.util.Scanner;


public class Test{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Food>FoodList=new ArrayList<>();
		ManageFood managefood=new ManageFood();
		int select;
		Scanner bp=new Scanner(System.in);
		do {
			Menumain();
			select=Integer.parseInt(bp.nextLine());
			switch(select) {
			case 1:
				do {
					MenuManageFood();
					select=Integer.parseInt(bp.nextLine());
					switch(select) {
					case 1:
						managefood.pd();
						
						break;
					case 2:
						managefood.Print();
						managefood.EditFood();
						break;
					case 3:
						managefood.Print();
						managefood.DeleatFood();
						break;
					case 4:
						managefood.PrintOrder();
						
						break;
					case 5:
						managefood.search();
						
						break;
					case 0:
						System.out.println("back");
						break;
					
				
				default:
					break;
				
			}
		}while(select!=3);
		break;
		case 2:
			do {
				MenuOrder();
				select=Integer.parseInt(bp.nextLine());
				switch(select) {
				case 1:
					managefood.Print();
					managefood.Price();
					break;
				case 0:
					System.out.println("back");
					break;
				default:
					break;
				}
			}while(select!=0);
			break;
					default:
						break;
				}
				}while (select!=3);
			}
					
				
			
			
	
	static void MenuManageFood() {
		System.out.println("---------MENU MANAGEFOOD----------");
		System.out.println("o.Back to manu main");
		System.out.println("1.Add Food ");
		System.out.println("2.Edit Food");
		System.out.println("3.Deleat Food");
		System.out.println("4.Print info table order");
		System.out.println("5.Payment");
		
	}
	
	static void MenuOrder() {
		System.out.println("---------MENU ORDER----------");
		System.out.println("o.Back to manu main");
		System.out.println("1.Print manu and Order ");
		System.out.println("------------------");
		System.out.println("Select");
	}
	static void Menumain() {
		System.out.println("---------MENU----------");
		System.out.println("1.Manage Food ");
		System.out.println("2.Manage Order ");
		System.out.println("3.exict");
	}
	
}   