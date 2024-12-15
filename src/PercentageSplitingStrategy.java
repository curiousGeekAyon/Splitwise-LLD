import java.util.List;

public class PercentageSplitingStrategy implements SplitingStrategy{
    public void split(List<Split>splits,double amount) {
            double total=0;
            for(int i=0;i<splits.size();i++)
            {
                PercentageSplit split=(PercentageSplit) splits.get(i);
                double percentage=split.getPercentage();
                total+=percentage;
                double amountPaid=(amount*percentage)/100;
                split.setAmountPaid(amountPaid);
            }
    }
}

