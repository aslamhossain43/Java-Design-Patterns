package creational_design_patterns_abstract_factory;
public class ShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }else if(shapeType.equalsIgnoreCase("CIRCLE")){
          return new Circle();
       }	 
      return null;
   }

@Override
Color getColor(String colorType) {
	// TODO Auto-generated method stub
	return null;
}
}