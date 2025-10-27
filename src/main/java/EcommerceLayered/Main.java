package EcommerceLayered;

import EcommerceLayered.Controller.ProductController;
import EcommerceLayered.Service.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        ProductController bean = applicationContext.getBean(ProductController.class);
//        PaymentService paymentService = applicationContext.getBean(PaymentService.class);//PaymentService is an interface Here it will get all the beans of the the classs which is implementing it
        bean.AddProduct("Mobile");
        bean.paymenttype("gpay");
        bean.AddProduct("Laptop");
        bean.paymenttype("creditCard");
        bean.AddProduct("Charger");
        bean.paymenttype("cash");
        bean.ListTheProducts();
    }
}
