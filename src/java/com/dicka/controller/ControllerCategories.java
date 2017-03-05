/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicka.controller;

import com.dicka.dao.CategoriDAO;
import com.dicka.entities.Categories;
import com.dicka.service.CategoriService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author dicka
 */
@Controller
public class ControllerCategories extends HttpServlet{
    
    @Autowired
    private CategoriService categoriService;
    
    @RequestMapping(value = "categoris", method = RequestMethod.GET)
    public String categoris(ModelMap modelMap, Model model){
        
     model.addAttribute("list", categoriService.getFindAll());
     modelMap.put("title", "Categories");
     return "index";
    }
    
    @RequestMapping(value = "insert", method = RequestMethod.GET)
    public String insert(ModelMap modelMap){
        modelMap.put("title", "Form Insert");
        return "insert";
    }
    
    
    @RequestMapping(value = "update", method = RequestMethod.GET)
    public String update(@RequestParam(value = "id")String id, Model model, ModelMap modelMap){
        try {
            modelMap.put("title", "Update Spring");
            model.addAttribute("cat", categoriService.getFindById(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "update";
    }
    
    @RequestMapping(value = "prosesUpdate", method = RequestMethod.POST)
    public String prosesUpdate(HttpServletRequest request, Categories c)
    throws ServletException, IOException{
        try {
            c.setIdcategoris(request.getParameter("idcategoris"));
            c.setNama(request.getParameter("nama"));
            categoriService.Ubah(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:categoris.html";
    }
    
    
    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public String delete(@RequestParam(value = "id") String id){
        try {
           Categories c=categoriService.getFindById(id);
           categoriService.Hapus(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:categoris.html";
    }
    
    
    @RequestMapping(value = "proses", method = RequestMethod.POST)
    public String prosesInsert(HttpServletRequest request, Categories c)
            throws ServletException, IOException{
         try {
            c.setIdcategoris(request.getParameter("idcategoris"));
            c.setNama(request.getParameter("nama"));
            categoriService.Simpan(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
         return "redirect:categoris.html";
    }
}
