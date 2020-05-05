package com.example.scrollhorivert;

import java.util.ArrayList;
import java.util.List;

public class Items {

    public String Item;
    public String Supplier;
    public int LatestStock;
    public int SalePrice;
    public String BinNumber;
    public int Balance;

    public Items() {

    }

    public Items(String item, String supplier, int latestStock,
                 int salePrice, String binNumber, int balance) {
        Item = item;
        Supplier = supplier;
        LatestStock = latestStock;
        SalePrice = salePrice;
        BinNumber = binNumber;
        Balance = balance;
    }


    public List<Items> GetItems() {
        List<Items> lstItems = new ArrayList<Items>();

        lstItems.add(new Items("Weetabix Original 430g", "Weetabix",
                57, 9, "B7", 50));

        lstItems.add(new Items("Weetabix Chocolate 500g", "Weetabix",
                136, 122, "B8", 120));

        lstItems.add(new Items("Milo Honey Stars 500g", "Nestle",
                90, 89, "B1", 80));

        lstItems.add(new Items("Corn Flakes 500g", "Kellogg",
                149, 99, "B7", 149));

        lstItems.add(new Items("All Bran Flakes 500g", "Kellogg",
                180, 199, "B2", 100));

        lstItems.add(new Items( "Ricoffy 100g", "Ricoffy",
                50, 54, "B3", 50));

        lstItems.add(new Items("Lays Maxx Craquantes 145g", "Lays",
                47, 59, "B12", 47));

        lstItems.add(new Items("Lays Potato Chips 145g", "Lays",
                50, 74, "B12", 50));

        lstItems.add(new Items("Madeleines 250g", "St Michel",
                75, 79, "B2", 75));

        lstItems.add(new Items("Petis Pois 425g", "Regal",
                75, 18, "B13", 70));

        lstItems.add(new Items("Peas 40g", "Carnel",
                7, 18, "B1", 7));

        lstItems.add(new Items("Roasted Peanuts 500g", "Tropic",
                80, 62, "B5", 70));

        lstItems.add(new Items("Tropical Mix 125g", "Tropic",
                90, 53, "B6", 85));

        lstItems.add(new Items("Sweet Kernel Corn 400g", "O&P",
                72, 21, "B8", 70));

        lstItems.add(new Items("Cadbury Fingers Dark & Milk 125g", "Cadbury",
                65, 55, "B9", 60));

        lstItems.add(new Items("Mushrooms Pieces & Sterns 400g", "Kalite",
                60, 23, "B6", 59));

        lstItems.add(new Items("Bisuits Caramel & Crunchie 130g", "Cadbury",
                70, 68, "B10", 70));

        lstItems.add(new Items("Barbecue Sauce 300ml", "Sunny",
                60, 27, "B10", 40));

        lstItems.add(new Items( "Butter Doux 200g", "Lurpak",
                50, 52, "B11", 50));

        lstItems.add(new Items( "Olive Grove 500g", "Olive",
                190, 119, "B20", 150));

        return lstItems;
    }
}
