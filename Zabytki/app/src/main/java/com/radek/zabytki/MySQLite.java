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
        momumentsInit(database);
    }

    private void momumentsInit(SQLiteDatabase db) {
        dodaj(
                new Monument("Nowy Ratusz, ob. Pomorska Akademia Medyczna", "https://pl.wikipedia.org/wiki/Pomorski_Uniwersytet_Medyczny_w_Szczecinie", 53.42299, 14.554408, "https://upload.wikimedia.org/wikipedia/commons/f/fd/Pomeranian_Medical_Academy_in_Szczecin.jpg")
        ,db);

        dodaj(
                new Monument("Wieża ciśnień (kolejowa)", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Potulicka_wieza_cisnien.jpg", 53.415811, 14.543637, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Potulicka_wieza_cisnien.jpg")
        ,db);

        dodaj(
                new Monument("Wiatrak holenderski", "https://pl.wikipedia.org/wiki/Plik:Szczecin_wiatrak_ul_Mieszka_I_zabytek.jpg", 53.41294, 14.517433, "https://pl.wikipedia.org/wiki/Plik:Szczecin_wiatrak_ul_Mieszka_I_zabytek.jpg")
        ,db);

        dodaj(
                new Monument("Willa", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Krasickiego_6.jpg", 53.44922, 14.513648, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Krasickiego_6.jpg")
        ,db);

        dodaj(
                new Monument("Kościół ewangelicki, ob.rzym.-kat. p.w. Najświętszego Zbawiciela", "https://pl.wikipedia.org/wiki/Parafia_Naj%C5%9Bwi%C4%99tszego_Zbawiciela_w_Szczecinie", 53.445202, 14.543303, "https://pl.wikipedia.org/wiki/Parafia_Naj%C5%9Bwi%C4%99tszego_Zbawiciela_w_Szczecinie#/media/File:Szczecin_Holy_Saviour_Church_2008-02.jpg")
        ,db);

        dodaj(
                new Monument("Wieża widokowa Quistropa", "https://pl.wikipedia.org/wiki/Wie%C5%BCa_Quistorpa", 53.46196, 14.52301, "https://pl.wikipedia.org/wiki/Wie%C5%BCa_Quistorpa#/media/File:Stettin_Quistorpturm_a.jpg")
        ,db);

        dodaj(
                new Monument("Kamienica", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Czeslawa_9_kamienica.jpg", 53.439179, 14.556528, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Czeslawa_9_kamienica.jpg")
        ,db);

        dodaj(
                new Monument("Kamienica", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Slaska_38_zabytek.jpg", 53.431965, 14.54759, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Slaska_38_zabytek.jpg")
        ,db);

        dodaj(
                new Monument("Budynki prezydium policji, ob. Komenda Wojewódzka Policji", "https://pl.wikipedia.org/wiki/Plik:Szczecin_Komenda_Woj_Policji.jpg", 53.4291, 14.558712, "https://pl.wikipedia.org/wiki/Plik:Szczecin_Komenda_Woj_Policji.jpg")
        ,db);

        dodaj(
                new Monument("Willa", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Mickiewicza_2_willa.jpg", 53.4351143, 14.5373696, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Mickiewicza_2_willa.jpg")
        ,db);

        dodaj(
                new Monument("Stajnia książęca, ob. Instytut Filologii Germańskiej", "https://pl.wikipedia.org/wiki/Stajnia_ksi%C4%85%C5%BC%C4%99ca_w_Szczecinie", 53.426411, 14.558933, "https://pl.wikipedia.org/wiki/Stajnia_ksi%C4%85%C5%BC%C4%99ca_w_Szczecinie#/media/File:Szczecin_Stajnia_Zamkowa_1.jpg")
        ,db);

        dodaj(
                new Monument("Młyn parowy (z silosem i spichrzem)", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Debogorska_31_olejarnia.jpg", 53.459608, 14.589156, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Debogorska_31_olejarnia.jpg")
        ,db);

        dodaj(
                new Monument("Kościół par. p.w. Wniebowzięcia NMP", "https://pl.wikipedia.org/wiki/Parafia_Wniebowzi%C4%99cia_Naj%C5%9Bwi%C4%99tszej_Maryi_Panny_w_Szczecinie", 53.394942, 14.664641, "https://pl.wikipedia.org/wiki/Parafia_Wniebowzi%C4%99cia_Naj%C5%9Bwi%C4%99tszej_Maryi_Panny_w_Szczecinie#/media/File:Szczecin_Dabie_kosciol_Niepokalanego_Poczecia_1.jpg")
        ,db);

        dodaj(
                new Monument("Ratusz d. gminy Żelechowa", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Robotnicza_26_zabytek.jpg", 53.457892, 14.582416, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Robotnicza_26_zabytek.jpg")
        ,db);

        dodaj(
                new Monument("Budynek fabryczny (magazynowo-produkcyjny) B. Stoewera", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Dlugosza_23_zabytek.jpg", 53.44469, 14.546616, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Dlugosza_23_zabytek.jpg")
        ,db);

        dodaj(
                new Monument("Kościół ewangelicki, ob. rzym.-kat. par. p.w. św. Antoniego Padewskiego", "https://pl.wikipedia.org/wiki/Parafia_%C5%9Bw._Antoniego_w_Szczecinie", 53.472262, 14.546558, "https://pl.wikipedia.org/wiki/Parafia_%C5%9Bw._Antoniego_w_Szczecinie#/media/File:Szczecin_Warszewo_kosciol_ul_Szczecinska_zabytek.jpg")
        ,db);

        dodaj(
                new Monument("Relikty arsenału - mur oporowy z kazamatami", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Korzeniowskiego_arsenal.jpg", 53.4285438, 14.5528116, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Korzeniowskiego_arsenal.jpg")
        ,db);

        dodaj(
                new Monument("Dom dyrektora Szkoły Rzemiosł Budowlanych, ob. rektorat Politechniki Szczecińskiej", "https://pl.wikipedia.org/wiki/Plik:Szczecin_al_Piastow_17_zabytek.jpg", 53.4239062, 14.5376158, "https://pl.wikipedia.org/wiki/Plik:Szczecin_al_Piastow_17_zabytek.jpg")
        ,db);

        dodaj(
                new Monument("Kamienica", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Podgorna_62_kamienica.jpg", 53.4234955, 14.5538595, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Podgorna_62_kamienica.jpg")
        ,db);

        dodaj(
                new Monument("Królewska Szkoła Budowy Maszyn, ob. Wydział Elektryczny PS", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Sikorskiego_37_zabytek.jpg", 53.424921, 14.53391, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Sikorskiego_37_zabytek.jpg")
        ,db);

        dodaj(
                new Monument("Budynek Sejmu Prowincji Pomorza, ob. Muzeum Pomorza Zachodniego", "https://pl.wikipedia.org/wiki/Wikipedia:Wiki_Lubi_Zabytki/zachodniopomorskie/Szczecin/Szczecin#/media/File:Wik_22_Szczecin_Pa%C5%82ac_Sejmu_Stan%C3%B3w_Pomorskich.jpg", 53.427829, 14.554954, "")
        ,db);

        dodaj(
                new Monument("Ratusz staromiejski,  ob. Muzeum Historii Miasta", "https://pl.wikipedia.org/wiki/Ratusz_Staromiejski_w_Szczecinie", 53.4243496, 14.5600033, "https://pl.wikipedia.org/wiki/Ratusz_Staromiejski_w_Szczecinie#/media/File:1109_Ratusz_Staromiejski_Szczecin.jpg")
        ,db);

        dodaj(
                new Monument("Dom", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Kusnierska_kamieniczki.jpg", 53.425935, 14.559193, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Kusnierska_kamieniczki.jpg")
        ,db);

        dodaj(
                new Monument("Kościół par. p.w. Niepokalanego Serca Marii", "https://pl.wikipedia.org/wiki/Parafia_Niepokalanego_Serca_Naj%C5%9Bwi%C4%99tszej_Maryi_Panny_w_Szczecinie", 53.49356, 14.60555, "https://pl.wikipedia.org/wiki/Parafia_Niepokalanego_Serca_Naj%C5%9Bwi%C4%99tszej_Maryi_Panny_w_Szczecinie#/media/File:Szczecin-S%C5%82oneczne_008.jpg")
        ,db);

        dodaj(
                new Monument("Dworek (dec. pałacyk) myśliwski, ob. biblioteka", "https://pl.wikipedia.org/wiki/Wikipedia:Wiki_Lubi_Zabytki/zachodniopomorskie/Szczecin#/media/File:Szczecin_(Dabie)-palacyk_mysliwski.jpg", 53.395181, 14.665974, "https://pl.wikipedia.org/wiki/Wikipedia:Wiki_Lubi_Zabytki/zachodniopomorskie/Szczecin#/media/File:Szczecin_(Dabie)-palacyk_mysliwski.jpg")
        ,db);

        dodaj(
                new Monument("Kościół ewangelicki, ob. rzym.-kat. par. p.w. Najświętszej Rodziny", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_Naj%C5%9Bwi%C4%99tszej_Rodziny_w_Szczecinie", 53.35098, 14.73318, "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_Naj%C5%9Bwi%C4%99tszej_Rodziny_w_Szczecinie#/media/File:Szczecin_Plonia_ul_Klonowa_kosciol_(1).jpg")
        ,db);

        dodaj(
                new Monument("Willa", "https://pl.wikipedia.org/wiki/Plik:Szczecin_al_Wyzwolenia_73_willa.jpg", 53.43662, 14.552611, "https://pl.wikipedia.org/wiki/Plik:Szczecin_al_Wyzwolenia_73_willa.jpg")
        ,db);

        dodaj(
                new Monument("Dom, ob. bank", "https://pl.wikipedia.org/wiki/Wikipedia:Wiki_Lubi_Zabytki/zachodniopomorskie/Szczecin/Szczecin#/media/File:Szczecin_ul_Grodzka_Bank_PKO.jpg", 53.425381, 14.554107, "https://pl.wikipedia.org/wiki/Wikipedia:Wiki_Lubi_Zabytki/zachodniopomorskie/Szczecin/Szczecin#/media/File:Szczecin_ul_Grodzka_Bank_PKO.jpg")
        ,db);

        dodaj(
                new Monument("Gimnazjum nr 48, d. zakład opieki dla ociemniałych chłopców", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Jagiellonska_61_zabytek.jpg", 53.434072, 14.527743, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Jagiellonska_61_zabytek.jpg")
        ,db);

        dodaj(
                new Monument("Kaplica cmentarna, ob. kościół p.w. Matki Boskiej Ostrobramskiej", "http://encyklopedia.szczecin.pl/wiki/Ko%C5%9Bci%C3%B3%C5%82_Matki_Bo%C5%BCej_Ostrobramskiej_w_Szczecinie", 53.4560401, 14.565909, "http://encyklopedia.szczecin.pl/wiki/Plik:Ko%C5%9Bci%C3%B3%C5%82_pw._MB_Ostrobramskiej.jpg")
        ,db);

        dodaj(
                new Monument("Park miejski im. Jana Kasprowicza", "https://pl.wikipedia.org/wiki/Park_im._Jana_Kasprowicza_w_Szczecinie", 53.445035, 14.524765, "https://pl.wikipedia.org/wiki/Park_im._Jana_Kasprowicza_w_Szczecinie#/media/File:0907_Pomnik_Czynu_Polak%C3%B3w_Szczecin_SZN_9.jpg")
        ,db);

        dodaj(
                new Monument("Urzędu Celnego", "https://pl.wikipedia.org/wiki/Wikipedia:Wiki_Lubi_Zabytki/zachodniopomorskie/Szczecin/Szczecin#/media/File:Szczecin_gmach_urzedu_celnego_2005-07.jpg", 53.421642, 14.561867, "https://pl.wikipedia.org/wiki/Wikipedia:Wiki_Lubi_Zabytki/zachodniopomorskie/Szczecin/Szczecin#/media/File:Szczecin_gmach_urzedu_celnego_2005-07.jpg")
        ,db);

        dodaj(
                new Monument("Gimnazjum Mariackie, ob. LO", "https://pl.wikipedia.org/wiki/Plik:Szczecin_Plac_Mariacki_szkola.jpg", 53.426957, 14.557107, "https://pl.wikipedia.org/wiki/Plik:Szczecin_Plac_Mariacki_szkola.jpg")
        ,db);

        dodaj(
                new Monument("Dom", "https://pl.wikipedia.org/wiki/Plik:Szczecin_Krzekowo_ul_Szeroka_6_zabytek.jpg", 53.4475526, 14.4842768, "https://pl.wikipedia.org/wiki/Plik:Szczecin_Krzekowo_ul_Szeroka_6_zabytek.jpg")
        ,db);

        dodaj(
                new Monument("Cegielnia \"Zgoda\"", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Nad_Odra_cegielnia.jpg", 53.501964, 14.613221, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Nad_Odra_cegielnia.jpg")
        ,db);

        dodaj(
                new Monument("Kościół, ob. magazyn", "", 53.4233257, 14.5328846, "")
        ,db);

        dodaj(
                new Monument("Cmentarz", "https://pl.wikipedia.org/wiki/Plik:Szczecin_cmentarz_ul_Ostrowska_zabytek.jpg", 53.467205, 14.576985, "https://pl.wikipedia.org/wiki/Plik:Szczecin_cmentarz_ul_Ostrowska_zabytek.jpg")
        ,db);

        dodaj(
                new Monument("Pałac, zw.  pałacem Bartza oraz pałacem Velthusena", "https://pl.wikipedia.org/wiki/Pa%C5%82ac_Klasycystyczny_w_Szczecinie", 53.426631, 14.554404, "https://pl.wikipedia.org/wiki/Pa%C5%82ac_Klasycystyczny_w_Szczecinie#/media/File:Pa%C5%82ac_Velthusena_w_Szczecinie,_2014.JPG")
        ,db);

        dodaj(
                new Monument("Fragment muru obronnego", "https://pl.wikipedia.org/wiki/Plik:Szczecin_(Dabie)-mury_obronne.jpg", 53.39608, 14.66305, "https://pl.wikipedia.org/wiki/Plik:Szczecin_(Dabie)-mury_obronne.jpg")
        ,db);

        dodaj(
                new Monument("Dom (kamienica)", "", 53.4617424, 14.5617283, "")
        ,db);
        //Błażej
        dodaj(
                new Monument("Tzw. Krużganek Mariacki", "Pierwotnie składał się z czterech skrzydeł, z których do czasów współczesnych zachowało się tylko wschodnie skrzydło, w tym w piwnicy i na parterze gotyckie mury. Jest to jedyna pozostałość po kolegiacie Mariackiej. Odbudowany po zniszczeniach drugiej wojny światowej. Obecnie mieści się tu biuro Towarzystwa Budownictwa Społecznego ” Prawobrzeże” Spółka z o.o., Mariacka 24.", 53.427619, 14.556795, "https://pl.wikipedia.org/wiki/Plik:Szczecin_Kruzganek_Mariacki.jpg")
        ,db);

        dodaj(
                new Monument("Elektrownia", "zwany także (niezbyt trafnie) „budynkiem starej transformatorowni”, lub „elektrownią przy ulicy Świętego Ducha”. Od 2 sierpnia 2013 mieści się w nim centrum sztuki współczesnej zwane Trafostacją Sztuki w Szczecinie, w skrócie TRAFO.", 53.422597, 14.556759, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Sw_Ducha_dawna_elektrownia.jpg")
        ,db);

        dodaj(
                new Monument("Pałac Joński", "https://pl.wikipedia.org/wiki/Pa%C5%82ac_Jo%C5%84ski_w_Szczecinie", 53.42583, 14.554229, "https://pl.wikipedia.org/wiki/Pa%C5%82ac_Jo%C5%84ski_w_Szczecinie#/media/File:PalacJonskiWSzczecinie.jpg")
        ,db);

        dodaj(
                new Monument("Sąd Krajowy, ob. Sąd Okręgowy", "Jego budowę zkończono w 1935 roku; poczatkowo słuzył jako Miejska Kasa Oszczędności (Sparrkasse). Po drugiej wojnie światowej budynek stał się siedzibą Komitetu Wojewódzkiego PZPR. W czasie wydarzeń grudniowych 1970 roku pod budynkiem zebrał się 20-tysięczny tłum protestujących. Budynek został podpalony, sprzęty i portrety przywódców wyrzucone przez okna. Starcia na ulicach Szczecina trwały do godz. 22. Tego dnia w Szczecinie w zajściach zginęło 16 osób, a ponad 100 osób zostało rannych.", 53.4285438, 14.5528116, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Kaszubska_42_Sad.jpg")
        ,db);

        dodaj(
                new Monument("Dom ogrodnika", "Drewniany domek francuski, stojący przy ulicy Storrady 2 został zbudowany w 1928 r. przy cmentarzu gminy francuskiej. Cmentarz powstał XVIII w. na prośbę Francuzów mieszkających w Szczecinie, użytkowany był do 1937 r. Zlokalizowano go między ulicami Storrady, Kapitańską, Parkową i Wawelską. Budynek nazywany jest obecnie domkiem grabarza, chociaż tak naprawdę został wybudowany dla ogrodnika cmentarnego. W 2007 r. został wpisany do rejestru zabytków. To ciekawe miejsce jest obecnie siedzibą stowarzyszenia \"Klub Storrady\", które odremontowało obiekt i organizuje w nim imprezy kulturalne.", 53.4321615, 14.5685645, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Storrady_dom_ogrodnika.jpg")
        ,db);

        dodaj(
                new Monument("Kościół św. Jana Ewangelisty", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw._Jana_Ewangelisty_w_Szczecinie", 53.422237, 14.557649, "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw._Jana_Ewangelisty_w_Szczecinie#/media/File:1009_Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw_Jana_Ewangelisty_Szczecin.jpg")
        ,db);

        dodaj(
                new Monument("Kamienica (z 3 oficynami)", "Najpiękniejsza secesyjna kamienica Szczecina, znajdująca się przy ul. św. Wojciecha 1, powstała w 1904 roku dla Alberta Netza, właściciela Cesarsko – Królewskiej Firmy Spedycyjnej z Berlina. Projekt kamienicy został wykonany przez Fridericha Liebergesell, architekta, który cieszył się wówczas przychylnością miejscowych przedsiębiorców i notabli. Był jednym z niewielu w mieście, który wprowadził w dekoracji fasad swoich budowli nowoczesny i mało popularny wówczas w Szczecinie styl secesji. Przy ul. św. Wojciecha zastosował połączenie dwóch nurtów secesyjnych – geometrycznego z roślinno-figuralnym, dzięki czemu na fasadzie pojawia się niezwykle bogaty repertuar wzorów. Linearne sploty łodyg, liści i kwiatów połączone zostały z wzorami geometrycznymi. Płyciny balkonowe i nadokienne zdobi płynna, falująca linia. W zwieńczeniu portalu spoczywają dwie wydłużone sylwety orłów. Ugięte skrzydła ptaków tworzą jednolitą wstęgę miękko układających się linii. Z narożników ostatniego piętra spoglądają na przechodniów zagadkowo zamyślone twarze kobiece, otoczone gęstymi puklami włosów. Na podwórko kamienicy prowadzi wąska brama, której ściany zdobi barwna glazura i sztukaterie, wśród których zwracają uwagę zatrzymane w bezruchu chrząszcze z opuszczonymi ku dołowi skrzydłami. Na parterze kamienicy, również w podwórku, znajdują się galerie i antykwariat.", 53.42631, 14.547943, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_sw_Wojciecha_1_zabytek.jpg")
        ,db);

        dodaj(
                new Monument("Budynek podstacji energetycznej", "W 1873 r. przy Falkenwalderstraße 95 (dzisiejsza al. Wojska Polskiego 74) wybudowano wg projektu architekta Keslera, drewniany dom wraz ze stajnią położoną wewnątrz dziedzińca dla Johannesa Quistorpa.", 53.435478, 14.538017, "https://pl.wikipedia.org/wiki/Plik:Szczecin_al_Wojska_Polskiego_74_stacja_energetyczna.jpg")
        ,db);

        dodaj(
                new Monument("Budynek Archiwum Państwowego", "https://pl.wikipedia.org/wiki/Archiwum_Pa%C5%84stwowe_w_Szczecinie", 53.430074, 14.549294, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_sw_Wojciecha_13_zabytek.jpg")
        ,db);
        dodaj(
                new Monument("Rektorat Uniwersytetu Szczecińskiego", "Obecny budynek rektoratu Uniwersytetu Szczecińskiego, mieszczący się przy al. Papieża Jana Pawła II 22 a (niem. Kaiser-Wilhelm-Straße ) obok skrzyżowania z ul. Wielkopolską (niem. Deutsche Straße), wybudowano w latach 1886-1888[2] według projektu Richarda Rönnebecka z Nassau[3] z przeznaczeniem na budynek Gimnazjum Króla Wilhelma (niem. König-Wilhelms-Gymnasium). Budowa sfinansowana została w dużej mierze przez Johanna Quistorpa. Poprzednia siedziba szkoły poświęcona 11 października 1880 roku przy obecnej ul.Wielkopolskiej 14 szybko okazała się za ciasna. Zdecydowano wówczas o budowie na tej samej parceli dodatkowego budynku usytuowanego od strony obecnej al. Papieża Jana Pawła II. Dnia 12 kwietnia 1888 roku nastąpiło uroczyste poświęcenie gmachu i oddanie go do użytku. W 1903 roku do kompleksu istniejących gmachów doszła dodatkowo hala sportowa od strony ul. Mieczysława Niedziałkowskiego. W czasie II wojny światowej zniszczeniu uległ dach budynku, spłonęły też wnętrza.", 53.436542, 14.544734, "https://pl.wikipedia.org/wiki/Plik:Szczecin_Rektorat_Uniwersytetu_Szczecinskiego.jpg")
        ,db);

        dodaj(
                new Monument("Rektorat Uniwersytetu Szczecińskiego", "Obecny budynek rektoratu Uniwersytetu Szczecińskiego, mieszczący się przy al. Papieża Jana Pawła II 22 a (niem. Kaiser-Wilhelm-Straße ) obok skrzyżowania z ul. Wielkopolską (niem. Deutsche Straße), wybudowano w latach 1886-1888[2] według projektu Richarda Rönnebecka z Nassau[3] z przeznaczeniem na budynek Gimnazjum Króla Wilhelma (niem. König-Wilhelms-Gymnasium). Budowa sfinansowana została w dużej mierze przez Johanna Quistorpa. Poprzednia siedziba szkoły poświęcona 11 października 1880 roku przy obecnej ul.Wielkopolskiej 14 szybko okazała się za ciasna. Zdecydowano wówczas o budowie na tej samej parceli dodatkowego budynku usytuowanego od strony obecnej al. Papieża Jana Pawła II. Dnia 12 kwietnia 1888 roku nastąpiło uroczyste poświęcenie gmachu i oddanie go do użytku. W 1903 roku do kompleksu istniejących gmachów doszła dodatkowo hala sportowa od strony ul. Mieczysława Niedziałkowskiego. W czasie II wojny światowej zniszczeniu uległ dach budynku, spłonęły też wnętrza.", 53.436542, 14.544734, "https://pl.wikipedia.org/wiki/Plik:Szczecin_Rektorat_Uniwersytetu_Szczecinskiego.jpg")
        ,db);

        dodaj(
                new Monument("Pałac Pod Globusem", "https://pl.wikipedia.org/wiki/Pa%C5%82ac_Pod_Globusem_w_Szczecinie", 53.426098, 14.554294, "https://pl.wikipedia.org/wiki/Plik:Pa%C5%82ac_pod_Globusem_w_Szczecinie.JPG")
        ,db);

        dodaj(
                new Monument("Kościół św. Kazimierza", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw._Kazimierza_w_Szczecinie", 53.453762, 14.531347, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Broniewskiego_Kosciol_sw_Kazimierza.jpg")
        ,db);

        dodaj(
                new Monument("Kościół św. Józefa Oblubieńca Najświętszej Maryi Panny", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw._J%C3%B3zefa_Oblubie%C5%84ca_Naj%C5%9Bwi%C4%99tszej_Maryi_Panny_w_Szczecinie", 53.407922, 14.534945, "https://pl.wikipedia.org/wiki/Plik:Szczecin_kosciol_sw_Jozefa_(1).jpg")
        ,db);

        dodaj(
                new Monument("Kościół Świętego Krzyża", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_%C5%9Awi%C4%99tego_Krzy%C5%BCa_w_Szczecinie", 53.43855, 14.51053, "https://pl.wikipedia.org/wiki/Plik:Szczecin_kosciol_Swietego_Krzyza_ul_Wieniawskiego.jpg")
        ,db);

        dodaj(
                new Monument("Kamienica", "Ta eklektyczna kamienica przy ul. Piłsudskiego 7 (koło stacji benzynowej) została zbudowana w 1894 r. według projektu szczecińskiego architekta Jerzego Sommenstuhla. Od lat 20. XX w. funkcjonowała w niej piekarnia. Wojnę budynek przetrwał nienaruszony. Pierwszy powojenny remont rozpoczął się na początku lat 70. W czasie tego remontu na strychu wybuchł pożar dlatego nie zachował się oryginalny szczyt budynku. W roku 2006 mieszkańcy kamienicy przeprowadzili jej kapitalny remont.", 53.432553, 14.551246, "http://bi.gazeta.pl/im/6/11070/z11070876Q,Fragment-zabytkowej-kamienicy.jpg")
        ,db);

        dodaj(
                new Monument("Budynek Zakładu dla Głuchoniemych", "Na ul. Siemiradzkiego 2 w Szczecinie stoi neogotycki budynek wzniesiony w 1904 r., dawna siedziba zakładu dla głuchoniemych. Fundatorem był Martin Quistorp. Obecnie mieści się tu Gimnazjum nr 10, wcześniej od 1955 r. była tam Szkoła Podstawowa nr 32, która po reformie w 1999 r. została zastąpiona gimnazjum.", 53.448366, 14.513538, "http://www.polskaniezwykla.pl/pictures/original/276723.jpg")
        ,db);

        dodaj(
                new Monument("Kościół Matki Bożej Różańcowej", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_Matki_Bo%C5%BCej_R%C3%B3%C5%BCa%C5%84cowej_w_Szczecinie", 53.411159, 14.495236, "https://pl.wikipedia.org/wiki/Plik:Szczecin_kosciol_MB_Rozancowej_ul_Lwowska.jpg")
        ,db);

        dodaj(
                new Monument("Kościół Niepokalanego Serca Najświętszej Marii Panny", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_Niepokalanego_Serca_Naj%C5%9Bwi%C4%99tszej_Marii_Panny_w_Szczecinie", 53.493723, 14.603443, "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_Niepokalanego_Serca_Naj%C5%9Bwi%C4%99tszej_Marii_Panny_w_Szczecinie#/media/File:Szczecin_ul_Nehringa_kosciol_a.jpg")
        ,db);

        dodaj(
                new Monument("Willa Lentza", "https://pl.wikipedia.org/wiki/Willa_Lentza", 53.435495, 14.546417, "https://pl.wikipedia.org/wiki/Willa_Lentza#/media/File:Szczecin_al_Wojska_Polskiego_84_Willa_Lentza.jpg")
        ,db);
        //Kinga K.
        dodaj(
                new Monument("Kościół par., ob. archikatedra p.w. św. Jakuba", "https://pl.wikipedia.org/wiki/Bazylika_archikatedralna_%C5%9Bw._Jakuba_w_Szczecinie", 53.42508, 14.55672, "https://upload.wikimedia.org/wikipedia/commons/1/1c/Szczecin_katedra_sw_Jakuba_%282%29.jpg")
        ,db);

        dodaj(
                new Monument("Kościół par. p.w. św. Jana Chrzciciela", "https://pl.wikipedia.org/wiki/Bazylika_%C5%9Bw._Jana_Chrzciciela_w_Szczecinie", 53.427149, 14.548767, "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Szczecin_kosciol_Jana_Chrzciciela_2.jpg/800px-Szczecin_kosciol_Jana_Chrzciciela_2.jpg")
        ,db);

        dodaj(
                new Monument("Kościół rzym.-kat. ob. pol.-kat. p.w. śś. Piotra i Pawła", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw._Piotra_i_%C5%9Bw._Paw%C5%82a_w_Szczecinie", 53.427818, 14.559791, "https://upload.wikimedia.org/wikipedia/commons/8/8c/KosciolSwPiotraIPawla_w_Szczecinie.jpg")
        ,db);

        dodaj(
                new Monument("Kościół ewangelicki (tzw. kościół pokoju), ob.rzym.-kat. p.w. św. Stanisława Kostki", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw._Stanis%C5%82awa_Kostki_w_Szczecinie", 53.438485, 14.566617, "https://upload.wikimedia.org/wikipedia/commons/1/1f/Szczecin_Kosciol_Sw_Stanislawa_Kostki.jpg")
        ,db);

        dodaj(
                new Monument("Plac Jasne Błonia im. Jana Pawła II (niem. Quinstorp-Aue)", "https://pl.wikipedia.org/wiki/Jasne_B%C5%82onia", 53.4285438, 14.5528116, "https://upload.wikimedia.org/wikipedia/commons/6/6b/0907_Szczecin_Jane_B%C5%82onia_SZN.jpg")
        ,db);

        dodaj(
                new Monument("Kasyno oficerskie, ob. szkoła", "http://encyklopedia.szczecin.pl/wiki/Kasyno_wojskowe", 53.423071, 14.549747, "http://fotopolska.eu/foto/216/216718.jpg")
        ,db);

        dodaj(
                new Monument("Elektrownia miejska", "Elektrownia miejska ob. biurowiec", 53.432067, 14.568865, "https://www.e-biurowce.pl/cache/b/b/3/8/7/bb38718cc30024e44807c30f3779e5126d9ddf39.jpeg")
        ,db);

        dodaj(
                new Monument("Muzeum Miejskie, ob. Muzeum Narodowe i Teatr Wspólczesny", "https://pl.wikipedia.org/wiki/Teatr_Wsp%C3%B3%C5%82czesny_w_Szczecinie", 53.430125, 14.564666, "https://upload.wikimedia.org/wikipedia/commons/4/4a/PolandSzczecinSeaMuseum.JPG")
        ,db);

        dodaj(
                new Monument("Rejencja Szczecińska, ob. Urząd Wojewódzki", "https://pl.wikipedia.org/wiki/Budynek_Urz%C4%99du_Wojew%C3%B3dzkiego_w_Szczecinie", 53.431198, 14.566181, "https://upload.wikimedia.org/wikipedia/commons/0/05/Urz%C4%85d_Wojew%C3%B3dzki_Szczecin.jpg")
        ,db);

        dodaj(
                new Monument("Kino Kosmos", "Kino Kosmos", 53.427044, 14.544917, "http://bi.gazeta.pl/im/9a/a0/be/z12492954Q,Kino-Kosmos-w-Szczecinie.jpg")
        ,db);

        dodaj(
                new Monument("Willa, ob. Szczecińska Agencja Artystyczna", "Willa, ob. Szczecińska Agencja Artystyczna", 53.43352, 14.539372, "http://www.dioblina.eu/files/dioblina/styles/fullscreen/public/ugl/0/0/1/willa-ob-szczecinska-agencja-artystyczna-102090.jpg")
        ,db);

        dodaj(
                new Monument("Plebania kościoła p.w. św. Jakuba", "http://encyklopedia.szczecin.pl/wiki/Willa_przy_alei_Wojska_Polskiego_113", 53.44085, 14.53224, "http://encyklopedia.szczecin.pl/images/0/05/WKZ_Wojska_Polskiego_113_2.JPG")
        ,db);

        dodaj(
                new Monument("Pałac, ob. Klub 13 Muz", "https://pl.wikipedia.org/wiki/Dom_Kultury_13_Muz", 53.428186, 14.55416, "https://upload.wikimedia.org/wikipedia/commons/8/89/13_Muz.1.JPG")
        ,db);

        dodaj(
                new Monument("Wieża widokowa (d. wieża Bismarcka)", "https://pl.wikipedia.org/wiki/Wie%C5%BCa_Goc%C5%82awska", 53.4285438, 14.5528116, "https://upload.wikimedia.org/wikipedia/commons/3/34/Bismarckturm-Stettin-2013.JPG")
        ,db);

        dodaj(
                new Monument("Kościół ewangelicki, ob. rzym.-kat. par. p.w. Św. Ducha", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw._Jana_Ewangelisty_w_Szczecinie", 53.380284, 14.633902,  "https://upload.wikimedia.org/wikipedia/commons/f/f3/1009_Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw_Jana_Ewangelisty_Szczecin.jpg")
        ,db);

        dodaj(
                new Monument("Zespół kościoła ewangelickiego p.w.Krzyża Świętego, ob. rzym.-kat. par. p.w. Św. Rodziny", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw._Rodziny_w_Szczecinie", 53.439463, 14.536257, "https://upload.wikimedia.org/wikipedia/commons/8/8e/Szczecin_Kosciol_sw._Rodziny_1.jpg")
        ,db);

        dodaj(
                new Monument("Plac Tobrucki, d. Plac Ratuszowy (Marktplatz)", "http://encyklopedia.szczecin.pl/wiki/Plac_Ratuszowy", 53.4214986, 14.5533364, "https://media-cdn.tripadvisor.com/media/photo-s/08/1c/20/8a/plac-tobrucki.jpg")
        ,db);

        dodaj(
                new Monument("Port wolnocłowy - Łasztownia", "https://pl.wikipedia.org/wiki/%C5%81asztownia", 53.470523, 14.5736917,"")
        ,db);
        dodaj(
                new Monument("Zespół dworski Sienno", "http://www.polskiezabytki.pl/m/obiekt/7777/Szczecin_-_Dwor__ul._Laczna_4_/", 53.4184073, 14.566093,"")
        ,db);
        dodaj(
                new Monument("Zespół portowej straży pożarnej", "http://www.port.szczecin.pl/pl/porty/bezpieczenstwo/portowa-sluzba-ratownicza/zadania-psr#", 53.417576, 14.569226,"")
        ,db);
        dodaj(
                new Monument("Zespół zajezdni tramwajowej", "Jest to zespół budynków dawnej zajezdni tramwajowej", 53.44032, 14.533949,"")
        ,db);
        dodaj(
                new Monument("Zagroda pastora", "zagroda pastora obok domu parafialnego wraz z budynkiem gospodarczym", 53.493896, 14.600877,"")
        ,db);
        dodaj(
                new Monument("Zespół dworca kolejowego Szczecin Niebuszewo", "https://pl.wikipedia.org/wiki/Szczecin_Niebuszewo_(stacja_kolejowa)", 53.4285438, 14.5528116,"")
        ,db);
        dodaj(
                new Monument("Zespół komendantury twierdzy", "https://pl.wikipedia.org/wiki/Twierdza_Szczecin", 53.421602, 14.551271,"")
        ,db);
        dodaj(
                new Monument("Zespół willi", "https://pl.wikipedia.org/wiki/Willa_Hoerdera_w_Szczecinie\n", 53.446662, 14.517005,"")
        ,db);
        dodaj(
                new Monument("Zespół willi", "https://pl.wikipedia.org/wiki/Willa_Lentza", 53.450007, 14.516327,"")
        ,db);
        dodaj(
                new Monument("Zespół szkoły, ob. LO", "http://lo14.szczecin.pl/", 53.434562, 14.527459,"")
        ,db);
        dodaj(
                new Monument("Zespół willi", "willa wraz z dziedzińcem folwarcznym i parkiem dworskim", 53.438469, 14.534863,"")
        ,db);
        dodaj(
                new Monument("Zespół szpitala", "http://www.szpital-zdroje.szczecin.pl/zdroje/swiadczenia-medyczne/przychodnia-specjalistyczna-ul-slowackiego-19/zespol-specjalistycznych-poradni-dla-kobiet/", 53.440682, 14.552352,"")
        ,db);
        dodaj(
                new Monument("Zespół willi", "http://www.domkepinskich.ubf.pl/news.php", 53.433822, 14.540296,"")
        ,db);
        dodaj(
                new Monument("Zespół d. gimnazjum męskiego, ob. I LO", "https://pl.wikipedia.org/wiki/I_Liceum_Og%C3%B3lnokszta%C5%82c%C4%85ce_im._Marii_Sk%C5%82odowskiej-Curie_w_Szczecinie", 53.429157, 14.537289, "")
        ,db);
        dodaj(
                new Monument("Zespół willi", "http://encyklopedia.szczecin.pl/wiki/Willa_przy_ulicy_Mickiewicza_2", 53.449377, 14.517628,"")
        ,db);
        dodaj(
                new Monument("Zespół willi", "http://zabytki.ocalicodzapomnienia.eu/zabytek-2-19-1-2132.html", 53.43692, 14.537984,"")
        ,db);
        dodaj(
                new Monument("Zespół Domów Profesorskich", "https://pl.wikipedia.org/wiki/Domki_Profesorskie_w_Szczecinie", 53.4274473, 14.5571865,"")
        ,db);
        dodaj(
                new Monument("Zespół kościoła ewang., ob. rzym.-kat. par. pw. Matki Boskiej Nieustającej Pomocy", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_Matki_Bo%C5%BCej_Nieustaj%C4%85cej_Pomocy_w_Szczecinie", 53.468333, 14.590731,"")
        ,db);
        dodaj(
                new Monument("Zespół domu", "https://pl.wikipedia.org/wiki/Dom_Grotha_w_Szczecinie", 53.437366, 14.571323,"")
        ,db);
        dodaj(
                new Monument("Zespół willi", "http://spzozsw.pl/przychodnie/przychodnia-specj/", 53.439133, 14.535713,"")
        ,db);
        dodaj(
                new Monument("Zespół fabryki cykorii", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Swiatowida_75-76_zabytek.jpg", 53.468185, 14.597909,"")
        ,db);
        dodaj(
                new Monument("Zespół wiaty przystanku tramwajowego i kiosku nastawniczego", "http://www.mkm.szczecin.pl/encyklopedia/lasarkonski", 53.45737, 14.51827,"")
        ,db);
        dodaj(
                new Monument("Zespół tarasów widokowych", "https://pl.wikipedia.org/wiki/Wa%C5%82y_Chrobrego", 53.42997, 14.56525,"")
        ,db);
        dodaj(
                new Monument("Zespół Cmentarza Centralnego", "https://pl.wikipedia.org/wiki/Cmentarz_Centralny_w_Szczecinie", 53.4171457, 14.5225421,"")
        ,db);
        dodaj(
                new Monument("Zespół willi", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Piotra_Skargi_14_willa.jpg", 53.44238, 14.539287,"")
        ,db);
        dodaj(
                new Monument("Zespół loży masońskiej Trzech Cyrkli, ob. Teatr Polski", "http://encyklopedia.szczecin.pl/wiki/Teatr_Polski_(Szczecin)", 53.433708, 14.570542,"")
        ,db);
        dodaj(
                new Monument("Zespół willi", "https://pl.wikipedia.org/wiki/Willa_Hoerdera_w_Szczecinie", 53.436003, 14.53746,"")
        ,db);
        dodaj(
                new Monument("Zespół kościoła, obecnie kościół p.w. NMP Matki Kościoła", "https://pl.wikipedia.org/wiki/Parafia_Naj%C5%9Bwi%C4%99tszej_Maryi_Panny_Matki_Ko%C5%9Bcio%C5%82a_w_Bezrzeczu", 53.34113, 14.75055,"")
        ,db);
        dodaj(
                new Monument("Budynki z kompleksu d. fabryki Stoewera", "https://pl.wikipedia.org/wiki/Stoewer", 53.445869, 14.545044,"")
        ,db);
        dodaj(
                new Monument("Zespół poczty", "https://pl.wikipedia.org/wiki/Poczta_nr_2_w_Szczecinieu", 53.421199, 14.555022,"")
        ,db);
        dodaj(
                new Monument("Zespół willi", "http://www.dioblina.eu/Willa_przy_Pola_3", 53.451376, 14.51588,"")
        ,db);
        dodaj(
                new Monument("Zespół kościoła par. p.w. św. Maksymiliana Kolbe", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw._Maksymiliana_Marii_Kolbego_w_Szczecinie", 53.396341, 14.528829,"")
        ,db);
        dodaj(
                new Monument("Zespół willi", "https://pl.wikipedia.org/wiki/Willa_Nellego_w_Szczecinie", 53.444785, 14.542358,"")
        ,db);
        dodaj(
                new Monument("Zespół kościoła par. p.w. Św. Trójcy", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_%C5%9Awi%C4%99tej_Tr%C3%B3jcy_w_Szczecinie_(Krzekowo)", 53.449381, 14.484718,"")
        ,db);
        dodaj(
                new Monument("Zespół willi", "http://encyklopedia.szczecin.pl/wiki/Willa_przy_ulicy_Konopnickiej_27", 53.438752, 14.508103,"")
        ,db);
        dodaj(
                new Monument("Zespół rzeźni miejskiej", "https://pl.wikipedia.org/wiki/Stara_Rze%C5%BAnia_w_Szczecinie", 53.4256599, 14.568195,"")
        ,db);
        dodaj(
                new Monument("Zespół mieszkalno-przemysłowy", "", 53.4338087, 14.531023,"")
        ,db);
        dodaj(
                new Monument("Zespół straży pożarnej", "http://www.straz.szczecin.pl/", 53.425458, 14.552816,"")
        ,db);
        dodaj(
                new Monument("Zespół willowy", "http://encyklopedia.szczecin.pl/wiki/Willa_przy_alei_Wojska_Polskiego_115", 53.441167, 14.531758,"")
        ,db);
        dodaj(
                new Monument("Zespół dworski", "http://szczecin.wyborcza.pl/szczecin/56,34939,10849918,dworek-i-kosciol,,2.html?disableRedirects=true", 53.400939, 14.489629,"")
        ,db);
        //Kinga M
        dodaj(
                new Monument("Kościół ewangelicki, ob. rzym.-kat. par. p.w. Najświętszego Serca Pana Jezusa", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_Naj%C5%9Bwi%C4%99tszego_Serca_Pana_Jezusa_w_Szczecinie",53.427181,14.548556,"https://upload.wikimedia.org/wikipedia/commons/6/63/Szczecin_Kosciol_NSPJ.jpg")
                ,db);

        dodaj(
                new Monument("Park miejski Różanka", "https://pl.wikipedia.org/wiki/Ogr%C3%B3d_R%C3%B3%C5%BCany_w_Szczecinie",53.447804,14.523943,"https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/Ogr%C3%B3d_R%C3%B3%C5%BCany_w_Szczecinie_wlz_3.JPG/1280px-Ogr%C3%B3d_R%C3%B3%C5%BCany_w_Szczecinie_wlz_3.JPG")
                ,db);

        dodaj(
                new Monument("Zamek Książąt Pomorskich w Szczecinie", "https://pl.wikipedia.org/wiki/Zamek_Ksi%C4%85%C5%BC%C4%85t_Pomorskich_w_Szczecinie",53.4262776,14.5602091,"https://upload.wikimedia.org/wikipedia/commons/9/90/26.Zamek_Ksi%C4%85%C5%BC%C4%85t_Pomorskich-widok_z_katedry1.jpg")
                ,db);

        dodaj(
                new Monument("Czerwony Ratusz , ob. Urząd Morski", "https://pl.wikipedia.org/wiki/Czerwony_Ratusz_w_Szczecinie",53.421949,14.552135,"https://upload.wikimedia.org/wikipedia/commons/f/f9/CzerwonyRatuszWSzczecinie.jpg")
                ,db);

        dodaj(
                new Monument("Zespół gmachów władz Prowincji Pomorskiej", "https://pl.wikipedia.org/wiki/Urz%C4%85d_Miasta_Szczecin",53.437984,14.5422603,"https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/1311_Urz%C4%85d_Miejski_Szczecin_ZS.jpg/1920px-1311_Urz%C4%85d_Miejski_Szczecin_ZS.jpg")
                ,db);

        dodaj(
                new Monument("Zespół budynków straży pożarnej", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Firlika_Straz_Pozarna.jpg",53.440953,14.574139,"https://upload.wikimedia.org/wikipedia/commons/f/f7/Szczecin_ul_Firlika_Straz_Pozarna.jpg")
                ,db);

        dodaj(
                new Monument("Liceum Fundacji Salem, ob. specjalny ośrodek wychowawczy nr 2", "https://pl.wikipedia.org/wiki/Wikipedia:Wiki_Lubi_Zabytki/zachodniopomorskie/Szczecin/Szczecin",53.433674,14.529573,"https://upload.wikimedia.org/wikipedia/commons/thumb/5/5c/0904_Gim_Mariac_Szczecin.jpg/1200px-0904_Gim_Mariac_Szczecin.jpg")
                ,db);

        dodaj(
                new Monument("Szkoła, ob. Centrum Doskonalenia Nauczycieli", "https://pl.wikipedia.org/wiki/Historia_o%C5%9Bwiaty_w_Gryficach",53.43204,14.537529,"https://upload.wikimedia.org/wikipedia/commons/c/c1/Zachodniopomorska_Szko%C5%82a_Biznesu_w_Gryficach.JPG")
                ,db);

        dodaj(
                new Monument("Zespół fabryki spirytusu i drożdży F. Crepina", "https://pl.wikipedia.org/wiki/Wikiprojekt:Wiki_Lubi_Zabytki/wykazy/wojew%C3%B3dztwo_zachodniopomorskie/Szczecin/NID",53.413335,14.545976,"http://www.wszczecinie.pl/thumb/articles/848-1da4ea020bdc1ec214bef054bb8b11e7.jpg")
                ,db);

        dodaj(
                new Monument("Zespół fabryki spirytusu, likierów i drożdży O.Lefevre'a", "http://encyklopedia.szczecin.pl/wiki/Zabudowa_fabryczna_przy_ulicy_Kolumba",53.416439,14.548533,"http://encyklopedia.szczecin.pl/images/f/f0/Obiekt_brak.jpg")
                ,db);

        dodaj(
                new Monument("Zespół zajezdni tramwajowej", "https://pl.wikipedia.org/wiki/Tramwaje_w_Szczecinie",53.417057,14.549153,"https://upload.wikimedia.org/wikipedia/commons/3/3c/Wyspa_Jask%C3%B3%C5%82cza_podstacja_transformatorowa.jpg")
                ,db);

        dodaj(
                new Monument("Zespół domu", "https://pl.wikipedia.org/wiki/Wikipedia:Wiki_Lubi_Zabytki/zachodniopomorskie/Szczecin/Szczecin",53.438232,14.531442,"http://encyklopedia.szczecin.pl/images/f/f0/Obiekt_brak.jpg")
                ,db);

        dodaj(
                new Monument("Kamienica Loitzów, ob. Liceum Sztuk Plastycznych", "https://pl.wikipedia.org/wiki/Kamienica_Loitz%C3%B3w",53.425262,14.559382,"https://pl.wikipedia.org/wiki/Kamienica_Loitz%C3%B3w#/media/File:PolandSzczecinLoitz.JPG")
                ,db);

        dodaj(
                new Monument("Zespół spichrzy", "https://pl.wikipedia.org/wiki/Spichlerz",53.425242,14.5599227,"https://pl.wikipedia.org/wiki/Spichlerz#/media/File:2015_Pa%C5%82ac_Sarny_w_%C5%9Acinawce_G%C3%B3rnej,_spichrz_02.jpg")
                ,db);

        dodaj(
                new Monument("Dom", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Labedzia_15_dom.jpg",53.455885,14.541467,"https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Szczecin_ul_Labedzia_15_dom.jpg/800px-Szczecin_ul_Labedzia_15_dom.jpg")
                ,db);

        dodaj(
                new Monument("Kamienica", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Malczewskiego_34_zabytek.jpg",53.4349969,14.556882,"https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Szczecin_ul_Malczewskiego_34_zabytek.jpg/622px-Szczecin_ul_Malczewskiego_34_zabytek.jpg")
                ,db);

        dodaj(
                new Monument("Szkoła im. Elżbiety, ob. LO nr XII", "https://pl.wikipedia.org/wiki/Plik:Kolumny_przed_wejsciem_do_budynku_Zespo%C5%82u_Szk%C3%B3%C5%82_Sportowych_Szczecin._ul._Ma%C5%82opolska_22.jpg",53.427876,14.562525,"https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Kolumny_przed_wejsciem_do_budynku_Zespo%C5%82u_Szk%C3%B3%C5%82_Sportowych_Szczecin._ul._Ma%C5%82opolska_22.jpg/800px-Kolumny_przed_wejsciem_do_budynku_Zespo%C5%82u_Szk%C3%B3%C5%82_Sportowych_Szczecin._ul._Ma%C5%82opolska_22.jpg")
                ,db);

        dodaj(
                new Monument("Zespół willowy", "http://encyklopedia.szczecin.pl/wiki/Willa_przy_ulicy_Matejki_8",53.436829,14.560523,"https://upload.wikimedia.org/wikipedia/commons/8/84/Szczecin_ul_Matejki_8_willa.jpg")
                ,db);

        dodaj(
                new Monument("Teren Starego Miasta", "https://pl.wikipedia.org/wiki/Stare_Miasto_(Szczecin)",53.4285438,14.5528116,"https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/1009_Rynek_Sienny_Szczecin_SZN.jpg/1920px-1009_Rynek_Sienny_Szczecin_SZN.jpg")
                ,db);

        dodaj(
                new Monument("Kościół ewangelicki, ob. rzym.-kat. par. p.w. św. Kazimierza", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw._Kazimierza_w_Szczecinie",53.453762,14.531347,"https://upload.wikimedia.org/wikipedia/commons/thumb/1/13/Szczecin_ul_Broniewskiego_Kosciol_sw_Kazimierza.jpg/800px-Szczecin_ul_Broniewskiego_Kosciol_sw_Kazimierza.jpg")
                ,db);

        dodaj(
                new Monument("Zespół szkolny", "http://gimnazjumnr6.szczecin.pl/Nowastrona/index.php",53.449252,14.535479,"http://szkolnictwo.pl/zdj/PB/PB0301.jpg")
                ,db);

        dodaj(
                new Monument("Bank", "https://pl.wikipedia.org/wiki/Pa%C5%82ac_Ziemstwa_Pomorskiego",53.426859,14.550905,"https://upload.wikimedia.org/wikipedia/commons/e/e4/Szczecin_Palac_Ziemstwa_1.jpg")
                ,db);

        dodaj(
                new Monument("Poczta", "https://pl.wikipedia.org/wiki/Gmach_przy_alei_Niepodleg%C5%82o%C5%9Bci_41/42_w_Szczecinie",53.426438,14.550663,"https://upload.wikimedia.org/wikipedia/commons/a/aa/Szczecin_al_Niepodleglosci_41_42_zabytek.jpg")
                ,db);

        dodaj(
                new Monument("Loża masońska Pod Trzema Złotymi Kotwicami, ob. dom kultury", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Partyzantow_DKK.jpg",53.423865,14.5497,"https://upload.wikimedia.org/wikipedia/commons/c/ce/Szczecin_ul_Partyzantow_DKK.jpg")
                ,db);

        dodaj(
                new Monument("Zespół gimnazjum, ob. biblioteka", "https://pl.wikipedia.org/wiki/Ksi%C4%85%C5%BCnica_Pomorska_im._Stanis%C5%82awa_Staszica_w_Szczecinie",53.4285438,14.5528116,"https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Ksiaznica_Pomorska_w_Szczecinie_%283%29.jpg/1280px-Ksiaznica_Pomorska_w_Szczecinie_%283%29.jpg")
                ,db);

        dodaj(
                new Monument("Szkoła Rzemiosł Budowlanych, ob. Wydziału Inżynierii PS", "http://tme.d2.pl/index.php?option=com_content&view=article&id=48&Itemid=58",53.425239,14.534938,"https://lh6.googleusercontent.com/-DrmT4kf75Rw/To3imiHexBI/AAAAAAAACcM/J8mCP65wW90/s600/Zdj%C4%99cie4141.jpg")
                ,db);

        dodaj(
                new Monument("Zespół szpitala", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Piotra_Skargi_Szpital_Wojskowy.jpg",53.443237,14.542225,"https://upload.wikimedia.org/wikipedia/commons/5/55/Szczecin_ul_Piotra_Skargi_Szpital_Wojskowy.jpg")
                ,db);

        dodaj(
                new Monument("Fabryka czekolady, ob. Wojewódzka Stacja Sanitarno-epdemiologiczna", "http://encyklopedia.szczecin.pl/wiki/Budynek_Sanepidu_przy_ulicy_Spedytorskiej",53.415043,14.555347,"http://encyklopedia.szczecin.pl/images/1/1e/Sanepid_1.JPG")
                ,db);

        dodaj(
                new Monument("Zespół gmachów Wyższej Szkoły Morskiej", "https://pl.wikipedia.org/wiki/Akademia_Morska_w_Szczecinie",53.428277,14.563576,"https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/PolandSzczecinMAcademy.JPG/1280px-PolandSzczecinMAcademy.JPG")
                ,db);

        dodaj(
                new Monument("Zespół szpitala Betania", "https://pl.wikipedia.org/wiki/Zak%C5%82ad_opieku%C5%84czy_%22Bethanien%22",53.4388773,14.530012,"https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Szczecin_ul_Wawrzyniaka_7d-g.jpg/1280px-Szczecin_ul_Wawrzyniaka_7d-g.jpg")
                ,db);

        dodaj(
                new Monument("Zespół gimnazjum im. króla Wilhelma, ob. zespół szkół specjalnych nr 4", "https://pl.wikipedia.org/wiki/Liceum_Pedagogiczne_nr_1_w_Szczecinie",53.436501,14.546081,"https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Uniwersytet_Szczecinski_Wydzial_Matematyczno_Fizyczny.jpg/1280px-Uniwersytet_Szczecinski_Wydzial_Matematyczno_Fizyczny.jpg")
                ,db);

        dodaj(
                new Monument("Kamienica", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Zolkiewskiego_2_zabytek.jpg",53.430567,14.537101,"https://upload.wikimedia.org/wikipedia/commons/8/8a/Szczecin_ul_Zolkiewskiego_2_zabytek.jpg")
                ,db);

        dodaj(
                new Monument("Zespół zajezdni tramwajowej Niemierzyn", "https://pl.wikipedia.org/wiki/Niemierzyn_(zajezdnia_tramwajowa)",53.44766,14.540075,"https://pl.wikipedia.org/wiki/Niemierzyn_(zajezdnia_tramwajowa)#/media/File:Szczecin_Zajezdnia_Tramwajowa_Niemierzyn.jpg")
                ,db);

        dodaj(
                new Monument("Willa", "https://pl.wikipedia.org/wiki/Plik:Szczecin_Dabie_ul_Zaglowa_willa.jpg",53.40119,14.66658,"https://upload.wikimedia.org/wikipedia/commons/f/f3/Szczecin_Dabie_ul_Zaglowa_willa.jpg")
                ,db);

        dodaj(
                new Monument("Zespół domu opieki dla sierot (dom macierzysty diakonis Kinderhail)", "http://otwartezabytki.pl/pl/relics/69582-szczecin-dom-macierzysty-diakonis-kinderhail-ob-panstwowy-dom-dziecka-zielony-dwor",53.3752592,14.6404942,"https://d-nm.ppstatic.pl/k/r/d8/1d/54b038c5283ad_o.jpg?1488288330")
                ,db);

        dodaj(
                new Monument("Skwer miejski - pl. im. Janiny Szczerskiej", "http://encyklopedia.szczecin.pl/wiki/Plac_im._Janiny_Szczerskiej",53.426248,14.536261,"http://encyklopedia.szczecin.pl/images/thumb/0/01/Szczecin_pl_Janiny_Szczerskiej.jpg/240px-Szczecin_pl_Janiny_Szczerskiej.jpg")
                ,db);

        dodaj(
                new Monument("Willa", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Metalowa_42_zabytek.jpg",53.361592,14.589262,"https://upload.wikimedia.org/wikipedia/commons/3/3c/Szczecin_ul_Metalowa_42_zabytek.jpg")
                ,db);

        dodaj(
                new Monument("Budynek d. restauracji Tiergarten", "https://commons.wikimedia.org/wiki/File:Szczecin_ul_Chmielewskiego_18_zabytek.jpg",53.402195,14.532476,"https://upload.wikimedia.org/wikipedia/commons/2/2c/Szczecin_ul_Chmielewskiego_18_zabytek.jpg")
                ,db);

        dodaj(
                new Monument("Zespół szkół", "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Boleslawa_Smialego_42_43.jpg",53.4309052,14.5404249,"https://upload.wikimedia.org/wikipedia/commons/f/fa/Szczecin_ul_Boleslawa_Smialego_42_43.jpg")
                ,db);

        dodaj(
                new Monument("Wieża ciśnień, ob. kościół rzym.-kat. p.w. Matki Boskiej Jasnogórskiej", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_Matki_Bo%C5%BCej_Jasnog%C3%B3rskiej_w_Szczecinie",53.405737,14.523145,"https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Szczecin%2C_ko%C5%9Bci%C3%B3%C5%82_MB_Jasnog%C3%B3rskiej.jpg/1280px-Szczecin%2C_ko%C5%9Bci%C3%B3%C5%82_MB_Jasnog%C3%B3rskiej.jpg")
                ,db);



    }


    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        database.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(database);
    }

    public void dodaj(Monument monument, SQLiteDatabase db) {
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
