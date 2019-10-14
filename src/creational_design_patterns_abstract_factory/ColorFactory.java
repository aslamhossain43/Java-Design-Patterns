package creational_design_patterns_abstract_factory;

public class ColorFactory extends AbstractFactory {
	

	@Override
	Color getColor(String colorType) {
		if(colorType.equalsIgnoreCase("RED")){
	         return new Red();         
	      }else if(colorType.equalsIgnoreCase("GREEN")){
	         return new Green();
	      }else if(colorType.equalsIgnoreCase("BLUE")){
	          return new Blue();
	       }	
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}