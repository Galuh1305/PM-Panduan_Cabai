package com.uti.pm_panduan_cabai;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class c_rawitActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_rawit);

        // Inisialisasi Button
        Button buttonBack = findViewById(R.id.back_kriting);

        // Set onClickListener untuk Button
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kembali ke Activity sebelumnya
                onBackPressed();
            }
        });
    }

    // Mengoverride fungsi onBackPressed jika Anda ingin menambahkan logika khusus saat tombol "Back" ditekan
    @Override
    public void onBackPressed() {
        // Tambahkan logika khusus di sini jika diperlukan sebelum kembali
        super.onBackPressed();  // Ini akan memanggil aksi default, yaitu kembali ke Activity sebelumnya
    }
}
