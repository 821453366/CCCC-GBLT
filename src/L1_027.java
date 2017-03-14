import java.util.Scanner;

/**
 * Created by pc on 17-3-9.
 */
public class L1_027 {
    public static void main (String[] agrs){
        String arr="";
        int b=0;
        int n[]=new int [10];
        int aa[]=new int [11];
        Scanner input = new Scanner(System.in);
        String s_num=input.next();
        for(int i= 0 ;i<s_num.length();i++){
            n[s_num.charAt(i)-'0']++;
        }
        System.out.print("int[] arr = new int[]{");
        for (int i= n.length-1;i>=0;i--){
            if(n[i]!=0){
                arr+=i;
                b++;
                if (b == 1) {
                    System.out.print(i);
                }else {
                    System.out.print(","+i);
                }
            }
        }
        System.out.println("};");

        System.out.print("int[] index = new int[]{");
        b=0;
        for(int i = 0; i<aa.length;i++){
            b++;
           aa[i]= arr.indexOf(s_num.charAt(i));
           if(b==1){
            System.out.print(aa[i]);
           }else {
               System.out.print(","+aa[i]);
           }
        }
        System.out.print("};");



    }
}