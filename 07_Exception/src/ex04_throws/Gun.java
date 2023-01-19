package ex04_throws;

public class Gun {

	private int bullet;
	public static final int MAX_BULLET = 10;
	
	// 총알 넣기
	public void reload(int bullet) throws RuntimeException {	// reload 메소드를 호출하는 곳으로 예외를 던지겠다.
		if(this.bullet + bullet > MAX_BULLET) {
			throw new RuntimeException("장전 불가능");
		}
		this.bullet += bullet;
	}
	
	// 총 쏘기
	public void shoot() throws RuntimeException {	// 메소드에서 하나 이상의 예외를 던질 수 있기에 throw가 아닌 throws가 된다.
		if(bullet == 0) {
		throw new RuntimeException("need reload");
		}
		bullet--;
		System.out.println("f");
	}

	public int getBullet() {
		return bullet;
	}

	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
	
	
	
}
