
public class Lesson_009 {

	public static void main(String[] args) {
		
		int [][] myList = {{10,20,30},{40,50,60}};
		
		for(int i = 0; i < myList.length; i++) {
			for(int y = 0; y < myList[i].length; y++) {
				myList[i][y] = (i+y) * 2;
			}
		}
		for(int i = 0; i < myList.length; i++) {
			for(int y = 0; y < myList[i].length; y++) {
				System.out.println(i +" + "+ y +"* 2 ="+myList[i][y]);
			}
		}
	}

}
