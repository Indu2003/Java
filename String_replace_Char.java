import java.util.*;
public class prog7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String s=sc.nextLine();
        System.out.println("Enter the char ");
        char ch1=sc.next().charAt(0);
        System.out.println("Enter the char ");
        char ch2=sc.next().charAt(0);
        int l=s.length();
        char[] c=s.toCharArray();
        String res=replaceChar(c,l,ch1,ch2);
        System.out.println(res);
    }

    public static String replaceChar(char[] c, int l, char ch1, char ch2) {
        if (c==null)
            return null;
        for (int i=0;i<c.length;i++){
            if (c[i]==ch1)
                c[i]=ch2;
            else if (c[i]==ch2)
                c[i]=ch1;

        }
        return new String(c);
        
    }
}