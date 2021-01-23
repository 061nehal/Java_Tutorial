package JavaProgram;

import java.text.NumberFormat;
import java.util.Scanner;

public class WaterBill {

	public static void main(String[] args) {
		
		int customerID;
		int lastMeterReading;
		int newMeterReading;
		
		double waterRate=0;
		final double serviceCharge=8;
		double superSavingPlanCharge=6;
		final double taxRate=0.06;
		double discountRate=0.20;
		boolean superPlan=true;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter Customer ID : ");
		customerID=scan.nextInt();
		System.out.println("Please Enter Last Meter reading:  ");
		lastMeterReading=scan.nextInt();
		System.out.println("Please Enter New Meter Reading  ");
		newMeterReading=scan.nextInt();
		
		int waterUnit=newMeterReading-lastMeterReading;
		if(waterUnit<200) {
		waterRate=0.08;
		}
		else if (waterUnit>=200 && waterUnit<800) {
			waterRate=0.07;
			
		}
		else if(waterUnit>=800) {
			waterRate=0.05;
		}
		
		
		
		if(superPlan==true) {
			System.out.println("Customer is in Super Plan-Yes");
			//scan.nextBoolean();
			superSavingPlanCharge=6;
			
		}
		else{
			System.out.println("Customer is in Super Plan-No");
			//scan.nextBoolean();
			superSavingPlanCharge=0;

		}
        double waterCost=(waterUnit*waterRate)+serviceCharge;
		
		NumberFormat doller=NumberFormat.getCurrencyInstance();
		System.out.println("Water Cost: "+doller.format(waterCost));
		
		double subTotal=waterCost+superSavingPlanCharge;
		System.out.println("Subtotal Cost "+doller.format(subTotal));
		
		if(subTotal>35) {
			discountRate=0.20;
		}
		else {
			discountRate=0;
		}
		double totalDiscount=subTotal*discountRate;
		
		double afterDiscountSubTotalBill=subTotal-totalDiscount;
		double totalTax=afterDiscountSubTotalBill*taxRate;
		System.out.println("Total tax is "+doller.format(totalTax));
		
		double finalBill=afterDiscountSubTotalBill+totalTax;
		System.out.println("Final Water Bill :"+doller.format(finalBill));
		

	}

}
