package BS4Configapp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//responsable de procesar las solicitudes de API REST entrantes, preparar un modelo y devolver la vista para que se muestre como respuesta.
//https://pharos.sh/controller-y-restcontroller-anotaciones-en-spring-boot/
public class Controller {

        @Autowired
        Service service;

        //GET /valores/ -> return “valor de var1 es: “+var1+ “valor de my.var2 es: “+var2;
        @GetMapping("/valores")
        @ResponseBody //para indicar que el resultado del método lo vuelque en el cuerpo de la respuesta
        public String getVars(){
            return "valor de var1 es: "+ service.getVar1() + " valor de my.var2 es: " + service.getVar2();
        }

    //GET /var3/ -> return “valor de var3 es: “+var3;

    @GetMapping("/var3")
        public String var3(){
            return "Valor de var3 es: " + service.getVar3();
        }
}
