package sec01;
abstract class Shape{ //추상클래스
	abstract void draw();  //추상메소드
	
}

class Rect extends Shape{
	
}

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r = new Rect();
		r.draw();
		Shape s =new Shape();
		
	}

}
