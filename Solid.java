//Java PRogram to calculate surface area and volume of cylinder, cone & sphere. (abstraction)

import java.util.*;

abstract class SolidInput{
	double h;
	double r;
	abstract void SArea();
	abstract void SVolume();
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the solid: ");
		r = sc.nextDouble();
		System.out.print("Enter the height of the solid: ");
		h = sc.nextDouble();
//		sc.close();
	}
}

class Cylinder extends SolidInput{

	@Override
	void SArea() {
		double area = (2*Math.PI*r*h) + (2*Math.PI*r*r);
		System.out.println("Area of the Cylinder is: " + area);
	}

	@Override
	void SVolume() {
		double volume = (Math.PI*r*r*h);
		System.out.println("Volume of the Cylinder is: " + volume);
	}
	
}

class Cone extends SolidInput{

	@Override
	void SArea() {
		double area = Math.PI*r*(r+Math.sqrt(r*r+h*h));
		System.out.println("Area of the Cone is: " + area);
	}

	@Override
	void SVolume() {
		double volume = (0.33333)*(Math.PI*r*r*h);
		System.out.println("Volume of the Cone is: " + volume);
	}
	
}

class Sphere extends SolidInput{

	@Override
	void SArea() {
		double area = 4*Math.PI*r*r;
		System.out.println("Area of the Sphere is: " + area);
	}

	@Override
	void SVolume() {
		double volume = (1.33333)*(Math.PI*r*r*r);
		System.out.println("Volume of the Sphere is: " + volume);
	}
	
}

public class Solid {

	public static void main(String[] args) {
		SolidInput SI;
		Cylinder CY = new Cylinder();
		SI = CY;
		SI.input();
		SI.SArea();
		SI.SVolume();
		Cone CO = new Cone();
		SI = CO;
		SI.input();
		SI.SArea();
		SI.SVolume();
		Sphere SP = new Sphere();
		SI = SP;
		SI.input();
		SI.SArea();
		SI.SVolume();

	}

}
