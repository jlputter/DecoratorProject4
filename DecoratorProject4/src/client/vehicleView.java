package client;

import model.*;

public class vehicleView {
	
	public static void main(String[] args) {
	
	Vehicle bike = new Motorcycle();

    Vehicle redbike = new VehicleColor(new Motorcycle());
    
    Vehicle redcar = new VehicleColor(new Car());
    
    bike.assemble();
    
    System.out.println("\n************************\n");
    
    redbike.assemble();
    
    System.out.println("\n************************\n");
    
    redcar.assemble();

}
}