package com.faizal.spring5rest.bootstrap;

import com.faizal.spring5rest.domain.Customer;
import com.faizal.spring5rest.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private CustomerRepository customerRepository;

    public Bootstrap(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        loadCustomers();
    }


    private void loadCustomers() {
        Customer tony = new Customer();
        tony.setFirstname("Tony");
        tony.setLastname("Stark");

        Customer steve = new Customer();
        steve.setFirstname("Steve");
        steve.setLastname("Rogers");

        Customer natasha = new Customer();
        natasha.setFirstname("Natasha");
        natasha.setLastname("Romanoff");

        customerRepository.save(tony);
        customerRepository.save(steve);
        customerRepository.save(natasha);

        System.out.println("Customer Data Loaded = " + customerRepository.count());


    }

}
