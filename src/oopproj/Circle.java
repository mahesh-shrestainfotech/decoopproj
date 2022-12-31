package oopproj;

//Circle
public class Circle {
	
	//field or instance variable
	float radius;
	static float PI = 3.14f;
	
	public void calculateArea() {
		float area = PI * radius * radius;
		System.out.println("Area : "+area);
	}
	
	public void calculateCircumference() {
		float circumference = 2 * PI * radius;
		System.out.println("Circumference : "+circumference);
	}
	

}
