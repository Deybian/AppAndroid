package com.deybian.as3app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity {
    private final String JSON_URL = "https://cvicefcc.000webhostapp.com/listar_puerta" ;
    private JsonArrayRequest request ;
    private RequestQueue requestQueue ;
    private List<modelopuerta> lstpuerta ;
    private RecyclerView recyclerView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstpuerta = new ArrayList<>() ;
        recyclerView = findViewById(R.id.recyclerpuertas);
        jsonrequest();



    }

    private void jsonrequest() {

        request = new JsonArrayRequest(JSON_URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                JSONObject jsonObject  = null ;

                for (int i = 0 ; i < response.length(); i++ ) {


                    try {
                        jsonObject = response.getJSONObject(i) ;
                        modelopuerta mpuertas = new modelopuerta() ;
                        mpuertas.setTitu(jsonObject.getString("name"));
                        mpuertas.setDes(jsonObject.getString("description"));
                        mpuertas.setImgpuerta(jsonObject.getInt("Rating"));

                        lstpuerta.add(mpuertas);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }


                }

                setuprecyclerview(lstpuerta);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });


        requestQueue = Volley.newRequestQueue(Main4Activity.this);
        requestQueue.add(request) ;


    }

    private void setuprecyclerview(List<modelopuerta> lstpuerta) {


        RecyclerViewAdaptador myadapter = new RecyclerViewAdaptador(this,lstpuerta) ;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myadapter);

    }




}
