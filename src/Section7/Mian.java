package Section7;

public class Mian {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Zemicka", 230, true, false, true, true);
        System.out.println("Total burger price is "+hamburger.totalPrice());

        HealthyBurger zdravo = new HealthyBurger(100, true,true,false,false,true,true);
        System.out.println("Total burger price is "+zdravo.totalPrice());

    }
}

