public class PokemonterGO implements Movies{
    @Override
    public String name() {
        return "Pokemonter GO";
    }

    @Override
    public String length() {
        return "2 hr";
    }

    @Override
    public String[] timeOfTheater1() {
        return new String[]{"09:00", "19:00"};
    }

    @Override
    public String[] timeOfTheater2() {
        return new String[]{"14:45", "22:45"};
    }
}
