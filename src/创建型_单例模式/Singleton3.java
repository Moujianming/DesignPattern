package 创建型_单例模式;

public class Singleton3 {

	private static Singleton3 single = null;
	
	private Singleton3() {};
	
	public static Singleton3 getinstance()
	{
		synchronized (single) {
			if(null==single)
			{
				return new Singleton3();
			}
			return single;
		}
	}
}
