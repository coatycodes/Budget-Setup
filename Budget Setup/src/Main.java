import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			System.out.println("What is your rent?");
				String a = scanner.next();
			System.out.println("How much are your groceries?");
				String b = scanner.next();
			System.out.println("How much are your utilities?");
				String c = scanner.next();
			System.out.println("How much is your insurance?");
				String d = scanner.next();
			System.out.println("How much do you make per month?");
				String e = scanner.next();
				
				int n1=Integer.parseInt(a);
				int n2=Integer.parseInt(b);
				int n3=Integer.parseInt(c);
				int n4=Integer.parseInt(d);
				int n5=Integer.parseInt(e);
				
				int sum = n1+n2+n3+n4;
				int diff = n5-sum;
			
				System.out.println();
				System.out.println("Rent: $"+a);	
				System.out.println("Groceries: $"+b);
				System.out.println("Utilities: $"+c);
				System.out.println("Insurance: $"+d);
			
				System.out.println("Your monthly budget is: $"+sum);
				System.out.println("Your monthly surplus is: $"+diff);
				
					
				
	}

}
