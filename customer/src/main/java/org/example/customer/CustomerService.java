package org.example.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = new Customer(request.firstName(), request.lastName(), request.email());

        customerRepository.save(customer);
    }
}
