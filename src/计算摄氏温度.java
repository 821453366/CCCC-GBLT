import java.util.Scanner;

/**
 * Created by pc on 17-3-12.
 */
public class 计算摄氏温度 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int i_f = input .nextInt();
        int i_c=5*(i_f-32)/9;
        System.out.print("Celsius = "+i_c);

    }
}
