package net.sourceforge.pmd.symboltable;

import net.sourceforge.pmd.ast.SimpleNode;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractScopeEvaluator implements ScopeEvaluator {
         protected Set triggers = new HashSet();
         public abstract Scope getScopeFor(SimpleNode node);
         public boolean IsScopeCreatedBy(SimpleNode node) {
             return triggers.contains(node.getClass());
         }
     }

