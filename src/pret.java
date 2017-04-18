/**
 * Created by Tomasz on 23.03.2017.
 */
public class pret extends PunktMaterialny {
    int r3=10;
    int I3;
    int MomentPret;
    public int getMomentPret(){
        return I3=r3*r3*masa/12;
    }
    int Stpret;
    public int getStpret() {
        return I3 + masa * r * r;
    }
}
