public class Calculator{
	public static void main(String[] args){
		int x = 7;
		int y = 3;
		String operator = "-";
		if(operator == "+"){
			System.out.println("x + y = " + (x + y));
		}else if(operator == "-"){
			System.out.println("x - y = " + (x - y));
		}else if(operator == "*"){
			System.out.println("x * y = " + x * y);
		}else if(operator == "/"){
			System.out.println("x / y = " + x / y);
		}else if(operator == "^"){
			System.out.println("x ^ y = " + (x ^ y));
		}else if(operator == "%"){
			System.out.println("x % y = " + x % y);
		}
	}
}