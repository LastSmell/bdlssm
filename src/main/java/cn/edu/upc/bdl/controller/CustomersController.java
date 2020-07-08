package cn.edu.upc.bdl.controller;

import cn.edu.upc.bdl.model.Customers;
import cn.edu.upc.bdl.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping(value = "/customers", method = {RequestMethod.POST, RequestMethod.GET})
public class CustomersController {
    @Autowired
    private CustomersService customersService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Customers> getAllCustomers() {
        return customersService.getAll();
    }

    @RequestMapping("/getAll1")
    @ResponseBody
    public Map<String, Object> getAllCustomers1() {
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("data", customersService.getAll());
        return map;
    }

    @RequestMapping("/getCustomersByUsername")
    @ResponseBody
    public Map<String, Object> getCustomersByUsername(@RequestBody Customers customers) {//@RequestBody可自动处理json数据,json数据不能缺少元素
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("data", customersService.getCustomersByUsername(customers));
        return map;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Map<String, Object> insert(@RequestBody Customers customers) {
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("result", customersService.insert(customers));
        return map;
    }



    @RequestMapping("/updatePassword")
    @ResponseBody
    public Map<String, Object> updatePassword(@RequestBody Customers customers) {
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("result", customersService.updatePasswordById(customers));
        return map;
    }
    @RequestMapping("/updateScore")
    @ResponseBody
    public Map<String, Object> updateScore(@RequestBody Customers customers) {
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("result", customersService.updateScoreById(customers));
        return map;
    }
    @RequestMapping("/delete")
    @ResponseBody
    public Map<String, Object> deleteAccount(@RequestBody Customers customers) {
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("result", customersService.deleteAccount(customers));
        return map;
    }

    @RequestMapping("/login")
    @ResponseBody
    public Map<String, Object> getPasswordByID(@RequestBody Customers customers) {
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("result", customersService.getPasswordByID(customers));
        return map;
    }



}
