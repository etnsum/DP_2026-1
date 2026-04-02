package practice.ch05;

public class Main {
    public static void main(String[] args) {
        // Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        if (s2 == s3) {
            System.out.println("s2와 s3는 같은 Singleton 객체입니다.");
        } else {
            System.out.println("s2와 s3는 다른 Singleton 객체입니다.");
        }

        System.out.println("s2의 값: " + s2);
        System.out.println("s3의 값: " + s3);   

        // Singleton2 사용하기
        Singleton2 s4 = Singleton2.INSTANCE; // Singleton2 객체 열기
        s4.hello(); // 싱글톤 객체의 hello 메소드 호출
    }
}
