package id.arieridwan.androiddagger2.model;

/**
 * Created by arieridwan on 03/01/2017.
 */

public class Motor {

    private int rpm;

    public Motor() {
        this.rpm = 0;
    }

    public int getRpm() {
        return rpm;
    }

    public void accelerate(int value){
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }
}
