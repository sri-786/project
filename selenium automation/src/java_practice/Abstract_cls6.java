

//Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea().
//Create subclasses Sphere and Cube that extend the Shape3D class 
//implement the respective methods to calculate the volume and surface area of each shape.
package java_practice;

abstract class Shape3D {
	abstract void calculateVolume(int r1);

	abstract void calculateSurfaceArea(int s);

}

class Sphere extends Shape3D {
	void calculateVolume(int r1) {
		double v = (4 / 3) * (3.14) * (r1 * r1 * r1);
		int sph = (int) v;
		
		System.out.println("Calculate Shpere Volume :" + sph);
	}

	void calculateSurfaceArea(int r) {
		double area = 4 * (3.14) * (r * r);
		int area1 = (int) area;
		System.out.println("Calculate Sphere Surface Area :" + area1);
	}

	
}

class Cube extends Shape3D {
	void calculateVolume(int r1) {
		double cubvol = r1 * r1 * r1;
		int cubevol = (int) cubvol;
		System.out.println("Calculate Cube Voume :" + cubevol);
	}

	void calculateSurfaceArea(int s) {
		double area = 6 * (s * s);
		int area1 = (int) area;
		System.out.println("Calculate Cube Surface Area :" + area1);
	}

}

class Abstract_cls6 {
	public static void main(String[] args) {
		Shape3D sphape = new Sphere();
		sphape.calculateVolume(2);
		sphape.calculateSurfaceArea(5);

		Shape3D cub = new Cube();
		cub.calculateVolume(4);
		cub.calculateSurfaceArea(5);
	}
}