import java.util.List;

public class ExpenseInputDetails {
    private SPLIT_TYPE splitType;
    private List<Split> splits;
    private User paidBy;
    private double amount;

    public SPLIT_TYPE getSplitType() {
        return splitType;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

//    public ExpenseInputDetails(User paidBy, SPLIT_TYPE splitType, List<Split> splits) {
//        this.splitType = splitType;
//        this.splits = splits;
//        this.paidBy=paidBy;
//    }

    public void setSplitType(SPLIT_TYPE splitType) {
        this.splitType = splitType;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
