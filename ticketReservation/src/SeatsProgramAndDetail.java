import java.util.Objects;

public class SeatsProgramAndDetail implements SeatsData {
    private String type, amount;
    public void start(){
        Seats[] seats = new Seats[3];
        seats[0] = new VIP();
        seats[1] = new Honeymoon();
        seats[2] = new Normal();
        processSeatsDetails(seats);
        System.out.print("Select 1-3 : ");
        getType();
        if(Objects.equals(chosenType(), seats[0].name()) || Objects.equals(chosenType(), seats[1].name()) || Objects.equals(chosenType(), seats[2].name())){
            System.out.print("Enter amount of ticket : ");
        }else{
            while(!Objects.equals(chosenType(), seats[0].name()) && !Objects.equals(chosenType(), seats[1].name()) && !Objects.equals(chosenType(), seats[2].name())){
                System.out.print("Please select only 1-3 : ");
                getType();
            }
        }
        getAmount();
    }

    public void Detail(){
        new Detail(chosenType(), totalPrice());
    }

    private void processSeatsDetails(Seats[] list){
        int n = 1;
        System.out.println();
        System.out.println("--Choose your seat type--");
        for(Seats type : list){
            System.out.println(n+"-"+type.name()+" ฿"+ type.cost());
            n++;
        }
    }
    @Override
    public void getType(){
        type = keyboard.nextLine();
        if(!Objects.equals(type, "1") && !Objects.equals(type, "2") && !Objects.equals(type, "3")){
            System.out.print("Please select only 1-3 : ");
            getType();
        }
    }

    @Override
    public void getAmount() {
        amount = keyboard.nextLine();
        try{
            if(Integer.parseInt(amount)<1) {
                System.out.print("Please enter only 1-3 : ");
                getAmount();
            }

        }catch(NumberFormatException e){
            System.out.print("Please enter only number : ");
            getAmount();
        }
    }

    @Override
    public String chosenType() {
        Seats e;
        if(Integer.parseInt(type) == 1){
            e = new VIP();
            return e.name();
        } else if (Integer.parseInt(type) == 2) {
            e = new Honeymoon();
            return e.name();
        } else if (Integer.parseInt(type) == 3) {
            e = new Normal();
            return e.name();
        }else{
            return "";
        }
    }

    @Override
    public int chosenTypePrice() {
        Seats[] seats = new Seats[3];
        seats[0] = new VIP();
        seats[1] = new Honeymoon();
        seats[2] = new Normal();
        if(Objects.equals(chosenType(), seats[0].name())){
            return seats[0].cost();
        } else if (Objects.equals(chosenType(), seats[1].name())) {
            return seats[1].cost();
        } else if (Objects.equals(chosenType(), seats[2].name())) {
            return seats[2].cost();
        }else{
            return -999;
        }
    }

    @Override
    public int totalPrice() {
        return Integer.parseInt(amount)*chosenTypePrice();
    }
}
