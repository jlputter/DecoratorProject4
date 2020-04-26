package model;

public abstract class VehicleDecorator implements Vehicle {
	
	protected Vehicle vehicleDecorated;
	
	public VehicleDecorator(Vehicle vehicleDecorated){
	      this.vehicleDecorated = vehicleDecorated;
	   }

	   public void assemble(){
	      vehicleDecorated.assemble();
	   }	

}
