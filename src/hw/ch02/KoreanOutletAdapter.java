package hw.ch02;

public class KoreanOutletAdapter implements Charger {

    private KoreanOutlet outlet;  // Adapter를 내부적으로 포함시킴

    // 생성자에서 객체 주입
    public KoreanOutletAdapter(KoreanOutlet outlet) {
        this.outlet = outlet;
    }

    @Override
    public int charge() {
        // provide()를 charge()로 변환하여 호출
        return outlet.provide(); // chargee() 메서드 안에 provide() 메서드 호출하여 220V를 반환
    }
}