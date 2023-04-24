public class Conjuring7 implements Movies{
    @Override
    public String name() {
        return "Conjuring 7";
    }

    @Override
    public String length() {
        return "2 hr 15 min";
    }

    @Override
    public String[] timeOfTheater1() {
        return new String[0];
    }

    @Override
    public String[] timeOfTheater2() {
        return new String[]{"09:00", "20:15"};
    }
}
