package cn.edu.upc.bdl.service.impl;

import cn.edu.upc.bdl.dao.ProductsMapper;
import cn.edu.upc.bdl.model.Products;
import cn.edu.upc.bdl.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {
    @Autowired
    //@Resource
    private ProductsMapper productsMapper;

    public List<Products> getAll() {
        return productsMapper.selectAll();
    }
    public List<Products> getByName(Products products) {
        return productsMapper.selectByName(products.getName());
    }
    public List<Products> getMarketable() {
        return productsMapper.selectMarketable();
    }
    public int updateReserve(Products products){
        return productsMapper.updateReserve(products.getNo(),products.getReserve());
    }
    public int updatePrice(Products products){
        return productsMapper.updatePrice(products.getNo(),products.getPrice());
    }
    public int updateName(Products products){
        return productsMapper.updateName(products.getNo(),products.getName());
    }
    public int delete(Products products){
        return productsMapper.delete(products.getNo());
    }
    public List<Products> getByNo(Products products){
        return productsMapper.selectSelective(products.getNo());
    }
    public  int updateByPrimaryKeySelective(Products products){
        return productsMapper.updateByPrimaryKeySelective(products);
    }
}
