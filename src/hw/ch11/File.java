package hw.ch11;
import java.util.ArrayList;
import java.util.List;

public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    // search 구현
    @Override
    public List<Entry> search(String keyword) {
        List<Entry> result = new ArrayList<>();

        // 자신의 이름만 검사
        if (name.contains(keyword)) {
            result.add(this); // 조건 맞으면 추가
        }

        return result; // 아니면 빈 리스트
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}