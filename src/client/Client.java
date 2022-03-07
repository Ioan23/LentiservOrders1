package client;


import envelope.Envelope;
import order.OrderStatus;

import java.util.List;

public interface Client {
    void orderStatus(OrderStatus orderStatus);




    void sendEnvelopeItems(List<Envelope> envelopeList);

    

    boolean areItemsSent();

    void getOrderStatus();

    Envelope receiveOrders();

}