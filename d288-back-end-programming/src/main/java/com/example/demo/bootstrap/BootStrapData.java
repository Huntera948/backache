package com.example.demo.bootstrap;

import com.example.demo.dao.CountryRepository;
import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Country;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Division;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;
    private final CountryRepository countryRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository, CountryRepository countryRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
        this.countryRepository = countryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (customerRepository.count() == 0) {
            Country country = new Country();
            country.setId(1L);
            country.setCountry_name("USA");
            countryRepository.save(country);

            Division division = new Division();
            division.setId(1L);
            division.setCountry(country);
            divisionRepository.save(division);

            Customer customer1 = new Customer("John", "Doe", "123 Main St", "12345", "555-1234", division);
            Customer customer2 = new Customer("Jane", "Smith", "456 Elm St", "23456", "555-5678", division);
            Customer customer3 = new Customer("Alice", "Johnson", "789 Oak St", "34567", "555-9012", division);
            Customer customer4 = new Customer("Bob", "Brown", "101 Pine St", "45678", "555-3456", division);
            Customer customer5 = new Customer("Carol", "Davis", "202 Maple St", "56789", "555-7890", division);

            division.addCustomer(customer1);
            division.addCustomer(customer2);
            division.addCustomer(customer3);
            division.addCustomer(customer4);
            division.addCustomer(customer5);

            customerRepository.save(customer1);
            customerRepository.save(customer2);
            customerRepository.save(customer3);
            customerRepository.save(customer4);
            customerRepository.save(customer5);
            divisionRepository.save(division);
        } else {
            System.out.println("Customers already exist, skipping data initialization.");
        }

        Iterable<Customer> allCustomers = customerRepository.findAll();
    }
}
