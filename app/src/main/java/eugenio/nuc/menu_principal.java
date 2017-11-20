package eugenio.nuc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class menu_principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        configureCardView();
        configureCardView2();
        configureCardView3();
        configureCardView4();
        //configureCardView5();
        configureCardView6();
        configureCardView7();

    }
        private void configureCardView7() {
            CardView cardView = (CardView) findViewById(R.id.cardView7);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(menu_principal.this, Settings.class));
                }
            });

        }

        private void configureCardView6() {
            CardView cardView = (CardView) findViewById(R.id.cardView6);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(menu_principal.this, nuc_health.class));
                }
            });

        }

//        private void configureCardView5() {
//            CardView cardView = (CardView) findViewById(R.id.cardView5);
//            cardView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    startActivity(new Intent(menu_principal.this, JuicerControl.class));
//                }
//            });
//
//        }

        private void configureCardView4() {
            CardView cardView = (CardView) findViewById(R.id.cardView4);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(menu_principal.this, Smoothies.class));
                }
            });

        }

        private void configureCardView3() {
            CardView cardView = (CardView) findViewById(R.id.cardView3);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(menu_principal.this, CoolFruitJuices.class));
                }
            });

        }

        private void configureCardView2() {
            CardView cardView = (CardView) findViewById(R.id.cardView2);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(menu_principal.this, NutritiousJuices.class));
                }
            });

        }

        private void configureCardView() {
            CardView cardView = (CardView) findViewById(R.id.cardView);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(menu_principal.this, BasicJuices.class));
                }
            });


        }

}
