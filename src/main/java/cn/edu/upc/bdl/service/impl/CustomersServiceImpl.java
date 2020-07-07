package cn.edu.upc.bdl.service.impl;

import cn.edu.upc.bdl.dao.CustomersMapper;
import cn.edu.upc.bdl.model.Customers;
import cn.edu.upc.bdl.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomersServiceImpl implements CustomersService {
    @Autowired
    //@Resource
    private CustomersMapper customersMapper;

    @Override
    public List<Customers> getAll() {
        return customersMapper.selectAll();
    }

    @Override
    public List<Customers> getCustomersByUsername(Customers customers) {
        return customersMapper.selectByUsername(customers.getUsername());
    }

    @Override
    public int insert(Customers customers) {

        return customersMapper.insert(customers);
    }

    @Override
    public int updatePasswordById(Customers customers) {

        return customersMapper.updatePasswordById(customers.getId(),customers.getPassword());
    }

    @Override
    public List<Customers> getPasswordByID(Customers customers){
        return customersMapper.selectPasswordByID(customers.getId());
    }
}