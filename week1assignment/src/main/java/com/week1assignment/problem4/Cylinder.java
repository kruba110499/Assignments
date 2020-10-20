package com.week1assignment.problem4;

public class Cylinder {
	 final static double PI=3.14;
	 public static double feetToMeterConvertion(double numberToBeConverted)
	 {
	 return numberToBeConverted*0.3048;
	 }
	 public static void main(String[] args) {
			 double cylinderHeight=20;
			 double internalDiameter=5;
			 double heightInMeter=feetToMeterConvertion(cylinderHeight);
			 double internalDiameterInMeter=feetToMeterConvertion(internalDiameter);
			 double internalRadiusInMeter=internalDiameterInMeter/2;
			 double volumeOfTheCylinder=PI*internalRadiusInMeter*internalRadiusInMeter*heightInMeter;
			 double litresToBeFilled=volumeOfTheCylinder*volumeOfTheCylinder*volumeOfTheCylinder;
			 System.out.printf("Rate at which the tank to be filled within 1hour : %.2f(litres/sec)\n",litresToBeFilled/60);
			 System.out.printf("Rate at which the tank to be filled within 2hour : %.2f(litres/sec)\n",litresToBeFilled/(60*2));
			 System.out.printf("Rate at which the tank to be filled within 3hour : %.2f(litres/sec)\n",litresToBeFilled/(60*3));
			 System.out.printf("Rate at which the tank to be filled within 4hour : %.2f(litres/sec)\n",litresToBeFilled/(60*4));
   }
} 
