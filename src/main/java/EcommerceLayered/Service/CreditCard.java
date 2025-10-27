package EcommerceLayered.Service;

import org.springframework.stereotype.Component;

@Component
public class CreditCard implements PaymentService{
    @Override
    public void Pay() {
        System.out.println("You have selected CreditCard for Payment");
    }
}
