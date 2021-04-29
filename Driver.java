public class Driver 
{
  public static void main(String[] args) 
  {
    //Donor Class Object
    Donor person1 = new Donor("Bob", 100);
    Donor person2 = new Donor("Jim", 200);
  
    //toString called
    System.out.println("toString: " + person1);
    System.out.println("toString: " + person2);
	System.out.println("");
    
    //getName called
    System.out.println("getName: " + person1.getName());
    System.out.println("getName: " + person2.getName());
	System.out.println("");
    
    //getTotalDonations called
    System.out.println("getTotalDonations: $" + person1.getTotalDonations()); 
    System.out.println("getTotalDonaitons: $" + person2.getTotalDonations());
  }
}