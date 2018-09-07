package com.androidtest.yeling.logintow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Login extends AppCompatActivity {
    private ListView listView;
    private ImageView imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        listView = findViewById(R.id.ListView);
        imageView3 = findViewById(R.id.imageView3);

        /*
        *SimpleAdapter(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to)
        */

        listView.setAdapter(new SimpleAdapter(this, putData(), R.layout.list_item, new String[]{"name", "pic"}, new int[]{R.id.textView, R.id.imageView2}));

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private List<Map<String, Object>> putData() {
        List<Map<String, Object>> list = new ArrayList<>();

        Map<String, Object> map1 = new HashMap<>();
        map1.put("name", "城市广场停车场");
        map1.put("pic", "");

        Map<String, Object> map2 = new HashMap<>();
        map2.put("name", "百货大厦停车场");
        map2.put("pic", "");

        Map<String, Object> map3 = new HashMap<>();
        map3.put("name", "百城柯基停车场");
        map3.put("pic", R.mipmap.close);

        Map<String, Object> map4 = new HashMap<>();
        map4.put("name", "新宇大厦停车场");
        map4.put("pic", R.mipmap.close);

        Map<String, Object> map5 = new HashMap<>();
        map5.put("name", "无锡工艺停车场");
        map5.put("pic", "");

        Map<String, Object> map6 = new HashMap<>();
        map6.put("name", "梁非凡停车场");
        map6.put("pic", R.mipmap.close);

        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        list.add(map5);
        list.add(map6);

        return list;
    }
}
