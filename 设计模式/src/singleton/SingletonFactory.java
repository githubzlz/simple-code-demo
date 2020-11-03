package singleton;

/**
 * @author zhulinzhong
 * @version 1.0 CreateTime:2020-05-09 17:43
 * @description
 */
public class SingletonFactory {
    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return SingletonFactory.instance;
    }

}
