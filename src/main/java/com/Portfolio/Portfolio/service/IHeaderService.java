package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.Header;
import java.util.List;




public interface IHeaderService {
    
    public List<Header> verHeader();
    
    public void modificarHeader(Header data);
    
    public void crearHeader(Header data);
    
    
    
    
}
