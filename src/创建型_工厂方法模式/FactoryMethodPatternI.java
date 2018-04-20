package ������_��������ģʽ;

public class FactoryMethodPatternI {

	//���������Ľӿ�Ҳ�����ǳ�����
	interface Producer{
		public void Produce();
	}
	
	//ʵ�������ľ����Ʒ
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
	
	//��������
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
				System.out.println("û��Ҫ�����Ĳ�Ʒ!");
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
