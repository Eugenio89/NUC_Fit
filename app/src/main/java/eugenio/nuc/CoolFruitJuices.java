package eugenio.nuc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class CoolFruitJuices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cool_fruit_juices);

        configureCardViewTropicalMix();
        configureCardViewSummerSmash();
        configureCardViewTropicalFantasyMix();
        configureCardViewSummerWatermelonMix();
        configureCardViewKiwiMax();
        configureCardViewPomegranateAppleJuice();
        configureCardViewBerryBerryJuice();
        configureCardViewIcedBananaLatte();
        configureCardViewMangoTangoCoulis();
        configureCardViewBananaNutSmoothie();
        configureCardViewPinkGrapefruitade();
        configureCardViewGreenLemonade();
        configureCardViewBlueberryade();
        configureCardViewCherryFizz();
        configureCardViewTequilaSunrise();
        configureCardViewAppleMartini();
        configureCardViewRedSangria();
        configureCardViewSummerSake();
        configureCardViewBlueberryMojito();
        configureCardViewRedEye();
        configureCardViewWatermelonNomimono();
        configureCardViewMalibuBayBreeze();

    }

    private void configureCardViewTropicalMix() {
        CardView cardView = (CardView) findViewById(R.id.CardViewTropicalMix);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolTropicalMix.class));
            }
        });
    }

    private void configureCardViewSummerSmash() {
        CardView cardView = (CardView) findViewById(R.id.CardViewSummerSmash);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolSummerSmash.class));
            }
        });
    }

    private void configureCardViewTropicalFantasyMix() {
        CardView cardView = (CardView) findViewById(R.id.CardViewTropicalFantasy);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolTropicalFantasyMix.class));
            }
        });
    }

    private void configureCardViewSummerWatermelonMix() {
        CardView cardView = (CardView) findViewById(R.id.CardViewSummerWatermelon);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolSummerWatermelonMix.class));
            }
        });
    }

    private void configureCardViewKiwiMax() {
        CardView cardView = (CardView) findViewById(R.id.CardViewKiwiMax);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolKiwiMax.class));
            }
        });
    }

    private void configureCardViewPomegranateAppleJuice() {
        CardView cardView = (CardView) findViewById(R.id.CardViewPomegranateApple);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolPomegranateAppleJuice.class));
            }
        });
    }

    private void configureCardViewBerryBerryJuice() {
        CardView cardView = (CardView) findViewById(R.id.CardViewBerryBerry);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolBerryBerryJuice.class));
            }
        });
    }

    private void configureCardViewIcedBananaLatte() {
        CardView cardView = (CardView) findViewById(R.id.CardViewIcedBanana);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolIcedBananaLatte.class));
            }
        });
    }

    private void configureCardViewMangoTangoCoulis() {
        CardView cardView = (CardView) findViewById(R.id.CardViewMangoTango);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolMangoTangoCoulis.class));
            }
        });
    }

    private void configureCardViewBananaNutSmoothie() {
        CardView cardView = (CardView) findViewById(R.id.CardViewBananaNut);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolBananaNutSmoothie.class));
            }
        });
    }

    private void configureCardViewPinkGrapefruitade() {
        CardView cardView = (CardView) findViewById(R.id.CardViewPinkGrapefruitade);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolPinkGrapefruitade.class));
            }
        });
    }

    private void configureCardViewGreenLemonade() {
        CardView cardView = (CardView) findViewById(R.id.CardViewGreenLemonade);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolGreenLemonade.class));
            }
        });
    }

    private void configureCardViewBlueberryade() {
        CardView cardView = (CardView) findViewById(R.id.CardViewBlueberryade);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolBlueberryade.class));
            }
        });
    }

    private void configureCardViewCherryFizz() {
        CardView cardView = (CardView) findViewById(R.id.CardViewCarrotCherryFizz);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolCherryFizz.class));
            }
        });
    }

    private void configureCardViewTequilaSunrise() {
        CardView cardView = (CardView) findViewById(R.id.CardViewTequilaSunrise);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolTequilaSunrise.class));
            }
        });
    }

    private void configureCardViewAppleMartini() {
        CardView cardView = (CardView) findViewById(R.id.CardViewAppleMartini);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolAppleMartini.class));
            }
        });
    }

    private void configureCardViewRedSangria() {
        CardView cardView = (CardView) findViewById(R.id.CardViewRedSangria);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolRedSangria.class));
            }
        });
    }

    private void configureCardViewSummerSake() {
        CardView cardView = (CardView) findViewById(R.id.CardViewSummerSake);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolSummerSake.class));
            }
        });
    }

    private void configureCardViewBlueberryMojito() {
        CardView cardView = (CardView) findViewById(R.id.CardViewBlueberryMojito);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolBlueberryMojito.class));
            }
        });
    }

    private void configureCardViewRedEye() {
        CardView cardView = (CardView) findViewById(R.id.CardViewRedEye);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolRedEye.class));
            }
        });
    }

    private void configureCardViewWatermelonNomimono() {
        CardView cardView = (CardView) findViewById(R.id.CardViewWatermelonNomimono);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolWatermelonNomimono.class));
            }
        });
    }

    private void configureCardViewMalibuBayBreeze() {
        CardView cardView = (CardView) findViewById(R.id.CardViewMalibuBay);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoolFruitJuices.this, CoolMalibuBayBreeze
                        .class));
            }
        });
    }


}
