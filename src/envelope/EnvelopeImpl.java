package envelope;


public class EnvelopeImpl implements Envelope {
    private String name;
    private String frame;
    private String lensType;






    public EnvelopeImpl(){



    }
    public EnvelopeImpl(String name, String frame, String lensType){
        this.name=name;
        this.frame=frame;
        this.lensType=lensType;
    }

    @Override
    public void withOutLens() {

    }

    @Override
    public void hasLens() {

    }

    @Override
    public void lensesAreOrdered() {

    }

    @Override
    public void hasLensMount() {

    }

    @Override
    public void prepareForSend() {

    }
}
