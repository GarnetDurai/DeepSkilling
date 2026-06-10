class Main{
    public static double forcast(double amount, int n, int r){
        if(n == 0)return amount;
        double interest = (amount * 1 * r)/100;
        return forcast(interest + amount, n-1, r);
    }
    public static void main(String[]args){
        double amount = 1000;
        int n = 3;
        int r = 10;
        System.out.print(forcast(amount, n, r));
    }
}