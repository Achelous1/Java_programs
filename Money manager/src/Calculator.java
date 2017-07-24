import java.util.*;

class Calculator{
	public static void main(String args[]){
		double income, spend;	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the amount of income");
			String tmp = scanner.nextLine();
			income = Double.parseDouble(tmp);
			
		System.out.print("Enter the amount spent");
			String tmp2 = scanner.nextLine();
			spend = Double.parseDouble(tmp2);
			
		gTotal(income, spend, gTotal);
		System.out.println("The remaining amount is " + remainVal);
	}
}


class Calculation {
		double remainVal;
		
		double gTotal(double income, double spend, double gTotal) {
			double total = income - spend;
			remainVal = gTotal - total;
			return remainVal;
		}
}
