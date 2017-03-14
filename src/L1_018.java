import java.util.Scanner;

public class L1_018 {
    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner input = new Scanner(System.in);
        String s_time = input.next();

        String s1[] = s_time.split(":");
        int h = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);
        if (m > 0) {
            b = 1;
        }
        if (h - 12 == 0 && b != 0) {
            System.out.print("Dang");
        }
        if (h - 12 < 0 || (h-12==0&&b==0) ){
            System.out.print("Only " + s_time + ".  Too early to Dang.");
        } else {
            a = h - 12;
        }
        if (h - 12 > 0) {
            for (int i = 0; i < a + b; i++) {
                System.out.print("Dang");
            }
        }
    }
}
