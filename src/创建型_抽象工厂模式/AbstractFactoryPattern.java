package ������_���󹤳�ģʽ;

public class AbstractFactoryPattern {

	//��������ɹ��̻��ǽӿ�
	interface Producer{
		public void Produce();
	}
	
	//ʵ����������
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
	
	//����Ĺ����������ǽӿ�
	interface Factoryer{
		public Producer Factory();
	}
	
	//ʵ�־���Ĺ�������
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
