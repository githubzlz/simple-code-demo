package factorymethod.multimethodsfactory;

import factorymethod.multimethodsfactory.contant.Contact;
import factorymethod.multimethodsfactory.contant.ContactFactory;

/**
 * @author zhulinzhong
 * @version 1.0 CreateTime:2020-05-09 16:27
 * @description 多方法工厂
 */
public class Main {

    public static void main(String[] args) {

        //创建工厂
        ContactFactory factory = new ContactFactory();

        //获取实例phone
        Contact phone = factory.getPhoneContact();
        phone.send();

        //获取实例mail
        Contact mail = factory.getMailContact();
        mail.send();
    }

}
