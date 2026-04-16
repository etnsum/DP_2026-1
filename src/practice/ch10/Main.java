package practice.ch10;

public class Main {
    public static void main(String[] args) {
    

    Player player1 = new Player("Alice", new WinningStrategy(314));
    Player player2 = new Player("Bob", new WinningStrategy(15));

    for ( int i = 0; i < 10; i++) {
        // 플레이어가 각각 손 얻음
        Hand nextHand1 = player1.nextHand();
        Hand nextHand2 = player2.nextHand();

        // 손을 대결시킴
        if (nextHand1.isStrongerThan(nextHand2)) {
            System.out.println("Winner: " + player1);
            player1.win();
            player2.lose();
        } else if (nextHand2.isStrongerThan(nextHand1)) {
            System.out.println("Winner: " + player2);
            player1.lose();
            player2.win();
        } else {
            System.out.println("Even...");
            player1.even();
            player2.even();
        }
    }
}
