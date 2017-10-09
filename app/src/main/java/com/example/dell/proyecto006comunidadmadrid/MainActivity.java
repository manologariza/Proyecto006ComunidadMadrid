package com.example.dell.proyecto006comunidadmadrid;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Propiedades de la clase
    private String[] localidades = { "Madrid", "Mostoles", "Alcalá de Henares", "Fuenlabrada", "Leganés", "Getafe", "Alcorcón",
            "Torrejón de Ardoz", "Parla", "Coslada", "Alcobendas", "San Sebastián de los Reyes", "Pozuelo de Alarcón", "Las Rozas",
            "Rivas-Vaciamadrid", "Valdemoro", "Majadahonda", "Collado Villaba", "Aranjuez", "Arganda del Rey"};
    private String[] habitantes = { "3165541", "205614", "195907", "194171", "187173", "176659", "167354", "126981", "124661", "113340", "94471", "86206", "84989", "84533",  "82715", "72988", "70755", "61597", "57932", "54256"};
    private String[] lemas = { "Madrid, el motor de España", "Móstoles, una ciudad de oportunidades",  "Alcalá de Henares, capital cultural de la región",
            "Fuenlabrada, de aldea agrícola a ciudad industrial y cultural", "De 'Legamar' a Leganés", "Getafe, una ciudad con vocación de liderazgo", "Alcorcón, del rojo a los neones",
            "Torrejón de Ardoz, la puerta de la industria", "Parla, del 'milagro' a la deuda", "Coslada, plataforma logística de la Comunidad", "Alcobendas, el motor empresarial del norte",
            "San Sebastián de los Reyes, entre encierros y nuevas tecnologías", "Pozuelo de Alarcón, una ciudad con valor añadido", "Las Rozas, verde y de nivel alto",
            "Rivas-Vaciamadrid, joven y ecológico", "Valdemoro, mucho más que una ciudad dormitorio", "Majadahonda busca su cénit", "Collado Villalba, la capital de la sierra",
            "Aranjuez, un paisaje patrimonio de la humanidad", "Arganda del Rey, un eje industrial en transformación"};
    private String[] enlaces = {"https://www.madridiario.es/noticia/230227", "https://www.madridiario.es/noticia/230300", "https://www.madridiario.es/noticia/230384",
            "https://www.madridiario.es/noticia/230282", "https://www.madridiario.es/noticia/230526", "https://www.madridiario.es/noticia/230543", "https://www.madridiario.es/noticia/230543",
            "https://www.madridiario.es/noticia/230571", "https://www.madridiario.es/noticia/230723", "https://www.madridiario.es/noticia/231049", "https://www.madridiario.es/noticia/230300",
            "https://www.madridiario.es/noticia/230864", "https://www.madridiario.es/noticia/231021", "https://www.madridiario.es/noticia/230906", "https://www.madridiario.es/noticia/230918",
            "https://www.madridiario.es/noticia/231264", "https://www.madridiario.es/noticia/231243", "https://www.madridiario.es/noticia/231339",
            "https://www.madridiario.es/noticia/231416", "https://www.madridiario.es/noticia/231230"};

    private String[] escudos = {"madrid", "mostoles", "alcala", "fuenlabrada", "leganes", "getafe", "alcorcon", "torrejon", "parla", "coslada", "alcobendas", "sansebastiandelosreyes",
            "pozuelo", "lasrozas", "rivas", "valdemoro", "majadahonda","villalba", "aranjuez", "arganda"};

    private TextView tv1;
    private ListView lv1;
    private ImageView imgv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciamos las controles
        tv1=(TextView)findViewById(R.id.tv1);
        lv1=(ListView)findViewById(R.id.lv1);
        imgv=(ImageView)findViewById(R.id.imgv);

        ArrayAdapter adaptador=new ArrayAdapter(this, android.R.layout.simple_list_item_1, localidades);
        lv1.setAdapter(adaptador);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView vistaAdaptador, View view, int  i, long k){
                tv1.setText("Población de " + lv1.getItemAtPosition(i) + " es " + habitantes[i]);
                switch (i){
                    case 0:
                        imgv.setImageResource(R.drawable.madrid);
                        break;
                    case 1:
                        imgv.setImageResource(R.drawable.mostoles);
                        break;
                    case 2:
                        imgv.setImageResource(R.drawable.alcala);
                        break;
                    case 3:
                        imgv.setImageResource(R.drawable.fuenlabrada);
                        break;
                    case 4:
                        imgv.setImageResource(R.drawable.leganes);
                        break;
                    case 5:
                        imgv.setImageResource(R.drawable.getafe);
                        break;
                    case 6:
                        imgv.setImageResource(R.drawable.alcorcon);
                        break;
                    case 7:
                        imgv.setImageResource(R.drawable.torrejon);
                        break;
                    case 8:
                        imgv.setImageResource(R.drawable.parla);
                        break;
                    case 9:
                        imgv.setImageResource(R.drawable.coslada);
                        break;
                    case 10:
                        imgv.setImageResource(R.drawable.alcobendas);
                        break;
                    case 11:
                        imgv.setImageResource(R.drawable.sansebastiandelosreyes);
                        break;
                    case 12:
                        imgv.setImageResource(R.drawable.pozuelo);
                        break;
                    case 13:
                        imgv.setImageResource(R.drawable.lasrozas);
                        break;
                    case 14:
                        imgv.setImageResource(R.drawable.rivas);
                        break;
                    case 15:
                        imgv.setImageResource(R.drawable.valdemoro);
                        break;
                    case 16:
                        imgv.setImageResource(R.drawable.majadahonda);
                        break;
                    case 17:
                        imgv.setImageResource(R.drawable.villalba);
                        break;
                    case 18:
                        imgv.setImageResource(R.drawable.aranjuez);
                        break;
                    case 19:
                        imgv.setImageResource(R.drawable.arganda);
                        break;
                }


            }


        });
    }
}
