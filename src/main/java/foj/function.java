package foj;

public class function {
  private  AnyArg anyArg;

  public function(AnyArg runnable) {
    this.anyArg = runnable;
  }

  public Object call(Object...args){
    return anyArg.run(args);
  }

  public static function function(AnyArg runnable){
    return new function(runnable);
  }

  public static interface AnyArg{
    public Object run(Object...args);
  }
}

