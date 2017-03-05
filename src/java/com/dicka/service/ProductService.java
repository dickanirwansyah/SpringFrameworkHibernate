/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicka.service;

import com.dicka.entities.Product;
import java.util.List;

/**
 *
 * @author dicka
 */
public interface ProductService {
    
    public List<Product> getFindAll();
    
    public Product getFindById(String id);
    
    public void SimpanProduct(Product product);
    
    public void UpdateProduct(Product product);
    
    public void DeleteProduct(Product product);
    
    public String setAuto();
}
