package EcommerceLayered.Service;

import EcommerceLayered.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;

@Service
public class ProductService {
    public ProductRepo productRepo;
    public PaymentService paymentService;
    @Autowired
    public Map<String,PaymentService> paymentType;
    public void paymentType(String s){
        if(paymentType.get(s)!=null){
            paymentType.get(s).Pay();
        }
        else{
            System.out.println("Payment Option from "+s+" not Available");
            System.out.println("Available option");
            Set<String> strings = paymentType.keySet();
            System.out.println(strings);
        }
    }
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }
    public void addProduct(String s){
        productRepo.Save(s);
    }
    public void LIstAllProduct(){
        productRepo.ShowAllProduct();
    }
}
