package com.example.tp21;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.tp21.extra.MESSAGE";
    private static final String TAG =
            MainActivity.class.getSimpleName();

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = (TextView)findViewById(R.id.show_count);

        Log.d(TAG,"Q1 : La deuxiéme activité est ajoutée en tant que classe Java, le fichier de présentation (layout) XML est créé et le fichier AndroidManifest.xml est modifié pour déclarer une deuxiéme activité.");
        Log.d(TAG,"Q2 : Le bouton Up (Haut) de la barre d'applications n'apparant plus dans la deuxiéme activité pour renvoyer l'utilisateur à l'activité parent.");
        Log.d(TAG,"Q3: new Intent(Context context, Class<?> class)");
        Log.d(TAG,"Q4:Comme extra d'intention (Intent)");
        Log.d(TAG,"Q5: Tout ce qui précéde.");



    }

    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }


    public void SendMessage(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = mShowCount.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}