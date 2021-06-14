import business.abstracts.ProductService;
import business.concretes.ProductManager;
import core.jLoggerManagerAdapter;
import dataaccess.concretes.HibernateProductDao;
import dataaccess.concretes.abcProductDao;
import entities.concretes.Product;

public class Main {

    public static void main(String[] args) {
        //ToDo: Sptrind Ioc ile çözülecek.
        ProductService productService=new ProductManager(new abcProductDao(),new jLoggerManagerAdapter());
        Product product=new Product(1,2,"Elma",12,100);
        productService.add(product);
    }
}
