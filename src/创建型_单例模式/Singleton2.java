package ������_����ģʽ;

public class Singleton2 {

	private static Singleton2 single = null;
	
	private Singleton2() {};
	
	public static synchronized Singleton2 getinstance()
	{
		if(null == single)
		{
			return new Singleton2();
		}
		return single;
	}
}
