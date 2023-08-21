package section18;

public class Thread06 {
	
	public static void main(String[] args) {
		
		System.out.println("메인스레드 시작!");
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("익명 스레드 시작");
				
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
				}
				
				System.out.println("익명 스레드 종료");
			}
		});
		
		thread1.start();
		System.out.println("메인스레드 종료!");
	}

}
