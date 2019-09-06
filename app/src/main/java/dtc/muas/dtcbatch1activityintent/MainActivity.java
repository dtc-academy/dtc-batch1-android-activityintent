package dtc.muas.dtcbatch1activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPindahActivity = findViewById(R.id.btnPindahActivity);
        Button btnPindahActivityDenganData = findViewById(R.id.btnPindahActivityDenganData);
        Button btnTelepon = findViewById(R.id.btnTelepon);
        Button btnBukaBrowser = findViewById(R.id.btnBukaBrowser);

        btnPindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        btnPindahActivityDenganData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("NAMA", "Muasdev");
                intent.putExtra("ASAL", "Parepare");
                intent.putExtra("PEKERJAAN", "Android Dev");
                startActivity(intent);
            }
        });
        btnTelepon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = "082347218036";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(dialPhoneIntent);
            }
        });
        btnBukaBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alamatWebsite = "http://www.google.com";
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(alamatWebsite));
                if (browserIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(browserIntent);
                }
            }
        });
    }
}
