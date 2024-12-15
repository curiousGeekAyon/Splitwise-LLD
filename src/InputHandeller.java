import java.util.ArrayList;
import java.util.List;

public class InputHandeller {

    SpltiwiseApp spltiwiseApp;
    public InputHandeller(SpltiwiseApp spltiwiseApp)
    {
        this.spltiwiseApp=spltiwiseApp;
    }
    public void handelInput(String input){
        if(input.contains(ACTION.EXPENSE.name()))
        {
            ExpenseInputDetails expenseInputDetails=new ExpenseInputDetails();
//            EXPENSE u4 1200 4 u1 u2 u3 u4 PERCENT 40 20 20 20

            if(input.contains(SPLIT_TYPE.EQUAL.name()))
            {
                String []inputs=input.split(" ");
                expenseInputDetails.setPaidBy(spltiwiseApp.userMap.get(inputs[1]));
                int count=Integer.parseInt(inputs[3]);
                double amount=Integer.parseInt(inputs[2]);
                List<Split>splits=new ArrayList<>();
                expenseInputDetails.setSplits(splits);
                expenseInputDetails.setSplitType(SPLIT_TYPE.EQUAL);
                for(int i=0;i<count;i++)
                {
                     splits.add(new EqualSplit(spltiwiseApp.userMap.get(inputs[3+i])));
                }
            }
            else if(input.contains(SPLIT_TYPE.PERCENT.name()))
            {
                String []inputs=input.split(" ");
                expenseInputDetails.setPaidBy(spltiwiseApp.userMap.get(inputs[1]));
                int count=Integer.parseInt(inputs[3]);
                double amount=Integer.parseInt(inputs[2]);
                List<Split>splits=new ArrayList<>();
                expenseInputDetails.setSplits(splits);
                for(int i=0;i<count;i++)
                {
                    splits.add(new PercentageSplit(Double.parseDouble(inputs[3+i+count+1]),spltiwiseApp.userMap.get(inputs[3+i])));
                }
            }
            else if(input.contains(SPLIT_TYPE.EXACT.name()))
            {
                String []inputs=input.split(" ");
                expenseInputDetails.setPaidBy(spltiwiseApp.userMap.get(inputs[1]));
                int count=Integer.parseInt(inputs[3]);
                double amount=Integer.parseInt(inputs[2]);
                List<Split>splits=new ArrayList<>();
                expenseInputDetails.setSplits(splits);
                for(int i=0;i<count;i++)
                {
                    splits.add(new ExactSplit(Double.parseDouble(inputs[3+i+count+1]),spltiwiseApp.userMap.get(inputs[3+i])));
                }
            }
            else{
                System.out.println("WRONG INPUT");
            }
        }
        else if(input.contains(ACTION.SHOW.name()))
        {
            String []inputs=input.split(" ");
            if(inputs.length>1)
            {
                spltiwiseApp.showingBalanceService.showforCurrentUser(spltiwiseApp.userMap.get(inputs[1]));
            }
            else{
                spltiwiseApp.showingBalanceService.showforAllUser();
            }
        }
    }
}
