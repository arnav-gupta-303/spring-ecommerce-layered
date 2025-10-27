package EcommerceLayered.Service;

import org.springframework.stereotype.Component;

@Component
public class Gpay implements PaymentService{
    @Override
    public void Pay() {
        System.out.println("You have selected Gpay for payment");
    }
}
