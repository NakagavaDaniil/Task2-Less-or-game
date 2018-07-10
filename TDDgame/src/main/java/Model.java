import java.util.ArrayList;


public class Model {
    public int rondomNumber;
    private int minBarrier;
    private int maxBarrier;
    public ArrayList tries = new ArrayList();



    public void setRandom (){
        rondomNumber = (int)Math.ceil(Math.random()*
                (maxBarrier - minBarrier - 1) + minBarrier);
    }

    public int checkValue (int userValue){
        tries.add(userValue);
        return rondomNumber-userValue;
    }

    public Model() {
    }

    public void setBarriers(int minBarrier , int maxBarrier) {
        this.minBarrier = minBarrier;
        this.maxBarrier=maxBarrier;
    }

    public int getMinBarrier() {
        return minBarrier;
    }


    public int getMaxBarrier() {
        return maxBarrier;
    }

    public int getRondomNumber() {
        return rondomNumber;
    }

    public void setMinBarrier(int minBarrier) {
        this.minBarrier = minBarrier;
    }

    public void setMaxBarrier(int maxBarrier) {
        this.maxBarrier = maxBarrier;
    }
}
