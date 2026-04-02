package practice.es;

// 다른 방법의 싱글턴 패턴
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("Singleton 객체가 생성되었습니다.");
        slowdown(); // 객체 생성이 느려지는 메소드 호출
    }

    public static Singleton  getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
    
    private void slowdown() {
        try {
            Thread.sleep(1000); // 1초 동안 일시 정지
        } catch (InterruptedException e) {
            e.printStackTrace();    
        }
    }
}
