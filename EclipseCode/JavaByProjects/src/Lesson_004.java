/*
   Copyright 2015 ArabSource
   Project : Learn Java By Projects
   Lesson : 4
   Date : June 29th, 2015
   Website : www.arabsource.org
 */
public class Lesson_004 {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++){
			if(i==3){
				continue;
			}
			System.out.println("i value = "+i);
		}
		
		int x = 5;
		while(x <= 10){
			System.out.println("x value = "+x);
			x++;
		}
		
		int y = 10;
		do{
			System.out.println("y value = "+y);
			y++;
		}while(y < 20);
		
		boolean chk = true;
		int z = 0;
		while(chk){
			if(z > 5){
				chk = false;
			}
			System.out.println("z value = "+z);
			z++;
			
		}

	}

}
