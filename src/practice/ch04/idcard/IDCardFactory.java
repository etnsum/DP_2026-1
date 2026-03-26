package practice.ch04.idcard;
import ch04.Sample.framework.Factory;
import ch04.Sample.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    // 부모 타입은 자식 객체를 참조할 수 있다.
    // 부모 객체는 자식 타입이 참조할 수 없다.
    protected Product createProduct(String owner) { //실제 제품 생산
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) { //생산된 제품을 등록
        System.out.println(product + "을 등록했습니다.");
    }
}
