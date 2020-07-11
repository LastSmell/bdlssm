package cn.edu.upc.bdl.service;

import java.util.List;

import cn.edu.upc.bdl.model.Cp;
import cn.edu.upc.bdl.model.CpKey;

public interface CpService {
    List<Cp> getAll();
    List<Cp> getByProducts(Cp cp);
    List<Cp> getByCustomers(Cp cp);
    int delete(Cp cp);
    int insert(Cp cp);
    int update(Cp cp);
    int updatePlus(Cp cp);
}
