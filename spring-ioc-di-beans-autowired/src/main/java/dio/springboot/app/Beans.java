package dio.springboot.app;

import com.google.gson.Gson;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
    public Gson gson(){
        return new Gson();
    }
}
