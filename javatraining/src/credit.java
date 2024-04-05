public class credit {
   public Integer Creditamount= 23500;

    public Integer requestamount()
    {
        Long requestedamount= 30000l;
        System.out.println("the requested amt is = "+requestedamount );
        return Creditamount;
    }
    public static void main(String[] args)
    {
        credit debtamt = new credit();
        debtamt.requestamount();
        Integer loan = debtamt.Creditamount;
        System.out.println("But the Credited amt is =" +loan);
    }
}
