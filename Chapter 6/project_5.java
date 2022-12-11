public class project_5{
    public static void main(int a,int b,int c){
        int L =0;
        if(a>b && a>c)
            L = a;
        else if(b>a && b>c)
            L = b;
        else
            L = c;
        System.out.println(L +" Is The Largest");
    }
}