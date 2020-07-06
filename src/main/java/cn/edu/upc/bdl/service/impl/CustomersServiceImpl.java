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
    private CustomersMapper usersMapper;

    @Override
    public List<Customers> getAll() {
        return usersMapper.selectAll();
    }

    @Override
    public List<Customers> getUserByUsername(String username) {
        return usersMapper.selectByUsername(username);
    }

    @Override
    public int insert(Customers users) {
        return usersMapper.insert(users);
    }
}