package com.deybian.as3app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Main5Activity extends AppCompatActivity {

    private RecyclerView recyclerViewmodelmaterial;
    private RecyclerViewAdaptador2 adaptadormodelmaterial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        recyclerViewmodelmaterial=(RecyclerView)findViewById(R.id.listamaterial);
        recyclerViewmodelmaterial.setLayoutManager(new LinearLayoutManager(this));

        adaptadormodelmaterial=new RecyclerViewAdaptador2(obtenermaterial());
        recyclerViewmodelmaterial.setAdapter(adaptadormodelmaterial);

    }


    public List<modelomaterial> obtenermaterial(){
        List<modelomaterial> mmaterial=new ArrayList<>();
        mmaterial.add(new modelomaterial("Pino","Madera más económica y más trabajada al día de hoy. Madera blanda, de tonos claros y que adquiere un característico color miel cuando se sella.                Precio: S/. 4.99 m2",R.drawable.material1));
        mmaterial.add(new modelomaterial("Maple","MAdera de color blanco cremoso con un ligero matiz café rojizo que ofrece una textura fina y cerrada con muestras de dibujos rizados, en forma de violín.                     Precio: S/. 5.99 m2",R.drawable.material2));
        mmaterial.add(new modelomaterial("Abedul","Madera  amarillenta de tonos claros y de grano fino. Es una madera elástica, especial para los revestimientos de interior, como frisos, molduras o rodapiés.                Precio: S/. 6.99 m2",R.drawable.material3));
        mmaterial.add(new modelomaterial("Roble Claro","Madera muy resistente y duradera. Su grano es abierto y basto. Con el tiempo su tonalidad pasa de un marrón claro o medio a un gris aterciopelado.                Precio: S/. 8.99 m2",R.drawable.material4));
        mmaterial.add(new modelomaterial("Caoba","Madera tropical, oscura, de color rojizo intenso y de grano fino, que cuenta con resistencia natural a la carcoma.                Precio: S/. 7.99 m2",R.drawable.material5));
        mmaterial.add(new modelomaterial("Cedro","Madera blanda-dura aromática, duradera y densa y fragil. Tipo de madera muy interesante ya que su aroma repele a los insectos, entre ellos las polillas.                Precio: S/. 9.99 m2",R.drawable.material6));



        return mmaterial;

    }

    public void siguiente5(View view){
        Intent cambio = new Intent(this, Main6Activity.class);
        startActivity(cambio);
    }
}
