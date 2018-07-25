package framework;

import java.util.HashMap;

/**
 * Created by Administrator on 2018/7/25.
 */
public class Manager {
    private HashMap showcase = new HashMap();
    public void register(String name,Product product){
        showcase.put(name,product);
    }
    public Product create(String productName){
        Product p = (Product) showcase.get(productName);
        return p.createClone();
    }
}
