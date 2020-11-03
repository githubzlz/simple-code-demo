package factorymethod.staticmetnodfactoory.contant;

/**
 * @author zhulinzhong
 * @version 1.0 CreateTime:2020-05-09 16:34
 * @description
 */
public class ContactFactory {

    public static Contact getPhoneContact() {
        return new Phone();
    }

    public static Contact getMailContact(){
        return new Mail();
    }
}
