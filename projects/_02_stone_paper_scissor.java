import java.util.Random;
import java.util.Scanner;
public class _41_ex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter 1 to 3 for stone paper scissor resp. ");
            int choice = sc.nextInt();

            Random r = new Random();
            int comp = r.nextInt(1, 4);
            System.out.println("computer choose : " + comp);

            switch (ans(choice, comp)) {
                case 0:
                    System.out.println("U lose");
                    break;
                case 1:
                    System.out.println(" Congrats bhai ! ,U are winner");
                    break;
                case 2:
                    System.out.println("draw");
                    break;

            }
            System.out.println("Do u want to repeat if yes press Y/y else N/n");
            char ch = sc.next().charAt(0);
//            if (ch == 'n' || ch == 'N') {
//                System.out.println("exiting program......");
//                return;
//            }
//            else {
//                while (ch != 'Y' && ch != 'y' && ch != 'N' && ch != 'n') {
//                    System.out.println("enter valid input");
//                    ch = sc.next().charAt(0);
//                    if(ch=='n'|| ch=='N'){
//                        System.out.println("exiting program..................");
//                        return;
//                    }
//
//                }
//            }
            while (ch != 'Y' && ch != 'y' && ch != 'N' && ch != 'n') {
                    System.out.println("enter valid input");
                    ch = sc.next().charAt(0);
            }
            if (ch == 'n' || ch == 'N') {
                System.out.println("exiting program......");
                return;
            }
        }while (true) ;
    }
    public static int ans(int user, int comp) {
        if (user == comp) return 2; // draw
        // winning conditions: user beats comp
        if ((user == 1 && comp == 3) || // rock beats scissors
                (user == 2 && comp == 1) || // paper beats rock
                (user == 3 && comp == 2))   // scissors beats paper
            return 1;
        return 0; // user loses
    }
}

