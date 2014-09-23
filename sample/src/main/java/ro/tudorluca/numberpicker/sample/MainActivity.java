package ro.tudorluca.numberpicker.sample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;

import ro.tudorluca.numberpicker.NumberPicker2;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberPicker2 picker = (NumberPicker2) findViewById(R.id.picker);
        picker.setMinValue(0);
        picker.setMaxValue(10);
        picker.setDisplayedValues(getValues(11));
    }

    private CharSequence[] getValues(int count) {
        CharSequence[] values = new CharSequence[count];
        for (int i = 0; i < count; i++) {
            values[i] = Html.fromHtml("<sup>1</sup>/<sub>" + i + "</sub>");
        }

        return values;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
