package id.arieridwan.androiddagger2.module;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import id.arieridwan.androiddagger2.model.Motor;
import id.arieridwan.androiddagger2.model.Vehicle;

/**
 * Created by arieridwan on 03/01/2017.
 */
@Module
public class VehicleModule {

    @Provides
    @Singleton
    Motor provideMotor(){
        return new Motor();
    }

    @Provides
    @Singleton
    Vehicle provideVehicle(){
        return new Vehicle(new Motor());
    }
}
