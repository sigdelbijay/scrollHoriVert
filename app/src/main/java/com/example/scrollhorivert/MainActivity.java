package com.example.scrollhorivert;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    ListView lstStockItems;
    ListView listViewMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstStockItems = findViewById(R.id.lstStockItems);
        listViewMain = findViewById(R.id.listViewMain);
        FillList();

        listViewMain.setOnScrollListener(new AbsListView.OnScrollListener() {

            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                lstStockItems.setSelection(firstVisibleItem);//force the right listview to scrollyou may have to do some calculation to sync the scrolling status of the two listview.
            }
        });

    }

    public void FillList() {
        try {
            Items items = new Items();
            List<Map<String, String>> prolist = new ArrayList<Map<String, String>>();
            String[] from = { "Item", "Supplier", "LatestStock", "SalePrice", "BinNumber", "Balance"};
            int[] views = {R.id.txtItemName, R.id.txtSupplier,
                    R.id.txtLatestStock, R.id.txtSalePrice, R.id.txtBinNumber, R.id.txtBalance};

            List<Items> lsr = items.GetItems();
            Log.i("----------list---->", lsr+"");

            for (int i = 0; i < lsr.size(); i++) {
                Map<String, String> datanum = new HashMap<String, String>();
                datanum.put("Item", String.valueOf(lsr.get(i).Item));
                datanum.put("Supplier", String.valueOf(lsr.get(i).Supplier));
                datanum.put("LatestStock", String.valueOf(lsr.get(i).LatestStock));
                datanum.put("SalePrice", String.valueOf(lsr.get(i).SalePrice));
                datanum.put("BinNumber", String.valueOf(lsr.get(i).BinNumber));
                datanum.put("Balance", String.valueOf(lsr.get(i).Balance));
                prolist.add(datanum);
            }
            Log.i("-----prolist-------->", prolist+"");

            final SimpleAdapter simpleAdapter = new SimpleAdapter(MainActivity.this,
                    prolist, R.layout.lst_items, from,
                    views);
            lstStockItems.setAdapter(simpleAdapter);

            String [] array = {
                    "IT1001", "IT1002", "IT1003", "IT1004", "IT1005", "IT1001", "IT1002", "IT1003", "IT1004",
                    "IT1005", "IT1001", "IT1002", "IT1003", "IT1004", "IT1005", "IT1001", "IT1002", "IT1003", "IT1004", "IT1005"
            };
            final ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, array);
            listViewMain.setAdapter(arrayAdapter);
        } catch (Exception ex) {
            Toast.makeText(MainActivity.this, ex.getMessage().toString(),
                    Toast.LENGTH_LONG).show();
        }
    }
}

