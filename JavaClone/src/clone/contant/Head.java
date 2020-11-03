package clone.contant;

import java.io.*;

/**
 * @author zhulinzhong
 * @version 1.0 CreateTime:2020-05-09 14:50
 * @description
 */
public class Head implements Cloneable, Serializable {

    private Integer iq;

    public Integer getIq() {
        System.out.println("Head.get()执行了");
        return iq;
    }

    public void setIq(Integer iq) {
        this.iq = iq;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
