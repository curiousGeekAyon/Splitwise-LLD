import java.util.List;

public class EqualSplitingStrategy implements SplitingStrategy{
    @Override
    public void split(List<Split> splits, double amount) {
        int spliterSize=splits.size();
        double amountPaid=amount/spliterSize;
        for(Split split: splits)
            {
                split.setAmountPaid(amountPaid);
            }
    }
}
