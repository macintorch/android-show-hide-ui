package ainor.com.my.showhide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button showButton;
    Button hideButton;
    TextView textView;

    public void showText (View view) {
        textView.setVisibility(View.VISIBLE);
        Log.i("Show Button: ", "Pressed");
    }

    public void hideText (View view) {
        textView.setVisibility(View.INVISIBLE);

        Log.i("Hide Button: ", "Pressed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showButton = (Button) findViewById(R.id.showButton);
        hideButton = (Button) findViewById(R.id.hideButton);
        textView = (TextView) findViewById(R.id.textView);

    }
}
