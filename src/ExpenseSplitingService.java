import java.util.HashMap;

public class ExpenseSplitingService {
    public void split(Expense expense){
        SPLIT_TYPE splitType=expense.getSplitType();
        if(splitType.name().equals("EQUALS"))
        {
            expense.setSplitingStrategy(new EqualSplitingStrategy());
            expense.split();
        }
        else if(splitType.name().equals("PERCENTAGE"))
        {
            expense.setSplitingStrategy(new PercentageSplitingStrategy());
            expense.split();
        }
    }
}
