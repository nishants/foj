package foj;

public class function {
  private final AnyArg runnable;

  public function(AnyArg runnable) {
    this.runnable = ()-> {
      return "hello";
    };
  }

  public Object call(Object...a){
    return runnable.run();
  }

  public static function function(AnyArg runnable){
    return new function(runnable);
  }

  public static interface AnyArg{
    public Object run();
  }
}
