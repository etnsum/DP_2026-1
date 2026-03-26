package practice.ch04;

import ch04.Sample.framework.Factory;
import ch04.Sample.framework.Product;
import ch04.Sample.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        
        // (1) IDCard를 직접 생성
        //Product card1 = new IDCard("김여름");
        //card1.use();

        // (2) Factory를 이용하여 IDCard 생성
        Factory factory = new IDCardFactory();
        Product card2 = factory.create("한리안");

        card2.use();
    }
}
