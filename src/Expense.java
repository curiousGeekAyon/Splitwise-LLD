import java.util.List;

public class Expense {
    private User paidBy;
    private double amount;
    private List<Split> splits;
    private SplitingStrategy splitingStrategy;
    private SPLIT_TYPE splitType;
    private Expense(ExpenseBuilder expenseBuilder)
    {
        this.amount=expenseBuilder.getAmount();
        this.paidBy=expenseBuilder.getPaidBy();
        this.splits=expenseBuilder.getSplits();
        this.splitingStrategy=expenseBuilder.getSplitingStrategy();
        this.splitType=expenseBuilder.getSplit_type();
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }

    public SplitingStrategy getSplitingStrategy() {
        return splitingStrategy;
    }

    public void setSplitingStrategy(SplitingStrategy splitingStrategy) {
        this.splitingStrategy = splitingStrategy;
    }

    public SPLIT_TYPE getSplitType() {
        return splitType;
    }
    public void split(){
        if(splitingStrategy!=null)
        {
            splitingStrategy.split(splits,amount);
        }
    }

    public void setSplitType(SPLIT_TYPE splitType) {
        this.splitType = splitType;
    }

    public static class ExpenseBuilder
        {
            private User paidBy;
            private double amount;
            private List<Split> splits;
            private SplitingStrategy splitingStrategy;
            private SPLIT_TYPE split_type;

            public SPLIT_TYPE getSplit_type() {
                return split_type;
            }

            public ExpenseBuilder setSplit_type(SPLIT_TYPE split_type) {
                this.split_type = split_type;
                return this;
            }

            public User getPaidBy() {
                return paidBy;
            }

            public ExpenseBuilder setPaidBy(User paidBy) {
                this.paidBy = paidBy;
                return this;
            }

            public double getAmount() {
                return amount;
            }

            public ExpenseBuilder setAmount(double amount) {
                this.amount = amount;
                return this;
            }

            public List<Split> getSplits() {
                return splits;
            }

            public ExpenseBuilder setSplits(List<Split> splits) {
                this.splits = splits;
                return this;
            }

            public SplitingStrategy getSplitingStrategy() {
                return splitingStrategy;
            }

            public ExpenseBuilder setSplitingStrategy(SplitingStrategy splitingStrategy) {
                this.splitingStrategy = splitingStrategy;
                return this;
            }
            public Expense build()
            {
                 return new Expense(this);
            }
        }
}
