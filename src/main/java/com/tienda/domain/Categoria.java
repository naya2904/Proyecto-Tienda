package com.tienda.domain;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")

public class Categoria implements Serializable {
    
    private static final long serialVersionUID =1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name="id_categoria")
    private Long idCategoria;
    private String descripcion;
    private boolean activa;
                                                                                                                          
    public Categoria() {
    }
   
    public Categoria(String descripcion, boolean activa) {
        this.descripcion = descripcion;
        this.activa = activa;
    }

    public boolean isActivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    }
    
    
