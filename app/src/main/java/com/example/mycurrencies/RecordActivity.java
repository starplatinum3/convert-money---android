package com.example.mycurrencies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class RecordActivity extends AppCompatActivity {

    ListView listView;
    List<BeanRecord>datas=new ArrayList<>();
    EditText edtSearch;
    RecordAdapter recordAdapter;
    Handler handler=   new Handler();
    List<String> times=new ArrayList<>();
    List<String> forCodes=new ArrayList<>();
    List<String> forAmount=new ArrayList<>();
    List<String> homCode=new ArrayList<>();
    List<String> homAmount=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        new
        setContentView(R.layout.activity_record);
         recordAdapter = new RecordAdapter(this, R.layout.record_list, datas);
        recordAdapter.notifyDataSetChanged();
        listView=findViewById(R.id.listview);
        listView.setAdapter(recordAdapter);
        listView.setTextFilterEnabled(true);
    }

    private  void set_edtSearch_TextChanged(){
//        edtSearch=findViewById(R.id.edtSearch);
        edtSearch=findViewById(R.id.etSearch);

    }

    void initDatas(){
//        datas=
        for(BeanRecord d:datas){
            if(d!=null){
                times.add(d.getTime());
                forCodes.add(d.getForCode());
                forAmount.add(d.getForAmount());
                homCode.add(d.getHomCode());
                homAmount.add(d.getHomAmount());
            }
        }
    }
}