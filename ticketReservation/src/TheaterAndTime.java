import java.util.Objects;
import java.util.Scanner;

public class TheaterAndTime extends MoviesProgram {
    private String theater, movie, time;
    public void start(String movie){
        Movies[] m = new Movies[3];
        m[0] = new Superman10();
        m[1] = new Conjuring7();
        m[2] = new PokemonterGO();
        this.movie = movie;
        receiveTheater();
        if(Objects.equals(movie, m[0].name())){
            SupermanTheaterDetails((Superman10) m[0], theater);
        } else if (Objects.equals(movie, m[1].name())) {
            ConjuringTheaterDetails((Conjuring7) m[1]);
        }else{
            PokomonterTheaterDetails((PokemonterGO) m[2], theater);
        }
        receiveTime(movie, theater);


    }


    public void receiveTheater(){
        Movies s = new Superman10();
        Movies c = new Conjuring7();
        Movies p = new PokemonterGO();
        Scanner keyboard = new Scanner(System.in);
        theaterVar(s, keyboard);
        if(Objects.equals(movie, c.name())){
            theater = "2";
        }
        theaterVar(p, keyboard);
    }

    private void theaterVar(Movies p, Scanner keyboard) {
        if (Objects.equals(movie, p.name())) {
            System.out.println();
            System.out.print("Select Theater 1/2 : ");
            theater = keyboard.nextLine();
            if(!Objects.equals(theater, "1")&&!Objects.equals(theater, "2")){
                System.out.print("Please select only 1/2-");
                receiveTheater();
            }
        }
    }

    public void receiveTime(String movie, String theater){
        String timeNum;
        Movies s = new Superman10();
        Movies c = new Conjuring7();
        Movies p = new PokemonterGO();
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.print("Select time 1/2 : ");
        timeNum = keyboard.nextLine();
        timeDetail(movie, theater, timeNum, s);
        if(Objects.equals(movie, c.name())){
            if (Objects.equals(timeNum, "1")){
                time = c.timeOfTheater2()[0];
            } else if (Objects.equals(timeNum, "2")) {
                time = c.timeOfTheater2()[1];
            }else {
                System.out.print("Please select only 1/2-");
                receiveTime(movie, theater);
            }
        }
        timeDetail(movie, theater, timeNum, p);
    }

    private void timeDetail(String movie, String theater, String timeNum, Movies s) {
        if(Objects.equals(movie, s.name())){
            if(Objects.equals(theater, "1")){
                if (Objects.equals(timeNum, "1")){
                    time = s.timeOfTheater1()[0];
                } else if (Objects.equals(timeNum, "2")) {
                    time = s.timeOfTheater1()[1];
                }else {
                    System.out.print("Please select only 1/2-");
                    receiveTime(movie, theater);
                }
            }
            if(Objects.equals(theater, "2")){
                if (Objects.equals(timeNum, "1")){
                    time = s.timeOfTheater2()[0];
                } else if (Objects.equals(timeNum, "2")) {
                    time = s.timeOfTheater2()[1];
                }else {
                    System.out.print("Please select only 1/2-");
                    receiveTime(movie, theater);
                }
            }
        }
    }


    private void timeVar(String theater, String[] strings, String[] strings2) {
        if(Objects.equals(theater, "1")){
            System.out.println("1-"+ strings[0]);
            System.out.println("2-"+ strings[1]);
        }else{
            System.out.println("1-"+ strings2[0]);
            System.out.println("2-"+ strings2[1]);
        }
    }
    private void SupermanTheaterDetails(Superman10 s, String theater){
        timeVar(theater, s.timeOfTheater1(), s.timeOfTheater2());

    }
    private void ConjuringTheaterDetails(Conjuring7 c){
        System.out.println("1-"+c.timeOfTheater2()[0]);
        System.out.println("2-"+c.timeOfTheater2()[1]);
    }
    private void PokomonterTheaterDetails(PokemonterGO p, String theater){
        timeVar(theater, p.timeOfTheater1(), p.timeOfTheater2());

    }

    public void Detail(){
        System.out.println("Theater : "+theater);
        System.out.println("Time : "+time);
    }
}
