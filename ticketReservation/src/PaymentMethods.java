import java.util.Objects;

public class PaymentMethods implements Payment {
    private final String[] methods = {"Credit/Debit card", "E-Wallet", "Promtpay"};
    private String method;
    public void start(){
        showMethods();
        System.out.print("Select 1-3 : ");
        selectMethod();
        if(Objects.equals(ChosenMethod(), methods[0]) || Objects.equals(ChosenMethod(), methods[1]) || Objects.equals(ChosenMethod(), methods[2])){
            System.out.println("You chose to pay with "+ChosenMethod());
        }else{
            while(!Objects.equals(ChosenMethod(), methods[0]) && !Objects.equals(ChosenMethod(), methods[1]) && !Objects.equals(ChosenMethod(), methods[2])){
                System.out.print("Please select only 1-3 : ");
                selectMethod();
            }
            System.out.println("You chose to pay with "+ChosenMethod());
        }
    }

    public void showMethods(){
        int n = 1;
        System.out.println("--Select payment method--");
        for(String m : methods){
            System.out.println(n+"-"+m);
            n++;
        }
    }

    public void selectMethod(){
        method = keyboard.nextLine();
        if(!Objects.equals(method, "1") && !Objects.equals(method, "2") && !Objects.equals(method, "3")){
            System.out.print("Please select only 1-3 : ");
            selectMethod();
        }
    }

    @Override
    public String ChosenMethod() {
        if(Integer.parseInt(method) == 1){
            return methods[0];
        } else if (Integer.parseInt(method) == 2) {
            return methods[1];
        }else if(Integer.parseInt(method) == 3){
            return methods[2];
        }else
            return "";
    }
}
