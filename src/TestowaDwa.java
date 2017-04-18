/**
 * Created by Tomasz on 23.03.2017.
 */
    public class TestowaDwa {
    public static void main(String[] args) {
        walec walec1 = new walec();
        System.out.println("Masa walca wynosi: " + walec1.getmasa());
        System.out.println("Moment walca wynosi: " + walec1.getMomentWalec());
        System.out.println("Moment steinera walca wynosi: " + walec1.getStwalec());
        kula kula1 = new kula();
        System.out.println("Masa kuli wynosi: " + kula1.getmasa());
        System.out.println("Moment kuli wynosi: " + kula1.getMomentKula());
        System.out.println("Moment steinera kuli wynosi: " + kula1.getStkula());
        pret pret1 = new pret();
        System.out.println("Masa preta wynosi: " + pret1.getmasa());
        System.out.println("Moment preta wynosi: " + pret1.getMomentPret());
        System.out.println("Moment steinera preta wynosi: " + pret1.getStpret());
    }
}