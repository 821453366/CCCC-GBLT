import java.util.Scanner;

public class L1_011 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s_str1 = input.nextLine();
        String s_str2 = input.nextLine();
        String[] arr1 =s_str1.split("");
        String[] arr2 =s_str2.split("");
        String s_str3="";
        for(int i=0 ; i<arr1.length;i++){
            for(int j=0 ; j<arr2.length;j++){
                if(arr1[i].equals(arr2[j])&&arr1[i]!=" "){
                    arr1[i]="";
                }
            }
            s_str3 +=arr1[i];
        }
        System.out.print(s_str3);
    }
}