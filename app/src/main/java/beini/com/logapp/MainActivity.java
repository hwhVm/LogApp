package beini.com.logapp;

import android.app.Activity;
import android.os.Bundle;

import beini.com.logger.log.Logger;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.init("com.beini");
    }
}
