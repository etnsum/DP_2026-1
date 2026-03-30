package hw.ch03;

public class Main {
    public static void main(String[] args) {

        // [3-1] 기본 테스트 (기존 코드 호환성)
        System.out.println("=== 기본 테스트 ===");
        AbstractDisplay d1 = new CharDisplay('H');          // 기본 5회
        AbstractDisplay d2 = new StringDisplay("Hello");    // 기본 5회
        d1.display();
        d2.display();

        // [3-2] 반복 횟수 제어 테스트
        System.out.println("\n=== 반복 횟수 테스트 ===");
        AbstractDisplay d3 = new CharDisplay('X', 3);       // 3회
        AbstractDisplay d4 = new StringDisplay("Test", 7);  // 7회
        d3.display();
        d4.display();

        // [3-3] NumberDisplay 테스트
        System.out.println("\n=== NumberDisplay 테스트 ===");
        AbstractDisplay num = new NumberDisplay(42, 4);
        num.display();
    }
}