public class AmbiguousMethods<A,B> {
  // These routines do not have a covariant generic output type
  public static <InputT, OutputT> AmbiguousMethods<InputT, OutputT> variant(
      SimpleFunction<? super InputT, ? extends OutputT> fn) {
    return new AmbiguousMethods<InputT, OutputT>();
  }

  public <NewInputT> AmbiguousMethods<NewInputT, B> variant(
      SerializableFunction<NewInputT, ? extends B> fn) {
    return new AmbiguousMethods<NewInputT, B>();
  }


  // These routines have a covariant generic output type
  public static <InputT, OutputT> AmbiguousMethods<InputT, OutputT> covariant(
      SimpleFunction<? super InputT, ? extends Iterable<OutputT>> fn) {
    return new AmbiguousMethods<InputT, OutputT>();
  }

  public <NewInputT> AmbiguousMethods<NewInputT, B> covariant(
      SerializableFunction<NewInputT, ? extends Iterable<B>> fn) {
    return new AmbiguousMethods<NewInputT, B>();
  }
}
