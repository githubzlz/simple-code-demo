package clone.contant;

import java.io.*;

/**
 * @author zhulinzhong
 * @version 1.0 CreateTime:2020-05-09 14:31
 * @description
 */
public class Person implements Cloneable, Serializable {

    private String name;
    private Head head;

    public Person(){
        System.out.println("创建了Person");
    }

    public void eat(){
        System.out.println("Person eat");
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        System.out.println("Person.setHead()执行了");
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepClone(){
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
            outputStream.writeObject(this);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
