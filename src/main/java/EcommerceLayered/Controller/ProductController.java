package EcommerceLayered.Controller;

import EcommerceLayered.Service.ProductService;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {
    public ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public void AddProduct(String s){
        productService.addProduct(s);
        System.out.println("Product "+s+" Added");
    }
    public void ListTheProducts(){
        productService.LIstAllProduct();
        System.out.println("product Listed");
    }
    public void paymenttype(String s){
        productService.paymentType(s);
    }
}
