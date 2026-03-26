package practice.ch03;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H'); //작따: 캐릭터, 큰따: 문자열
        d1.display();

        AbstractDisplay d2 = new StringDisplay("Hello, world."); //작따: 캐릭터, 큰따: 문자열
        d2.display();
    }
}
