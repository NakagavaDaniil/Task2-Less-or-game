import org.junit.Assert;

public class TestModel extends Assert {
    private Model model = new Model();


@org.junit.Test(timeout = 1000)
    public void testRandom() {
    model.setBarriers(GlobalConstants.minBarrier, GlobalConstants.maxBarrier);
    model.setRandom();
    int i = 0;
    while (true){
        if(model.rondomNumber==GlobalConstants.minBarrier){
            Assert.assertEquals(i, model.rondomNumber);
            break;
        }else
        if(GlobalConstants.maxBarrier == model.rondomNumber){
            Assert.assertEquals(i, model.rondomNumber);
            break;
        }else
        if(i==model.rondomNumber){
            Assert.assertEquals(i, model.rondomNumber);
            break;
        }
        i++;
    }

}

}
