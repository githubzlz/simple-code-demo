package singleton;

/**
 * @author zhulinzhong
 * @version 1.0 CreateTime:2020-05-09 17:31
 * @description 单例模式
 */
public class Singleton {
    /**
     * 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
     */
    private static Singleton instance = null;

    /**
     *  私有构造方法，防止被实例化
     */
    private Singleton() {
    }

    /**
     * 此处使用一个内部类来维护单例
     */
    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }


        /**
         * 静态工程方法，创建实例
         * synchronized 保证线程安全 （调用getInstance就回加锁）
         * @return
         */
//    public synchronized static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

    /**
     * 静态工程方法，创建实例
     * synchronized 保证线程安全（只有在需要创建对象时才加锁）
     * 注：由于JVM内部的优化机制，JVM先画出了一些分配给Singleton实例的空白内存，
     * 并赋值给instance成员（注意此时JVM没有开始初始化这个实例），然后线程A离开了synchronized块。
     * 此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。
     * @return
     */
//    public static Singleton getInstance() {
//        if (instance == null) {
//            synchronized (instance){
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }

    public static Singleton getInstance() {
        return SingletonFactory.instance;
    }

    /**
     * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
     * @return
     */
    public Object readResolve() {
        return instance;
    }
}
