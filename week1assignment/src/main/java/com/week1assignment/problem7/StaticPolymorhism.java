package com.week1assignment.problem7;
class Addition{
	public int add(int num1,int num2) {
		return num1+num2;
	}
	public int add(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	public int add(int num1) {
		return num1+10;
	}
}
public class StaticPolymorhism {

	public static void main(String[] args) {
		Addition obj=new Addition();
		System.out.println(obj.add(20));
		System.out.println(obj.add(10, 30));
		System.out.println(obj.add(11,11,11));

	}

}
