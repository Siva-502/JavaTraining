public class VoterId extends VoterDetails {
    public  VoterId()
    {
        super (9876543210l , 23);
       System.out.println("Your VoterId is Ready");
    }
    public static void main(String[] args)
    {
        VoterId election = new VoterId();
    }


}
