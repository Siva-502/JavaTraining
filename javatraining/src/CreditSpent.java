
                 //More than one method using returntype

public class CreditSpent {
    int creditamt = 23500;
    int amtspent = 3623;
    int balance;
    int a;
    int b;

   public void spentamt()
       {
           System.out.print("Total Balance =" +balance);
       }


    public int subtractedamt()
    {
        int a = creditamt;
        return creditamt;
    }
    public int expenseamt()
    {
        int b = amtspent;
        return amtspent;
    }

    public int totalbalance()
    {
        int balance = a - b;
        return balance;
    }

    public static void main(String[] args)
    {
        CreditSpent debt = new CreditSpent();
        debt.subtractedamt();
        debt.expenseamt();
        debt.totalbalance();
        debt.spentamt();

    }
}
