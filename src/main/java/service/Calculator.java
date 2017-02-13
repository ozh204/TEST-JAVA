package service;

public class Calculator {
	
	public Integer add(int a, int b) {
		return a + b;
	}
	
	public Integer sub(int a, int b){
		return a - b;
	}
	
	public Integer multi(int a, int b){
		return a * b;
	}
	
	public Integer div(int a, int b){
		return a / b;
	}
	
	public boolean greater(int a, int b){
		if (a > b) return true;
		else return false;
	}

}
