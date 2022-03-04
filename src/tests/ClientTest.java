package tests;

import client.Client;
import envelope.Envelope;

import java.util.ArrayList;
import java.util.List;

public class ClientTest{

    private Client client;

    public void testSendEnvelopeItems() {
        List<Envelope> envelopeList = new ArrayList<Envelope>();
        client.sendEnvelopeItems(envelopeList);

        //verify
        if(client.areItemsSent()) {
            assert true;
        } else {
            assert false;
        }
    }

    public void testVerifyOrderStatus() {
        client.getOrderStatus();
    }


    public void testReceiveOrders(){
        client.receiveOrders();
    }
}
