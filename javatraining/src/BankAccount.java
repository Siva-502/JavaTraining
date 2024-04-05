public class BankAccount {
    Long accountnumber = 123456789l;
    Integer bankbalance = 0;
    String accountholder= "Siva";

    public void getbalance()
    {
        System.out.println("the Balance is:"+bankbalance );
    }

    public static void main(String[] args)
    {
        BankAccount account = new BankAccount();
        account.getbalance();

    }




}
