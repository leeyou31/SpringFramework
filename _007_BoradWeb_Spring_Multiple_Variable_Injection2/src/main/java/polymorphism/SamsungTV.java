package polymorphism;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) ��ü ����");
	}
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(2) ��ü ����");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(3) ��ü ����");
		this.speaker = speaker;
		this.price = price;
	}
	
	
	
	public void powerOn() {
		System.out.println("SamsungTV --- ���� �Ҵ�. (����: " + price +")");
	}
	public void powerOff() {
		System.out.println("SamsungTV --- ���� ����.");
	}
	
	public void volumeUp() {

		speaker.volumeUp();
	}
	
	public void volumeDown() {

		speaker.volumeDown();
	}
}
