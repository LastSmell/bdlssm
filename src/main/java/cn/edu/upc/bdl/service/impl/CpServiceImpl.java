package cn.edu.upc.bdl.service.impl;

import cn.edu.upc.bdl.dao.CpMapper;
import cn.edu.upc.bdl.model.Cp;
import cn.edu.upc.bdl.service.CpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CpServiceImpl implements CpService{
    @Autowired
    //@Resource
    private CpMapper cpMapper;

    public List<Cp> getAll(){
        return cpMapper.selectAll();
    }
    public List<Cp> getById(Cp cp){
        return cpMapper.selectById(cp.getId());
    }
    public int insert(Cp cp){
        return cpMapper.insert(cp);
    }
}
