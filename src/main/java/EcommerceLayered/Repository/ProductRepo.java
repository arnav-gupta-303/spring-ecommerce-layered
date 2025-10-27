package EcommerceLayered.Repository;

import EcommerceLayered.Database.ProductDatabase;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepo {
    public ProductDatabase productDatabase;

    public ProductRepo(ProductDatabase productDatabase) {
        this.productDatabase = productDatabase;
    }

    public void Save(String s){
        productDatabase.addProduct(s);
    }
    public void ShowAllProduct(){
        System.out.println(productDatabase.listAll());
    }
}
