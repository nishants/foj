package foj;

public class function {
  private final Runnable runnable;

  public function(Runnable runnable) {
    this.runnable = runnable;
  }

  public void call(){
    runnable.run();
  }
  public static function function(Runnable runnable){
    return new function(runnable);
  }

}
