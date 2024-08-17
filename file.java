import java.util.Scanner;

public class file{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.print("ener Principle: ");
		int principle = scan.nextInt();

		System.out.print("ente time: ");
		int time = scan.nextInt();

		System.out.print("enter Rate: ");
		int rate = scan.nextInt();

		int Si = (principle * time * rate)/100;

		System.out.println("Simple interest is : " + Si);
	}
}