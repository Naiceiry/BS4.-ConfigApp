package BS41Perfiles.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    ReadAplicationProperties rap;

    @Autowired
    ReadMiConfig rmc;

    @Autowired Perfiles perfil;
    //Mostrarlas en el en el endpoint  http://localhost:8081/miconfiguracion
    @GetMapping("/miconfiguracion")
    private String getrmc() {
        return ">>>  "+rap.getUrl() + "  <<<-->>> "+
                "  <<<-->>>  "	+ rap.getPassword()
                + "  <<<-->>>  "
                + rmc.getValor1()
                + "  <<<-->>>  "
                + rmc.getValor2()+"   <<<<";
    }
//Crear endpoint en http://localhost:8081/perfil que devuelva el valor de la variable ‘perfil’.
    @GetMapping("/perfil")
    private String getPerfil() {
        return perfil.miFuncion();
    }
}








