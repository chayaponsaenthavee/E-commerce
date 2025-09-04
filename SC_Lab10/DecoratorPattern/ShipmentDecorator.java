package DecoratorPattern;
import FactoryMethodPattern.*;

/*
 * Abstract Decorator สำหรับห่อหุ้ม Shipment
 */
public abstract class ShipmentDecorator implements Shipment {
    protected Shipment wrappedShipment;

    public ShipmentDecorator(Shipment wrappShipment) {
        this.wrappedShipment = wrappShipment;
    }

    @Override
    public String getInfo(){
        return wrappedShipment.getInfo();
    }

    @Override
    public double getCost(){
        return wrappedShipment.getCost();
    }
}