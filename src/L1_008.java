import java.util.Scanner;

/**求整数段和
 * Created by pc on 17-3-12.
 */
public class L1_008 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int i_begin = input .nextInt();
        int i_end = input.nextInt();
        int a=0;
        int sum=0;
        for(int i=i_begin ;i<=i_end;i++){

            if(a==5){
                a=0;
                System.out.println();
            }
            sum +=i;
            System.out.printf("%5d",i);

            a++;
        }
        System.out.println();
        System.out.print("Sum = "+sum);

    }
}
