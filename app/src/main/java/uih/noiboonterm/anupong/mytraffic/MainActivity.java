package uih.noiboonterm.anupong.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //ประกาศตัวแปร
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Button Controller
        buttonController();

        //Listview Controller
        listviewController();


    }   //  Main Method

    private void listviewController() {

        //#1
        int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02, R.drawable.traffic_03,
                R.drawable.traffic_04, R.drawable.traffic_05, R.drawable.traffic_06,
                R.drawable.traffic_07, R.drawable.traffic_08, R.drawable.traffic_09,
                R.drawable.traffic_10, R.drawable.traffic_11, R.drawable.traffic_12,
                R.drawable.traffic_13, R.drawable.traffic_14, R.drawable.traffic_15,
                R.drawable.traffic_16, R.drawable.traffic_17, R.drawable.traffic_18,
                R.drawable.traffic_19, R.drawable.traffic_20,};

        //#2
        String[] titleStr = new String[20];
        titleStr[0] = "หัวข้อที่ 1";
        titleStr[1] = "หัวข้อที่ 2";
        titleStr[2] = "หัวข้อที่ 3";
        titleStr[3] = "หัวข้อที่ 4";
        titleStr[4] = "หัวข้อที่ 5";
        titleStr[5] = "หัวข้อที่ 6";
        titleStr[6] = "หัวข้อที่ 7";
        titleStr[7] = "หัวข้อที่ 8";
        titleStr[8] = "หัวข้อที่ 9";
        titleStr[9] = "หัวข้อที่ 10";
        titleStr[10] = "หัวข้อที่ 11";
        titleStr[11] = "หัวข้อที่ 12";
        titleStr[12] = "หัวข้อที่ 13";
        titleStr[13] = "หัวข้อที่ 14";
        titleStr[14] = "หัวข้อที่ 15";
        titleStr[15] = "หัวข้อที่ 16";
        titleStr[16] = "หัวข้อที่ 17";
        titleStr[17] = "หัวข้อที่ 18";
        titleStr[18] = "หัวข้อที่ 19";
        titleStr[19] = "หัวข้อที่ 20";

        //#3
        String[] strDetail = getResources().getStringArray(R.array.detail_short);

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, titleStr, strDetail, intIcon);
        trafficListView.setAdapter(objMyAdapter);

    }// listViewController

    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sheep);
                buttonMediaPlayer.start();

                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/XqLuzCtoel4"));
                startActivity(objIntent);
            } // event
        });
    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);
    }

}   //  Main Class
