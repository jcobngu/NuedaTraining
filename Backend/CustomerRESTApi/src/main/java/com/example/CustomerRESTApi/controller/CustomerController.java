package com.example.CustomerRESTApi.controller;

import com.example.CustomerRESTApi.model.Customer;
import com.example.CustomerRESTApi.model.CustomerTableInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CustomerController {

    @GetMapping("/customer")
    public ArrayList<CustomerTableInfo> getCustomers(){
        ArrayList<CustomerTableInfo> result= new ArrayList<CustomerTableInfo>();
        result.add(new CustomerTableInfo("John", "Doe", "JD123"));
        return result;
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomerFromID(@PathVariable String id){
        return new Customer("John", "bofa", id, 80000, 4113, 123123123, 123);
    }
}
