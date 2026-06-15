import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
public class MyService {
    private static final Logger logger = LoggerFactory.getLogger(MyService.class);
    public static void main(String[]args){
        Calculator calc = new Calculator();
        logger.info("Adding Two Numbers");
        int a = calc.add(2,3);
        logger.info("Done Adding");
        logger.info("Subtracting Two Numbers");
        int b = calc.sub(3, 9);
        logger.info("Done Subtracting");
        logger.warn("Possible div by 0 Exist");
        int c = calc.div(1, 0);
        logger.info("Done Processing div");


    }
}
