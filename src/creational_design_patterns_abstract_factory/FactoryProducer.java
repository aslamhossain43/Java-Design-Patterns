package creational_design_patterns_abstract_factory;
public class FactoryProducer {
   public static AbstractFactory getFactory(String factoryType){   
      if(factoryType.equalsIgnoreCase("SHAPE")){
         return new ShapeFactory();         
      }else if(factoryType.equalsIgnoreCase("COLOR")){
         return new ColorFactory();
      }else {
    	  
    	  return null;
      }
   }
}