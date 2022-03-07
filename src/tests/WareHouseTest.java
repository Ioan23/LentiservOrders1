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

    }

    public void testOrderLens(){
        Envelope envelope = null;
        wareHouse.orderLenses(envelope);

        //verify order status
        assert orderStatus == OrderStatus.ORDER_LENS;
    }

    public void testNotifyClient() {
        OrderStatus orderStatus = null;
        wareHouse.notifyClient(orderStatus);
    }

    public void testPrepareEnvelopForMount(){
        Envelope envelope = null;
        wareHouse.prepareEnvelopeForMount(envelope);
    }

}
