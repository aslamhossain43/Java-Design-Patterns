package behavioral_design_patterns_visitor;
public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}