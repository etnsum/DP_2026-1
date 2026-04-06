package hw.ch04.license;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class LicenseCardFactory extends Factory {
    private int licenseCounter = 100; // 면허증 번호 자동 증가
    private String baseDate; // 발급 날짜

    public LicenseCardFactory(String baseDate) { // 생성자 추가
        this.baseDate = baseDate;
    }

    @Override
    protected Product createProduct(String holder) {
        int currentNumber = licenseCounter++;
        String expiryDate = makeExpiryDate(baseDate);
        return new LicenseCard(holder, currentNumber, baseDate, expiryDate);
    }

    @Override
    protected void registerProduct(Product product) { // 등록 메서드 구현
        System.out.println(product + "을 등록했습니다.");
    }

    private String makeExpiryDate(String issuedDate) {
        String[] parts = issuedDate.split("-");
        int year = Integer.parseInt(parts[0]) + 5;
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]) - 1;

        if (day == 0) {
            day = 1;
        }

        return String.format("%04d-%02d-%02d", year, month, day);
    }
}