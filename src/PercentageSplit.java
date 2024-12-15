public class PercentageSplit extends  Split {
    private double percentage;
    public PercentageSplit(double percentage,User paidTo){
        super(SPLIT_TYPE.PERCENT,paidTo);
        this.percentage=percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
