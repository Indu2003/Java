import java.util.*;
public class prime_no {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter a number");
        int n=scanner.nextInt();
        boolean flag=false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=true;
                break;
            }
        }
         if (!flag){
            System.out.println("Prime number");
         }
            else {
                System.out.println("Not a prime number");
            }

        }

        
    }
             
     




