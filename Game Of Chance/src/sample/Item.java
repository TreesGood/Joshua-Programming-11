package sample;

public class Item {
    private int rarity;
    private double value;
    public String name;

    Item(String Name, double Value, int Rarity){
        this.name = Name;
        this.value = Value;
        this.rarity = Rarity;

    }

    //getters
    public double getValue() {
        return value;
    }
    //special getter for the rarity as a string of stars
    public String getRarityString() {

        String StarRarity = "☆☆☆☆☆";

        if (rarity == 0) {
            StarRarity = "☆☆☆☆☆";
        } else if (rarity == 1) {
            StarRarity = "★☆☆☆☆";
        } else if (rarity == 2) {
            StarRarity = "★★☆☆☆";
        } else if (rarity == 3) {
            StarRarity = "★★★☆☆";
        } else if (rarity == 4) {
            StarRarity = "★★★★☆";
        } else if (rarity == 5) {
            StarRarity = "★★★★★";
        }
        return StarRarity;
    }
    public int getRarity(){
        return rarity;
    }


    public String toString(){
        return "Stars: "+rarity+"\n"+name;
    }

}
