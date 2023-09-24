package javeriana.co.TallerWikiGroup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class DestinationController {

    
    @GetMapping("/templates/integrantes")
    public String integrantes(){
        return "integrantes";
    }

    @GetMapping("/templates/contacto")
    public String contacto(){

        return "contacto";
    }

    @GetMapping("/templates/proyecto")
    public String proyecto(){
        return "proyecto";
    }

    @GetMapping("/templates/paginaPrincipal")
    public String paginaPrincipal(){

        return "paginaPrincipal";
    }

    @GetMapping("/templates/desarrollo")
    public String desarrollo(){

        return "desarrollo";
    }

    @GetMapping("/proyecto")
    public String proyectoTemplate(){

    return "proyecto";
}  

    @GetMapping("/integrantes")
    public String integrantesTemplate(){

        return "integrantes";
    } 
  
    @GetMapping("/desarrollo")
    public String desarrolloTemplate(){

        return "desarrollo";
    }

    @GetMapping("/paginaPrincipal")
    public String paginaPrincipalTemplate(){

        return "paginaPrincipal";
    }
}

    

