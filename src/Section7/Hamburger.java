package Section7;

import java.sql.SQLOutput;

public class Hamburger {

    private String breadRoll;
    private int meatGrams;
    private boolean lettuce, tomato, paprika, onion;
    private int burgerPrice;
    private int lettucePrice = 3;
    private int tomatoPrice = 4;
    private int paprikaPrice = 5;
    private int onionPrice = 5;

    public Hamburger(String breadRoll, int meatGrams, boolean lettuce, boolean tomato, boolean paprika, boolean onion) {
        this.breadRoll = breadRoll;
        this.meatGrams = meatGrams;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.paprika = paprika;
        this.onion = onion;
    }

    public int totalPrice(){
        if(meatGrams>150&&meatGrams<=200) {
            burgerPrice = 22;
            System.out.println("Burger price = "+burgerPrice);
        }
        else if(meatGrams>200&&meatGrams<300) {
            burgerPrice = 30;
            System.out.println("Burger price = "+burgerPrice);
        }
        else {
            burgerPrice = 20;
            System.out.println("Burger price = "+burgerPrice);
        }
        if(lettuce) {
            System.out.println(" +lettuce, at price "+lettucePrice);
            burgerPrice+=lettucePrice;
        }
        if(tomato) {
            System.out.println(" +tomato, at price "+tomatoPrice);
            burgerPrice+=tomatoPrice;
        }
        if(paprika) {
            System.out.println(" +paprika, at price "+paprikaPrice);
            burgerPrice+=paprikaPrice;
        }
        if(onion) {
            System.out.println(" +onion, at price "+onionPrice);
            burgerPrice+=onionPrice;
        }
        return burgerPrice;
    }
}

class HealthyBurger extends Hamburger{

    private boolean krastavac;
    private boolean avocado;
    private int krastavacPrice = 2;
    private int avocadoPrice = 7;

    public HealthyBurger(int meatGrams, boolean lettuce, boolean tomato, boolean paprika, boolean onion, boolean krastavac, boolean avocado) {
        super("Brown rye bread roll", meatGrams, lettuce, tomato, paprika, onion);
        this.krastavac = krastavac;
        this.avocado = avocado;
    }

    @Override
    public int totalPrice() {

        int burgerPrice = super.totalPrice();
        if(krastavac) {
            System.out.println(" +krastavac, at price "+krastavacPrice);
            burgerPrice+=krastavacPrice;
        }
        if(avocado) {
            System.out.println(" +avocado, at price "+avocadoPrice);
            burgerPrice+=avocadoPrice;
        }
        return burgerPrice;
    }
}
