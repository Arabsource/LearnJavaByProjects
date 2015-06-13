
public class Lesson_003 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		boolean chk = true;
		
		if( x < y ){
			System.out.println("X = " + x);	//true
		}else{
			System.out.println("Y = " + y);	//false
		}
		
		int z = 200;
		
		switch(z){
		case 100:
			System.out.println("The number is : "+z);
			break;
		case 200:
			System.out.println("the number is : "+z);
			System.out.println(z+" is the case number 2"+" correct");
			break;
		default :
			System.out.println("the number is something else");
		}
	}

}
