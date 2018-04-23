package 创建型_单例模式;

public class Singleton4 {

	private static Singleton4 single = new Singleton4();
	
	private Singleton4() {};
	
	public static Singleton4 getinstance() {
		return single;
	}
}
