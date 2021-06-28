
import java.util.ArrayList;
import java.util.List;

public class ATM {

    public List<Integer> divideAmountToDenominations(int amount, int[] denominations) {
        return getMultipleAddendum(denominations, amount, new ArrayList<Integer>(), 0);
    }

    private List<Integer> getMultipleAddendum(int[] availableDenominations, int neededAmount, List<Integer> denominations, int currentAmount) {
        int receivedDenomination = getSingleAddendum(availableDenominations, availableDenominations.length - 1, currentAmount, neededAmount);
        currentAmount += receivedDenomination;
        denominations.add(receivedDenomination);
        return currentAmount < neededAmount
                ? getMultipleAddendum(availableDenominations, neededAmount, denominations, currentAmount)
                : denominations;

    }

    private int getSingleAddendum(int[] denominations, int iteration, int currentAmount, int neededAmount) {
        int addendum = denominations[iteration];
        int newCurrentAmount = currentAmount + addendum;
        return newCurrentAmount <= neededAmount
                ? addendum
                : getSingleAddendum(denominations, iteration - 1, currentAmount, neededAmount);
    }

}

