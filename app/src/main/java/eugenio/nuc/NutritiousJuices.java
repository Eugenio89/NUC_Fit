package eugenio.nuc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class NutritiousJuices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutritious_juices);

        configureCardViewLOHAS();
        configureCardViewHydratingCucumber();
        configureCardViewSoothingPear();
        configureCardViewLotusRoot();
        configureCardViewRedVitamin();
        configureCardViewOrangeBeet();
        configureCardViewSoyMilk();
        configureCardViewNutMilk();
        configureCardViewAlmondMilk();
        configureCardViewCashewMilk();
        configureCardViewBroccoliChicken();
        configureCardViewTomatoSoup();
        configureCardViewVegetableCheese();
        configureCardViewCarrotPotato();
        configureCardViewMangoBanana();

    }

    private void configureCardViewLOHAS() {
        CardView cardView = (CardView) findViewById(R.id.CardViewLOHAS);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritiousJuices.this, NutritiousLOHASWheatgrassJuice.class));
            }
        });
    }

    private void configureCardViewHydratingCucumber() {
        CardView cardView = (CardView) findViewById(R.id.CardViewHydratingCucumber);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritiousJuices.this, NutritiousHydratingCucumberJuice.class));
            }
        });
    }

    private void configureCardViewSoothingPear() {
        CardView cardView = (CardView) findViewById(R.id.CardViewSoothingPear);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritiousJuices.this, NutritiousSoothingPearGingerJuice.class));
            }
        });
    }

    private void configureCardViewLotusRoot() {
        CardView cardView = (CardView) findViewById(R.id.CardViewLotusRoot);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritiousJuices.this, NutritiousLotusRootEnergyBoostJuice.class));
            }
        });
    }

    private void configureCardViewRedVitamin() {
        CardView cardView = (CardView) findViewById(R.id.CardViewRedVitamin);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritiousJuices.this, NutritiousRedVitaminRadishJuice.class));
            }
        });
    }

    private void configureCardViewOrangeBeet() {
        CardView cardView = (CardView) findViewById(R.id.CardViewOrangeBeet);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritiousJuices.this, NutritiousOrangeBeetVitalizingJuice.class));
            }
        });
    }

    private void configureCardViewSoyMilk() {
        CardView cardView = (CardView) findViewById(R.id.CardViewSoyMilk);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritiousJuices.this, NutritiousSoyMilk.class));
            }
        });
    }

    private void configureCardViewNutMilk() {
        CardView cardView = (CardView) findViewById(R.id.CardViewNutMilk);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritiousJuices.this, NutritiousNutMilk.class));
            }
        });
    }

    private void configureCardViewAlmondMilk() {
        CardView cardView = (CardView) findViewById(R.id.CardViewAlmondMilk);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritiousJuices.this, NutritiousAlmondMilk.class));
            }
        });
    }

    private void configureCardViewCashewMilk() {
        CardView cardView = (CardView) findViewById(R.id.CardViewCashewMilk);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritiousJuices.this, NutritiousCashewMilk.class));
            }
        });
    }

    private void configureCardViewBroccoliChicken() {
        CardView cardView = (CardView) findViewById(R.id.CardViewBroccoliChicken);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritiousJuices.this, NutritiousBroccoliChickenPorridge.class));
            }
        });
    }

    private void configureCardViewTomatoSoup() {
        CardView cardView = (CardView) findViewById(R.id.CardViewTomatoSoup);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritiousJuices.this, NutritiousTomatoSoup.class));
            }
        });
    }

    private void configureCardViewVegetableCheese() {
        CardView cardView = (CardView) findViewById(R.id.CardViewVegetableCheese);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritiousJuices.this, NutritiousVegetableAndCheeseFingerFood.class));
            }
        });
    }

    private void configureCardViewCarrotPotato() {
        CardView cardView = (CardView) findViewById(R.id.CardViewCarrotPotato);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritiousJuices.this, NutritiousCarrotAndPotatoMash.class));
            }
        });
    }

    private void configureCardViewMangoBanana() {
        CardView cardView = (CardView) findViewById(R.id.CardViewMangoBanana);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritiousJuices.this, NutritiousMangoAndBananaPuree.class));
            }
        });
    }

}
