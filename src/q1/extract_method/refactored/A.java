package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      commonMethod(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      commonMethod(edgeList, p);
      // other implementation
      return null;
   }

   <T extends Graph> void commonMethod(List<T> list, String p) {
      for (T t : list) {
         if (t.contains(p))
            System.out.println(t);
      }
   }
}

class Graph {
   String name;

   public boolean contains(String p) { return name.contains(p); }
}

class Node extends Graph {

}

class Edge extends Graph {

}