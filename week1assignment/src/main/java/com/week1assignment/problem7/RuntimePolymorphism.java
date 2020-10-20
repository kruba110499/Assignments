package com.week1assignment.problem7;
class Shape{
	public void draw() {
		System.out.println("draw");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("circle");
	}
}
class Rectangle extends Shape{
	@Override
	public void draw() {
		System.out.println("Rectangle");
	}
}
class Triangle extends Shape{
	@Override
	public void draw() {
		System.out.println("triangle");
	}
}
public class RuntimePolymorphism {

	public static void main(String[] args) {
		Shape circle=new Circle();
		Shape rectangle=new Rectangle();
		Shape triangle=new Triangle();
		circle.draw();
		rectangle.draw();
		triangle.draw();

	}

}
