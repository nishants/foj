package foj;


import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static foj.datafun.*;

public class datafunTest {

  @Test
  public void shouldSupportBoolean() {
    Object val = true;

    assertThat(exists(val), is(true));
    assertThat(not(val), is(false));
  }

  @Test
  public void supportForHash() {
    Map hash = hash(
        "name : friend",
        "id   : '121'",
        "age  : 34"),
        expected = new HashMap();

    expected.put("name", "friend");
    expected.put("id", "121");
    expected.put("age", 34);

    assertThat(hash, is(expected));
  }

}