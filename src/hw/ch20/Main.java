package hw.ch20;

public class Main {
    static final String RED = "\u001B[31m";
    static final String GREEN = "\u001B[32m";
    static final String YELLOW = "\u001B[33m";
    static final String BLUE = "\u001B[34m";
    static final String MAGENTA = "\u001B[35m";
    static final String CYAN = "\u001B[36m";
    static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java hw.ch20.Main digits");
            System.out.println("Example: java hw.ch20.Main 1212123");
            System.exit(0);
        }

        BigString bs = new BigString(args[0], true);

        String[] colors = {
            RED,      // 1
            BLUE,     // 2
            GREEN,    // 1
            MAGENTA,  // 2
            CYAN,     // 1
            YELLOW,   // 2
            BLUE      // 3
        };

        bs.print(colors);
    }
}