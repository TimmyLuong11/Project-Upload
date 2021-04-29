public class Project2_TimothyLuong 
{
	public static void main(String[] args)
	{
		//Declare Variables 
		final double taxRate = 0.065;
		int purchaseCopies1 = 1;
		int purchaseCopies2 = 2;
		int purchaseCopies3 = 4;
		final double costOfPurchase1 = 50.85;
		final double costOfPurchase2 = 12.05;
		final double costOfPurchase3 = 14.91;
		String purchase1 = "C Primer Plus by Prata";
		String purchase2 = "C++ Primer Plus by Prata";
		String purchase3 = "Effective Java by Bloch";
		
		//Do Calculations
		double totalCost = (costOfPurchase1 * purchaseCopies1) + (costOfPurchase2 * purchaseCopies2) + (costOfPurchase3 * purchaseCopies3);
		double salesTax = ((int)totalCost * taxRate) + (totalCost % taxRate);
		double finalCost = totalCost + salesTax;
		
		//Print Out Statements 
		System.out.println("Purchase " + purchaseCopies1 + " copy of " + purchase1 + "." + " Each copy costs $" + costOfPurchase1 + ".");
		System.out.println("Purchase " + purchaseCopies2 + " copy of " + purchase2 + "." + " Each copy costs $" + costOfPurchase2 + ".");
		System.out.println("Purchase " + purchaseCopies3 + " copy of " + purchase3 + "." + " Each copy costs $" + costOfPurchase3 + ".");
		System.out.println("The total cost of your purchases is: $" + totalCost + ".");
		System.out.println("Sales tax is: $" + salesTax);
		System.out.println("The total cost of your order will be: $" + finalCost);
	}
}
