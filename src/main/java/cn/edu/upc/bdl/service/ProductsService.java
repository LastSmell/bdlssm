package cn.edu.upc.bdl.service;

import cn.edu.upc.bdl.model.Products;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductsService {
    List<Products> getAll();
    List<Products> getByName(Products products);
    List<Products> getMarketable();
    int updateReserve(Products products);
    int updatePrice(Products products);
    int updateName(Products products);



}
