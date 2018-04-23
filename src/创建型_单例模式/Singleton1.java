package 创建型_单例模式;

public class Singleton1 {

	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  
	private static Singleton1 single = null;
	
	/* 私有构造方法，防止被实例化 */
	private Singleton1() {};
	
	 /* 静态工程方法，创建实例 */
	public static Singleton1 getinstance()
	{
		if(null==single)
		{
			return new Singleton1();
		}
		return single;
	}
	
	/*序列化前后要保持一致*/
	public Object solve()
	{
		return single;
	}
}
