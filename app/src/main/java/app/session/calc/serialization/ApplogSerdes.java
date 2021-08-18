package app.session.calc.serialization;


import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

public class ApplogSerdes  implements Serde<Applog> {
    @Override
    public Serializer<Applog> serializer() {
      return new ApplogSerializer();
    }
  
    @Override
    public Deserializer<Applog> deserializer() {
      return new ApplogDeserializer();
    }
}
