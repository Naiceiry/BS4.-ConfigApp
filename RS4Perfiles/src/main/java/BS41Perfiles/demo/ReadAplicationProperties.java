package BS41Perfiles.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:miconfiguracion.properties")
public class ReadAplicationProperties {
   @Value("${url}")
    private String url;
    @Value("${password}")
    private String password;

    public ReadAplicationProperties() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}