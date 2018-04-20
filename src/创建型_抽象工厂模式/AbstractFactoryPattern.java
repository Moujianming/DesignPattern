package 创建型_抽象工厂模式;

public class AbstractFactoryPattern {

	//抽象的生成过程或是接口
	interface Producer{
		public void Produce();
	}
	
	//实现生产过程
	class SmsProducer implements Producer{

		@Override
		public void Produce() {
			// TODO Auto-generated method stub
			System.out.println("produce sms!");
		}
		
	}
	
	class MailProducer implements Producer{

		@Override
		public void Produce() {
			// TODO Auto-generated method stub
			System.out.println("produce mail!");
		}
		
	}
	
	//抽象的工厂方法或是接口
	interface Factoryer{
		public Producer Factory();
	}
	
	//实现具体的工厂方法
	class SmsFactoryer implements Factoryer{

		@Override
		public Producer Factory() {
			// TODO Auto-generated method stub
			return new SmsProducer();
		}
		
	}
	
	class MailFactoryer implements Factoryer{

		@Override
		public Producer Factory() {
			// TODO Auto-generated method stub
			return new MailProducer();
		}
		
	}
	public static void main(String[] args) {
		AbstractFactoryPattern factoryPattern = new AbstractFactoryPattern();
		MailFactoryer factoryer = factoryPattern.new MailFactoryer();
		Producer producer = factoryer.Factory();
		producer.Produce();
	}
}
