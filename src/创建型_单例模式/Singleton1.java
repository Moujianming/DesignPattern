package ������_����ģʽ;

public class Singleton1 {

	/* ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ��� */  
	private static Singleton1 single = null;
	
	/* ˽�й��췽������ֹ��ʵ���� */
	private Singleton1() {};
	
	 /* ��̬���̷���������ʵ�� */
	public static Singleton1 getinstance()
	{
		if(null==single)
		{
			return new Singleton1();
		}
		return single;
	}
	
	/*���л�ǰ��Ҫ����һ��*/
	public Object solve()
	{
		return single;
	}
}
