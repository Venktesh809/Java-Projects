package implementationProg;

import subProg.Subtraction;

import java.util.Scanner;

import addtionProg.Addition;
import divProg.Division;
import mulProg.Product;
import otherProg.Cube;
import otherProg.Factor;
import otherProg.Factorial;
import otherProg.Power;
import otherProg.Square;


public class DivImp {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println(" *** Welcome to My Calculator ***");
			System.out.println();
			int t = 0;
			int t2 = 0;
			int tru = 0;
			
			while(tru == 0) {
					
				while(t!=1)
				{
					System.out.println("Enter the choice");
					System.out.println("1 for addtion");
					System.out.println("2 for Subtration");
					System.out.println("3 for Multiplication");
					System.out.println("4 for Division");
					System.out.println("5 for Other Program");
					System.out.println("6 for Exit");
					
					
					int num = sc.nextInt();
					int n2 = num;
					switch(num) {
					case 1:
						System.out.println("Enter first number");
						float a1 = sc.nextFloat();
						System.out.println("Enter second number");
						float a2 = sc.nextFloat();
						Addition.add(a1,a2);
						System.out.println();
						break;
						
					case 2:
						System.out.println("Enter first number");
						int s1 = sc.nextInt();
						System.out.println("Enter second number");
						int s2 = sc.nextInt();
						Subtraction sb = new Subtraction();
						sb.sub(s1,s2);
						System.out.println();
						break;
						
					case 3:
						System.out.println("Enter first number");
						int p1 = sc.nextInt();
						System.out.println("Enter second number");
						int p2 = sc.nextInt();
						Product.pro(p1,p2);
						System.out.println();
						break;
						
					case 4:
						System.out.println("Enter first number");
						int d1 = sc.nextInt();
						System.out.println("Enter second number");
						int d2 = sc.nextInt();
						Division dv = new Division();
						dv.div(d1,d2);
						System.out.println();
						break;
						
					case 5:
						
						while(t2 != 2) {
							
							System.out.println("1 for Square");
							System.out.println("2 for Cube");
							System.out.println("3 for Factor");
							System.out.println("4 for Factorial");
							System.out.println("5 for Power of the number");
							System.out.println("6 for Main Calculator");
							
							int num2 = sc.nextInt();
							switch(num2) {
							
							case 1:
								System.out.println("Enter number");
								int sqr1 = sc.nextInt();
							
								Square.getSqr(sqr1);
								System.out.println();
								break;
								
								
							case 2:
								System.out.println("Enter number");
								int c1 = sc.nextInt();
							
								Cube.getCube(c1);
								System.out.println();
								break;
								
							case 3:
								System.out.println("Enter number");
								int f1 = sc.nextInt();
								
								Factor.getFactors(f1);
								System.out.println();
								break;
								
							case 4:
								System.out.println("Enter number");
								int fac1 = sc.nextInt();
							
								Factorial ft = new Factorial();
								ft.getFact(fac1);
								System.out.println();
								break;
								
							case 5:
								System.out.println("Enter base number");
								int b = sc.nextInt();
								System.out.println("Enter power number");
								int p = sc.nextInt();
								Power pw = new Power();
								pw.getPower(b, p);
								System.out.println();
								break;
							
							case 6:
								t2 = 2;
								 
								 System.out.println();
								 System.out.println(" *** Go to main calculator *** ");
								 System.out.println();
							
								 break;
								 
							default:
								System.out.println("Invalid Number ");
								System.out.println();
								
							}			// nested switch
							
						}				// nested while 
												
						t2 = 0;
						break;	
						 
					case 6:
						 t = 1;
						 System.out.println("Your exit to calculator");
						 System.out.println();						
						break;
						
					default:
						System.out.println("Invalid Number");
						System.out.println();
					}					// top switch 
				}						// top while
				
				if(t==1) {
					System.out.println("You want to use calculator again press :  0 ");
					int agn = sc.nextInt();
					t = agn;
					tru = agn;
				}
			
			
			}
			
			
			
			
			
			
			
		}
}
