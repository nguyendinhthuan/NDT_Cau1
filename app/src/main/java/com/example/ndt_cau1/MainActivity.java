package com.example.ndt_cau1;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editText_TaiKhoan1, editText_TaiKhoan2;
    private TextView textView_KetQua;
    private CheckBox checkBox_Luu;
    private Button button_DangNhap, button_Thoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_TaiKhoan1 = (EditText) findViewById(R.id.editText_TaiKhoan1);
        editText_TaiKhoan2 = (EditText) findViewById(R.id.editText_TaiKhoan2);
        checkBox_Luu = (CheckBox) findViewById(R.id.checkBox_Luu);
        button_DangNhap = (Button) findViewById(R.id.button_DangNhap);
        textView_KetQua = (TextView) findViewById(R.id.textView_KetQua);
        //button_Thoat = (Button) findViewById(R.id.button_Thoat);

        action();

    }

    private void action() {
        button_DangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox_Luu.isChecked()) {
                    textView_KetQua.setText("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu !");
                } else {
                    textView_KetQua.setText("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu !");
                }
            }
        });
    }
}
