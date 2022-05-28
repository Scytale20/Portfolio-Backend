package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.Info;
import java.util.List;


public interface IInfoService {
    
    public List<Info> verInfo();
    
    public void crearInfo(Info info);
    
    public void modificarInfo(Info info);
    
}
