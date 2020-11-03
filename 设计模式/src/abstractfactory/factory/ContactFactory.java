package abstractfactory.factory;

import abstractfactory.contant.Contact;

/**
 * @author zhulinzhong
 * @version 1.0 CreateTime:2020-05-09 16:34
 * @description
 */
public interface ContactFactory {

    /**
     *
     * @return
     */
    public Contact  getContact();
}
