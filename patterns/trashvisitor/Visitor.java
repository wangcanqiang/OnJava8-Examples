// patterns/trashvisitor/Visitor.java
// (c)2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// The base interface for visitors
package patterns.trashvisitor;

interface Visitor {
  void visit(Aluminum a);
  void visit(Paper p);
  void visit(Glass g);
  void visit(Cardboard c);
  void total();
}
