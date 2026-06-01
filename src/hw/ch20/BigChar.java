package hw.ch20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BigChar {
    // 색상 리셋 코드
    private static final String RESET = "\u001B[0m";

    // 문자의 이름 
    private char charname;

    // 큰 문자를 표현하는 문자열('#' '.' '\n'의 열)
    // fontdata는 BigChar 안에 저장되는 내재 상태이다.
    private String fontdata;

    // 생성자 
    public BigChar(char charname) {
        this.charname = charname;
        try {
            String filename = "src/hw/ch20/big" + charname + ".txt";
            StringBuilder sb = new StringBuilder();
            for (String line: Files.readAllLines(Path.of(filename))) {
                sb.append(line);
                sb.append("\n");
            }
            this.fontdata = sb.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    // 큰 문자를 표시한다
    public void print() {
        System.out.print(fontdata);
    }

    // 색상 코드를 외재 상태로 받아 큰 문자를 표시한다
    public void print(String colorCode) {
        System.out.print(colorCode + fontdata + RESET);
    }
}
