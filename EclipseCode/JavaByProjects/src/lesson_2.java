import java.util.Scanner;


public class lesson_2 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String [] argo){
		
		System.out.print("Enter your age : ");
		
		if(scan.hasNextInt()){
			int age = scan.nextInt();
			System.out.println("a " +  age);
		}else{
			System.out.println("you did not entered Int");
		}
		
		System.out.println("random number " + (int) (Math.random() * 100));
		System.out.println("ceil number " + Math.ceil(5.23));
		System.out.println("floor number " + Math.floor(5.23));
		System.out.println("round number " + Math.round(5.23));
	}
}
