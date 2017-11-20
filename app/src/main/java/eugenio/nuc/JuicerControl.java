package eugenio.nuc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.RadioGroup;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.util.Date;



public class JuicerControl extends AppCompatActivity {


    String state;




    public void onRadioButtonClickedControl(View view) {
        //Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        //Check which radio button was clicked
        switch (view.getId()) {

            case R.id.radioForward:
                if (checked)

                    state = "Forward";
                    TextView tv = (TextView) findViewById(R.id.current_state);
                    tv.setText("The Juicer Motor is operating in FORWARD mode");

                break;

            case R.id.radioReverse:
                if (checked)
                    state = "Reverse";
                    TextView tv2 = (TextView) findViewById(R.id.current_state);
                    tv2.setText("The Juicer Motor is operating in REVERSE mode.");

                    break;

            case R.id.radioOff:
                if (checked)
                    state = "OFF";
                    TextView tv3 = (TextView) findViewById(R.id.current_state);
                    tv3.setText("The Juicer Motor is currently OFF");

                    break;
        }
    }










    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juicer_control);


    }


}
