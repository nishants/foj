# foj
A minimal,opinionated syntatic sugar for Java

```ruby
import static foj.datafun.*;

Object file     = new File("my/file/path"),
       isJson   = name_of(file, ends_with(, ".json")),
       result   = isTrue(isJson) ? render(file) : read(file);
       
```
