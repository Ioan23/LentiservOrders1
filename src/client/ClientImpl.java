package client;

import envelope.Envelope;
import order.OrderStatus;

import java.util.List;

public class ClientImpl implements Client {

    Envelope clientEnvelopOrder;


    public ClientImpl(Envelope clientEnvelopOrder) {
        this.clientEnvelopOrder = clientEnvelopOrder;
    }

    public Envelope getClientEnvelopOrder() {
        return clientEnvelopOrder;
    }

    @Override
    public void orderStatus(OrderStatus status) {

    }

    @Override
    public void sendEnvelopeItems(List<Envelope> envelopeList) {

    }

    @Override
    public boolean areItemsSent() {
        return false;
    }

    @Override
    public void getOrderStatus() {


}

    @Override
    public Envelope receiveOrders() {
        return null;
    }
}

