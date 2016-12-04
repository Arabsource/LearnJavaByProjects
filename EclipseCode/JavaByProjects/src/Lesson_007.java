
public class Lesson_007 {

	public static void main(String[] args) {
		Integer x = 5;
		
		//compareTo
		System.out.println(x.compareTo(2));
		System.out.println(x.compareTo(5));
		System.out.println(x.compareTo(8));
		
		//equals
		System.out.println(x.equals(4));
		System.out.println(x.equals(5));
		
		//toString
		String str = "test ";
		System.out.println(str + x.toString());
		
		//parseInt, ParseDouble
		Integer y = Integer.parseInt("44");
		System.out.println(y);
		
		//ceil, floor, round
		double x1 = 100.1;
		double y1 = 100.51;
		System.out.println(Math.ceil(x1));
		System.out.println(Math.floor(x1));
		
		System.out.println(Math.round(x1));
		System.out.println(Math.round(y1));
		
		//min, max
		int x2 = 122;
		int y2 = 16;
		
		System.out.println("the smalest value is : "+ Math.min(x2,  y2));
		System.out.println("the smalest biggest is : "+Math.max(x2,  y2));
		
		//sqrt
		System.out.println(Math.sqrt(y2));
		
		//sin, cos, tan
		double z = 45.0;
		double rad = Math.toRadians(z);
		
		System.out.println(Math.sin(rad));
		System.out.println(Math.cos(rad));
		System.out.println(Math.tan(rad));
		
		//random
		System.out.println(Math.round(Math.random()*1000));
		
		
		
	}
}
