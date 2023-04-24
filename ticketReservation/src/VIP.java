public class VIP implements Seats {
    @Override
    public String name() {
        return "VIP";
    }

    @Override
    public int cost() {
        return 800;
    }
}