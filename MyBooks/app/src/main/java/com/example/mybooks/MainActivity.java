package com.example.mybooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.example.mybooks.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<LandMark> landMarkArrayList;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landMarkArrayList = new ArrayList<>();




        LandMark annakareina = new LandMark("Anna Kareina",
                "Anna Karenina eseri Lev Nikolayeviç Tolstoy’un en önemli romanı olarak kabul gören , okuyanların içini acıtan bir hikayedir.Dünya klasikleri arasında yer alan eser , 19. yüzyılda Rusya ‘da yaşanmaktadır",
                R.drawable.annakareina);
        LandMark metro = new LandMark("Metro",
                "2013 yılında dünyada bir nükleer savaş patlak verdi. Uluslararası süpergüçler ellerindeki her şeyi birbirlerine fırlatırken, şehirler ve bu şehirlerde bulunan insanlar harap oldu. İnsan ırkının büyük çoğunluğu yok olurken, hayatta kalanlar ise Moskova’nın yeraltında bulunan Metro sistemine sığınan insanlar oldu.\n",
                R.drawable.metro);
        LandMark santrac = new LandMark("Santraç",
                "Satranç, Stefan Zweig'ın bir nevi dünyaya vedası niteliğindedir. Ölmeden önce yazdığı son eser olan Satranç, farklı bir dünyanın kapılarını aralıyor bizlere.\n",
                R.drawable.santrac);
        LandMark tehlikelioyunlar = new LandMark("Tehlikeli Oyunlar",
                "Kişinin kendiyle savaşmasını ve yenmesini, kendini dönüştürmesini hayati bir sorun olarak algılamaya çağıran, çarpıcı ve sarsıcı bir roman. Romanın baş kişisi Hikmet Benol, toplumdaki yoğun kargaşanın temelinde yatan gerçekliği araştırırken",
                R.drawable.tehlikelioyunlar);
        LandMark tutunamayanlar = new LandMark("Tutunamayanlar",
                "Tutunamayanlar, Oğuz Atay‘ın ilk romanıdır. Eserin ilk yayım yılı 1971’de iki cilt olarak, 1984’te ise tek cilt olarak yayımlanmıştır.\n" +
                        "\n" +
                        "Çoğu yazar ve okuyucuya göre Modern Türk Edebiyatı’nın en önemli eserlerinden biridir.",
                R.drawable.tutunamayanlar);
        LandMark zambaklarulkesinde = new LandMark("Zambaklar Ülkesinde",
                "Beyaz Zambaklar Ülkesinde, Mustafa Kemal Atatürk zamanında Türkçeye ilk kez çevrildi. Atatürk, kitabı okuduğunda bu destansı başarıya tek kelimeyle hayran olmuştu.",
                R.drawable.zambaklarulkesinde);
        LandMark beyazdis = new LandMark("Beyaz Diş",
                "Jack London‘ın Beyaz Diş romanı, ilk kez 1906 yılında tefrika (bölümler) halinde bir dergide yayınlanmıştır.\n" +
                        "\n" +
                        "Romandaki olaylar Amerika, Kanada ve Rusya’da geçmektedir.",
                R.drawable.beyazdis);
        LandMark farelerveinsanlar = new LandMark("Fareler ve İnsanlar",
                "Fareler ve İnsanlar, (İngilizce: Of Mice and Men), Nobel Edebiyat Ödülü sahibi yazar John Steinbeck tarafından yazılmış bir novella (uzun hikâye)dır. İlk defa 1937 yılında yayınlanan eser, iki gezgin çiftlik işçisi olan George Milton ve Lennie Small’un Büyük Bunalım sırasında Kaliforniya’da yaşadıkları trajik olayları anlatır.",
                R.drawable.farelerveinsanlar);
        LandMark ikisehrinhikayesi = new LandMark("İki Şehrin Hikayesi",
                "Charles Dickens‘in en popüler romanlarından biridir. Tarihî bir roman özelliği taşır. İlk defa 1859 yılında gazetelerde bölümler halinde yayımlanmıştır. İki Şehrin Hikâyesi, dünya klasikleri arasına girmiş realist ve sürükleyici bir romandır."
                        ,
                R.drawable.ikisehrinhikayesi);
        LandMark karamazovbrothers = new LandMark("Karamazov Kardeşler",
                "Karamazov Kardeşler’deki baba tipinin, gerçek hayattaki Dostoyevski’nin babası olduğu tahmin edilmektedir. Çünkü Dostoyevski’nin babasıyla özellikleri ve davranışları uymaktadır.",
                R.drawable.karamazovbrothers);
        LandMark kurkmantolumadonna = new LandMark("Kürk Mantolu Madonna",
                "Raif Efendi, 20'li yaşlarında babasının isteği üzerine gittiği Berlin'de, sanata olan ilgisi sayesinde bir sanat galerisine gider. Galerideki tablolar arasında bir sanatçının otoportresini görür ve tablodaki kadını hiç tanımamasına rağmen platonik olarak ona âşık olur.",
                R.drawable.kurkmantolumadonna);
        LandMark lesmiserables = new LandMark("Sefiller",
                "Jan Valjean: Romanın başkahramanı. Önce çalışkan bir köylüyken hırsızlıktan hapishaneye düşer, mahkumluktan sonra, ticaretle uğraşır, belediye başkanı olur, bahçıvanlık yapar. Kötülüklerden arınır, topluma yararlı bir insan olur.\n" +
                        "\n",
                R.drawable.lesmiserables);
        LandMark lordoftherings = new LandMark("Yüzüklerin Efendisi",
                "Bilbo, Shire’li bir hobbittir. Gollum’dan Ali yüzüğü saflıkla almıştır. Bu yüzüğü takan kişi görünmez olur ve bazı güçler elde etmiş olur.",
                R.drawable.lordoftherings);
        LandMark dokuzuncuhariciye = new LandMark("Dokuzuncu Hariciye Koğuşu",
                "Peyami Safa’nın yazdığı eser, psikolojik roman türündeki önemli yapıtlardan biridir. Betimlemeler çok canlıdır. Yalın ve yoğun bir anlatımı vardır. Yazarın kendi yaşamıyla da ilgili otobiyografik bir roman olan bu eser anı tarzında yazılmıştır.",
                R.drawable.dokuzuncuhariciye);
        LandMark memlekethikayeleri = new LandMark("Memleket Hikayeleri",
                "Memleket Hikayeleri, Refik Halit Karay‘ın 1919 yılında yayınlanan hikâye kitabıdır. Yazar tarafından yapılan ekleme ve değişikliklerle kitap 18 hikâye ile 1947 yılında tekrar yayınlanmıştır.\n" +
                        "\n",
                R.drawable.memlekethikayeleri);


        landMarkArrayList.add(annakareina);
        landMarkArrayList.add(metro);
        landMarkArrayList.add(santrac);
        landMarkArrayList.add(tehlikelioyunlar);
        landMarkArrayList.add(tutunamayanlar);
        landMarkArrayList.add(zambaklarulkesinde);
        landMarkArrayList.add(beyazdis);
        landMarkArrayList.add(farelerveinsanlar);
        landMarkArrayList.add(ikisehrinhikayesi);
        landMarkArrayList.add(karamazovbrothers);
        landMarkArrayList.add(kurkmantolumadonna);
        landMarkArrayList.add(lesmiserables);
        landMarkArrayList.add(lordoftherings);
        landMarkArrayList.add(dokuzuncuhariciye);
        landMarkArrayList.add(memlekethikayeleri);




        ArrayAdapter arrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                landMarkArrayList.stream().map(landMark -> landMark.name).collect(Collectors.toList())
        );
        binding.listview.setAdapter(arrayAdapter);

        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("landmark",landMarkArrayList.get(position));
                startActivity(intent);
            }
        });


    }
}