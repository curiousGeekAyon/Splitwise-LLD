public class ExactSplit extends Split{
    public ExactSplit(double amountPaid,User paidTo) {
        super(SPLIT_TYPE.EXACT,paidTo);
        this.amountPaid=amountPaid;
    }
}
