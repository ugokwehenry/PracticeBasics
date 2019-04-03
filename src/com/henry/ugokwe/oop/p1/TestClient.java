package com.henry.ugokwe.oop.p1;

public class TestClient {

	/**
	 * @param args
	 */
	public static int getVal(){
		return 42;
	}
	public static void main(String[] args) {
		C c = new X();
		
		
		C clone = ((X) c).clone();
		if(clone != c){
			System.out.println("Clone created!!"+ clone.getClass().getSimpleName());
			System.out.println("Clone created!!"+ c.getClass().getSimpleName());
		}
	}

}
