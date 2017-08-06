package immuitables;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FoobarValueShould {
@Test
public void testName() throws Exception {
	ObjectMapper objectMapper = new ObjectMapper();
	final FoobarValue object = ImmutableFoobarValue.builder()
			.foo(3)
	.bar("bar")
	    .build();
	String json = objectMapper.writeValueAsString(object);
	final FoobarValue readValue = objectMapper.readValue(json, FoobarValue.class);
	assertThat(readValue).isEqualTo(object);
	
}
}
