import java.util.Scanner;

public class L1_003 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String arr = input.next();
        int[] n = new int[10];

        for (int i=0;i<arr.length();i++){
            n [arr.charAt(i)-'0']++;
        }
        for (int i=0; i<n.length;i++){
            if(n[i]!=0){
                System.out.println(i+":"+n[i]);
            }
        }

    }
}

/*

import java.util.Scanner;
public class L1_003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        String n = in.next();
        for(int i = 0;i<n.length();i++)
        a[n.charAt(i)-'0']++;
        for (int arr:a) {
            System.out.println(arr);

        }
       for(int i = 0;i<a.length;i++)
        if(a[i]!=0)
        System.out.println(i+":"+a[i]);
    }
}
*/


