/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Aula;
import service.AulaServiceImplement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;
/**
 *
 * @author aguss
 */
@Controller 
@RequestMapping("/views/aulas")
public class aulaController {
   
    @Autowired
    private  AulaServiceImplement aulaService;
    @GetMapping("/")
    public String getListAula(Model model){
       // List<Aula> listadoAula = aulaService.listarAula();
      //  model.addAttribute("lisAulas",listadoAula);
        
        return "/views/aulas/listar";
    }
    
    
}
