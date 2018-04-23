package ������_����ģʽ;

public class Singleton6 {

	private static class SingleHolder
	{
		private static final Singleton6 single = new Singleton6();
	}
	
	private Singleton6() {};
	
	public static Singleton6 getinstance()
	{
		return SingleHolder.single;
	}
}
