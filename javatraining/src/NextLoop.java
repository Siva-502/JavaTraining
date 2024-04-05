public class NextLoop {
    //  Parameterized constructor
        long a;
        long b;

        NextLoop(long a , long b) {
            if (a > b) {
                System.out.println("The biggest num is =" + a);
            } else {
                System.out.println("The Smallest number is =" + a);

            }
        }
        public static void main(String[] args){
            NextLoop biggest = new NextLoop(1 , 9);
            NextLoop smallest = new NextLoop( 81478148124l , 12398992l);

        }
    }

