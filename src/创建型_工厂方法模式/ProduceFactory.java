package ������_��������ģʽ;
import ������_��������ģʽ.FactoryMethodPatternIII.Producer;


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
