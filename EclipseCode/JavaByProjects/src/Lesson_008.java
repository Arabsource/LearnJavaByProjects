
public class Lesson_008 {

	public static void main(String[] args) {
		
		int[] myList = {101,102,103,104,105,106,107,108};
		
		//System.out.println(myList[4]);
		
		for(int i=0; i <myList.length; i++) {
			System.out.println(myList[i]);
		}
		
		for(int i=0; i <myList.length; i++) {
			myList[i] = i * 2;
		}
		
		for(int y : myList) {
			System.out.println("new value : "+y);
		}

	}

}
