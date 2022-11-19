package cymbol.listeners;

import org.antlr.v4.runtime.misc.MultiMap;
import org.antlr.v4.runtime.misc.OrderedHashSet;

import java.util.Set;

public class Graph {
  Set<String> nodes = new OrderedHashSet<>();
  MultiMap<String, String> edges = new MultiMap<>();

  public void edge(String source, String target) {
    edges.map(source, target);
  }

  public String toDot() {
    StringBuilder buf = new StringBuilder();

    buf.append("digraph G {\n")
        .append("  ranksep = 0.25;\n")
        .append("  edge [arrowsize = 0.5]\n")
        .append(" node [shape = circle, fontname = \"ArialNarrow\", fontsize = 12, fixedsize = true, height = 0.45];\n");

    nodes.forEach(node -> buf.append(node).append("; "));
    buf.append("\n");

    edges.getPairs().forEach(edge ->
        buf.append(" ")
            .append(edge.a)
            .append(" -> ")
            .append(edge.b)
            .append(";\n"));
    buf.append("}\n");

    return buf.toString();
  }
}