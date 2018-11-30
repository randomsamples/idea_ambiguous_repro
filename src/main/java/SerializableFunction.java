import java.io.Serializable;

public interface SerializableFunction<InputT, OutputT> extends Serializable {
  OutputT apply(InputT input);
}