interface Fact {
    int fact(int n);
}
class Factorial{
    public static void main(String[]args){
        System.out.println(((Fact) n->{
            int fact=1;
            for(int i=1;i<=n;i++) fact *=i;
            return fact;
        }).fact(6));

    }
}