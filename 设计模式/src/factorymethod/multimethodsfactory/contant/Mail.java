package factorymethod.multimethodsfactory.contant;

/**
 * @author zhulinzhong
 * @version 1.0 CreateTime:2020-05-09 16:30
 * @description
 */
public class Mail implements Contact {
    @Override
    public void send() {
        System.out.println("用邮件发送消息了");
    }
}
