public class MyFirstGame{
	public static void main(String[] args){
		int computerNumber = 50;
		int myNumber = 10;

		System.out.println("Start!!!");

		while(true){
			if(myNumber == computerNumber){
				System.out.println("We learned");
				break;
			}if(myNumber > computerNumber){
				System.out.println("Youre number " + myNumber + " more");
				myNumber--;
			}if(myNumber < computerNumber){
				System.out.println("Youre number " + myNumber + " less");
				myNumber++;
			}
		}
		System.out.print("You win!!!");
	}
}