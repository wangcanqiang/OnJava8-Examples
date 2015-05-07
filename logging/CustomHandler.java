//: logging/CustomHandler.java
// How to write custom handler
import java.util.logging.*;
import java.util.*;

public class CustomHandler {
  private static Logger logger =
    Logger.getLogger("CustomHandler");
  private static List<String> trace = new ArrayList<>();
  public static void main(String[] args) {
    logger.addHandler(new Handler() {
      @Override
      public void publish(LogRecord logRecord) {
        trace.add(logRecord.getLevel() + ":");
        trace.add(logRecord.getSourceClassName()+":");
        trace.add(logRecord.getSourceMethodName()+":");
        trace.add("<" + logRecord.getMessage() + ">");
        trace.add("\n");
      }
      @Override
      public void flush() {}
      @Override
      public void close() {}
    });
    logger.warning("Logging Warning");
    logger.info("Logging Info");
    System.out.print(trace);
  }
} ///:~