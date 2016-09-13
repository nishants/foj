package foj;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static foj.datafun.*;

public class datafunTest {

  @Test
  public void shouldSupportBoolean(){
    Object val = true;

    assertThat(iF(val), is(true));
    assertThat(not(val), is(false));
  }

  @Test
  public void shouldReadFile(){
    Object val = true;

    assertThat(iF(val), is(true));
    assertThat(not(val), is(false));
  }



}