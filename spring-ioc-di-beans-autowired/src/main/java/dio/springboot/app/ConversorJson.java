package dio.springboot.app;

import com.google.gson.Gson;

public class ConversorJson {
    private Gson gson = new Gson();
    public ViaCepResponse converter(String json ){
        ViaCepResponse response = gson.fromJson(json,ViaCepResponse.class);
        return response;
    }
}
