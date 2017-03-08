import java.util.Scanner;

/**
 * Created by pc on 17-3-8.
 */
public class 正整数A加B {
/*L1-1 正整数A+B*/
    public static void main (String [] args){
        int i_a=0,i_b=0,i_c=0;
        int d=0,f=0;
            Scanner input = new Scanner(System.in);
            String a=input.next();
            String b=input.next();
            try {
                 i_a = Integer.parseInt(a);

            }catch (Exception e){
                 i_a = 0;
            }
            try {
                i_b = Integer.parseInt(b);
            }catch (Exception e){
                i_b = 0;
            }

            if(i_a>=1&&i_a<=1000){
                d=1;
            }else{
                d=0;
            }
            if(i_b>=1&&i_b<=10000){
                f=1;
            }else{
                f=0;
            }
            if(d==1&&f==1){
                i_c=i_a+i_b;
                System.out.println(i_a+" + "+i_b+" = "+i_c);
            }else if (d==0&&f==1){
                System.out.println("? + "+i_b+" = ?");
            }else if(d==1&&f==0){
                System.out.println(i_a+" + ? = ?");
            }else if (d==0&&f==0){
                System.out.println("? + ? = ?");
        }


    }
}
