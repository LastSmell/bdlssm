package cn.edu.upc.bdl.service.impl;

import cn.edu.upc.bdl.dao.CpMapper;
import cn.edu.upc.bdl.model.Cp;
import cn.edu.upc.bdl.model.CpKey;
import cn.edu.upc.bdl.service.CpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CpServiceImpl implements CpService{
    @Autowired
    //@Resource
    private CpMapper cpMapper;

    @Override
    public List<Cp> getAll(){
        return cpMapper.selectAll();
    }
    @Override
    public List<Cp> getByProducts(Cp cp){
        return cpMapper.selectByProducts(cp.getNo());
    }
    @Override
    public List<Cp> getByCustomers(Cp cp){
        return cpMapper.selectByCustomers(cp.getId());
    }
    @Override
    public int delete(Cp cp){
        return cpMapper.delete(cp);
    }
    public int insert(Cp cp){
        return cpMapper.insert(cp);
    }

}
