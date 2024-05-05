import java.util.*;
public class hyphen {
   
    public static void main(String[] args) {
        Scanner srn=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s=srn.nextLine();
        String res=moveHypen(s);
        System.out.println(res);
    }
    public static String moveHypen(String s){
        if (s==null){
            return null;
        }
        StringBuffer result=new StringBuffer(); 
        StringBuffer hypen=new StringBuffer();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch=='-')
                hypen.append(ch);
            else
                result.append(ch);

        }
        result.insert(0,hypen.toString());
        return result.toString();

    }
    
}


