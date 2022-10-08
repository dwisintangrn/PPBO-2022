import java.util.Scanner;

public class PPBO_05_Problem2 {
    public static void main(String args[] ) throws Exception {
        String s;
        Scanner input = new Scanner(System.in);

        s = input.nextLine();
        input.close();

        int rule;
        if(s.matches("^[AaiIuUeEoO].*")){
            rule = 1;
        }else if(s.matches("^(.*[^ng])(ng)")){
            rule = 2;
        }else {
            rule = -1;
        }
        System.out.println(rule);
    }
}
