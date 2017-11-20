package eugenio.nuc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class BasicJuices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_juices);

        configureCardViewApple();
        configureCardViewCarrot();
        configureCardViewPomegranate();
        configureCardViewPear();
        configureCardViewOrange();
        configureCardViewGrape();
        configureCardViewCabbage();
        configureCardViewTomato();
        configureCardViewSpinach();
        configureCardViewCelery();
        configureCardViewKale();
        configureCardViewWheatgrass();
        configureCardViewBell();
        configureCardViewCarrotCelery();
        configureCardViewDreamy();
        configureCardViewDetox();
        configureCardViewCeleb();
        configureCardViewBabySpinach();
        configureCardViewMultivitamin();
        configureCardViewTangy();
        configureCardViewPurple();

    }

        private void configureCardViewApple() {
            CardView cardView = (CardView) findViewById(R.id.CardViewApple);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BasicJuices.this, BasicAppleJuice.class));
                }
            });
        }

        private void configureCardViewCarrot() {
            CardView cardView = (CardView) findViewById(R.id.CardViewCarrot);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BasicJuices.this, BasicCarrotJuice.class));
                }
            });
        }

        private void configureCardViewPomegranate() {
            CardView cardView = (CardView) findViewById(R.id.CardViewPomegranate);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BasicJuices.this, BasicPomegranateJuice.class));
                }
            });
        }

        private void configureCardViewPear() {
            CardView cardView = (CardView) findViewById(R.id.CardViewPear);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BasicJuices.this, BasicPearJuice.class));
                }
            });
        }

        private void configureCardViewOrange() {
            CardView cardView = (CardView) findViewById(R.id.CardViewOrange);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BasicJuices.this, BasicOrangeJuice.class));
                }
            });
        }

        private void configureCardViewGrape() {
            CardView cardView = (CardView) findViewById(R.id.CardViewGrape);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BasicJuices.this, BasicGrapeJuice.class));
                }
            });
        }

        private void configureCardViewCabbage() {
            CardView cardView = (CardView) findViewById(R.id.CardViewCabbage);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BasicJuices.this, BasicCabbageJuice.class));
                }
            });
        }

        private void configureCardViewTomato() {
            CardView cardView = (CardView) findViewById(R.id.CardViewTomato);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BasicJuices.this, BasicTomatoJuice.class));
                }
            });
        }

        private void configureCardViewSpinach() {
            CardView cardView = (CardView) findViewById(R.id.CardViewSpinach);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BasicJuices.this, BasicSpinachJuice.class));
                }
            });
        }

        private void configureCardViewCelery() {
            CardView cardView = (CardView) findViewById(R.id.CardViewCelery);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BasicJuices.this, BasicCeleryJuice.class));
                }
            });
        }

        private void configureCardViewKale() {
            CardView cardView = (CardView) findViewById(R.id.CardViewKale);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BasicJuices.this, BasicKaleJuice.class));
                }
            });
        }

        private void configureCardViewWheatgrass() {
            CardView cardView = (CardView) findViewById(R.id.CardViewWheatgrass);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BasicJuices.this, BasicWheatgrassJuice.class));
                }
            });
        }

        private void configureCardViewBell() {
            CardView cardView = (CardView) findViewById(R.id.CardViewBell);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BasicJuices.this, BasicBellPepperJuice.class));
                }
            });
        }

        private void configureCardViewCarrotCelery() {
            CardView cardView = (CardView) findViewById(R.id.CardViewCarrotCelery);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BasicJuices.this, BasicCarrotAndCeleryJuice.class));
                }
            });
        }

        private void configureCardViewDreamy() {
            CardView cardView = (CardView) findViewById(R.id.CardViewDreamy);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BasicJuices.this, BasicDreamyCarrotJuice.class));
                }
            });
        }

        private void configureCardViewDetox() {
            CardView cardView = (CardView) findViewById(R.id.CardViewDetox);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BasicJuices.this, BasicDetoxGreenJuice.class));
                }
            });
        }

        private void configureCardViewCeleb() {
            CardView cardView = (CardView) findViewById(R.id.CardViewCeleb);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BasicJuices.this, BasicCelebCeleryJuice.class));
                }
            });
        }

        private void configureCardViewBabySpinach() {
            CardView cardView = (CardView) findViewById(R.id.CardViewBabySpinach);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BasicJuices.this, BasicBabySpinachJuice.class));
                }
            });
        }

        private void configureCardViewMultivitamin() {
            CardView cardView = (CardView) findViewById(R.id.CardViewMultivitamin);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BasicJuices.this, BasicMultivitaminJuice.class));
                }
            });
        }

        private void configureCardViewTangy() {
            CardView cardView = (CardView) findViewById(R.id.CardViewTangy);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BasicJuices.this, BasicTangyTomato.class));
                }
            });
        }

        private void configureCardViewPurple() {
        CardView cardView = (CardView) findViewById(R.id.CardViewPurple);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BasicJuices.this, BasicPurpleCabbageJuice.class));
            }
        });


    }

}
