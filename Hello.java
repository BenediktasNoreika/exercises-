
public class Hello {
	public static void main(String[] args) {
		number(2,3,true);
		//count();
		count2(3);

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
	
	
	}

