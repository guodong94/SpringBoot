package framework;

/**
 * Created by Administrator on 2018/7/25.
 */
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract  Product createClone();
}
