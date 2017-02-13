package service;

public class Calculator2 {
	
	public double add(double a, double b) {
		return a + b;
	}
	
	public double sub(double a, double b){
		return a - b;
	}
	
	public double multi(double a, double b){
		return a * b;
	}
	
	public double div(double a, double b){
		return a / b;
	}
	
	public boolean greater(double a, double b){
		if (a > b) return true;
		else return false;
	}

}
