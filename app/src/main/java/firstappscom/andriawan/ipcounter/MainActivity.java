package firstappscom.andriawan.ipcounter;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.Context;

public class MainActivity extends ActionBarActivity implements OnItemSelectedListener{

    Button GetResult;

    AlertDialog alert;

    TextView resultfinal,
    //tekpen
            ts1,ts2,ts3,ts4,
            tr1,tr2,tr3,tr4,tr5,tr6,tr7,tr8,
    //keskretarisan
            ks1,ks2,ks3,ks4,
            kr1,kr2,kr3,kr4,kr5,kr6,kr7,kr8,

     //Speaking
            sp1,sp2,sp3,sp4,
            sr1,sr2,sr3,sr4,sr5,sr6,sr7,sr8,

    //bpw
            bp1,bp2,bp3,bp4,
            bsr1,bsr2,bsr3,bsr4,bsr5,bsr6,bsr7,bsr8,

    //tnt
            tn1,tn2,tn3,tn4,
            tsr1,tsr2,tsr3,tsr4,tsr5,tsr6,tsr7,tsr8,

    //writing
            wp1,wp2,wp3,wp4,
            wsr1,wsr2,wsr3,wsr4,wsr5,wsr6,wsr7,wsr8,

    //reading
            rp1,rp2,rp3,rp4,
            rsr1,rsr2,rsr3,rsr4,rsr5,rsr6,rsr7,rsr8,

    //efs
            ep1,ep2,ep3,ep4,
            esr1,esr2,esr3,esr4,esr5,esr6,esr7,esr8,

    //structure
            stp1,stp2,stp3,stp4,
            sur1,sur2,sur3,sur4,sur5,sur6,sur7,sur8,

    //listening
            lsp1,lsp2,lsp3,lsp4,
            lsr1,lsr2,lsr3,lsr4,lsr5,lsr6,lsr7,lsr8,

    //translation
            trp1,trp2,trp3,trp4,
            trr1,trr2,trr3,trr4,trr5,trr6,trr7,trr8
    ;

    private Spinner tekpenSKS;
    private Spinner tekpenScore;
    private Spinner KesekretarisanSKS;
    private Spinner KesekretarisanScore;
    private Spinner SpeakingSKS;
    private Spinner SpeakingScore;
    private Spinner bpwSKS;
    private Spinner bpwScore;
    private Spinner tntSKS;
    private Spinner tntScore;
    private Spinner writingSKS;
    private Spinner writingScore;
    private Spinner readingSKS;
    private Spinner readingScore;
    private Spinner efsSKS;
    private Spinner efsScore;
    private Spinner structureSKS;
    private Spinner structureScore;
    private Spinner listeningSKS;
    private Spinner listeningScore;
    private Spinner translationSKS;
    private Spinner translationScore;


    private String []SksList = {"1","2","3","4"};
    private String [] ScoreList = {"4","3.5","3","2.5","2","1.5","1","0"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetResult = (Button) findViewById(R.id.result);
        GetResult.setOnClickListener(count_IP);

        resultfinal = (TextView) findViewById(R.id.resultfinal);

        tekpenSKS = (Spinner) findViewById(R.id.spinner_tekpen_sks);
        ArrayAdapter adapterTekpenSks = new ArrayAdapter(this,android.R.layout.simple_spinner_item,SksList);
        adapterTekpenSks.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tekpenSKS.setAdapter(adapterTekpenSks);

        tekpenScore = (Spinner) findViewById(R.id.spinner_tekpen_score);
        ArrayAdapter adapterTekpenScore = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ScoreList);
        adapterTekpenScore.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tekpenScore.setAdapter(adapterTekpenScore);

        KesekretarisanSKS = (Spinner) findViewById(R.id.spinner_kesekretarisan_sks);
        ArrayAdapter adapterKesekretarisanSks = new ArrayAdapter(this,android.R.layout.simple_spinner_item,SksList);
        adapterKesekretarisanSks.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        KesekretarisanSKS.setAdapter(adapterKesekretarisanSks);

        KesekretarisanScore = (Spinner) findViewById(R.id.spinner_kesekretarisan_score);
        ArrayAdapter adapterKesekretarisanScore = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ScoreList);
        adapterKesekretarisanScore.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        KesekretarisanScore.setAdapter(adapterKesekretarisanScore);

        SpeakingSKS = (Spinner) findViewById(R.id.spinner_speaking_sks);
        ArrayAdapter adapterSpeakingSks = new ArrayAdapter(this,android.R.layout.simple_spinner_item,SksList);
        adapterKesekretarisanSks.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpeakingSKS.setAdapter(adapterSpeakingSks);

        SpeakingScore = (Spinner) findViewById(R.id.spinner_speaking_score);
        ArrayAdapter adapterSpeakingScore = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ScoreList);
        adapterKesekretarisanScore.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpeakingScore.setAdapter(adapterSpeakingScore );

        bpwSKS = (Spinner) findViewById(R.id.spinner_bpw_sks);
        ArrayAdapter adapterBpwSks = new ArrayAdapter(this,android.R.layout.simple_spinner_item,SksList);
        adapterKesekretarisanSks.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        bpwSKS.setAdapter(adapterBpwSks);

        bpwScore = (Spinner) findViewById(R.id.spinner_bpw_score);
        ArrayAdapter adapterBpwScore = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ScoreList);
        adapterKesekretarisanScore.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        bpwScore.setAdapter(adapterBpwScore );

        tntSKS = (Spinner) findViewById(R.id.spinner_tnt_sks);
        ArrayAdapter adapterTntSks = new ArrayAdapter(this,android.R.layout.simple_spinner_item,SksList);
        adapterKesekretarisanSks.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tntSKS.setAdapter(adapterTntSks);

        tntScore = (Spinner) findViewById(R.id.spinner_tnt_score);
        ArrayAdapter adapterTntScore = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ScoreList);
        adapterKesekretarisanScore.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tntScore.setAdapter(adapterTntScore);

        writingSKS = (Spinner) findViewById(R.id.spinner_writing_sks);
        ArrayAdapter adapterWritingSks = new ArrayAdapter(this,android.R.layout.simple_spinner_item,SksList);
        adapterKesekretarisanSks.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        writingSKS.setAdapter(adapterWritingSks);

        writingScore = (Spinner) findViewById(R.id.spinner_writing_score);
        ArrayAdapter adapterWritingScore = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ScoreList);
        adapterKesekretarisanScore.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        writingScore.setAdapter(adapterWritingScore);

        readingSKS = (Spinner) findViewById(R.id.spinner_reading_sks);
        ArrayAdapter adapterReadingSks = new ArrayAdapter(this,android.R.layout.simple_spinner_item,SksList);
        adapterKesekretarisanSks.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        readingSKS.setAdapter(adapterReadingSks);

        readingScore = (Spinner) findViewById(R.id.spinner_reading_score);
        ArrayAdapter adapterReadingwScore = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ScoreList);
        adapterKesekretarisanScore.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        readingScore.setAdapter(adapterReadingwScore);

        efsSKS = (Spinner) findViewById(R.id.spinner_efs_sks);
        ArrayAdapter adapterefsSks = new ArrayAdapter(this,android.R.layout.simple_spinner_item,SksList);
        adapterKesekretarisanSks.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        efsSKS.setAdapter(adapterefsSks);

        efsScore = (Spinner) findViewById(R.id.spinner_efs_score);
        ArrayAdapter adapterEfsScore = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ScoreList);
        adapterKesekretarisanScore.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        efsScore.setAdapter(adapterEfsScore);

        structureSKS = (Spinner) findViewById(R.id.spinner_structure_sks);
        ArrayAdapter adapterStrucSks = new ArrayAdapter(this,android.R.layout.simple_spinner_item,SksList);
        adapterKesekretarisanSks.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        structureSKS.setAdapter(adapterStrucSks);

        structureScore = (Spinner) findViewById(R.id.spinner_structure_score);
        ArrayAdapter adapterStrucScore = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ScoreList);
        adapterKesekretarisanScore.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        structureScore.setAdapter(adapterStrucScore);

        listeningSKS = (Spinner) findViewById(R.id.spinner_listening_sks);
        ArrayAdapter adapterlisSks = new ArrayAdapter(this,android.R.layout.simple_spinner_item,SksList);
        adapterKesekretarisanSks.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listeningSKS.setAdapter(adapterlisSks);

        listeningScore = (Spinner) findViewById(R.id.spinner_listening_score);
        ArrayAdapter adapterlisScore = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ScoreList);
        adapterKesekretarisanScore.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listeningScore.setAdapter(adapterlisScore);

        translationSKS = (Spinner) findViewById(R.id.spinner_translation_sks);
        ArrayAdapter adaptertraSks = new ArrayAdapter(this,android.R.layout.simple_spinner_item,SksList);
        adapterKesekretarisanSks.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        translationSKS.setAdapter(adaptertraSks);

        translationScore = (Spinner) findViewById(R.id.spinner_translation_score);
        ArrayAdapter adaptertraScore = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ScoreList);
        adapterKesekretarisanScore.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        translationScore.setAdapter(adaptertraScore);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (tekpenSKS.getSelectedItemPosition()) {
            case 0:
                ts1.setText("1");
                break;
            case 1:
                ts2.setText("2");
                break;
            case 2:
                ts3.setText("3");
                break;
            case 3:
                ts4.setText("4");
                break;
        }
            switch (tekpenScore.getSelectedItemPosition()){
                case 0:
                    tr1.setText("4");
                    break;
                case 1:
                    tr2.setText("3.5");
                    break;
                case 2:
                    tr3.setText("3");
                    break;
                case 3:
                    tr4.setText("2.5");
                    break;
                case 4:
                    tr5.setText("2");
                    break;
                case 5:
                    tr6.setText("1.5");
                    break;
                case 6:
                    tr7.setText("1");
                    break;
                case 7:
                    tr8.setText("0");
                    break;
            }

            switch (KesekretarisanSKS.getSelectedItemPosition()) {
                case 0:
                    ks1.setText("1");
                    break;
                case 1:
                    ks2.setText("2");
                    break;
                case 2:
                    ks3.setText("3");
                    break;
                case 3:
                    ks4.setText("4");
                    break;
            }

            switch (KesekretarisanScore.getSelectedItemPosition()){
                case 0:
                    kr1.setText("4");
                    break;
                case 1:
                    kr2.setText("3.5");
                    break;
                case 2:
                    kr3.setText("3");
                    break;
                case 3:
                    kr4.setText("2.5");
                    break;
                case 4:
                    kr5.setText("2");
                    break;
                case 5:
                    kr6.setText("1.5");
                    break;
                case 6:
                    kr7.setText("1");
                    break;
                case 7:
                    kr8.setText("0");
                    break;
            }

        switch (SpeakingSKS.getSelectedItemPosition()) {
            case 0:
                ks1.setText("1");
                break;
            case 1:
                ks2.setText("2");
                break;
            case 2:
                ks3.setText("3");
                break;
            case 3:
                ks4.setText("4");
                break;
        }

        switch (SpeakingScore.getSelectedItemPosition()){
            case 0:
                kr1.setText("4");
                break;
            case 1:
                kr2.setText("3.5");
                break;
            case 2:
                kr3.setText("3");
                break;
            case 3:
                kr4.setText("2.5");
                break;
            case 4:
                kr5.setText("2");
                break;
            case 5:
                kr6.setText("1.5");
                break;
            case 6:
                kr7.setText("1");
                break;
            case 7:
                kr8.setText("0");
                break;
        }

        switch (bpwSKS.getSelectedItemPosition()) {
            case 0:
                ks1.setText("1");
                break;
            case 1:
                ks2.setText("2");
                break;
            case 2:
                ks3.setText("3");
                break;
            case 3:
                ks4.setText("4");
                break;
        }

        switch (bpwScore.getSelectedItemPosition()){
            case 0:
                kr1.setText("4");
                break;
            case 1:
                kr2.setText("3.5");
                break;
            case 2:
                kr3.setText("3");
                break;
            case 3:
                kr4.setText("2.5");
                break;
            case 4:
                kr5.setText("2");
                break;
            case 5:
                kr6.setText("1.5");
                break;
            case 6:
                kr7.setText("1");
                break;
            case 7:
                kr8.setText("0");
                break;
        }

        switch (tntSKS.getSelectedItemPosition()) {
            case 0:
                ks1.setText("1");
                break;
            case 1:
                ks2.setText("2");
                break;
            case 2:
                ks3.setText("3");
                break;
            case 3:
                ks4.setText("4");
                break;
        }

        switch (tntScore.getSelectedItemPosition()){
            case 0:
                kr1.setText("4");
                break;
            case 1:
                kr2.setText("3.5");
                break;
            case 2:
                kr3.setText("3");
                break;
            case 3:
                kr4.setText("2.5");
                break;
            case 4:
                kr5.setText("2");
                break;
            case 5:
                kr6.setText("1.5");
                break;
            case 6:
                kr7.setText("1");
                break;
            case 7:
                kr8.setText("0");
                break;
        }

        switch (writingSKS.getSelectedItemPosition()) {
            case 0:
                ks1.setText("1");
                break;
            case 1:
                ks2.setText("2");
                break;
            case 2:
                ks3.setText("3");
                break;
            case 3:
                ks4.setText("4");
                break;
        }

        switch (writingScore.getSelectedItemPosition()){
            case 0:
                kr1.setText("4");
                break;
            case 1:
                kr2.setText("3.5");
                break;
            case 2:
                kr3.setText("3");
                break;
            case 3:
                kr4.setText("2.5");
                break;
            case 4:
                kr5.setText("2");
                break;
            case 5:
                kr6.setText("1.5");
                break;
            case 6:
                kr7.setText("1");
                break;
            case 7:
                kr8.setText("0");
                break;
        }

        switch (readingSKS.getSelectedItemPosition()) {
            case 0:
                ks1.setText("1");
                break;
            case 1:
                ks2.setText("2");
                break;
            case 2:
                ks3.setText("3");
                break;
            case 3:
                ks4.setText("4");
                break;
        }

        switch (readingScore.getSelectedItemPosition()){
            case 0:
                kr1.setText("4");
                break;
            case 1:
                kr2.setText("3.5");
                break;
            case 2:
                kr3.setText("3");
                break;
            case 3:
                kr4.setText("2.5");
                break;
            case 4:
                kr5.setText("2");
                break;
            case 5:
                kr6.setText("1.5");
                break;
            case 6:
                kr7.setText("1");
                break;
            case 7:
                kr8.setText("0");
                break;
        }

        switch (efsSKS.getSelectedItemPosition()) {
            case 0:
                ks1.setText("1");
                break;
            case 1:
                ks2.setText("2");
                break;
            case 2:
                ks3.setText("3");
                break;
            case 3:
                ks4.setText("4");
                break;
        }

        switch (efsScore.getSelectedItemPosition()){
            case 0:
                kr1.setText("4");
                break;
            case 1:
                kr2.setText("3.5");
                break;
            case 2:
                kr3.setText("3");
                break;
            case 3:
                kr4.setText("2.5");
                break;
            case 4:
                kr5.setText("2");
                break;
            case 5:
                kr6.setText("1.5");
                break;
            case 6:
                kr7.setText("1");
                break;
            case 7:
                kr8.setText("0");
                break;
        }

        switch (structureSKS.getSelectedItemPosition()) {
            case 0:
                ks1.setText("1");
                break;
            case 1:
                ks2.setText("2");
                break;
            case 2:
                ks3.setText("3");
                break;
            case 3:
                ks4.setText("4");
                break;
        }

        switch (structureScore.getSelectedItemPosition()){
            case 0:
                kr1.setText("4");
                break;
            case 1:
                kr2.setText("3.5");
                break;
            case 2:
                kr3.setText("3");
                break;
            case 3:
                kr4.setText("2.5");
                break;
            case 4:
                kr5.setText("2");
                break;
            case 5:
                kr6.setText("1.5");
                break;
            case 6:
                kr7.setText("1");
                break;
            case 7:
                kr8.setText("0");
                break;
        }

        switch (listeningSKS.getSelectedItemPosition()) {
            case 0:
                ks1.setText("1");
                break;
            case 1:
                ks2.setText("2");
                break;
            case 2:
                ks3.setText("3");
                break;
            case 3:
                ks4.setText("4");
                break;
        }

        switch (listeningScore.getSelectedItemPosition()){
            case 0:
                kr1.setText("4");
                break;
            case 1:
                kr2.setText("3.5");
                break;
            case 2:
                kr3.setText("3");
                break;
            case 3:
                kr4.setText("2.5");
                break;
            case 4:
                kr5.setText("2");
                break;
            case 5:
                kr6.setText("1.5");
                break;
            case 6:
                kr7.setText("1");
                break;
            case 7:
                kr8.setText("0");
                break;
        }

        switch (translationSKS.getSelectedItemPosition()) {
            case 0:
                ks1.setText("1");
                break;
            case 1:
                ks2.setText("2");
                break;
            case 2:
                ks3.setText("3");
                break;
            case 3:
                ks4.setText("4");
                break;
        }

        switch (translationScore.getSelectedItemPosition()){
            case 0:
                kr1.setText("4");
                break;
            case 1:
                kr2.setText("3.5");
                break;
            case 2:
                kr3.setText("3");
                break;
            case 3:
                kr4.setText("2.5");
                break;
            case 4:
                kr5.setText("2");
                break;
            case 5:
                kr6.setText("1.5");
                break;
            case 6:
                kr7.setText("1");
                break;
            case 7:
                kr8.setText("0");
                break;
        }

        }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    private View.OnClickListener count_IP = new View.OnClickListener() {
        @Override
        public void onClick(View count_IP) {

            double n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16,n17,n18,n19,n20,n21,n22;
            double firstValue;
            double finalValue;

            n1=Double.parseDouble(tekpenScore.getSelectedItem().toString());
            n2=Double.parseDouble(tekpenSKS.getSelectedItem().toString());
            n3=Double.parseDouble(KesekretarisanScore.getSelectedItem().toString());
            n4=Double.parseDouble(KesekretarisanSKS.getSelectedItem().toString());
            n5=Double.parseDouble(SpeakingScore.getSelectedItem().toString());
            n6=Double.parseDouble(SpeakingSKS.getSelectedItem().toString());
            n7=Double.parseDouble(bpwScore.getSelectedItem().toString());
            n8=Double.parseDouble(bpwSKS.getSelectedItem().toString());
            n9=Double.parseDouble(tntScore.getSelectedItem().toString());
            n10=Double.parseDouble(tntSKS.getSelectedItem().toString());
            n11=Double.parseDouble(writingScore.getSelectedItem().toString());
            n12=Double.parseDouble(writingSKS.getSelectedItem().toString());
            n13=Double.parseDouble(readingScore.getSelectedItem().toString());
            n14=Double.parseDouble(readingSKS.getSelectedItem().toString());
            n15=Double.parseDouble(efsScore.getSelectedItem().toString());
            n16=Double.parseDouble(efsSKS.getSelectedItem().toString());
            n17=Double.parseDouble(structureScore.getSelectedItem().toString());
            n18=Double.parseDouble(structureSKS.getSelectedItem().toString());
            n19=Double.parseDouble(listeningScore.getSelectedItem().toString());
            n20=Double.parseDouble(listeningSKS.getSelectedItem().toString());
            n21=Double.parseDouble(translationScore.getSelectedItem().toString());
            n22=Double.parseDouble(translationSKS.getSelectedItem().toString());


            firstValue = (n1*n2) + (n3*n4) + (n5*n6)+ (n7*n8)+ (n9*n10)+ (n11*n12)+ (n13*n14)+ (n15*n16)+ (n17*n18)+ (n19*n20)+ (n21*n22);
            finalValue = firstValue / (n2+n4+n6+n8+n10+n12+n14+n16+n18+n20+n22);
            resultfinal.setText(Double.toString(finalValue));


            /*double finalValue;
            double skstekpen1, skstekpen2, skstekpen3, skstekpen4, skstekpen5;
            double scoretekpen1, scoretekpen2, scoretekpenscore3, tekpenscore4, tekpenscore5,
                    tekpenscore6, tekpenscore7, tekpenscoretekpen8, scoretekpen9;
            double sks_sekret1, sks_sekret2, sks_sekret3, sks_sekret4, sks_sekret5;
            double score_sekret1, score_sekret2, score_sekret3, score_sekret4, score_sekret5, score_sekret6,
                    score_sekret7, score_sekret8, score_sekret9;

            skstekpen1 = Double.parseDouble(ts1.getText().toString());
            skstekpen2 = Double.parseDouble(ts2.getText().toString());
            skstekpen3 = Double.parseDouble(ts3.getText().toString());
            skstekpen4 = Double.parseDouble(ts4.getText().toString());
            skstekpen5 = Double.parseDouble(ts5.getText().toString());*/


        }
    };
}
