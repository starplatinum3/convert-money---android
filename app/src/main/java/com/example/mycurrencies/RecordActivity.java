package com.example.mycurrencies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
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
   ImageView ivDeleteText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        new
        setContentView(R.layout.activity_record);
         recordAdapter = new RecordAdapter(this, R.layout.record_list, datas);
        recordAdapter.notifyDataSetChanged();
        listView=findViewById(R.id.listview);
        ivDeleteText=findViewById(R.id.ivDeleteText);
        listView.setAdapter(recordAdapter);
        listView.setTextFilterEnabled(true);
        set_edtSearch_TextChanged();

    }

    private  void set_edtSearch_TextChanged(){
//        edtSearch=findViewById(R.id.edtSearch);
        edtSearch=findViewById(R.id.etSearch);
        edtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if(s.length()==0){
//                    ivDe
                    ivDeleteText.setVisibility(View.GONE);
                }else{
                    ivDeleteText.setVisibility(View.VISIBLE);
                }

                handler.post(eChanged);
            }
        });

    }

    void getmDataSub(){

    }

    Runnable eChanged=new Runnable() {
        @Override
        public void run() {
            String s = edtSearch.getText().toString();
            datas.clear();

            recordAdapter.notifyDataSetChanged();
        }
    };

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