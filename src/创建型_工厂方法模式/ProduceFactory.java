package 创建型_工厂方法模式;
import 创建型_工厂方法模式.FactoryMethodPatternIII.Producer;


public class ProduceFactory {

	public static  Producer SmsFactory()
	{
		return  new FactoryMethodPatternIII().new SmsProducer();
	}
	public static Producer MailFacory()
	{
		return  new FactoryMethodPatternIII().new MailProducer();
	}
	
}
