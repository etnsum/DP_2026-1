package hw.ch03;

public class NumberDisplay extends AbstractDisplay {
    private int number;

    // 생성자 숫자, 반복 횟수
    public NumberDisplay(int number, int repeatCount) {
        super(repeatCount);
        this.number = number;
    }

    @Override
    public void open() {
        System.out.println("<<Number>>");
    }

    @Override
    public void print() {
        System.out.println(number);
    }

    @Override
    public void close() {
        System.out.println("<<Number>>");
    }
}