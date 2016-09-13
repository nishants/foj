package foj;

public class function {
  private final AnyArg runnable;

  public function(AnyArg runnable) {
    this.runnable = runnable;
  }

  public void call(Object...a){
    runnable.run();
  }

  public static function function(AnyArg runnable){
    return new function(runnable);
  }

  public static interface AnyArg{
    public Object run();
  }
}
