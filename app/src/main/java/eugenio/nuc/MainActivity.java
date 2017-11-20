package eugenio.nuc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //    configureGetStartedButton();
    }

    //private void configureGetStartedButton() {
    //    Button GetStartedButton = (Button) findViewById(R.id.GetStartedButton);
    //    GetStartedButton.setOnClickListener(new View.OnClickListener() {
    //        @Override
    //        public void onClick(View v) {
    //            startActivity(new Intent(MainActivity.this, menu_principal.class));
    //        }
    //    });

    //}

    //Si no funciona, borrar desde aqui
    public void GetStartedButton (View view){
        Intent intent = new Intent(this, menu_principal.class); //Esta era la buena
        startActivity(intent);
    }
    //hasta aqui (y quitar los comentarios de arriba)
}
