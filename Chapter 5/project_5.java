public class project_5{
    public static void main(int a, int b){
        System.out.println("The Values Before Were: " +a +", " +b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("The Values After Are: " +a +", " +b);
    }
}