package hw.ch02;

public class Main {
    public static void main(String[] args) {

        // 기존 한국 콘센트
        KoreanOutlet outlet = new KoreanOutlet();

        // Adapter 생성
        Charger adapter = new KoreanOutletAdapter(outlet);

        // 스마트폰에 어댑터 연결
        Smartphone phone = new Smartphone(adapter);

        // 충전
        phone.charge();
    }
}
