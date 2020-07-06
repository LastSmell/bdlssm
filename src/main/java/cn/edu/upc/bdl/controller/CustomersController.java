package cn.edu.upc.bdl.controller;

import cn.edu.upc.bdl.model.Customers;
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
@RequestMapping(value="/user",method = {RequestMethod.POST,RequestMethod.GET})
public class CustomersController {
    @Autowired
    private CustomersService userService;
    @RequestMapping("/getAll")
    @ResponseBody

    public List<Customers> getAllUsers(){
        return userService.getAll();
    }

    @RequestMapping("/getAll1")
    @ResponseBody
    public Map<String, Object> getAllUsers1(){
        Map map=new HashMap<String, Object>();
        map.put("status","success");
        map.put("data",userService.getAll());
        return map;
    }
    @RequestMapping("/getUserByName")
    @ResponseBody
    public Map<String, Object> getUserByName(String username){
        Map map=new HashMap<String, Object>();
        map.put("status","success");
        map.put("data",userService.getUserByUsername(username));
        return map;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public Map<String, Object> insert(@RequestBody Customers user){
        Map map=new HashMap<String, Object>();
        map.put("status","success");
        map.put("result",userService.insert(user));
        return map;
    }

}
