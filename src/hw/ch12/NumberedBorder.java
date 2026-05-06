package hw.ch12;

public class NumberedBorder extends Border {

    public NumberedBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        // 행 번호 "%2d|"가 앞에 붙으므로 4칸 증가
        return 4 + display.getColumns();
    }

    @Override
    public int getRows() {
        // 행 수는 내용물과 똑같게
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        // row는 0부터 시작하므로 출력 번호는 row + 1로 해준다
        return String.format("%2d|%s", row + 1, display.getRowText(row));
    }
}