package j.programs;

import java.util.Scanner;

public class Discountcal {
	
	

	public static void main(String[] args) {
		// Discount Calculator
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the price of Iron\nSteel\nTungeten\nNickel\n ");
		float iron = scan.nextFloat();  //15_000f
		float stell = scan.nextFloat(); //10_000f
		float tung = scan.nextFloat();  //2000f
		float nickel = scan.nextFloat();  //1500f
		
		
		float irondis = iron*7/100;
		float stelldis = stell*3/100;
		float tungdis = tung*2/100;
		float nickeldis = nickel*1/100;
		
		double totaldis_per_product = irondis+stelldis+tungdis+nickeldis;
		System.out.println("per_product Discount "+totaldis_per_product);
		
		
		double total_amt = iron+stell+tung+nickel;
		
		double whole_dis = 0;
		if(total_amt>25_000 && total_amt<=50_000)
		{
			whole_dis = total_amt *5/100;
			System.out.println("whole_product Discount "+whole_dis);
		}
		else if(total_amt>50_000 && total_amt<=10_00_000)
		{
			whole_dis = total_amt *7/100;
			System.out.println("whole_product Discount "+whole_dis);
		}
		else if(total_amt>10_00_000 )
		{
			whole_dis = total_amt *10/100;
			System.out.println("whole_product Discount "+whole_dis);
		}
		
		System.out.println();
		System.err.println("| RECOMDATION |");
		if(totaldis_per_product == whole_dis)
		{
			System.out.println("Choose any Discount bec both are having same discount");
		}
		else if(totaldis_per_product > whole_dis )
		{
			System.out.println("Take the per_product Discount "+ (totaldis_per_product - whole_dis)+ " Is more discount & discount " +  totaldis_per_product);
		}
		else
		{
			System.out.println("Take the whole_product Discount "+ (whole_dis- totaldis_per_product)+ " Is more discount & discount " +  whole_dis);

		}
		
			
	}

}
