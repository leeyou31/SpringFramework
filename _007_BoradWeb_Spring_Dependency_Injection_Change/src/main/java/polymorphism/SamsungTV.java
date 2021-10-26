package polymorphism;

public class SamsungTV implements TV {
	private SonySpeaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) ��ü ����");
	}
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===> SamsungTV(2) ��ü ����");
		this.speaker = speaker;
	}
	
	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println("===> SamsungTV(3) ��ü ����");
		this.speaker = speaker;
		this.price = price;
	}
	
	
	
	public void powerOn() {
		System.out.println("SaamsungTV --- ���� �Ҵ�. (����: " + price +")");
	}
	public void powerOff() {
		System.out.println("SaamsungTV --- ���� ����.");
	}
	
	public void volumeUp() {

		speaker.volumeUp();
	}
	
	public void volumeDown() {

		speaker.volumeDown();
	}
}
