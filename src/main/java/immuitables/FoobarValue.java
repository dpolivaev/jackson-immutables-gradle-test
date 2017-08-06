package immuitables;

import java.util.List;
import java.util.Set;

import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Value.Immutable
@JsonSerialize(as = ImmutableFoobarValue.class)
@JsonDeserialize(as = ImmutableFoobarValue.class)
public interface FoobarValue {
  public abstract int foo();
  public abstract String bar();
  public abstract List<Integer> buz();
  public abstract Set<Long> crux();
}