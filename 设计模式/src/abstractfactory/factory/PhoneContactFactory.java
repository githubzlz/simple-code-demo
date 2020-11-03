package abstractfactory.factory;

import abstractfactory.contant.Contact;
import abstractfactory.contant.Phone;

/**
 * @author zhulinzhong
 * @version 1.0 CreateTime:2020-05-09 17:21
 * @description
 */
public class PhoneContactFactory implements ContactFactory{
    @Override
    public Contact getContact() {
        return new Phone();
    }
}
