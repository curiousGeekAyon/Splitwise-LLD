public  class Split {
    private SPLIT_TYPE splitType;
    private User paidTo;
    private double amountPaid;

    public SPLIT_TYPE getSplitType() {
        return splitType;
    }

    public void setSplitType(SPLIT_TYPE splitType) {
        this.splitType = splitType;
    }

    public User getPaidTo() {
        return paidTo;
    }

    public void setPaidTo(User paidTo) {
        this.paidTo = paidTo;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Split(SPLIT_TYPE splitType, User paidTo) {
        this.splitType = splitType;
        this.paidTo=paidTo;
    }

}
