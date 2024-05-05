import java.util.Scanner;

public class Program_9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value..");
        int a=sc.nextInt();
        System.out.println("enter b value...");
        int b=sc.nextInt();
        Program_9 max=new Program_9();
        int result=max.MaxComponents(a,b);
        System.out.print("Output: ");
        System.out.print(result);
        

    }
    public static int MaxComponents(int a,int b){
        int max=0;int num=0;
        for (int i=a;i<=b;i++)
        {
            int temp=count(i);
            if(temp>max){
                max=temp;
                num=i;
            }
        }
        return num;
    }
    private static int count(int i){
        int exe=0;
        while(i%2==0 && i!=0){
                 exe++;
                 i/=2;        //i=i/2;
        }
        return exe;
    }
    
    
}
