
/**
 * Created by Tomasz on 23.03.2017.
 */
public class PunktMaterialny {
    public void napis() {

        System.out.println("Punkt materialny");
    }

    protected int masa;

    protected PunktMaterialny() {  //konstruktor bez parametru (przypisuje masie wartość 20)
        masa = 20;
    }

    protected void setmasa(int m) {  //metoda (mutator, nadaje wartość zmiennej)
        masa = m;
    }
    protected PunktMaterialny(int m) {  //konstruktor z parametrem
        if (m>0) {
            masa = m;
        }
        else {
            System.out.println("Masa nie moze byc ujemna");
            masa=10;
        }
    }

    protected int getmasa() {  //metoda (akcesor, zwraca wartość zmiennej)
        return masa;
    }
    protected int r=5;
    }
