package 创建型_工厂方法模式;

public class FactoryMethodPatternI {

	//生产工厂的接口也可以是抽象类
	interface Producer{
		public void Produce();
	}
	
	//实现生产的具体产品
	class MailProducer implements Producer{

		@Override
		public void Produce() {
			System.out.println("Produce Mail!");
		}
		
	}
	
	class SmsProducer implements Producer{

		@Override
		public void Produce() {
			System.out.println("Produce Sms!");
		}
		
	}
	
	//生产工厂
	class ProduceFactory
	{
		public Producer Produce(String type)
		{
			if("sms".equals(type))
			{
				 return new SmsProducer();
			}else if("mail".equals(type))
			{
				return new MailProducer();
			}else
			{
				System.out.println("没有要生产的产品!");
				return null;
			}
		}
	}
	public static void main(String[] args) {

		FactoryMethodPatternI factoryMethodPatternI = new FactoryMethodPatternI();
		ProduceFactory factory = factoryMethodPatternI.new ProduceFactory();
		Producer producer = factory.Produce("sms");
		producer.Produce();
	}
}
