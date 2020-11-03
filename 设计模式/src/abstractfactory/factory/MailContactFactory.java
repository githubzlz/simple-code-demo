package abstractfactory.factory;

import abstractfactory.contant.Contact;
import abstractfactory.contant.Mail;

/**
 * @author zhulinzhong
 * @version 1.0 CreateTime:2020-05-09 17:22
 * @description
 */
public class MailContactFactory implements ContactFactory{

    @Override
    public Contact getContact() {
        return new Mail();
    }
}
