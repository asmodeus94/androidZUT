package com.radek.zabytki;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Radek on 04.05.2017.
 */

public class MySQLite extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 2;
    private static final String DATABASE_NAME = "monumentsDB";
    private static final String TABLE_NAME = "monuments";

    public MySQLite(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        String DATABASE_CREATE =
                "create table " + TABLE_NAME + " " +
                        "(_id integer primary key autoincrement," +
                        "name text not null," +
                        "description text not null," +
                        "longitude real not null," +
                        "latitude real not null," +
                        "url text not null);";
        database.execSQL(DATABASE_CREATE);
        momumentsInit();
    }

    private void momumentsInit() {
        dodaj(
                new Monument("Nowy Ratusz, ob. Pomorska Akademia Medyczna", "https://pl.wikipedia.org/wiki/Pomorski_Uniwersytet_Medyczny_w_Szczecinie", 53.42299, 14.554408, "https://upload.wikimedia.org/wikipedia/commons/f/fd/Pomeranian_Medical_Academy_in_Szczecin.jpg")
        );

        dodaj(
                new Monument("Wieża ciśnień (kolejowa)", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Potulicka_wieza_cisnien.jpg", 53.415811, 14.543637, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Potulicka_wieza_cisnien.jpg")
        );

        dodaj(
                new Monument("Wiatrak holenderski", "https://pl.wikipedia.org/wiki/Plik:Szczecin_wiatrak_ul_Mieszka_I_zabytek.jpg", 53.41294, 14.517433, "https://pl.wikipedia.org/wiki/Plik:Szczecin_wiatrak_ul_Mieszka_I_zabytek.jpg")
        );

        dodaj(
                new Monument("Willa", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Krasickiego_6.jpg", 53.44922, 14.513648, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Krasickiego_6.jpg")
        );

        dodaj(
                new Monument("Kościół ewangelicki, ob.rzym.-kat. p.w. Najświętszego Zbawiciela", "https://pl.wikipedia.org/wiki/Parafia_Naj%C5%9Bwi%C4%99tszego_Zbawiciela_w_Szczecinie", 53.445202, 14.543303, "https://pl.wikipedia.org/wiki/Parafia_Naj%C5%9Bwi%C4%99tszego_Zbawiciela_w_Szczecinie#/media/File:Szczecin_Holy_Saviour_Church_2008-02.jpg")
        );

        dodaj(
                new Monument("Wieża widokowa Quistropa", "https://pl.wikipedia.org/wiki/Wie%C5%BCa_Quistorpa", 53.46196, 14.52301, "https://pl.wikipedia.org/wiki/Wie%C5%BCa_Quistorpa#/media/File:Stettin_Quistorpturm_a.jpg")
        );

        dodaj(
                new Monument("Kamienica", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Czeslawa_9_kamienica.jpg", 53.439179, 14.556528, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Czeslawa_9_kamienica.jpg")
        );

        dodaj(
                new Monument("Kamienica", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Slaska_38_zabytek.jpg", 53.431965, 14.54759, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Slaska_38_zabytek.jpg")
        );

        dodaj(
                new Monument("Budynki prezydium policji, ob. Komenda Wojewódzka Policji", "https://pl.wikipedia.org/wiki/Plik:Szczecin_Komenda_Woj_Policji.jpg", 53.4291, 14.558712, "https://pl.wikipedia.org/wiki/Plik:Szczecin_Komenda_Woj_Policji.jpg")
        );

        dodaj(
                new Monument("Willa", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Mickiewicza_2_willa.jpg", 53.4351143, 14.5373696, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Mickiewicza_2_willa.jpg")
        );

        dodaj(
                new Monument("Stajnia książęca, ob. Instytut Filologii Germańskiej", "https://pl.wikipedia.org/wiki/Stajnia_ksi%C4%85%C5%BC%C4%99ca_w_Szczecinie", 53.426411, 14.558933, "https://pl.wikipedia.org/wiki/Stajnia_ksi%C4%85%C5%BC%C4%99ca_w_Szczecinie#/media/File:Szczecin_Stajnia_Zamkowa_1.jpg")
        );

        dodaj(
                new Monument("Młyn parowy (z silosem i spichrzem)", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Debogorska_31_olejarnia.jpg", 53.459608, 14.589156, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Debogorska_31_olejarnia.jpg")
        );

        dodaj(
                new Monument("Kościół par. p.w. Wniebowzięcia NMP", "https://pl.wikipedia.org/wiki/Parafia_Wniebowzi%C4%99cia_Naj%C5%9Bwi%C4%99tszej_Maryi_Panny_w_Szczecinie", 53.394942, 14.664641, "https://pl.wikipedia.org/wiki/Parafia_Wniebowzi%C4%99cia_Naj%C5%9Bwi%C4%99tszej_Maryi_Panny_w_Szczecinie#/media/File:Szczecin_Dabie_kosciol_Niepokalanego_Poczecia_1.jpg")
        );

        dodaj(
                new Monument("Ratusz d. gminy Żelechowa", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Robotnicza_26_zabytek.jpg", 53.457892, 14.582416, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Robotnicza_26_zabytek.jpg")
        );

        dodaj(
                new Monument("Budynek fabryczny (magazynowo-produkcyjny) B. Stoewera", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Dlugosza_23_zabytek.jpg", 53.44469, 14.546616, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Dlugosza_23_zabytek.jpg")
        );

        dodaj(
                new Monument("Kościół ewangelicki, ob. rzym.-kat. par. p.w. św. Antoniego Padewskiego", "https://pl.wikipedia.org/wiki/Parafia_%C5%9Bw._Antoniego_w_Szczecinie", 53.472262, 14.546558, "https://pl.wikipedia.org/wiki/Parafia_%C5%9Bw._Antoniego_w_Szczecinie#/media/File:Szczecin_Warszewo_kosciol_ul_Szczecinska_zabytek.jpg")
        );

        dodaj(
                new Monument("Relikty arsenału - mur oporowy z kazamatami", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Korzeniowskiego_arsenal.jpg", 53.4285438, 14.5528116, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Korzeniowskiego_arsenal.jpg")
        );

        dodaj(
                new Monument("Dom dyrektora Szkoły Rzemiosł Budowlanych, ob. rektorat Politechniki Szczecińskiej", "https://pl.wikipedia.org/wiki/Plik:Szczecin_al_Piastow_17_zabytek.jpg", 53.4239062, 14.5376158, "https://pl.wikipedia.org/wiki/Plik:Szczecin_al_Piastow_17_zabytek.jpg")
        );

        dodaj(
                new Monument("Kamienica", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Podgorna_62_kamienica.jpg", 53.4234955, 14.5538595, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Podgorna_62_kamienica.jpg")
        );

        dodaj(
                new Monument("Królewska Szkoła Budowy Maszyn, ob. Wydział Elektryczny PS", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Sikorskiego_37_zabytek.jpg", 53.424921, 14.53391, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Sikorskiego_37_zabytek.jpg")
        );

        dodaj(
                new Monument("Budynek Sejmu Prowincji Pomorza, ob. Muzeum Pomorza Zachodniego", "https://pl.wikipedia.org/wiki/Wikipedia:Wiki_Lubi_Zabytki/zachodniopomorskie/Szczecin/Szczecin#/media/File:Wik_22_Szczecin_Pa%C5%82ac_Sejmu_Stan%C3%B3w_Pomorskich.jpg", 53.427829, 14.554954, "")
        );

        dodaj(
                new Monument("Ratusz staromiejski,  ob. Muzeum Historii Miasta", "https://pl.wikipedia.org/wiki/Ratusz_Staromiejski_w_Szczecinie", 53.4243496, 14.5600033, "https://pl.wikipedia.org/wiki/Ratusz_Staromiejski_w_Szczecinie#/media/File:1109_Ratusz_Staromiejski_Szczecin.jpg")
        );

        dodaj(
                new Monument("Dom", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Kusnierska_kamieniczki.jpg", 53.425935, 14.559193, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Kusnierska_kamieniczki.jpg")
        );

        dodaj(
                new Monument("Kościół par. p.w. Niepokalanego Serca Marii", "https://pl.wikipedia.org/wiki/Parafia_Niepokalanego_Serca_Naj%C5%9Bwi%C4%99tszej_Maryi_Panny_w_Szczecinie", 53.49356, 14.60555, "https://pl.wikipedia.org/wiki/Parafia_Niepokalanego_Serca_Naj%C5%9Bwi%C4%99tszej_Maryi_Panny_w_Szczecinie#/media/File:Szczecin-S%C5%82oneczne_008.jpg")
        );

        dodaj(
                new Monument("Dworek (dec. pałacyk) myśliwski, ob. biblioteka", "https://pl.wikipedia.org/wiki/Wikipedia:Wiki_Lubi_Zabytki/zachodniopomorskie/Szczecin#/media/File:Szczecin_(Dabie)-palacyk_mysliwski.jpg", 53.395181, 14.665974, "https://pl.wikipedia.org/wiki/Wikipedia:Wiki_Lubi_Zabytki/zachodniopomorskie/Szczecin#/media/File:Szczecin_(Dabie)-palacyk_mysliwski.jpg")
        );

        dodaj(
                new Monument("Kościół ewangelicki, ob. rzym.-kat. par. p.w. Najświętszej Rodziny", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_Naj%C5%9Bwi%C4%99tszej_Rodziny_w_Szczecinie", 53.35098, 14.73318, "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_Naj%C5%9Bwi%C4%99tszej_Rodziny_w_Szczecinie#/media/File:Szczecin_Plonia_ul_Klonowa_kosciol_(1).jpg")
        );

        dodaj(
                new Monument("Willa", "https://pl.wikipedia.org/wiki/Plik:Szczecin_al_Wyzwolenia_73_willa.jpg", 53.43662, 14.552611, "https://pl.wikipedia.org/wiki/Plik:Szczecin_al_Wyzwolenia_73_willa.jpg")
        );

        dodaj(
                new Monument("Dom, ob. bank", "https://pl.wikipedia.org/wiki/Wikipedia:Wiki_Lubi_Zabytki/zachodniopomorskie/Szczecin/Szczecin#/media/File:Szczecin_ul_Grodzka_Bank_PKO.jpg", 53.425381, 14.554107, "https://pl.wikipedia.org/wiki/Wikipedia:Wiki_Lubi_Zabytki/zachodniopomorskie/Szczecin/Szczecin#/media/File:Szczecin_ul_Grodzka_Bank_PKO.jpg")
        );

        dodaj(
                new Monument("Gimnazjum nr 48, d. zakład opieki dla ociemniałych chłopców", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Jagiellonska_61_zabytek.jpg", 53.434072, 14.527743, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Jagiellonska_61_zabytek.jpg")
        );

        dodaj(
                new Monument("Kaplica cmentarna, ob. kościół p.w. Matki Boskiej Ostrobramskiej", "http://encyklopedia.szczecin.pl/wiki/Ko%C5%9Bci%C3%B3%C5%82_Matki_Bo%C5%BCej_Ostrobramskiej_w_Szczecinie", 53.4560401, 14.565909, "http://encyklopedia.szczecin.pl/wiki/Plik:Ko%C5%9Bci%C3%B3%C5%82_pw._MB_Ostrobramskiej.jpg")
        );

        dodaj(
                new Monument("Park miejski im. Jana Kasprowicza", "https://pl.wikipedia.org/wiki/Park_im._Jana_Kasprowicza_w_Szczecinie", 53.445035, 14.524765, "https://pl.wikipedia.org/wiki/Park_im._Jana_Kasprowicza_w_Szczecinie#/media/File:0907_Pomnik_Czynu_Polak%C3%B3w_Szczecin_SZN_9.jpg")
        );

        dodaj(
                new Monument("Urzędu Celnego", "https://pl.wikipedia.org/wiki/Wikipedia:Wiki_Lubi_Zabytki/zachodniopomorskie/Szczecin/Szczecin#/media/File:Szczecin_gmach_urzedu_celnego_2005-07.jpg", 53.421642, 14.561867, "https://pl.wikipedia.org/wiki/Wikipedia:Wiki_Lubi_Zabytki/zachodniopomorskie/Szczecin/Szczecin#/media/File:Szczecin_gmach_urzedu_celnego_2005-07.jpg")
        );

        dodaj(
                new Monument("Gimnazjum Mariackie, ob. LO", "https://pl.wikipedia.org/wiki/Plik:Szczecin_Plac_Mariacki_szkola.jpg", 53.426957, 14.557107, "https://pl.wikipedia.org/wiki/Plik:Szczecin_Plac_Mariacki_szkola.jpg")
        );

        dodaj(
                new Monument("Dom", "https://pl.wikipedia.org/wiki/Plik:Szczecin_Krzekowo_ul_Szeroka_6_zabytek.jpg", 53.4475526, 14.4842768, "https://pl.wikipedia.org/wiki/Plik:Szczecin_Krzekowo_ul_Szeroka_6_zabytek.jpg")
        );

        dodaj(
                new Monument("Cegielnia \"Zgoda\"", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Nad_Odra_cegielnia.jpg", 53.501964, 14.613221, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Nad_Odra_cegielnia.jpg")
        );

        dodaj(
                new Monument("Kościół, ob. magazyn", "", 53.4233257, 14.5328846, "")
        );

        dodaj(
                new Monument("Cmentarz", "https://pl.wikipedia.org/wiki/Plik:Szczecin_cmentarz_ul_Ostrowska_zabytek.jpg", 53.467205, 14.576985, "https://pl.wikipedia.org/wiki/Plik:Szczecin_cmentarz_ul_Ostrowska_zabytek.jpg")
        );

        dodaj(
                new Monument("Pałac, zw.  pałacem Bartza oraz pałacem Velthusena", "https://pl.wikipedia.org/wiki/Pa%C5%82ac_Klasycystyczny_w_Szczecinie", 53.426631, 14.554404, "https://pl.wikipedia.org/wiki/Pa%C5%82ac_Klasycystyczny_w_Szczecinie#/media/File:Pa%C5%82ac_Velthusena_w_Szczecinie,_2014.JPG")
        );

        dodaj(
                new Monument("Fragment muru obronnego", "https://pl.wikipedia.org/wiki/Plik:Szczecin_(Dabie)-mury_obronne.jpg", 53.39608, 14.66305, "https://pl.wikipedia.org/wiki/Plik:Szczecin_(Dabie)-mury_obronne.jpg")
        );

        dodaj(
                new Monument("Dom (kamienica)", "", 53.4617424, 14.5617283, "")
        );


    }


    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        database.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(database);
    }

    public void dodaj(Monument monument) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", monument.getName());
        values.put("description", monument.getDescription());
        values.put("longitude", monument.getLongitude());
        values.put("latitude", monument.getLatitude());
        values.put("url", monument.getUrl());
        db.insert(TABLE_NAME, null, values);
    }

    public void usun(String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME, "_id = ?", new String[]{id});
    }

    public int aktualizuj(Monument monument) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", monument.getName());
        values.put("description", monument.getDescription());
        values.put("longitude", monument.getLongitude());
        values.put("latitude", monument.getLatitude());
        values.put("url", monument.getUrl());
        int i = db.update(TABLE_NAME, values, "_id = ?", new String[]{String.valueOf(monument.getId())});
        db.close();
        return i;
    }

    public Monument pobierz(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor =
                db.query(TABLE_NAME,
                        new String[]{"_id",
                                "name", "description", "longitude", "latitude", "url"},
                        "_id = ?", // selections
                        new String[]{
                                String.valueOf(id)}, // selections args
                        null, // group by
                        null, // having
                        null, // order by
                        null); // limit
        if (cursor != null) {
            cursor.moveToFirst();
        }
        Monument monument = new Monument(
                cursor.getString(1), cursor.getString(2), cursor.getFloat(3), cursor.getFloat(4), cursor.getString(5)
        );
        monument.setId(Integer.parseInt(cursor.getString(0)));
        return monument;
    }

    public Cursor lista(){
        SQLiteDatabase db = this.getReadableDatabase();
        return db.rawQuery("Select * from " + TABLE_NAME, null);
    }
}
