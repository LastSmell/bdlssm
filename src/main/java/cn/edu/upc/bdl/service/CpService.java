package cn.edu.upc.bdl.service;

import java.util.List;
import cn.edu.upc.bdl.model.Cp;

public interface CpService {
    List<Cp> getAll();
    List<Cp> getById(Cp cp);
    List<Cp> getById1(Cp cp);
    int insert(Cp cp);
    int updateByPrimaryKeySelective(Cp cp);
}
