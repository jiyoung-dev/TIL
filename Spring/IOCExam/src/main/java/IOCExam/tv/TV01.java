package IOCExam.tv;

public class TV01 implements TV{

	public TV01() {
		return;
	}
	@Override
	public void turnOn() {
		System.out.println("1: 전원을 켭니다");		
	}

	@Override
	public void turnOff() {
		System.out.println("1: 전원을 끕니다");		
	}

	@Override
	public void volumeUp() {
		System.out.println("1: 볼륨을 높입니다");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("1: 볼륨을 낮춥니다");
		
	}

}
