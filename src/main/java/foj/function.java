package foj;

public class function {
  private  AnyArg runnable;
  private  NoArg noArg;

  public function(AnyArg runnable) {
    this.runnable = (Object...args)-> {
      return "hello";
    };
  }

  public function(NoArg runnable) {
    this.noArg = noArg;
  }

  public Object call(){
    return noArg.run();
  }

  public Object call(Object...a){
    return runnable.run();
  }

  public static function function(AnyArg runnable){
    return new function(runnable);
  }

  public static function function(NoArg runnable){
    return new function(runnable);
  }

  public static interface AnyArg{
    public Object run(Object...args);
  }
  public static interface NoArg{
    public Object run();
  }
}

