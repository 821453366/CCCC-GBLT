import java.util.Scanner;
/**
 * Created by pc on 17-3-14.
 */
public class L1_013 {
        public static void main(String [] agrs){
            int sum=0;
            int sumhe=0;
            Scanner input =new Scanner(System.in);
            int a = input.nextInt();
            for(int i= a;i>0;i--){
                sum=i;
                for(int j=i-1;j>0;j--){
                    sum*=j;
                }
                sumhe+=sum;
            }
            System.out.println(sumhe);
        }
    }

