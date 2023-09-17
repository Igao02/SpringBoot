package com.web.tornese.SpringWeb.Controllers;


import com.web.tornese.SpringWeb.Models.Administrador;
import com.web.tornese.SpringWeb.Repositorio.AdministradoresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AdministradoresController {
    @Autowired
    private AdministradoresRepo repo;

    @GetMapping("/administradores")
    public String index(Model model){
        List<Administrador> administradores = (List<Administrador>) repo.findAll();
        model.addAttribute("administradores", administradores);
        return "home/administradores/index";
    }

    @GetMapping("/administradores/novo")
    public String novo(){
        return "home/administradores/novo";
    }

}