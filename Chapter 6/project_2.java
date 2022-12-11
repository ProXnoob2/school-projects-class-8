public class project_2{
    public static void main(int age1, int age2, int age3){
        int L=0, S=0;
        if(age1>age2 && age1>age3)
            L=age1;
        else if(age2>age1 && age2>age3)
            L=age2;
        else if(age3>age1 && age3>age2)
            L=age3;
        System.out.println("The Oldest Person Is: " +L +" Years Old");
        if(age1<age2 && age1<age3)
            S=age1;
        else if(age2<age1 && age2<age3)
            S=age2;
        else if(age3<age1 && age3<age2)
            S=age3;
        System.out.println("The Youngest Person Is: " +S +" Years Old");
    }
}