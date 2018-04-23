package 创建型_单例模式;

public class Singleton6 {

	private static class SingleHolder
	{
		private static final Singleton6 single = new Singleton6();
	}
	
	private Singleton6() {};
	
	private static Singleton6 getinstance()
	{
		return SingleHolder.single;
	}
}
