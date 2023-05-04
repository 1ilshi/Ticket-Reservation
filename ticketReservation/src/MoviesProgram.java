import java.util.Objects;
public class MoviesProgram implements MoviesData{
    String movieNum;
    public void start(){
        Movies[] movies = new Movies[3];
        movies[0] = new Superman10();
        movies[1] = new Conjuring7();
        movies[2] = new PokemonterGO();
        processMovieDetails(movies);
        System.out.print("Select 1-3 : ");
        getMovieNum();

    }


    public void Detail(){
        System.out.println("Movie : "+getMovie());
    }

    private void processMovieDetails(Movies[] list){
        int n = 1;
        System.out.println();
        System.out.println("--Select movie--");
        for(Movies movie : list){
            System.out.println(n+"-"+movie.name()+" \n  lenght : "+ movie.length());
            n++;
        }
    }
    @Override
    public void getMovieNum(){
        movieNum = keyboard.nextLine();
        switch (movieNum) {
            case "1", "2", "3" -> movieNum = movieNum;
            default -> {
                System.out.print("Please select only 1-3 : ");
                getMovieNum();
            }
        }
    }
    @Override
    public String getMovie(){
        Movies e;
        if(Objects.equals(movieNum, "1")){
            e = new Superman10();
            return e.name();
        } else if (Objects.equals(movieNum, "2")) {
            e = new Conjuring7();
            return e.name();
        }else if (Objects.equals(movieNum, "3")){
            e = new PokemonterGO();
            return e.name();
        }else return "";
    }
}
