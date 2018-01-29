package com.infonova.paybox.securerestapi.service;

import com.infonova.paybox.securerestapi.model.Customer;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public List getCustomers() {
        return Arrays.asList(
                new Customer("bubu", "Timisoara"),
                new Customer("bibi", "Sibiu"),
                new Customer("cucu", "Brasov"));
    }
}
