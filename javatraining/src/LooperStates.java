
               // No arguments constructor
public class LooperStates {
    long a = 987612346l;
    long b = 987654321l;

    LooperStates() {
        if (a > b) {
            System.out.println("The biggest num is =" + a);
        } else {
            System.out.println("The Smallest number is =" + a);

        }
    }
    public static void main(String[] args){
        LooperStates biggest = new LooperStates();

    }
}
