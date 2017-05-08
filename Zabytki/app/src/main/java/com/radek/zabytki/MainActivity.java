package com.radek.zabytki;

import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MySQLite mySQLite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // przyklad dodania zabytku do bazy
        mySQLite = new MySQLite(this);
        mySQLite.dodaj(
                new Monument("nazwa zabytku", "opis zabytku", 53.43143213, 27.4246841, "https://www.google.pl/")
        );
        Monument monument = mySQLite.pobierz(1);
        momumentsInit();
        Log.d("DB", monument.getUrl());

    }

    private void momumentsInit() {
        mySQLite.dodaj(
                new Monument("Nowy Ratusz, ob. Pomorska Akademia Medyczna", "https://pl.wikipedia.org/wiki/Pomorski_Uniwersytet_Medyczny_w_Szczecinie", 53.42299, 14.554408, "")
        );

        mySQLite.dodaj(
                new Monument("Wieża ciśnień (kolejowa)", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Potulicka_wieza_cisnien.jpg", 53.415811, 14.543637, "")
        );

        mySQLite.dodaj(
                new Monument("Wiatrak holenderski", "https://pl.wikipedia.org/wiki/Plik:Szczecin_wiatrak_ul_Mieszka_I_zabytek.jpg", 53.41294, 14.517433, "")
        );

        mySQLite.dodaj(
                new Monument("Willa", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Krasickiego_6.jpg", 53.44922, 14.513648, "")
        );

        mySQLite.dodaj(
                new Monument("Kościół ewangelicki, ob.rzym.-kat. p.w. Najświętszego Zbawiciela", "https://pl.wikipedia.org/wiki/Parafia_Naj%C5%9Bwi%C4%99tszego_Zbawiciela_w_Szczecinie", 53.445202, 14.543303, "")
        );

        mySQLite.dodaj(
                new Monument("Wieża widokowa Quistropa", "https://pl.wikipedia.org/wiki/Wie%C5%BCa_Quistorpa", 53.46196, 14.52301, "")
        );

        mySQLite.dodaj(
                new Monument("Kamienica", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Czeslawa_9_kamienica.jpg", 53.439179, 14.556528, "")
        );

        mySQLite.dodaj(
                new Monument("Kamienica", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Slaska_38_zabytek.jpg", 53.431965, 14.54759, "")
        );

        mySQLite.dodaj(
                new Monument("Budynki prezydium policji, ob. Komenda Wojewódzka Policji", "https://pl.wikipedia.org/wiki/Plik:Szczecin_Komenda_Woj_Policji.jpg", 53.4291, 14.558712, "")
        );

        mySQLite.dodaj(
                new Monument("Willa", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Mickiewicza_2_willa.jpg", 53.4351143, 14.5373696, "")
        );

        mySQLite.dodaj(
                new Monument("Stajnia książęca, ob. Instytut Filologii Germańskiej", "https://pl.wikipedia.org/wiki/Stajnia_ksi%C4%85%C5%BC%C4%99ca_w_Szczecinie", 53.426411, 14.558933, "")
        );

        mySQLite.dodaj(
                new Monument("Młyn parowy (z silosem i spichrzem)", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Debogorska_31_olejarnia.jpg", 53.459608, 14.589156, "")
        );

        mySQLite.dodaj(
                new Monument("Kościół par. p.w. Wniebowzięcia NMP", "https://pl.wikipedia.org/wiki/Parafia_Wniebowzi%C4%99cia_Naj%C5%9Bwi%C4%99tszej_Maryi_Panny_w_Szczecinie", 53.394942, 14.664641, "")
        );

        mySQLite.dodaj(
                new Monument("Ratusz d. gminy Żelechowa", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Robotnicza_26_zabytek.jpg", 53.457892, 14.582416, "")
        );

        mySQLite.dodaj(
                new Monument("Budynek fabryczny (magazynowo-produkcyjny) B. Stoewera", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Dlugosza_23_zabytek.jpg", 53.44469, 14.546616, "")
        );

        mySQLite.dodaj(
                new Monument("Kościół ewangelicki, ob. rzym.-kat. par. p.w. św. Antoniego Padewskiego", "https://pl.wikipedia.org/wiki/Parafia_%C5%9Bw._Antoniego_w_Szczecinie", 53.472262, 14.546558, "")
        );

        mySQLite.dodaj(
                new Monument("Relikty arsenału - mur oporowy z kazamatami", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Korzeniowskiego_arsenal.jpg", 53.4285438, 14.5528116, "")
        );

        mySQLite.dodaj(
                new Monument("Dom dyrektora Szkoły Rzemiosł Budowlanych, ob. rektorat Politechniki Szczecińskiej", "https://pl.wikipedia.org/wiki/Plik:Szczecin_al_Piastow_17_zabytek.jpg", 53.4239062, 14.5376158, "")
        );

        mySQLite.dodaj(
                new Monument("Kamienica", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Podgorna_62_kamienica.jpg", 53.4234955, 14.5538595, "")
        );

        mySQLite.dodaj(
                new Monument("Królewska Szkoła Budowy Maszyn, ob. Wydział Elektryczny PS", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Sikorskiego_37_zabytek.jpg", 53.424921, 14.53391, "")
        );

        mySQLite.dodaj(
                new Monument("Budynek Sejmu Prowincji Pomorza, ob. Muzeum Pomorza Zachodniego", "https://pl.wikipedia.org/wiki/Wikipedia:Wiki_Lubi_Zabytki/zachodniopomorskie/Szczecin/Szczecin#/media/File:Wik_22_Szczecin_Pa%C5%82ac_Sejmu_Stan%C3%B3w_Pomorskich.jpg", 53.427829, 14.554954, "")
        );

        mySQLite.dodaj(
                new Monument("Ratusz staromiejski,  ob. Muzeum Historii Miasta", "https://pl.wikipedia.org/wiki/Ratusz_Staromiejski_w_Szczecinie", 53.4243496, 14.5600033, "")
        );

        mySQLite.dodaj(
                new Monument("Dom", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Kusnierska_kamieniczki.jpg", 53.425935, 14.559193, "")
        );

        mySQLite.dodaj(
                new Monument("Kościół par. p.w. Niepokalanego Serca Marii", "https://pl.wikipedia.org/wiki/Parafia_Niepokalanego_Serca_Naj%C5%9Bwi%C4%99tszej_Maryi_Panny_w_Szczecinie", 53.49356, 14.60555, "")
        );

        mySQLite.dodaj(
                new Monument("Dworek (dec. pałacyk) myśliwski, ob. biblioteka", "https://pl.wikipedia.org/wiki/Wikipedia:Wiki_Lubi_Zabytki/zachodniopomorskie/Szczecin#/media/File:Szczecin_(Dabie)-palacyk_mysliwski.jpg", 53.395181, 14.665974, "")
        );

        mySQLite.dodaj(
                new Monument("Kościół ewangelicki, ob. rzym.-kat. par. p.w. Najświętszej Rodziny", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_Naj%C5%9Bwi%C4%99tszej_Rodziny_w_Szczecinie", 53.35098, 14.73318, "")
        );

        mySQLite.dodaj(
                new Monument("Willa", "https://pl.wikipedia.org/wiki/Plik:Szczecin_al_Wyzwolenia_73_willa.jpg", 53.43662, 14.552611, "")
        );

        mySQLite.dodaj(
                new Monument("Dom, ob. bank", "https://pl.wikipedia.org/wiki/Wikipedia:Wiki_Lubi_Zabytki/zachodniopomorskie/Szczecin/Szczecin#/media/File:Szczecin_ul_Grodzka_Bank_PKO.jpg", 53.425381, 14.554107, "")
        );

        mySQLite.dodaj(
                new Monument("Gimnazjum nr 48, d. zakład opieki dla ociemniałych chłopców", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Jagiellonska_61_zabytek.jpg", 53.434072, 14.527743, "")
        );

        mySQLite.dodaj(
                new Monument("Kaplica cmentarna, ob. kościół p.w. Matki Boskiej Ostrobramskiej", "http://encyklopedia.szczecin.pl/wiki/Ko%C5%9Bci%C3%B3%C5%82_Matki_Bo%C5%BCej_Ostrobramskiej_w_Szczecinie", 53.4560401, 14.565909, "")
        );

        mySQLite.dodaj(
                new Monument("Park miejski im. Jana Kasprowicza", "https://pl.wikipedia.org/wiki/Park_im._Jana_Kasprowicza_w_Szczecinie", 53.445035, 14.524765, "")
        );

        mySQLite.dodaj(
                new Monument("Urzędu Celnego", "https://pl.wikipedia.org/wiki/Wikipedia:Wiki_Lubi_Zabytki/zachodniopomorskie/Szczecin/Szczecin#/media/File:Szczecin_gmach_urzedu_celnego_2005-07.jpg", 53.421642, 14.561867, "")
        );

        mySQLite.dodaj(
                new Monument("Gimnazjum Mariackie, ob. LO", "https://pl.wikipedia.org/wiki/Plik:Szczecin_Plac_Mariacki_szkola.jpg", 53.426957, 14.557107, "")
        );

        mySQLite.dodaj(
                new Monument("Dom", "https://pl.wikipedia.org/wiki/Plik:Szczecin_Krzekowo_ul_Szeroka_6_zabytek.jpg", 53.4475526, 14.4842768, "")
        );

        mySQLite.dodaj(
                new Monument("Cegielnia \"Zgoda\"", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Nad_Odra_cegielnia.jpg", 53.501964, 14.613221, "")
        );

        mySQLite.dodaj(
                new Monument("Kościół, ob. magazyn", "", 53.4233257, 14.5328846, "")
        );

        mySQLite.dodaj(
                new Monument("Cmentarz", "https://pl.wikipedia.org/wiki/Plik:Szczecin_cmentarz_ul_Ostrowska_zabytek.jpg", 53.467205, 14.576985, "")
        );

        mySQLite.dodaj(
                new Monument("Pałac, zw.  pałacem Bartza oraz pałacem Velthusena", "https://pl.wikipedia.org/wiki/Pa%C5%82ac_Klasycystyczny_w_Szczecinie", 53.426631, 14.554404, "")
        );

        mySQLite.dodaj(
                new Monument("Fragment muru obronnego", "https://pl.wikipedia.org/wiki/Plik:Szczecin_(Dabie)-mury_obronne.jpg", 53.39608, 14.66305, "")
        );

        mySQLite.dodaj(
                new Monument("Dom (kamienica)", "", 53.4617424, 14.5617283, "")
        );


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
