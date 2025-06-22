import java.util.Random;
import java.util.Scanner;

class game{
    int r;
    int u;
    int noOfGuesses=0;
    public game(){
        Random ran=new Random();
        r=ran.nextInt(100);
    }
    public void userinput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number :");
        u=sc.nextInt();
    }
    public boolean iscorrectNo(){
        noOfGuesses++;
        if(r==u){
            System.out.println("congrats u guessed it in "+ noOfGuesses+" trials .");
            return true;
        } else if (u<r) {
            System.out.println("Higher number pleae");
        } else if (u>r) {
            System.out.println("Lower number please");
        }
        return false;
    }
}
public class _43_guessNo
 {
    public static void main(String[] args) {

        game g=new game();
        boolean b=false;
        while(!b){
            g.userinput();
            b =g.iscorrectNo();
            System.out.println(b);
        }
    }
}
