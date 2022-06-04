package BS41Perfiles.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil1")
public class Perfil1 implements Perfiles{
    private String perfil="Perfil Activo en Appication.properties 1";
    @Override
    public String miFuncion() {
        return this.perfil;
    }
}
