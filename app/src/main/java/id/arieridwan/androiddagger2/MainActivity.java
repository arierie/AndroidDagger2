package id.arieridwan.androiddagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import id.arieridwan.androiddagger2.component.DaggerVehicleComponent;
import id.arieridwan.androiddagger2.component.VehicleComponent;
import id.arieridwan.androiddagger2.model.Vehicle;
import id.arieridwan.androiddagger2.module.VehicleModule;

public class MainActivity extends AppCompatActivity {

    Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VehicleComponent component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();
        vehicle = component.provideVehicle();
        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
    }
}
