package com.app.yanhao.seek.activity;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.app.yanhao.seek.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button sureButton;
    private EditText accountEdit,passEdit;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sureButton=(Button)findViewById(R.id.enter_button_sure);
        accountEdit = (EditText)findViewById(R.id.enter_editTextAccount);
        passEdit=(EditText)findViewById(R.id.enter_editTextPass);
        imageView=(ImageView)findViewById(R.id.avater);

        sureButton.setOnClickListener(this);
        imageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.enter_button_sure:
                //Todo:处理用户输入的账户和密码，与服务器上的信息进行对应
                Intent intent=new Intent(this,SeekActivity.class);
                startActivity(intent);
                break;
            case R.id.avater:
                //Todo: 完成点击图片，在本地选择图片作为自己的头像
                break;
        }
    }
    
}
