/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicka.service;

import com.dicka.entities.Categories;
import java.util.List;

/**
 *
 * @author dicka
 */
public interface CategoriService {
    
    public List<Categories> getFindAll();
    
    public Categories getFindById(String id);
    
    public void Simpan(Categories categories);
    
    public void Ubah(Categories categories);
    
    public void Hapus(Categories categories);
    
}
