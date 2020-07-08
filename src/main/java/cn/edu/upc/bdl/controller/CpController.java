package cn.edu.upc.bdl.controller;

import cn.edu.upc.bdl.model.Cp;
import cn.edu.upc.bdl.model.CpKey;
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

    @RequestMapping("/insert")
    @ResponseBody
    public Map<String, Object> insert(@RequestBody Cp cp) {
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("data", cpService.insert(cp));
        return map;
    }

    @RequestMapping("/getByProducts")
    @ResponseBody
    public Map<String, Object> getByProducts(@RequestBody Cp cp) {//@RequestBody可自动处理json数据
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("data", cpService.getByProducts(cp));
        return map;
    }

    @RequestMapping("/getByCustomers")
    @ResponseBody
    public Map<String, Object> getBuCustomers(@RequestBody Cp cp) {//@RequestBody可自动处理json数据
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("data", cpService.getByCustomers(cp));
        return map;
    }
    @RequestMapping("/delete")
    @ResponseBody
    public Map<String, Object> delete(@RequestBody Cp cp) {
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("result", cpService.delete(cp));
        return map;
    }
}
