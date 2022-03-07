package tests;

import envelope.Envelope;
import order.OrderStatus;
import warehouse.WareHouse;
import java.util.ArrayList;
import java.util.List;

public class WareHouseTest {
    WareHouse wareHouse;
    OrderStatus orderStatus;
    public void testReceiveOrders(){
        List<Envelope> envelopeList = new ArrayList<>();
        wareHouse.receiveOrders(envelopeList);
        System.out.println("The warehouse has received the orders");

    }

    public void testOrderLens(){
        Envelope envelope = null;
        wareHouse.orderLenses(envelope);
        System.out.println("The warehouse verify if the orders envelop have lenses");
        //verify order status
        assert orderStatus == OrderStatus.ORDER_LENS;
        System.out.println(" the client receive the status ORDER LENSES");
    }

    public void testNotifyClient() {
        OrderStatus orderStatus = null;
        wareHouse.notifyClient(orderStatus);
    }

    public void testPrepareEnvelopForMount(){
        Envelope envelope = null;
        wareHouse.prepareEnvelopeForMount(envelope);
    }
    public void testEnvelopMount(){
        List<Envelope> envelopeListMount = new ArrayList<>();
        wareHouse.mountTheLenses((Envelope) envelopeListMount);
    }

    public void testPrepareForSendTheEnvelopeHasMount(){

    }

}
