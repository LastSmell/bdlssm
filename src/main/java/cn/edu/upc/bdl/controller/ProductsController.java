package cn.edu.upc.bdl.controller;

import cn.edu.upc.bdl.model.Products;
import cn.edu.upc.bdl.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping(value = "/products", method = {RequestMethod.POST, RequestMethod.GET})
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Products> getAllProducts(){
        return productsService.getAll();
    }

    @RequestMapping("/getAll1")
    @ResponseBody
    public Map<String,Object> getAllProducts1(){
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("data",productsService.getAll());
        return map;
    }

    @RequestMapping("/getMarketable")
    @ResponseBody
    public Map<String,Object> getMarketable(){
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("data",productsService.getMarketable());
        return map;
    }

    @RequestMapping("/getByName")
    @ResponseBody
    public Map<String,Object> getByName(@RequestBody Products products){
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("data",productsService.getByName(products));
        return map;
    }

    @RequestMapping("/updateReserve")
    @ResponseBody
    public Map<String,Object> updateReserve(@RequestBody Products products){
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("result",productsService.updateReserve(products));
        return map;
    }
    @RequestMapping("/updatePrice")
    @ResponseBody
    public Map<String,Object> updatePrice(@RequestBody Products products){
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("result",productsService.updatePrice(products));
        return map;
    }
    @RequestMapping("/updateName")
    @ResponseBody
    public Map<String,Object> updateName(@RequestBody Products products){
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("result",productsService.updateName(products));
        return map;
    }
    @RequestMapping("/delete")
    @ResponseBody
    public Map<String,Object> delete(@RequestBody Products products){
        Map map = new HashMap<String, Object>();
        map.put("status", "success");
        map.put("result",productsService.delete(products));
        return map;
    }

}
