import java.util.Scanner;

/**反而成俗
 * 8分
 * Created by pc on 17-3-13.
 */
public class L1_017 {
    public static void main(String [] args){
        double i_two=0;
        double i_num=0;
        double i_sum=0;
        long i_length=0;

        Scanner input = new Scanner(System.in);
        String s_str=input.next();
        for(int i=0 ;i<s_str.length();i++){
            if((s_str.charAt(i)-'0')==2){
                i_two++;
            }
        }
         long i_intstr=Long.parseLong(s_str);
        if(i_intstr<0){
            i_num=0.5;
            i_length=s_str.length()-1;
        }else {
            i_length=s_str.length();
        }
        if((i_intstr%2)==0){
            i_sum=1;
        }
       double  d=((i_two/i_length)*(i_num+i_sum)*2*100);
        double f=((double)((int)(d*100+0.5)))/100;
        System.out.println(f+"%");

    }
}
