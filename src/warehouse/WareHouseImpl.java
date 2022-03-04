package warehouse;

import envelope.Envelope;
import order.OrderStatus;

import java.util.List;

public class WareHouseImpl implements WareHouse{
    OrderStatus orderStatus;

    @Override
    public void orderLenses(Envelope envelope) {
        orderStatus = OrderStatus.ORDER_LENS;
    }

    @Override
    public void mountTheLenses() {

    }

    @Override
    public void deliverOrders() {

    }

    @Override
    public void receivePackage() {

    }

    @Override
    public void notifyClient(OrderStatus orderStatus) {

    }

    @Override
    public void receiveOrders(List<Envelope> envelopeList) {

    }

    @Override
    public void prepareEnvelopeForMount(Envelope envelope) {

    }
}
