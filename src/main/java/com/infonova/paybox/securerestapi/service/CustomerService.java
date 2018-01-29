package com.infonova.paybox.securerestapi.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    List getCustomers();
}
