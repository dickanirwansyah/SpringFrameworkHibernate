/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicka.service;

import com.dicka.dao.ProductDAO;
import com.dicka.entities.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dicka
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService{
    
    @Autowired
    private ProductDAO productDAO;

    @Override
    public List<Product> getFindAll() {
      return productDAO.getFindAll();
    }

    @Override
    public Product getFindById(String id) {
      
        return productDAO.getFindById(id);
    }

    @Override
    public void SimpanProduct(Product product) {
      productDAO.SimpanProduct(product);
    }

    @Override
    public void UpdateProduct(Product product) {
      productDAO.UpdateProduct(product);
    }

    @Override
    public void DeleteProduct(Product product) {
      productDAO.DeleteProduct(product);
    }

    @Override
    public String setAuto() {
      return productDAO.setAuto();
    }
    
}
