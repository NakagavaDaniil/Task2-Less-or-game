import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private View view;
    private Model model;



    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }




    private int inputIntValueWithScanner(Scanner sc) {
        int res = 0;
        view.printer(view.ONLY_INT);
        while (true) {
            // check int-value
            while (!sc.hasNextInt()) {
                view.onlyInt();
                sc.next();
            }
            // check value into diapason
            if ((res = sc.nextInt()) <= model.getMinBarrier() ||
                    res >= model.getMaxBarrier()) {
                view.onlyInt();
                continue;
            }
            break;
        }
        return res;
    }


    public void processStarter() {
       model.setBarriers(GlobalConstants.minBarrier,GlobalConstants.maxBarrier);
       view.BARRIER(GlobalConstants.minBarrier,GlobalConstants.maxBarrier);
       view.printer(view.START);
        model.setRandom();
        Scanner scanner = new Scanner(System.in);

       while (!compareWithSecret( model.checkValue(inputIntValueWithScanner(scanner))));
       view.numberOfTries(model.tries.size());
       view.previousTries(model.tries);

    }

    private boolean compareWithSecret(int toCheck) {


        if (toCheck> 0) {
            view.more();
            return false;
        } else if (toCheck< 0) {

            view.less();
            return false;
        } else {
            view.congrats();
            return true;
        }
    }
}
