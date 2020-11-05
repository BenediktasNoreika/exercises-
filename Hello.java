
public class Hello {
	public static void main(String[] args) {
		//number(2,3,true);
		//count();
		//count2(3);
		coin(4.58,20);

	 }
	

	
	public static int number(int a, int b, boolean c) {
	int ans;
	if (c == true) {
	ans = a + b;	
	}
	else {
	ans = a*b;
	}
	return ans;
	}
	
	
	public static void count() {
		
		for (int i=100;i <200 ;i++ ) {
			System.out.println(i);
		}
		
		for (int i=100;i <=200 ;i++ ) {
			if (i%2 == 0) {
				System.out.println("-");
			}
			else {
				System.out.println("*");
			}	
		}
	  for (int i=0; i <=10; i++) {
		for (int x=0; x <=10; x++) {
			System.out.println(x);
		}
		}
	}
	
	public static void count2(int num) {
		for (int i=0; i <num; i++) {
			for (int x=0; x <=10; x++) {
				System.out.println(x);
			}
			}
	}
	
	public static void coin(double cost, double pay)
	{
		double total = pay - cost;
		int fifty = 0;
		int twenty = 0;
		int tenner=0;
		int fiver=0;
		int pound=0;
		int fiftyp=0;
		int twentyp=0;
		int tenp=0;
		int fivep=0;
		int twop=0;
		int onep=0;
		
		while(total > 0.00)
		{
			while (total >= 50)
			{
				fifty++;
				total = total - 50;
				
			}
			if (fifty != 0)
			{
				String count = Integer.toString(fifty);
				System.out.println(count + " 50 note");
			}
			
			while (total >= 20)
			{
				twenty++;
				total = total - 20;
			}
			if (twenty != 0)
			{
				String count = Integer.toString(twenty);
				System.out.println(count + " 20 note");
			}
			while (total >= 10)
			{
				tenner++;
				total = total - 10;
			}
			if (tenner != 0)
			{
				String count = Integer.toString(tenner);
				System.out.println(count + " 10 note");
			}
			while (total >= 5)
			{
				fiver++;
				total = total - 5;
			}
			if (fiver != 0)
			{
				String count = Integer.toString(fiver);
				System.out.println(count + " 5 note");
			}
			while (total >= 1)
			{
				pound++;
				total = total - 1;
			}
			if (pound != 0)
			{
				String count = Integer.toString(pound);
				System.out.println(count + " 1 pound");
			}
			while (total >= 0.5)
			{
				fiftyp++;
				total = total - 0.5;
			}
			if (fiftyp != 0)
			{
				String count = Integer.toString(fiftyp);
				System.out.println(count + " 50p");
			}
			while (total >= 0.2)
			{
				twentyp++;
				total = total - 0.2;
			}
			if (twentyp != 0)
			{
				String count = Integer.toString(twentyp);
				System.out.println(count + " 20p");
			}
			while (total >= 0.1)
			{
				tenp++;
				total = total - 0.1;
			}
			if (tenp != 0)
			{
				String count = Integer.toString(tenp);
				System.out.println(count + " 10p");
			}
			while (total >= 0.05)
			{
				fivep++;
				total = total - 0.05;
			}
			if (fivep != 0)
			{
				String count = Integer.toString(fivep);
				System.out.println(count + " 5p");
			}
			while (total >= 0.02)
			{
				twop++;
				total = total - 0.02;
			}
			if (twop != 0)
			{
				String count = Integer.toString(twop);
				System.out.println(count + " 2p");
			}
			if (total >= 0.01)
			{
				System.out.println("1 1p");
			}
			break;
			
			
		}
		
	}
	
	
	}

