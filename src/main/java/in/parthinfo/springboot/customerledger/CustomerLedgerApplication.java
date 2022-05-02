package in.parthinfo.springboot.customerledger;

import in.parthinfo.springboot.customerledger.diDemo.CellPhone;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CustomerLedgerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CustomerLedgerApplication.class, args);

        CellPhone phone = context.getBean(CellPhone.class);

        System.out.println(phone.show());

    }
}
