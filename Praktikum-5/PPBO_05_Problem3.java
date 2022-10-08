import java.util.Scanner;

public class PPBO_05_Problem3 {
    public static void main(String[] args) {
        char a, b, c;
        Scanner input = new Scanner(System.in);

        a = input.next().charAt(0);
        b = input.next().charAt(0);
        input.close();

        if(a > b){
            c = b;
            b = a;
            a = c;
        }
        String x = "";
        for(;a <= b; a++){
            x += a;
        }
        System.out.print(x);
    }
}

