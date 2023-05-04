public class Superman10 implements Movies{
    @Override
    public String name() {
        return "Superman 10";
    }

    @Override
    public String length() {
        return "3 hr";
    }

    @Override
    public String[] timeOfTheater1() {
        return new String[]{"12:00", "15:30"};
    }

    @Override
    public String[] timeOfTheater2() {
        return new String[]{"11:30", "17:00"};
    }
}
