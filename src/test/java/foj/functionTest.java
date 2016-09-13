package foj;


import org.junit.Test;

import java.util.HashMap;

import static foj.function.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class functionTest {

  @Test
  public void shouldInvokeFunctionOnCall() {
    HashMap map = new HashMap();

    function callback = function(() -> {
      return map.put("invoked", true);
    });

    assertThat(map.get("invoked"), is(nullValue()));

    Object result = callback.call(1, 2);

    assertThat(map.get("invoked"), is(true));
  }

  @Test
  public void supportForHash() {
    function callback = function((args) -> {
      return args[0];
    });
    assertThat(callback.call("hello", "bye"), is("hello"));
  }
}