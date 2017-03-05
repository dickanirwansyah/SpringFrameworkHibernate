/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicka.controller;

import com.dicka.entities.Categories;
import com.dicka.entities.Product;
import com.dicka.service.CategoriService;
import com.dicka.service.ProductService;
import java.io.IOException;
import java.math.BigDecimal;
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
public class ControllerProduct extends HttpServlet{
    
    @Autowired
    private ProductService productService;
    
    @Autowired
    private CategoriService categoriService;
    
    
    
    @RequestMapping(value = "product", method = RequestMethod.GET)        
    public String product(ModelMap modelMap,Model model){
        
        modelMap.put("title", "List Product");
        model.addAttribute("list", productService.getFindAll());
        return "product";
    }
    
    
    @RequestMapping(value = "productInsert", method = RequestMethod.GET)
    public String insertProduct(Model model, ModelMap modelMap){
        
        
        modelMap.put("title", "Insert Product");
        model.addAttribute("listCategories", categoriService.getFindAll());
        return "insertProduct";
    }
    
    @RequestMapping(value = "productUpdate", method = RequestMethod.GET)
    public String updateProduct(@RequestParam(value = "id")String id, Model model, ModelMap modelMap){
        
        try {
            modelMap.put("titleUpdate", "Update");
            Product p=productService.getFindById(id);
            model.addAttribute("listCategoris", categoriService.getFindAll());
            model.addAttribute("pro", p);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "updateProduct";
    }
   
    @RequestMapping(value = "productUpdate")
    public String prosesUpdateProduct(HttpServletRequest request, Model model, ModelMap modelMap)
            throws ServletException, IOException{
        try {
            Product p=new Product();
            p.setIdproduct(request.getParameter("idproduct"));
            p.setNama(request.getParameter("nama"));
            String idcategoris=request.getParameter("idcategoris");
            Categories c=categoriService.getFindById(idcategoris);
            p.setCategories(c);
            String price=request.getParameter("price");
            p.setPrice(new BigDecimal(price));
            String qty=request.getParameter("qty");
            p.setQty(Integer.parseInt(qty));
            productService.UpdateProduct(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:product.html";
    }
    
    @RequestMapping(value = "prosesInsert", method = RequestMethod.POST)
    public String prosesInsert(HttpServletRequest request)throws ServletException, IOException{
        
        Product p=new Product();
        p.setIdproduct(request.getParameter("idproduct"));
        p.setNama(request.getParameter("nama"));
        String idcategoris=request.getParameter("idcategoris");
        Categories c=categoriService.getFindById(idcategoris);
        p.setCategories(c);
        String price=request.getParameter("price");
        p.setPrice(new BigDecimal(price));
        String qty=request.getParameter("qty");
        p.setQty(Integer.parseInt(qty));
        productService.SimpanProduct(p);
        return "redirect:product.html";
    }
    
    @RequestMapping(value = "deleteProduct", method = RequestMethod.GET)
    public String deleteProduct(@RequestParam(value = "id")String id){
        
        try {
            Product p=productService.getFindById(id);
            productService.DeleteProduct(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
       return "redirect:product.html";
    }
    
   
}
