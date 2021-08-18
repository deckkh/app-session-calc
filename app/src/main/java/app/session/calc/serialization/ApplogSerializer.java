package app.session.calc.serialization;


import com.google.gson.Gson;
import java.nio.charset.StandardCharsets;
import org.apache.kafka.common.serialization.Serializer;

class ApplogSerializer implements Serializer<Applog> {
  private Gson gson = new Gson();

  @Override
  public byte[] serialize(String topic, Applog Applog) {
    if (Applog == null) return null;
    return gson.toJson(Applog).getBytes(StandardCharsets.UTF_8);
  }
}