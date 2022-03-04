package warehouse;

import envelope.Envelope;
import order.OrderStatus;

import java.util.List;

public interface WareHouse {
    public void orderLenses(Envelope envelope);
    public void mountTheLenses();
    public void deliverOrders();
    public void receivePackage();

    void notifyClient(OrderStatus orderStatus);

    void receiveOrders(List<Envelope> envelopeList);

    void prepareEnvelopeForMount(Envelope envelope);
}
