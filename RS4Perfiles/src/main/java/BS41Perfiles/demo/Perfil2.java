package BS41Perfiles.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil2")
public class Perfil2 implements Perfiles{
    private String perfil="Perfil Activo en Appication.properties 2";
    @Override
    public String miFuncion() {
        return this.perfil;
    }
}
