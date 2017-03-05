/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicka.service;

import com.dicka.dao.CategoriDAO;
import com.dicka.entities.Categories;
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
public class CategoriServiceImpl implements CategoriService{
    
    @Autowired
    private CategoriDAO categoriDAO;

    @Override
    public List<Categories> getFindAll() {
     return categoriDAO.getFindAll();
    }

    @Override
    public Categories getFindById(String id) {
     return categoriDAO.getFindById(id);
    }

    @Override
    public void Simpan(Categories categories) {
      categoriDAO.Simpan(categories);
    }

    @Override
    public void Ubah(Categories categories) {
      categoriDAO.Ubah(categories);
    }

    @Override
    public void Hapus(Categories categories) {
      categoriDAO.Hapus(categories);
    }
    
    
    
}
