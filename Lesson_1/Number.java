import java.util.Scanner;

public class Number{
	public static void main(String[] args){
		int number = 78;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = in.nextInt();
		while(num != number){
			if(num < number){
				System.out.println("Entered numbers less");
			}else if(num > number){
				System.out.println("Entered numbers more");
			}
			in = new Scanner(System.in);
			System.out.print("Enter number: ");
			num = in.nextInt();
		}
		System.out.println("We learned number " + number);
	}
}