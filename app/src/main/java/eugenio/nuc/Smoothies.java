package eugenio.nuc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Smoothies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smoothies);

        configureCardViewCreamyPumpkinSmoothie();
        configureCardViewSpinachSmoothie();
        configureCardViewOrientalSweetPotatoesSmoothie();
        configureCardViewBlueberrySmoothie();
        configureCardViewMelonBananaSmoothie();
        configureCardViewCarrotBananaSmoothie();
        configureCardViewTomatoKiwiSmoothie();
        configureCardViewCacaoAvocadoBananaSmoothie();
        configureCardViewCashewCranberrySmoothie();
        configureCardViewAvocadoPineappleSmoothie();
        configureCardViewStrawberrySorbet();
        configureCardViewKiwiSorbet();
        configureCardViewBlueberrySorbet();
        configureCardViewMangoSorbet();
        configureCardViewBananaYogurtGelato();
        configureCardViewCranberrySorbet();
        configureCardViewBerryDelight();
        configureCardViewOrangeLemonSorbet();

    }

    private void configureCardViewCreamyPumpkinSmoothie() {
        CardView cardView = (CardView) findViewById(R.id.CardViewCreamyPumpkinSmoothie);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Smoothies.this, SmoothiesCreamyPumpkinSmoothie.class));
            }
        });
    }

    private void configureCardViewSpinachSmoothie() {
        CardView cardView = (CardView) findViewById(R.id.CardViewSpinachSmoothie);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Smoothies.this, SmoothiesSpinachSmoothie.class));
            }
        });
    }

    private void configureCardViewOrientalSweetPotatoesSmoothie() {
        CardView cardView = (CardView) findViewById(R.id.CardViewOrientalSweetPotatoesSmoothie);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Smoothies.this, SmoothiesOrientalSweetPotatoesSmoothie.class));
            }
        });
    }

    private void configureCardViewBlueberrySmoothie() {
        CardView cardView = (CardView) findViewById(R.id.CardViewBlueberrySmoothie);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Smoothies.this, SmoothiesBlueberrySmoothie.class));
            }
        });
    }

    private void configureCardViewMelonBananaSmoothie() {
        CardView cardView = (CardView) findViewById(R.id.CardViewMelonBananaSmoothie);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Smoothies.this, SmoothiesMelonBananaSmoothie.class));
            }
        });
    }

    private void configureCardViewCarrotBananaSmoothie() {
        CardView cardView = (CardView) findViewById(R.id.CardViewCarrotBananaSmoothie);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Smoothies.this, SmoothiesCarrotBananaSmoothie.class));
            }
        });
    }

    private void configureCardViewTomatoKiwiSmoothie() {
        CardView cardView = (CardView) findViewById(R.id.CardViewTomatoKiwiSmoothie);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Smoothies.this, SmoothiesTomatoKiwiSmoothie.class));
            }
        });
    }

    private void configureCardViewCacaoAvocadoBananaSmoothie() {
        CardView cardView = (CardView) findViewById(R.id.CardViewCacaoAvocadoBananaSmoothie);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Smoothies.this, SmoothiesCacaoAvocadoBananaSmoothie.class));
            }
        });
    }

    private void configureCardViewCashewCranberrySmoothie() {
        CardView cardView = (CardView) findViewById(R.id.CardViewCashewCranberrySmoothie);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Smoothies.this, SmoothiesCashewCranberrySmoothie.class));
            }
        });
    }

    private void configureCardViewAvocadoPineappleSmoothie() {
        CardView cardView = (CardView) findViewById(R.id.CardViewAvocadoPineappleSmoothie);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Smoothies.this, SmoothiesAvocadoPineappleSmoothie.class));
            }
        });
    }

    private void configureCardViewStrawberrySorbet() {
        CardView cardView = (CardView) findViewById(R.id.CardViewStrawberrySorbet);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Smoothies.this, SmoothiesStrawberrySorbet.class));
            }
        });
    }

    private void configureCardViewKiwiSorbet() {
        CardView cardView = (CardView) findViewById(R.id.CardViewKiwiSorbet);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Smoothies.this, SmoothiesKiwiSorbet.class));
            }
        });
    }

    private void configureCardViewBlueberrySorbet() {
        CardView cardView = (CardView) findViewById(R.id.CardViewBlueberrySorbet);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Smoothies.this, SmoothiesBlueberrySorbet.class));
            }
        });
    }

    private void configureCardViewMangoSorbet() {
        CardView cardView = (CardView) findViewById(R.id.CardViewMangoSorbet);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Smoothies.this, SmoothiesMangoSorbet.class));
            }
        });
    }

    private void configureCardViewBananaYogurtGelato() {
        CardView cardView = (CardView) findViewById(R.id.CardViewBananaYogurtGelato);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Smoothies.this, SmoothiesBananaYogurtGelato.class));
            }
        });
    }

    private void configureCardViewCranberrySorbet() {
        CardView cardView = (CardView) findViewById(R.id.CardViewCranberrySorbet);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Smoothies.this, SmoothiesCranberrySorbet.class));
            }
        });
    }

    private void configureCardViewBerryDelight() {
        CardView cardView = (CardView) findViewById(R.id.CardViewBerryDelight);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Smoothies.this, SmoothiesBerryDelight.class));
            }
        });
    }

    private void configureCardViewOrangeLemonSorbet() {
        CardView cardView = (CardView) findViewById(R.id.CardViewOrangeLemonSorbet);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Smoothies.this, SmoothiesOrangeLemonSorbet.class));
            }
        });
    }

}
