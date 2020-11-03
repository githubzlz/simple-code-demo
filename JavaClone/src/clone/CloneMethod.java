package clone;

import clone.contant.Head;
import clone.contant.Person;

/**
 * @author zhulinzhong
 * @version 1.0 CreateTime:2020-05-09 14:05
 * @description 深克隆，浅克隆实现
 */
public class CloneMethod {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        person.setName("张三");
        Head zHead = new Head();
        zHead.setIq(100);
        person.setHead(zHead);

        //浅克隆
        Person person1 = (Person) person.clone();
        System.out.println(person.getHead().toString());
        System.out.println(person1.getHead().toString());

        //利用串行化实现深克隆
        Person person2 = (Person) person.deepClone();
        System.out.println(person.getHead().toString());
        System.out.println(person2.getHead().toString());
    }
}
