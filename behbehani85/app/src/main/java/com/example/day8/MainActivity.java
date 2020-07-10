package com.example.day8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<pokemon> myPokemons = new ArrayList<>();
        pokemon p1 = new pokemon("Charizard",R.drawable.charizard , 84 , 78 , 534 );
        pokemon p2 = new pokemon( "Charmander" , R.drawable.charmander , 52 , 43 , 309);
        pokemon p3 = new pokemon("Ivysaur", R.drawable.ivysaur , 62 , 63 , 405);
        pokemon p4 = new pokemon("Pikachu" , R.drawable.pikachu , 55 , 40 ,320 );

        myPokemons.add(p1);
        myPokemons.add(p2);
        myPokemons.add(p3);
        myPokemons.add(p4);

        RecyclerView bh = findViewById(R.id.RecyclerView) ;
        bh.setHasFixedSize(true);
        RecyclerView.LayoutManager ir = new LinearLayoutManager(this );
        bh.setLayoutManager(ir);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(bh.getContext() ,
                ((LinearLayoutManager)ir).getOrientation());
        bh.addItemDecoration(dividerItemDecoration);



        PokemonAdapter adapter = new PokemonAdapter (myPokemons,this);
        bh.setAdapter(adapter);


    }
}