package otherProg;

public class Power {

		public void getPower(int b, int p) {
			int powr = 1;
			for(int i =1; i<=p; i++) {
				powr = powr * b;
			}
			System.out.println(powr);
		}
}
