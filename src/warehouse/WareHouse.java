package warehouse;

import envelope.Envelope;
import order.OrderStatus;

import java.util.List;

public interface WareHouse {
    public void orderLenses(Envelope envelope);
    public void mountTheLenses(Envelope envelope);

    public void deliverOrders(List<Envelope> envelopeMountList) ;


    void notifyClient(OrderStatus orderStatus);

    void receiveOrders(List<Envelope> envelopeList);

    void prepareEnvelopeForMount(Envelope envelope);
}
