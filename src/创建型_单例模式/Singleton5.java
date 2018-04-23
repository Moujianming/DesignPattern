package 创建型_单例模式;

public class Singleton5 {

	private static Singleton5 single = null;
	
	static {
		single = new Singleton5();
	}
	
	private Singleton5() {};
	
	private static Singleton5 getinstance() {
		return single;
	}
}
