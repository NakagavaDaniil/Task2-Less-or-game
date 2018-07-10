import java.util.ArrayList;

public class View {
    public static final String TRIES ="Number of tries :";
    public static final String PREVIOUS="Previous tries ";
    public static final String MIN_PARAMS ="Enter min value  ";
    public static final String MAX_PARAMS ="Enter max value ";
    public static final String START ="Enter  value ";

    public static final String MIN_BARRIER ="Min barrier";
    public static final String MAX_BARRIER ="Max barrier";

    public static final String MORE ="More! ";
    public static final String LESS ="Less!";
    public static final String CONGRATS="Congratulations, you did it!!!  ";
    public static final String ONLY_INT="Only positive integers required!";



    public View() {
    }


    public void printer(String toPrint){
        System.out.println(toPrint);
    }

    public void numberOfTries(int number){
        printer(TRIES+" "+number);
    }

    public void BARRIER(int min , int max){
        printer(MIN_BARRIER+" "+min+" "+MAX_BARRIER+max);
    }

    public void previousTries(ArrayList numbers){
        printer(PREVIOUS+numbers.toString());
    }

    public void minParam(){
        printer(MIN_PARAMS);
    }
    public void maxParam(){
        printer(MAX_PARAMS);
    }

    public void congrats(){
        printer(CONGRATS);
    }
    public void less(){
        printer(LESS);
    }
    public void more(){
        printer(MORE);
    }
    public void onlyInt(){
        printer(ONLY_INT);
    }

}
