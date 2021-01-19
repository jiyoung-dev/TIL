package kr.co.multi.IOCExam.tv;

public class imp2_TV implements TV{
	
	public imp2_TV() {
		return;
	}
	
	@Override
	public void turnOn() {
		System.out.println("2: 전원을 켭니다");		
	}

	@Override
	public void turnOff() {
		System.out.println("2: 전원을 끕니다");		
	}

	@Override
	public void volumeUp() {
		System.out.println("2: 볼륨을 높입니다");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("2: 볼륨을 낮춥니다");
		
	}
}
