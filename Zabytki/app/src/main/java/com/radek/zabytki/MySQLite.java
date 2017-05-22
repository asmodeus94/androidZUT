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
        //Błażej
        dodaj(
                new Monument("Tzw. Krużganek Mariacki", "Pierwotnie składał się z czterech skrzydeł, z których do czasów współczesnych zachowało się tylko wschodnie skrzydło, w tym w piwnicy i na parterze gotyckie mury. Jest to jedyna pozostałość po kolegiacie Mariackiej. Odbudowany po zniszczeniach drugiej wojny światowej. Obecnie mieści się tu biuro Towarzystwa Budownictwa Społecznego ” Prawobrzeże” Spółka z o.o., Mariacka 24.", 53.427619, 14.556795, "https://pl.wikipedia.org/wiki/Plik:Szczecin_Kruzganek_Mariacki.jpg")
        );

        dodaj(
                new Monument("Elektrownia", "zwany także (niezbyt trafnie) „budynkiem starej transformatorowni”, lub „elektrownią przy ulicy Świętego Ducha”. Od 2 sierpnia 2013 mieści się w nim centrum sztuki współczesnej zwane Trafostacją Sztuki w Szczecinie, w skrócie TRAFO.", 53.422597, 14.556759, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Sw_Ducha_dawna_elektrownia.jpg")
        );

        dodaj(
                new Monument("Pałac Joński", "https://pl.wikipedia.org/wiki/Pa%C5%82ac_Jo%C5%84ski_w_Szczecinie", 53.42583, 14.554229, "https://pl.wikipedia.org/wiki/Pa%C5%82ac_Jo%C5%84ski_w_Szczecinie#/media/File:PalacJonskiWSzczecinie.jpg")
        );

        dodaj(
                new Monument("Sąd Krajowy, ob. Sąd Okręgowy", "Jego budowę zkończono w 1935 roku; poczatkowo słuzył jako Miejska Kasa Oszczędności (Sparrkasse). Po drugiej wojnie światowej budynek stał się siedzibą Komitetu Wojewódzkiego PZPR. W czasie wydarzeń grudniowych 1970 roku pod budynkiem zebrał się 20-tysięczny tłum protestujących. Budynek został podpalony, sprzęty i portrety przywódców wyrzucone przez okna. Starcia na ulicach Szczecina trwały do godz. 22. Tego dnia w Szczecinie w zajściach zginęło 16 osób, a ponad 100 osób zostało rannych.", 53.4285438, 14.5528116, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Kaszubska_42_Sad.jpg")
        );

        dodaj(
                new Monument("Dom ogrodnika", "Drewniany domek francuski, stojący przy ulicy Storrady 2 został zbudowany w 1928 r. przy cmentarzu gminy francuskiej. Cmentarz powstał XVIII w. na prośbę Francuzów mieszkających w Szczecinie, użytkowany był do 1937 r. Zlokalizowano go między ulicami Storrady, Kapitańską, Parkową i Wawelską. Budynek nazywany jest obecnie domkiem grabarza, chociaż tak naprawdę został wybudowany dla ogrodnika cmentarnego. W 2007 r. został wpisany do rejestru zabytków. To ciekawe miejsce jest obecnie siedzibą stowarzyszenia \"Klub Storrady\", które odremontowało obiekt i organizuje w nim imprezy kulturalne.", 53.4321615, 14.5685645, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Storrady_dom_ogrodnika.jpg")
        );

        dodaj(
                new Monument("Kościół św. Jana Ewangelisty", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw._Jana_Ewangelisty_w_Szczecinie", 53.422237, 14.557649, "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw._Jana_Ewangelisty_w_Szczecinie#/media/File:1009_Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw_Jana_Ewangelisty_Szczecin.jpg")
        );

        dodaj(
                new Monument("Kamienica (z 3 oficynami)", "Najpiękniejsza secesyjna kamienica Szczecina, znajdująca się przy ul. św. Wojciecha 1, powstała w 1904 roku dla Alberta Netza, właściciela Cesarsko – Królewskiej Firmy Spedycyjnej z Berlina. Projekt kamienicy został wykonany przez Fridericha Liebergesell, architekta, który cieszył się wówczas przychylnością miejscowych przedsiębiorców i notabli. Był jednym z niewielu w mieście, który wprowadził w dekoracji fasad swoich budowli nowoczesny i mało popularny wówczas w Szczecinie styl secesji. Przy ul. św. Wojciecha zastosował połączenie dwóch nurtów secesyjnych – geometrycznego z roślinno-figuralnym, dzięki czemu na fasadzie pojawia się niezwykle bogaty repertuar wzorów. Linearne sploty łodyg, liści i kwiatów połączone zostały z wzorami geometrycznymi. Płyciny balkonowe i nadokienne zdobi płynna, falująca linia. W zwieńczeniu portalu spoczywają dwie wydłużone sylwety orłów. Ugięte skrzydła ptaków tworzą jednolitą wstęgę miękko układających się linii. Z narożników ostatniego piętra spoglądają na przechodniów zagadkowo zamyślone twarze kobiece, otoczone gęstymi puklami włosów. Na podwórko kamienicy prowadzi wąska brama, której ściany zdobi barwna glazura i sztukaterie, wśród których zwracają uwagę zatrzymane w bezruchu chrząszcze z opuszczonymi ku dołowi skrzydłami. Na parterze kamienicy, również w podwórku, znajdują się galerie i antykwariat.", 53.42631, 14.547943, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_sw_Wojciecha_1_zabytek.jpg")
        );

        dodaj(
                new Monument("Budynek podstacji energetycznej", "W 1873 r. przy Falkenwalderstraße 95 (dzisiejsza al. Wojska Polskiego 74) wybudowano wg projektu architekta Keslera, drewniany dom wraz ze stajnią położoną wewnątrz dziedzińca dla Johannesa Quistorpa.", 53.435478, 14.538017, "https://pl.wikipedia.org/wiki/Plik:Szczecin_al_Wojska_Polskiego_74_stacja_energetyczna.jpg")
        );

        dodaj(
                new Monument("Budynek Archiwum Państwowego", "https://pl.wikipedia.org/wiki/Archiwum_Pa%C5%84stwowe_w_Szczecinie", 53.430074, 14.549294, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_sw_Wojciecha_13_zabytek.jpg")
        );
        dodaj(
                new Monument("Rektorat Uniwersytetu Szczecińskiego", "Obecny budynek rektoratu Uniwersytetu Szczecińskiego, mieszczący się przy al. Papieża Jana Pawła II 22 a (niem. Kaiser-Wilhelm-Straße ) obok skrzyżowania z ul. Wielkopolską (niem. Deutsche Straße), wybudowano w latach 1886-1888[2] według projektu Richarda Rönnebecka z Nassau[3] z przeznaczeniem na budynek Gimnazjum Króla Wilhelma (niem. König-Wilhelms-Gymnasium). Budowa sfinansowana została w dużej mierze przez Johanna Quistorpa. Poprzednia siedziba szkoły poświęcona 11 października 1880 roku przy obecnej ul.Wielkopolskiej 14 szybko okazała się za ciasna. Zdecydowano wówczas o budowie na tej samej parceli dodatkowego budynku usytuowanego od strony obecnej al. Papieża Jana Pawła II. Dnia 12 kwietnia 1888 roku nastąpiło uroczyste poświęcenie gmachu i oddanie go do użytku. W 1903 roku do kompleksu istniejących gmachów doszła dodatkowo hala sportowa od strony ul. Mieczysława Niedziałkowskiego. W czasie II wojny światowej zniszczeniu uległ dach budynku, spłonęły też wnętrza.", 53.436542, 14.544734, "https://pl.wikipedia.org/wiki/Plik:Szczecin_Rektorat_Uniwersytetu_Szczecinskiego.jpg")
        );

        dodaj(
                new Monument("Rektorat Uniwersytetu Szczecińskiego", "Obecny budynek rektoratu Uniwersytetu Szczecińskiego, mieszczący się przy al. Papieża Jana Pawła II 22 a (niem. Kaiser-Wilhelm-Straße ) obok skrzyżowania z ul. Wielkopolską (niem. Deutsche Straße), wybudowano w latach 1886-1888[2] według projektu Richarda Rönnebecka z Nassau[3] z przeznaczeniem na budynek Gimnazjum Króla Wilhelma (niem. König-Wilhelms-Gymnasium). Budowa sfinansowana została w dużej mierze przez Johanna Quistorpa. Poprzednia siedziba szkoły poświęcona 11 października 1880 roku przy obecnej ul.Wielkopolskiej 14 szybko okazała się za ciasna. Zdecydowano wówczas o budowie na tej samej parceli dodatkowego budynku usytuowanego od strony obecnej al. Papieża Jana Pawła II. Dnia 12 kwietnia 1888 roku nastąpiło uroczyste poświęcenie gmachu i oddanie go do użytku. W 1903 roku do kompleksu istniejących gmachów doszła dodatkowo hala sportowa od strony ul. Mieczysława Niedziałkowskiego. W czasie II wojny światowej zniszczeniu uległ dach budynku, spłonęły też wnętrza.", 53.436542, 14.544734, "https://pl.wikipedia.org/wiki/Plik:Szczecin_Rektorat_Uniwersytetu_Szczecinskiego.jpg")
        );

        dodaj(
                new Monument("Pałac Pod Globusem", "https://pl.wikipedia.org/wiki/Pa%C5%82ac_Pod_Globusem_w_Szczecinie", 53.426098, 14.554294, "https://pl.wikipedia.org/wiki/Plik:Pa%C5%82ac_pod_Globusem_w_Szczecinie.JPG")
        );

        dodaj(
                new Monument("Kościół św. Kazimierza", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw._Kazimierza_w_Szczecinie", 53.453762, 14.531347, "https://pl.wikipedia.org/wiki/Plik:Szczecin_ul_Broniewskiego_Kosciol_sw_Kazimierza.jpg")
        );

        dodaj(
                new Monument("Kościół św. Józefa Oblubieńca Najświętszej Maryi Panny", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw._J%C3%B3zefa_Oblubie%C5%84ca_Naj%C5%9Bwi%C4%99tszej_Maryi_Panny_w_Szczecinie", 53.407922, 14.534945, "https://pl.wikipedia.org/wiki/Plik:Szczecin_kosciol_sw_Jozefa_(1).jpg")
        );

        dodaj(
                new Monument("Kościół Świętego Krzyża", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_%C5%9Awi%C4%99tego_Krzy%C5%BCa_w_Szczecinie", 53.43855, 14.51053, "https://pl.wikipedia.org/wiki/Plik:Szczecin_kosciol_Swietego_Krzyza_ul_Wieniawskiego.jpg")
        );

        dodaj(
                new Monument("Kamienica", "Ta eklektyczna kamienica przy ul. Piłsudskiego 7 (koło stacji benzynowej) została zbudowana w 1894 r. według projektu szczecińskiego architekta Jerzego Sommenstuhla. Od lat 20. XX w. funkcjonowała w niej piekarnia. Wojnę budynek przetrwał nienaruszony. Pierwszy powojenny remont rozpoczął się na początku lat 70. W czasie tego remontu na strychu wybuchł pożar dlatego nie zachował się oryginalny szczyt budynku. W roku 2006 mieszkańcy kamienicy przeprowadzili jej kapitalny remont.", 53.432553, 14.551246, "http://bi.gazeta.pl/im/6/11070/z11070876Q,Fragment-zabytkowej-kamienicy.jpg")
        );

        dodaj(
                new Monument("Budynek Zakładu dla Głuchoniemych", "Na ul. Siemiradzkiego 2 w Szczecinie stoi neogotycki budynek wzniesiony w 1904 r., dawna siedziba zakładu dla głuchoniemych. Fundatorem był Martin Quistorp. Obecnie mieści się tu Gimnazjum nr 10, wcześniej od 1955 r. była tam Szkoła Podstawowa nr 32, która po reformie w 1999 r. została zastąpiona gimnazjum.", 53.448366, 14.513538, "http://www.polskaniezwykla.pl/pictures/original/276723.jpg")
        );

        dodaj(
                new Monument("Kościół Matki Bożej Różańcowej", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_Matki_Bo%C5%BCej_R%C3%B3%C5%BCa%C5%84cowej_w_Szczecinie", 53.411159, 14.495236, "https://pl.wikipedia.org/wiki/Plik:Szczecin_kosciol_MB_Rozancowej_ul_Lwowska.jpg")
        );

        dodaj(
                new Monument("Kościół Niepokalanego Serca Najświętszej Marii Panny", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_Niepokalanego_Serca_Naj%C5%9Bwi%C4%99tszej_Marii_Panny_w_Szczecinie", 53.493723, 14.603443, "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_Niepokalanego_Serca_Naj%C5%9Bwi%C4%99tszej_Marii_Panny_w_Szczecinie#/media/File:Szczecin_ul_Nehringa_kosciol_a.jpg")
        );

        dodaj(
                new Monument("Willa Lentza", "https://pl.wikipedia.org/wiki/Willa_Lentza", 53.435495, 14.546417, "https://pl.wikipedia.org/wiki/Willa_Lentza#/media/File:Szczecin_al_Wojska_Polskiego_84_Willa_Lentza.jpg")
        );
        //Kinga K.
        dodaj(
                new Monument("Kościół par., ob. archikatedra p.w. św. Jakuba", "https://pl.wikipedia.org/wiki/Bazylika_archikatedralna_%C5%9Bw._Jakuba_w_Szczecinie", 53.42508, 14.55672, "https://upload.wikimedia.org/wikipedia/commons/1/1c/Szczecin_katedra_sw_Jakuba_%282%29.jpg")
        );

        dodaj(
                new Monument("Kościół par. p.w. św. Jana Chrzciciela", "https://pl.wikipedia.org/wiki/Bazylika_%C5%9Bw._Jana_Chrzciciela_w_Szczecinie", 53.427149, 14.548767, "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Szczecin_kosciol_Jana_Chrzciciela_2.jpg/800px-Szczecin_kosciol_Jana_Chrzciciela_2.jpg")
        );

        dodaj(
                new Monument("Kościół rzym.-kat. ob. pol.-kat. p.w. śś. Piotra i Pawła", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw._Piotra_i_%C5%9Bw._Paw%C5%82a_w_Szczecinie", 53.427818, 14.559791, "https://upload.wikimedia.org/wikipedia/commons/8/8c/KosciolSwPiotraIPawla_w_Szczecinie.jpg")
        );

        dodaj(
                new Monument("Kościół ewangelicki (tzw. kościół pokoju), ob.rzym.-kat. p.w. św. Stanisława Kostki", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw._Stanis%C5%82awa_Kostki_w_Szczecinie", 53.438485, 14.566617, "https://upload.wikimedia.org/wikipedia/commons/1/1f/Szczecin_Kosciol_Sw_Stanislawa_Kostki.jpg")
        );

        dodaj(
                new Monument("Plac Jasne Błonia im. Jana Pawła II (niem. Quinstorp-Aue)", "https://pl.wikipedia.org/wiki/Jasne_B%C5%82onia", 53.4285438, 14.5528116, "https://upload.wikimedia.org/wikipedia/commons/6/6b/0907_Szczecin_Jane_B%C5%82onia_SZN.jpg")
        );

        dodaj(
                new Monument("Kasyno oficerskie, ob. szkoła", "http://encyklopedia.szczecin.pl/wiki/Kasyno_wojskowe", 53.423071, 14.549747, "http://fotopolska.eu/foto/216/216718.jpg")
        );

        dodaj(
                new Monument("Elektrownia miejska", "Elektrownia miejska ob. biurowiec", 53.432067, 14.568865, "https://www.e-biurowce.pl/cache/b/b/3/8/7/bb38718cc30024e44807c30f3779e5126d9ddf39.jpeg")
        );

        dodaj(
                new Monument("Muzeum Miejskie, ob. Muzeum Narodowe i Teatr Wspólczesny", "https://pl.wikipedia.org/wiki/Teatr_Wsp%C3%B3%C5%82czesny_w_Szczecinie", 53.430125, 14.564666, "https://upload.wikimedia.org/wikipedia/commons/4/4a/PolandSzczecinSeaMuseum.JPG")
        );

        dodaj(
                new Monument("Rejencja Szczecińska, ob. Urząd Wojewódzki", "https://pl.wikipedia.org/wiki/Budynek_Urz%C4%99du_Wojew%C3%B3dzkiego_w_Szczecinie", 53.431198, 14.566181, "https://upload.wikimedia.org/wikipedia/commons/0/05/Urz%C4%85d_Wojew%C3%B3dzki_Szczecin.jpg")
        );

        dodaj(
                new Monument("Kino Kosmos", "Kino Kosmos", 53.427044, 14.544917, "http://bi.gazeta.pl/im/9a/a0/be/z12492954Q,Kino-Kosmos-w-Szczecinie.jpg")
        );

        dodaj(
                new Monument("Willa, ob. Szczecińska Agencja Artystyczna", "Willa, ob. Szczecińska Agencja Artystyczna", 53.43352, 14.539372, "http://www.dioblina.eu/files/dioblina/styles/fullscreen/public/ugl/0/0/1/willa-ob-szczecinska-agencja-artystyczna-102090.jpg")
        );

        dodaj(
                new Monument("Plebania kościoła p.w. św. Jakuba", "http://encyklopedia.szczecin.pl/wiki/Willa_przy_alei_Wojska_Polskiego_113", 53.44085, 14.53224, "http://encyklopedia.szczecin.pl/images/0/05/WKZ_Wojska_Polskiego_113_2.JPG")
        );

        dodaj(
                new Monument("Pałac, ob. Klub 13 Muz", "https://pl.wikipedia.org/wiki/Dom_Kultury_13_Muz", 53.428186, 14.55416, "https://upload.wikimedia.org/wikipedia/commons/8/89/13_Muz.1.JPG")
        );

        dodaj(
                new Monument("Wieża widokowa (d. wieża Bismarcka)", "https://pl.wikipedia.org/wiki/Wie%C5%BCa_Goc%C5%82awska", 53.4285438, 14.5528116, "https://upload.wikimedia.org/wikipedia/commons/3/34/Bismarckturm-Stettin-2013.JPG")
        );

        dodaj(
                new Monument("Kościół ewangelicki, ob. rzym.-kat. par. p.w. Św. Ducha", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw._Jana_Ewangelisty_w_Szczecinie", 53.380284, 14.633902,  "https://upload.wikimedia.org/wikipedia/commons/f/f3/1009_Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw_Jana_Ewangelisty_Szczecin.jpg")
        );

        dodaj(
                new Monument("Zespół kościoła ewangelickiego p.w.Krzyża Świętego, ob. rzym.-kat. par. p.w. Św. Rodziny", "https://pl.wikipedia.org/wiki/Ko%C5%9Bci%C3%B3%C5%82_%C5%9Bw._Rodziny_w_Szczecinie", 53.439463, 14.536257, "https://upload.wikimedia.org/wikipedia/commons/8/8e/Szczecin_Kosciol_sw._Rodziny_1.jpg")
        );

        dodaj(
                new Monument("Plac Tobrucki, d. Plac Ratuszowy (Marktplatz)", "http://encyklopedia.szczecin.pl/wiki/Plac_Ratuszowy", 53.4214986, 14.5533364, "https://media-cdn.tripadvisor.com/media/photo-s/08/1c/20/8a/plac-tobrucki.jpg")
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
