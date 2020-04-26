package model;

public class VehicleColor extends VehicleDecorator{

	public VehicleColor(Vehicle vehicleDecorated) {
		super(vehicleDecorated);

		}
	
		@Override
		public void assemble(){
	    
		vehicleDecorated.assemble();
	    paintRed(vehicleDecorated);
	   
		}	
		
		private void paintRed(Vehicle vehicleDecorated){
		      System.out.println("Painted Red");

		}
	
	}