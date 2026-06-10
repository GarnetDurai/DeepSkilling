class test{
    public static void main(String[]args){
        Logger l1 = Logger.getLogger("Garnet", 1);
        Logger l2 = Logger.getLogger("Giri", 2);
        System.out.print(l1 == l2);
    }
}
