import java.util.Scanner;


public class calculator{
	public static void main (String[]args){
	Scanner scanner = new Scanner(System.in);


		System .out.print("Enter first number:");
		Double num1=scanner.nextDouble();
		System .out.print("Enter second number:");
		Double num2=scanner.nextDouble();
		System.out.print("choose operation(+,-,*,/):");
		char operator=scanner.next().charAt(0);
		double result=0;
		switch(operator){
			case'+':
				result=num1+num2;
				System.out.println("Addition of two nums:"+result);
				break;
			case'-':
				result=num1-num2;
				System.out.println("sub of two nums:"+result);
				break;
			case'*':
				result=num1*num2;
				System.out.println("mul of two nums:"+result);
				break;
			case'/':
				if(num2!=0){
					result=num1/num2;
				}else{
					System.out.println("invalid operator");
					return;
		}
             }
}
}	




	
