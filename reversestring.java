import java.util.Scanner;

public class reversestring{
	public static void main(String[]args){
	Scanner scanner=new Scanner(System.in);

	System.out.print("Enter a String:");
	String input=scanner.next();

	String reverse="";
	for (int i = input.length()-1; i>=0; i--){
		reverse += input.charAt(i);
	}

		System.out.println("Reversed String:"+reverse);
	}
}