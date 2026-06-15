public class MyService {
    Calculator calc;
    MyService(Calculator calc){
        this.calc = calc;
    }
    public int addIt(int a, int b){
        return calc.addNum(a, b);
    }


}
