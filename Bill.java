import java.util.Scanner;
public class Bill {
	int units;
	double cost;
	
	public void accept()
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the number of units consumed");
		units = in.nextInt();
	}
	
	public void calculate()
	{
		if(units<=100)
			cost = cost*1.20;
		else if(units>100 && units<=300)
			cost = 1.2*100 + (units-100)*2;
		else if(units>300)
			cost = 1.2*100 + 2*100 + (units-300)*3;
	}
	
	public void print()
	{
		System.out.println("----------Electricity Bill------------");
		System.out.println("Number of units entered: " +units);
		System.out.println("Total Bill: " +cost);
			
	}


	public static void main(String[] args) {
		
		Bill b = new Bill();
		b.accept();
		b.calculate();
		b.print();
		
	}

}
