package divProg;

public class Division {
	
		public void div(int a, int b) {
			
			try {
				System.out.println("Result : " + (a/b));
			} catch (ArithmeticException e) {
				System.out.println("Cannot divided");
			}
			
		}
}
