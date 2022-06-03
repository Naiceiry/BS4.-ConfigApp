package BS4Configapp.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@org.springframework.stereotype.Service
@PropertySource("classpath:application.yml")
public class Service {
        @Value("${VAR1}") //valor predeterminado para un determinado argumento que es afectado, en este Post
         private String var1; /*@Value("#{'${clientes.postresConsumidos}'.split(',')}")
                                    private List<String> postresConsumidos;*/

        @Value("${My.VAR2}")
        private int var2;
        @Value("${var3:var3 no tiene valor}")
        private String var3;

        public Service() {}

        public Service(String var1, int var2, String var3) {
            this.var1 = var1;
            this.var2 = var2;
            this.var3 = var3;
        }

        public String getVar1() {
            return var1;
        }

        public void setVar1(String var1) {
            this.var1 = var1;
        }

        public int getVar2() {
            return var2;
        }

        public String getVar3() {
            return var3;
        }

        public void setVar3(String var3) {
            this.var3 = var3;
        }

        public void setVar2(int var2) {
            this.var2 = var2;

        }

    }
