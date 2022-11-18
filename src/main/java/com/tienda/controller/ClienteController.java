package com.tienda.controller;

import com.tienda.Dao.ClienteDao;
import com.tienda.domain.Cliente;
import com.tienda.service.ClienteService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ClienteController {
    @Autowired
    private ClienteService clienteService;
    
         @GetMapping  ("/cliente/listado")
          public String inicio (Model model) {
             var clientes=clienteService.getClientes();    
        model.addAttribute("clientes",clientes);
             
             return "/cliente/listado";
    }
    
        @GetMapping ("/nuevo/nuevo")
        public String nuevoCliente (Cliente cliente) {
            return "/cliente/modifica";       
  }
        @PostMapping ("/cliente/guardarCliente")
        public String guardarCliente (Cliente cliente) {
            clienteService.save(cliente);
            return "redirect:/cliente/listado";
            
        }
        
        @GetMapping ("/cliente/modificar/ {idCliente}")
        public String modificarCliente (Cliente cliente, Model model) {
            cliente = clienteService.getCliente (cliente);
            model.addAttribute("cliente", cliente);
            return "/cliente/modificar";
        }
        
        @GetMapping ("/cliente/eliminar/ {idCliente}")
        public String eliminarCliente (Cliente cliente) {
            clienteService.delete (cliente);
            return "redirect:/cliente/listado";
        }
}
