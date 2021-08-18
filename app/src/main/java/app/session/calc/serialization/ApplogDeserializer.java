package app.session.calc.serialization;


import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.nio.charset.StandardCharsets;
import org.apache.kafka.common.serialization.Deserializer;


public class ApplogDeserializer implements Deserializer<Applog> {
    private Gson gson =
        new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_DASHES).create();
  
    @Override
    public Applog deserialize(String topic, byte[] bytes) {
      if (bytes == null) return null;
      return gson.fromJson(new String(bytes, StandardCharsets.UTF_8), Applog.class);
    }
  }
  