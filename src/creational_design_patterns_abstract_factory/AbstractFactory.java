package creational_design_patterns_abstract_factory;
public abstract class AbstractFactory {
   abstract Shape getShape(String shapeType) ;
   abstract Color getColor(String colorType) ;
}