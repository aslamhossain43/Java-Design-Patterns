package creational_design_patterns_abstract_factory;
public class AbstractFactoryPatternDemo {
   public static void main(String[] args) {
      //get shape factory
      AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
      //get an object of Shape Rectangle
      Shape rectangle = shapeFactory.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      rectangle.draw();
      //get an object of Shape Square 
      Shape square = shapeFactory.getShape("SQUARE");
      //call draw method of Shape Square
      square.draw();
      //get an object of Shape Square 
      Shape circle = shapeFactory.getShape("CIRCLE");
      //call draw method of Shape Square
      circle.draw();
      
      
      //get color factory
      AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
      
      //get an object of color red
      Color red = colorFactory.getColor("RED");
      //call draw method of Color red
      red.draw();
      //get an object of Green 
      Color green = colorFactory.getColor("GREEN");
      //call draw method of blue
      green.draw();
      //get an object of circle 
      Color blue = colorFactory.getColor("BLUE");
      //call draw method of color blue
      blue.draw();
      
      
   }
}