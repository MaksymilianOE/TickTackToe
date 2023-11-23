import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
/**
 * @author Maksy
 *
 */
        class Player {
            String name = this.name;
            String icon = this.icon;
        }
        Player player1 = new Player();
        Player player2 = new Player();

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Gib den Namen vom ersten Spieler ein");
            player1.name = scanner.nextLine();
            System.out.println("Gib den Namen vom zweiten Spieler ein");
            player2.name = scanner.nextLine();
            System.out.println("Namen: Spieler1 : " + player1.name + " Spieler2 : " + player2.name);
            System.out.println("Gib das Zeichen von Spieler 1 ein");
            player1.icon = scanner.nextLine();
            System.out.println("Gib das Zeichen von Spieler 2 ein");
            player2.icon = scanner.nextLine();
            System.out.println("Icons Player1 & 2: " + player1.icon + " " + player2.icon);
        } catch (Exception e) {
            System.out.println("Fehler. Versuche es erneut! " + e);
        }

        int rows = 3; //X
        int column = 3; //Y
        /**
         * - - -
         * - X - => 2,2
         * - - -
         */
        try {
            setPoint(3,2, "X");
        } catch (Exception e) {
            System.out.println("Fehler! " + e);
        }
    }

    public static void setPoint(int X, int Y, String type) throws Exception {
        if (X <= 3 && Y <= 3) {
            render(X,Y, type);
        } else {
            throw new Exception("Die Zahlen sind nicht im Rahmen des Spiels (max 3)");
        }
    }

    public static void showGrid () {
        for (int i = 1; i <= 3; i++) {
            System.out.println(" - - -");
        }
    }
    public static void render(int row, int column, String icon) {
        for (int i = 1; i <= 3; i++) { //Row
            for (int j = 1; j <= 3; j++) {
                if (i == row && j == column) {
                    System.out.print(" " + icon + " ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println("");
        }
    }
}
