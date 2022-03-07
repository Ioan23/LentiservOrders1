package tests;
import envelope.Envelope;

public class EnvelopeTest {
    Envelope envelope = null;

    void testEnvelepReceiveWithOutLens(){
        envelope.withOutLens();
    }
    void testEnvelopeHasLens() {
        envelope.hasLens();
    }
    // Metoda Ioan

    void testEnvelopeLensesAreOrdered(){
        envelope.lensesAreOrdered();
    }
    void testEnvelopHasLensMount(){
        envelope.hasLensMount();
    }
    void testEnvelopReadyForSend(){
        envelope.prepareForSend();
    }


}
