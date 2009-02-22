package org.jetbrains.plugins.clojure.psi.impl;

import com.intellij.lang.ASTNode;
import org.jetbrains.plugins.clojure.psi.ClojurePsiElementImpl;

/**
 * @author ilyas
*/
public class ClMap extends ClojurePsiElementImpl {
  public ClMap(ASTNode node) {
    super(node);
  }

  @Override
  public String toString() {
    return "ClMap";
  }
}
