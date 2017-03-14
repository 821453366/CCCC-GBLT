import java.util.Scanner;

/**
 * Created by pc on 17-3-14.
 */
public class L1_019 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int i_suma=0;
        int i_sumb=0;


        int i_a=input.nextInt();
        int i_b= input.nextInt();
        int i_num=input.nextInt();
        int i_han1[]=new int [i_num];
        int i_chu1[]=new int [i_num];
        int i_han2[]=new int [i_num];
        int i_chu2[]=new int [i_num];

        for(int i=0 ; i<i_num;i++){
            i_han1[i]=input.nextInt();
            i_chu1[i]=input.nextInt();
            i_han2[i]=input.nextInt();
            i_chu2[i]=input.nextInt();
        }
        for(int i=0;i<i_num;i++){
            int i_sum=i_han1[i]+i_han2[i];
            if(i_chu1[i]==i_sum&&i_chu2[i]!=i_sum){
                i_a--;
                i_suma++;
            }
            if(i_chu2[i]==i_sum&&i_chu1[i]!=i_sum){
                i_b--;
                i_sumb++;
            }
            if(i_a<0||i_b<0){
                break;
            }
        }
        if(i_a<0){
            System.out.print("A\n"+i_sumb);
        }
        if(i_b<0){
            System.out.print("B\n"+i_suma);
        }

    }
}
