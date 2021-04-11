package mcm.edu.ph.dude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button hero;
    Button monster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        hero=findViewById(R.id.Heroes);
        monster=findViewById(R.id.Monster);

        hero.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent hero =new Intent(Home.this,HeroPage.class);
                        startActivity(hero);
                    }

                }
        );
        monster.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent monster =new Intent(Home.this,MonsterPage.class);
                        startActivity(monster);
                    }
                }
        );

    }
}