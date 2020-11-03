package factorymethod.multimethodsfactory.contant;

/**
 * @author zhulinzhong
 * @version 1.0 CreateTime:2020-05-09 16:34
 * @description
 */
public class ContactFactory {

    public Contact getPhoneContact() {
        return new Phone();
    }

    public Contact getMailContact(){
        return new Mail();
    }
}
