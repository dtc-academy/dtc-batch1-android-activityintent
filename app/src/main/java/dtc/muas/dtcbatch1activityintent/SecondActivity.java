package dtc.muas.dtcbatch1activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvNama = findViewById(R.id.tvNama);
        TextView tvAsal = findViewById(R.id.tvAsal);
        TextView tvPekerjaan = findViewById(R.id.tvPekerjaan);

        String nama = getIntent().getStringExtra("NAMA");
        String asal = getIntent().getStringExtra("ASAL");
        String pekerjaan = getIntent().getStringExtra("PEKERJAAN");

        tvNama.setText(nama);
        tvAsal.setText(asal);
        tvPekerjaan.setText(pekerjaan);
    }
}
