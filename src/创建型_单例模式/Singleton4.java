package ������_����ģʽ;

public class Singleton4 {

	private static Singleton4 single = new Singleton4();
	
	private Singleton4() {};
	
	public static Singleton4 getinstance() {
		return single;
	}
}
