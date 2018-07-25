import framework.Manager;
import framework.Product;

/**
 * Created by Administrator on 2018/7/25.
 */
public class Main {
    public static void main(String[] args){
        Manager manager=new Manager();
        UnderlinPen underlinPen = new UnderlinPen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message",underlinPen);
        manager.register("warning box",mbox);
        manager.register("slash box",sbox);

        Product p1 = manager.create("strong message");
        p1.use("Hello World");
        Product p2 = manager.create("warning box");
        p2.use("Hello World");
        Product p3 = manager.create("slash box");
        p3.use("Hello World");

    }
}
