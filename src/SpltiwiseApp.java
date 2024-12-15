import java.util.HashMap;
import java.util.List;

public class SpltiwiseApp {
    HashMap<String,User>userMap;
    ExpenseSplitingService expenseSplitingService;
    ShowingBalanceService showingBalanceService;
    HashMap<User,HashMap<User,Double>>balanceMap;
    public void createNewExpenseandHandelBalanceCalculation(ExpenseInputDetails expenseInputDetails)
    {
        Expense expense=new Expense.ExpenseBuilder().setAmount(expenseInputDetails.getAmount()).setSplits(expenseInputDetails.getSplits()).setSplit_type(expenseInputDetails.getSplitType()).setPaidBy(expenseInputDetails.getPaidBy()).build();
        expenseSplitingService.split(expense);
        handelBalance(expense);
    }

    public SpltiwiseApp() {
        userMap=new HashMap<>();
        balanceMap=new HashMap<>();
        ExpenseSplitingService expenseSplitingService=new ExpenseSplitingService();
        ShowingBalanceService showingBalanceService=new ShowingBalanceService(balanceMap);
    }

    private void handelBalance(Expense expense) {

    }
    public void showBalance(User user)
    {
        if(user!=null)
        {
            showingBalanceService.showforAllUser();
        }
        else{
            showingBalanceService.showforCurrentUser(user);
        }
    }
}
