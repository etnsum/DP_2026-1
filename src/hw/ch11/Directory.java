package hw.ch11;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : directory) {
            size += entry.getSize();
        }
        return size;
    }

        // search 구현
    @Override
    public List<Entry> search(String keyword) {
        List<Entry> result = new ArrayList<>();

        // 자기 자신 검사
        if (name.contains(keyword)) {
            result.add(this);
        }

        // 재귀 호출
        for (Entry entry : directory) {
            result.addAll(entry.search(keyword)); // 결과 병합
        }

        return result;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry : directory) {
            entry.printList(prefix + "/" + name);
        }
    }

    public Entry add(Entry entry) {
        directory.add(entry);
        entry.setParent(this);
        return this;
    }
}