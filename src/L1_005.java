import java.util.Scanner;

/**L1_005
 * Created by pc on 17-3-12.
 */
public class L1_005 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int a=input.nextInt();
        String b[]=new String [a];
        int c[] = new int[a];
        int d[]= new int[a];

        for(int i= 0; i<a;i++){//依次存入信息
            b[i]=input.next();
            c[i]=input.nextInt();
            d[i]=input.nextInt();
        }
        int e=input.nextInt();//查找的个数
        int f[]=new int[e];
        for (int i=0 ; i<e;i++){
            f[i]=input.nextInt();//要查找的试机号
        }

        for(int i=0; i<e;i++){
            for (int j=0;j<a;j++){
                if(f[i]==c[j]){
                    System.out.println(b[j]+" "+d[j]);
                }
            }
        }
    }
}
/*
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int d,e,i,j;
		Scanner input = new Scanner(System.in);
		d=input.nextInt();
		String a[] = new String [d];
		int b[] = new int [d];
		int c[] = new int [d];

		for(i=0;i<d;i++){//存入信息
			a[i]=input.next();
			b[i]=input.nextInt();
			c[i]=input.nextInt();
			}
		e=input.nextInt();//查找个数
		int f[] = new int [e];
		for(j=0;j<e;j++){
			f[j]=input.nextInt();//存入试机号
		}

		for(j=0;j<e;j++){
			for(i=0;i<d;i++){
				if(f[j]==b[i]){
					System.out.print(a[i]+" "+c[i]+"\n");
				}
			}
		}
	}
}
*/