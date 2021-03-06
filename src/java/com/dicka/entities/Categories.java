package com.dicka.entities;
// Generated Feb 28, 2017 8:39:59 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Categories generated by hbm2java
 */
@Entity
@Table(name="categories"
    ,catalog="db_product"
)
public class Categories  implements java.io.Serializable {


     private String idcategoris;
     private String nama;
     private Set<Product> products = new HashSet<Product>(0);

    public Categories() {
    }

	
    public Categories(String idcategoris, String nama) {
        this.idcategoris = idcategoris;
        this.nama = nama;
    }
    public Categories(String idcategoris, String nama, Set<Product> products) {
       this.idcategoris = idcategoris;
       this.nama = nama;
       this.products = products;
    }
   
     @Id 

    
    @Column(name="idcategoris", unique=true, nullable=false)
    public String getIdcategoris() {
        return this.idcategoris;
    }
    
    public void setIdcategoris(String idcategoris) {
        this.idcategoris = idcategoris;
    }

    
    @Column(name="nama", nullable=false)
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="categories")
    public Set<Product> getProducts() {
        return this.products;
    }
    
    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
       return nama;
    }

}


