package ������_��������ģʽ;

public class FactoryMethodPatternIII {

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
	
	

	public static void main(String[] args) {
		
		Producer producer = ProduceFactory.MailFacory();
		producer.Produce();
	}
}
