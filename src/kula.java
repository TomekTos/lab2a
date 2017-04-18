/**
 * Created by Tomasz on 23.03.2017.
 */
public class kula extends PunktMaterialny {
    int r2=10;
    int MomentKula;
    int I2;
    public int getMomentKula(){
        return I2=r2*r2*masa*2/5;
    }
    int Stkula;
    public int getStkula() {
        return I2 + masa * r * r;
    }
}
