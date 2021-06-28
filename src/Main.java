import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int[] DENOMINATIONS = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};

    public static void main(String[] args) {
        System.out.print("Amount to divide by denominations: ");
        int amount = SCANNER.nextInt();

        ATM atm = new ATM();
        System.out.println(atm.divideAmountToDenominations(amount, DENOMINATIONS));
    }
}

