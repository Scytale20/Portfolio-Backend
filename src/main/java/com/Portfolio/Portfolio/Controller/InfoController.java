package com.Portfolio.Portfolio.Controller;

import com.Portfolio.Portfolio.model.Info;
import com.Portfolio.Portfolio.service.InfoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InfoController {
    
    @Autowired
    InfoService infoServ;
    
    @GetMapping("ver/info")
    @ResponseBody
    public List<Info> verInfo(){
       return infoServ.verInfo();
    }
    
    @PutMapping("mod/info")
    public void modificarInfo(@RequestBody Info info){
        infoServ.modificarInfo(info);
    }
    
    @PostMapping("new/info")
    public void crearHeader(@RequestBody Info info){
        infoServ.crearInfo(info);
    }
    
}
