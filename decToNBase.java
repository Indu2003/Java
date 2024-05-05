import java.util.Scanner;

public class progran_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a n value");
        int n=sc.nextInt();
        System.out.println("Enter a num");
        int num=sc.nextInt();
        String res=decToNBase(n,num);
        System.out.println(res);
    }

    public static String decToNBase(int n, int num) {
        StringBuilder result=new StringBuilder();
        int q=num/n;
        int[] rem=new int[1];
        rem[0]=num % n;
        int resize=1;
        while (q!=0){
            resize++;
            int[] temp=new int[resize];
            System.arraycopy(rem, 0, temp, 0, rem.length);
            rem=temp;
            rem[resize-1]=q%n;
            q=q/n;
        }
        for (int i=rem.length-1;i>=0;i--){
            if (rem[i] >9){
                result.append((char)(rem[i]-9+64));
            }
            else{
                result.append(rem[i]);
            }
        }
        return result.toString();
        
    }
}