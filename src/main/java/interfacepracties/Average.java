package interfacepracties;

public class Average implements IntSequence {
    private int i;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public int next() {
        i++;
        return i * i;
    }
}
