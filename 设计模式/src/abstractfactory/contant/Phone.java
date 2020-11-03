package abstractfactory.contant;

/**
 * @author zhulinzhong
 * @version 1.0 CreateTime:2020-05-09 16:29
 * @description
 */
public class Phone implements Contact {
    @Override
    public void send() {
        System.out.println("用手机发送消息了");
    }
}
