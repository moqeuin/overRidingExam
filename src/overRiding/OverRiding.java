package overRiding;


//오버라이딩 : 상속받은 메서드를 변경하는 것, 메서드를 상속받은 클래스에 맞게 변경해서 코드의 재활용성을 높인다.

public class OverRiding {
	
	public static void main(String[] args) {
		
		Point p = new Point();
		System.out.println(p.getLocation()); // x:0y:0
		Point3D p3 = new Point3D();
		System.out.println(p3.getLocation()); // x:0y:0z:0
	}

}

class Point{
	
	int x;
	int y;
	
	String getLocation() {
		return "x:" + this.x + "y:" + this.y;
	}
}

class Point3D extends Point{
	int z;
	// 오버라이딩한 위치
	String getLocation() {
		return "x:" + this.x + "y:" + this.y + "z:" + this.z;
	}
}