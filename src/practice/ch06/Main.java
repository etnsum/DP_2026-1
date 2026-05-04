package practice.ch06;
import practice.ch06.framework.Manager;
import practice.ch06.framework.Product;

public class Main {
    public static void main(String[] args) {
        MessageBox mbox1 = new MessageBox('*');
        mbox1.use("Hello, world.");

        mbox1.createCopy().use("Hello, world.");

        product p1 = manager.create("star box");
        p1.use("Hello, world.");


    }
}
