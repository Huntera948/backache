package com.example.demo.services;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);


}
