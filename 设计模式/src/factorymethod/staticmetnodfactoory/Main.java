package factorymethod.staticmetnodfactoory;

import factorymethod.staticmetnodfactoory.contant.Contact;
import factorymethod.staticmetnodfactoory.contant.ContactFactory;

/**
 * @author zhulinzhong
 * @version 1.0 CreateTime:2020-05-09 16:27
 * @description 静态方法工厂
 */
public class Main {

    public static void main(String[] args) {

        //静态方法获取实例phone
        Contact phone = ContactFactory.getPhoneContact();
        phone.send();

        //静态方法获取实例mail
        Contact mail = ContactFactory.getMailContact();
        mail.send();
    }

}
