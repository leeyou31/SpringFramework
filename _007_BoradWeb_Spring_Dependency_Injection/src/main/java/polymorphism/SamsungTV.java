package polymorphism;

public class SamsungTV implements TV {
	private SonySpeaker speaker;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV ��ü ����");
	}
	
	public void powerOn() {
		System.out.println("SaamsungTV --- ���� �Ҵ�.");
	}
	public void powerOff() {
		System.out.println("SaamsungTV --- ���� ����.");
	}
	
	public void volumeUp() {
		speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker = new SonySpeaker();
		speaker.volumeDown();
	}
}
