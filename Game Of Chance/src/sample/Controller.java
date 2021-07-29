package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class Controller {

    public Label Money;
    public Button RollingButton;
    public Label ItemReceivedName;
    public Label ReceivedItemRarity;
    public Label ReceivedItemValue;
    public ListView<Item> Inventory = new ListView<>();
    public Label InventoryItemName;
    public Label InventoryItemRarity;
    public Label InventoryItemValue;
    public Button InventorySellButton;
    public double money = 1700;
    public Label Money1;
    public Label LifetimeRolls;
    public Label oneStarRolls;
    public Label twoStarRolls;
    public Label threeStarRolls;
    public Label fourStarRolls;
    public Label fiveStarRolls;
    public Label LifeTimeSold;
    public Label zeroStarRolls;

    public int rolls;
    public int oneStars;
    public int twoStars;
    public int threeStars;
    public int fourStars;
    public int fiveStars;
    public int Sold;
    public int zeroStars;;
    //17
    String[] itemTypes = {"Sword","Bow","Wand","Laser rifle","Broadsword", "Staff", "Spear","Club","Shurikens","Stick","Ruler","Chainsaw","Spell Book","Daggers","Broken Bottle","Stapler","Sharp(and I mean VERY sharp) pencil"};
    //19
    String[] itemTitleNoun = {"lizard","dragon","fairy","cthulhu","hero","slime","goblin","troll","unicorn","werewolf","mermaid","griffin","yeti","sheep","pokemon","water bottle","cactus","pencil sharpener","international space station"};
    //19
    String[] itemTitleVerb = {"slaying","taming","summoning","healing","resurrecting","cleaning","hugging","obliterating","head patting","yelling at","catching","walking","","happiness","despair","hair cutting","watching","educating","vaccinating","lecturing about the meaning of life, the universe and everything"};

    public void SellItem(ActionEvent actionEvent) {
        Item item;
        item = Inventory.getSelectionModel().getSelectedItem();
        money += item.getValue();
        Money.setText(String.valueOf(money));
        Money1.setText(String.valueOf(money));
        Inventory.getItems().remove(item);
        InventoryItemName.setText("");
        InventoryItemRarity.setText("");
        InventoryItemValue.setText("");
        Sold++;
        LifeTimeSold.setText(String.valueOf(Sold));

    }


    public void Roll(ActionEvent actionEvent) {
        if (money >= 170) {
            money -=170;
            Money.setText(String.valueOf(money));
            Money1.setText(String.valueOf(money));


            int randomType = (int) (Math.floor(Math.random() * itemTypes.length));
            int randomTitleNoun = (int) (Math.floor(Math.random() * itemTitleNoun.length));
            int randomTitleVerb = (int) Math.floor(Math.random() * itemTitleVerb.length);

            double RarityRandom = (Math.random() * 5.2);

            int rarity = (int) (Math.floor((RarityRandom * RarityRandom / 5)));

            double value = (double) (Math.floor(((rarity + 1) * (rarity + 1) * ((Math.random() * 5) + 37))));

            Item currentItem = new Item("The " + itemTypes[randomType] + " of " + itemTitleNoun[randomTitleNoun] + " " + itemTitleVerb[randomTitleVerb], value, rarity);

            Inventory.getItems().add(currentItem);

            ItemReceivedName.setText(currentItem.name);

            String StarRarity = "☆☆☆☆☆";

            if (rarity == 0) {
                StarRarity = "☆☆☆☆☆";
                zeroStars++;
            } else if (rarity == 1) {
                StarRarity = "★☆☆☆☆";
                oneStars++;
            } else if (rarity == 2) {
                StarRarity = "★★☆☆☆";
                twoStars++;
            } else if (rarity == 3) {
                StarRarity = "★★★☆☆";
                threeStars++;
            } else if (rarity == 4) {
                StarRarity = "★★★★☆";
                fourStars++;
            } else if (rarity == 5) {
                StarRarity = "★★★★★";
                fiveStars++;
            }
            rolls++;
            zeroStarRolls.setText(String.valueOf(zeroStars));
            oneStarRolls.setText(String.valueOf(oneStars));
            twoStarRolls.setText(String.valueOf(twoStars));
            threeStarRolls.setText(String.valueOf(threeStars));
            fourStarRolls.setText(String.valueOf(fourStars));
            fiveStarRolls.setText(String.valueOf(fiveStars));
            LifetimeRolls.setText(String.valueOf(rolls));

            ReceivedItemRarity.setText(StarRarity);

            ReceivedItemValue.setText(String.valueOf(value));



        }
    }

    public void DisplayInfo(MouseEvent mouseEvent) {
        Item item;
        item = Inventory.getSelectionModel().getSelectedItem();
        InventoryItemName.setText(item.name);
        InventoryItemRarity.setText(item.getRarityString());
        InventoryItemValue.setText(String.valueOf(item.getValue()));


    }

}
