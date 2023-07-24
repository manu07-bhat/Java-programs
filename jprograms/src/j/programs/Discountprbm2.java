package j.programs;

import java.util.Scanner;

public class Discountprbm2 {
	
	static float dics(float i, float s, float t, float n)
	{
	
		float irondis = i*7/100;
		float stelldis = s*3/100;
		float tungdis = t*2/100;
		float nickeldis = n*1/100;
		
		float totaldis_per_product = irondis+stelldis+tungdis+nickeldis;
		System.out.println("per_product Discount "+totaldis_per_product);
		
			float total_amt = i+s+t+n;
		
		float whole_dis = 0;
		if(total_amt>25_000 && total_amt<=50_000)
		{
			whole_dis = total_amt *5/100;
			System.out.print("whole_product Discount ");
			return whole_dis;
		}
		else if(total_amt>50_000 && total_amt<=10_00_000)
		{
			whole_dis = total_amt *7/100;
			System.out.print("whole_product Discount ");
			return whole_dis;
		}
		else if(total_amt>10_00_000 )
		{
			whole_dis = total_amt *10/100;
			System.out.print("whole_product Discount ");
			return whole_dis;
		}
		
		System.out.println();
		System.err.println("| RECOMDATION |");
		if(totaldis_per_product == whole_dis)
		{
			System.out.println("Choose any Discount bec both are having same discount");
			return 0;
		}
		else if(totaldis_per_product > whole_dis )
		{
			System.out.print("Take the per_product Discount "+ (totaldis_per_product - whole_dis)+ " Is more discount & discount " );
			return   totaldis_per_product;
		}
		else
		{
			System.out.print("Take the whole_product Discount "+ (whole_dis- totaldis_per_product)+ " Is more discount & discount ");
			return    whole_dis;
		}
		
		
	
		
	}
	
	
	public static void main(String []args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the price of Iron\nSteel\nTungeten\nNickel\n ");
	
	float iron = scan.nextFloat();  //15_000f
	float stell = scan.nextFloat(); //10_000f
	float tung = scan.nextFloat();  //2000f
	float nickel = scan.nextFloat();  //1500f
	dics(iron, stell, tung, nickel);
	
		
	}

}
