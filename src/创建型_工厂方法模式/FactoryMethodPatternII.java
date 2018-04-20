package 创建型_工厂方法模式;

public class FactoryMethodPatternII {

	interface Producer{
		public void Produce();
	}
	
	class MailProducer implements Producer{
		@Override
		public void Produce()
		{
			System.out.println("produce Mail!");
		}
	}
	
	class SmsProducer implements Producer{
		@Override
		public void Produce()
		{
			System.out.println("produce Sms!");
		}
	}
	
	/*class ProduceMailFactory{
		public Producer ProduceFactory()
		{
			return new MailProducer();
		}
	}
	
	class ProduceSmsFacory{
		public Producer ProduceFactory()
		{
			return new SmsProducer();
		}
	}*/
	
	class ProduceFactory{
		public Producer SmsFactory()
		{
			return new SmsProducer();
		}
		public Producer MailFacory()
		{
			return new MailProducer();
		}
	}
	public static void main(String[] args) {
		FactoryMethodPatternII factoryMethodPatternII = new FactoryMethodPatternII();
		ProduceFactory factory = factoryMethodPatternII.new ProduceFactory();
		Producer produce = factory.MailFacory();
		produce.Produce();
		
	}
}
