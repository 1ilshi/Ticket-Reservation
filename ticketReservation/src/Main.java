public class Main {
    public static void main(String[] args) {
        DateProgram d = new DateProgram();
        MoviesProgram mp = new MoviesProgram();
        TheaterAndTime tat = new TheaterAndTime();
        SeatsProgramAndDetail sp = new SeatsProgramAndDetail();

        while(!new Login().start()){
            // user login
        }
        // receive date from user
        d.start();

        // receive movie that user chose
        mp.start();
        String m = mp.getMovie();

        // get user chooses's theater
        tat.start(m);

        // receive seat type and ticket amount from user
        sp.start();

        // show reservation detail -> date, movie, theater, time, seat, total price
        d.Detail();
        mp.Detail();
        tat.Detail();
        sp.Detail();

        // get payment method which user chose
        new PaymentMethods().start();
    }
}

