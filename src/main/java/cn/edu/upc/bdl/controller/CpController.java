package cn.edu.upc.bdl.controller;

import cn.edu.upc.bdl.model.Cp;
import cn.edu.upc.bdl.service.CpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@CrossOrigin
@Controller
@RequestMapping(value = "/cp", method = {RequestMethod.POST, RequestMethod.GET})
public class CpController {
    @Autowired
    private CpService cpService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Cp> getAll() {
        return cpService.getAll();
    }

    @RequestMapping("/getAll1")
    @ResponseBody
    public Map<String, Object> getAll1() {
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("data", cpService.getAll());
        return map;
    }

    @RequestMapping("/getById")
    @ResponseBody
    public Map<String, Object> getById(@RequestBody Cp cp) {
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("data", cpService.getById(cp));
        return map;
    }

    @RequestMapping("/getById1")
    @ResponseBody
    public Map<String, Object> getById1(@RequestBody Cp cp) {
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("data", cpService.getById1(cp));
        return map;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Map<String, Object> insert(@RequestBody Cp cp) {
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("result", cpService.insert(cp));
        return map;
    }


}
