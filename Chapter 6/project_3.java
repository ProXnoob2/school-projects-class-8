public class project_3{
    public static void main(int a, int b){
        int product = a*b;
        if(product%10==7 || product%7==0)
            System.out.println("Buzz");
        else
            System.out.println("Not Buzz");
    }
}