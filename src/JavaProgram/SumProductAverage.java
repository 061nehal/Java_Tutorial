package JavaProgram;

import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SumProductAverage {

	public static void main(String[] args) {
		String input;
		double firstNumber;
		double secondNumber;
		double thirdNumber;
		input=JOptionPane.showInputDialog("Enter First Number");
		firstNumber=Double.parseDouble(input);
		input=JOptionPane.showInputDialog("Enter Second Number");
		secondNumber=Double.parseDouble(input);
		input=JOptionPane.showInputDialog("Enter Third Number");
		thirdNumber=Double.parseDouble(input);
		
		double sum=firstNumber+secondNumber+thirdNumber;
		double product=firstNumber*secondNumber*thirdNumber;
		double average=(firstNumber+secondNumber+thirdNumber)/3;
		
		
		
		DecimalFormat df = new DecimalFormat("###.##");
		JFrame frame = new JFrame("JOptionPane showMessageDialog");
JOptionPane.showMessageDialog( frame, "Sum is  : "+df.format(sum)+"\n"+"Product is: "+df.format(product)+"\n"+"Average is : "+df.format(average));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
