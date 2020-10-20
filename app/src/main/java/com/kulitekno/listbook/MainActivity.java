package com.kulitekno.listbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {
    private RecyclerView rvJets;
    private ArrayList<book> list = new ArrayList<>();
    private String title = "Book ListView";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvJets = findViewById(R.id.rv_heroes);
        rvJets.setHasFixedSize(true);

        list.addAll(data.getListData());
        showRecyclerList();

    }

//    menu atas code
    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
    }
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_about){
            Intent move = new Intent(MainActivity.this,about.class);
            move.setFlags(move.FLAG_ACTIVITY_REORDER_TO_FRONT | move.FLAG_ACTIVITY_PREVIOUS_IS_TOP);
            startActivity(move);
        }
        else {
            setMode(item.getItemId());
        }
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {

            case R.id.action_list:
                title = "Book ListView";
                showRecyclerList();
                break;

            case R.id.action_cardview:
                title = "Book CardView";
                showRecyclerCard();
                break;
        }
        setActionBarTitle(title);
    }
//    ===

    private void showRecyclerList() {
        rvJets.setLayoutManager(new LinearLayoutManager(this));
        listAdapter listAdapter = new listAdapter(list);
        rvJets.setAdapter(listAdapter);

        listAdapter.setOnItemClickCallback(new listAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(book data) {
//                showSelectedJet(data);
                Intent move = new Intent(MainActivity.this,detail.class);
                move.setFlags(move.FLAG_ACTIVITY_REORDER_TO_FRONT | move.FLAG_ACTIVITY_PREVIOUS_IS_TOP);
                move.putExtra(detail.TITLE,data.getName());
                move.putExtra(detail.ISI,data.getDetail());
                move.putExtra(detail.img_data,data.getPhoto());
                move.putExtra(detail.penulis,data.getPenulis());
                move.putExtra(detail.terbit,data.getTerbit());
                move.putExtra(detail.halaman,data.getHalaman());
                move.putExtra(detail.genre,data.getGenre());
                startActivity(move);
            }
        });
    }

//    private void showSelectedJet(jet Jet) {
//        Toast.makeText(this, "Kamu memilih " + Jet.getName(), Toast.LENGTH_SHORT).show();
//    }

    private void showRecyclerCard() {
        rvJets.setLayoutManager(new LinearLayoutManager(this));
        cardAdapter CardAdapter = new cardAdapter(list);
        rvJets.setAdapter(CardAdapter);

        CardAdapter.setOnItemClickCallback(new cardAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(book data) {
//                showSelectedJet(data);
                Intent move = new Intent(MainActivity.this,detail.class);
                move.putExtra(detail.TITLE,data.getName());
                move.putExtra(detail.ISI,data.getDetail());
                move.putExtra(detail.img_data,data.getPhoto());
                move.putExtra(detail.penulis,data.getPenulis());
                move.putExtra(detail.terbit,data.getTerbit());
                move.putExtra(detail.halaman,data.getHalaman());
                move.putExtra(detail.genre,data.getGenre());
                startActivity(move);
            }
        });
    }
}
