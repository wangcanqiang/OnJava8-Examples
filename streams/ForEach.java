// streams/ForEach.java
// (c)2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
import java.util.*;
import java.util.stream.*;
import static streams.RandInts.*;

public class ForEach {
  final static int sz = 14;
  public static void main(String[] args) {
    rands().limit(sz)
      .forEach(n -> System.out.format("%d ", n));
    System.out.println();
    rands().limit(sz)
      .parallel()
      .forEach(n -> System.out.format("%d ", n));
    System.out.println();
    rands().limit(sz)
      .parallel()
      .forEachOrdered(n -> System.out.format("%d ", n));
  }
}
/* Output:
258 555 693 861 961 429 868 200 522 207 288 128 551 589
551 589 200 861 522 429 868 961 288 555 128 693 207 258
258 555 693 861 961 429 868 200 522 207 288 128 551 589
*/
