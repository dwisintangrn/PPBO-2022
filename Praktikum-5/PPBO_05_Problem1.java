import java.util.Scanner;

public class PPBO_05_Problem1{
    public static void main(String args[] ) throws Exception {
        String s;
        Scanner input = new Scanner(System.in);

        s = input.nextLine();
        input.close();
        
        for(int x=0; x < s.length(); x+=3){
            System.out.print(s.charAt(x));
        }
    }
}
