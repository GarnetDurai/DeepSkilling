import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Calculator {
    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);
    int add(int a, int b){
        return a + b;
    }
    int sub(int a, int b){
        return a - b;
    }
    int mul(int a, int b){
        return a * b;
    }
    int div(int a, int b){
        if(b == 0){
            logger.error("Divide by 0 Error");
            return 0;
        }
        return a/b;
    }
}
