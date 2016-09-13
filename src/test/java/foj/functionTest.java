package foj;


import org.junit.Test;

import java.util.HashMap;

import static foj.function.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class functionTest {

  @Test
  public void supportForHash() {
    HashMap map = new HashMap();
    function callback = function(() -> {
      map.put("invoked", true);
    });

    assertThat(map.get("invoked"), is(nullValue()));

    callback.call(1,2);

    assertThat(map.get("invoked"), is(true));
  }

}