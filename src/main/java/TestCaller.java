import com.google.common.collect.Lists;

import java.util.List;

public class TestCaller {
  // Demonstrate false ambiguous method
  public void testCall() {
    AmbiguousMethods.variant(new Variant());
    AmbiguousMethods.covariant(new Covariant()); // Will be underlined RED
  }

  // Test function mapping to simple generic type
  private class Variant extends SimpleFunction<String, Character> {
    @Override
    public Character apply(String input) {
      return 'A';
    }
  }

  // Test function mapping to covariant generic collection
  private class Covariant extends SimpleFunction<String, List<Character>> {
    @Override
    public List<Character> apply(String input) {
      return Lists.charactersOf(input);
    }
  }
}
