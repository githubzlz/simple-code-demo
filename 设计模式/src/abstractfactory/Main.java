package abstractfactory;

import abstractfactory.contant.Contact;
import abstractfactory.factory.ContactFactory;
import abstractfactory.factory.MailContactFactory;
import abstractfactory.factory.PhoneContactFactory;

/**
 * @author zhulinzhong
 * @version 1.0 CreateTime:2020-05-09 16:27
 * @description 抽象工厂
 */
public class Main {

    public static void main(String[] args) {

        //创建工厂
        ContactFactory phoneContactFactory = new PhoneContactFactory();
        //获取实例phone
        Contact phone = phoneContactFactory.getContact();
        phone.send();

        //创建工厂
        ContactFactory mailContactFactory = new MailContactFactory();
        //获取实例mail
        Contact mail = mailContactFactory.getContact();
        mail.send();
    }

}
