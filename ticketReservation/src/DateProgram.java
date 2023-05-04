import java.util.Objects;
import java.util.Date;
public class DateProgram implements DATE {
    private String date, month,year;
    private final Date D = new Date();
    public void start(){
        System.out.print("Enter year : ");
        yearInput();
        System.out.print("Enter month : ");
        monthInput();
        System.out.print("Enter date : ");
        dateInput();
    }

    public void Detail(){
        System.out.println();
        System.out.println("--Details of reservation--");
        System.out.println("Date : "+dateText());
    }

    @Override
    public void yearInput(){
        String year = DATE.keyboard.nextLine();
        try{
            if(Integer.parseInt(year) < D.getYear()+1900) {
                System.out.print("Year not available\nEnter again : ");
                yearInput();
            }else this.year = year;
        }catch(NumberFormatException e){
            System.out.print("Please enter number : ");
            yearInput();
        }
    }
    @Override
    public void monthInput(){
        String month = DATE.keyboard.nextLine();
        try{
            boolean b = Integer.parseInt(month) > 12 || Integer.parseInt(month) < 1;
            if(Integer.parseInt(year)==D.getYear()+1900){
                if(Integer.parseInt(month)<D.getMonth()+1){
                    System.out.print("Month not available\nEnter again : ");
                    monthInput();
                }else{
                    if(b){
                        System.out.print("Month not available\nEnter again : ");
                        monthInput();
                    }else this.month = month;
                }
            }else {
                if(b){
                    System.out.print("Month not available\nEnter again : ");
                    monthInput();
                }else this.month = month;
            }
        }catch(NumberFormatException e){
            System.out.print("Please enter number : ");
            monthInput();
        }
    }
    @Override
    public void dateInput(){
        String date = DATE.keyboard.nextLine();
        try{
            if(Integer.parseInt(date)<D.getDate()){
                if(Objects.equals(Integer.parseInt(month), 1)||Objects.equals(Integer.parseInt(month), 3)||Objects.equals(Integer.parseInt(month), 5)||Objects.equals(Integer.parseInt(month), 7)||Objects.equals(Integer.parseInt(month), 8)||Objects.equals(Integer.parseInt(month), 10)||Objects.equals(Integer.parseInt(month), 12)){
                    if(Integer.parseInt(date)>31||Integer.parseInt(date)<1){
                        System.out.print("Date not available\nEnter again : ");
                        dateInput();
                    }else this.date = date;
                } else if (checkLeapYear() && Objects.equals(Integer.parseInt(month), 2)) {
                    if(Integer.parseInt(date)>29||Integer.parseInt(date)<1){
                        System.out.print("Date not available\nEnter again : ");
                        dateInput();
                    }else this.date = date;
                } else if (!checkLeapYear() && Objects.equals(Integer.parseInt(month), 2)) {
                    if(Integer.parseInt(date)>28||Integer.parseInt(date)<1){
                        System.out.print("Date not available\nEnter again : ");
                        dateInput();
                    }else this.date = date;
                }else {
                    if(Integer.parseInt(date)>30||Integer.parseInt(date)<1){
                        System.out.print("Date not available\nEnter again : ");
                        dateInput();
                    }else this.date = date;
                }
            }else this.date = date;
        }catch(NumberFormatException e){
            System.out.print("Please enter number : ");
            dateInput();
        }
    }

    public Boolean checkLeapYear(){
        return ((Integer.parseInt(year) % 4 == 0) && (Integer.parseInt(year) % 100 != 0)) || (Integer.parseInt(year) % 400 == 0);
    }
    @Override
    public String dateText(){
        return date+"/"+month+"/"+year;
    }

}
