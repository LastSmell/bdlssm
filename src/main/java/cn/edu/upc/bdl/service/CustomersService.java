package cn.edu.upc.bdl.service;

import java.util.List;

import cn.edu.upc.bdl.model.Customers;


import javax.swing.*;

public interface CustomersService {
    List<Customers> getAll();
    List<Customers> getUserByUsername(String username);
    int insert(Customers users);

}
