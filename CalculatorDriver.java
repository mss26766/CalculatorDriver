
public class CalculatorDriver {
 public static void main(String[]args) {
	 
	 
	 double [] num = new double [3];
	 num[0] = 10.1;
	 num[1] = 10.2;
	 num[2] = 10.3;
	 int [] array2 = new int [2];
	 array2[0] =5;
	 array2[1] =6;
	 
	 System.out.println(Calculator.getAverage(num));
	 System.out.println(Calculator.getSum1(num));
	 System.out.println(Calculator.Product(array2));
	 System.out.println(Calculator.factorial(5));
	 System.out.println(Calculator.getAvarage(4,3));
	 System.out.println(Calculator.getSum(3,5,1));
	 System.out.println(Calculator.getPraduct(5,7));
	 
 }
}
