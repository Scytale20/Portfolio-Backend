package com.Portfolio.Portfolio.Controller;

import com.Portfolio.Portfolio.model.Header;
import com.Portfolio.Portfolio.service.HeaderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeaderController {
    
    @Autowired
    HeaderService headService;
    
    @GetMapping("ver/header")
    @ResponseBody
    public List<Header> verHeader(){
       return headService.verHeader();
    }
    
    @PutMapping("mod/header")
    public void modificarHeader(@RequestBody Header data){
        headService.modificarHeader(data);
    }
    
    @PostMapping("new/header")
    public void crearHeader(@RequestBody Header data){
        headService.crearHeader(data);   
    }
    
    
}
