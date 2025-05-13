import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ContoCorrente cc = new ContoCorrente("Mario Rossi", 100);
        ContoOnLine co = new ContoOnLine("Anna Verdi", 150, 50);

        try {
            System.out.println("Prelievo su conto corrente:");
            cc.preleva(120);
        } catch (BancaException e) {
            System.out.println("Errore CC: " + e.getMessage());
        }

        try {
            System.out.println("Prelievo su conto online:");
            co.preleva(80);
        } catch (BancaException e) {
            System.out.println("Errore CO: " + e.getMessage());
        }

        co.stampaSaldo();
    }
}