import java.util.*;
class Logger{
    private static Logger object;
    private String name;
    private int id;
    private Logger(String name, int id){
        this.id = id;
        this.name = name;
    }
    public static Logger getLogger(String name, int id){
        if(object == null) {
            object = new Logger(name, id);
        }
        return object;
    }

}
