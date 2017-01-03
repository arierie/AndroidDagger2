package id.arieridwan.androiddagger2.component;

import javax.inject.Singleton;
import dagger.Component;
import id.arieridwan.androiddagger2.model.Vehicle;
import id.arieridwan.androiddagger2.module.VehicleModule;

/**
 * Created by arieridwan on 03/01/2017.
 */
@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
    Vehicle provideVehicle();
}
