package hw.ch03;

public abstract class AbstractDisplay {

    // 반복 횟수 저장 필드 생성
    private int repeatCount;

    public AbstractDisplay() {
        this.repeatCount = 5;
    }

    // 반복 횟수를 받는 생성자
    public AbstractDisplay(int repeatCount) {
        this.repeatCount = repeatCount;
    }

    public abstract void open();
    public abstract void print();
    public abstract void close();

    // repeatCount 필드를 사용하도록 변경
    public final void display() {
        open();
        for (int i = 0; i < repeatCount; i++) {
            print();
        }
        close();
    }
}
