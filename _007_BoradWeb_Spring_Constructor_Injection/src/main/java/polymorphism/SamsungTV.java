package polymorphism;

public class SamsungTV implements TV {
	private SonySpeaker speaker;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) ��ü ����");
	}
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===> SamsungTV(2) ��ü ����");
		this.speaker = speaker;
	}
	
	
	public void powerOn() {
		System.out.println("SaamsungTV --- ���� �Ҵ�.");
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
