package otherProg;

public class Factorial {
	
		public void getFact(int a) {
			
			int fact=1;
			for(int i=a; i>=1; i--) {
				
				fact = fact * i;	
			}
			System.out.println(fact);
		}
}
