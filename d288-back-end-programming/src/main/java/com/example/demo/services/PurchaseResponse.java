package com.example.demo.services;

import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Data
public class PurchaseResponse {

    private final String orderTrackingNumber;

}
