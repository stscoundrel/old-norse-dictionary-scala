package io.github.stscoundrel.oldnorse

import org.junit.Test
import org.junit.Assert._

class DictionaryTest {
  @Test
  def testDefaultDictionaryHasExpectedAmountOfEntries(): Unit = {
    val dictionary = new Dictionary()
    val result = dictionary.getDictionary()

    assertEquals(35207, result.length)
  }

  @Test
  def testMarkupDictionaryHasExpectedAmountOfEntries(): Unit = {
    val dictionary = new Dictionary()
    val result = dictionary.getMarkupDictionary()

    assertEquals(35207, result.length)
  }

  @Test
  def testDictionaryHeadwordsMatch(): Unit = {
    val dictionary = new Dictionary()
    val noMarkupResult = dictionary.getDictionary()
    val markupResult = dictionary.getMarkupDictionary()

    (0 until 35207).foreach { i =>
      assertEquals(noMarkupResult(i).headword, markupResult(i).headword)
    }
  }

  @Test
  def testDefaultDictionaryHasExpectedContent(): Unit = {
    val dictionary = new Dictionary()
    val result = dictionary.getDictionary()

    assertEquals("A", result(0).headword);
    assertEquals(
        "or -AT or -T, a negative suffix to verbs, peculiar to Iceland and a part, at least, of Norway. Occurs frequently in old Icelandic poetry and laws, so as almost to form a complete negative voice. In the 1st pers. a personal pronoun k (g) = ek is inserted before the negative suffix, in the 2nd pers. a t or tt. As a rule the pron. as thus repeated; má-k-at-ek, non possum; sé-k-at-ek, non video; hef-k-at-ek, non habeo; skal-k-at-ek; vil-k-at-ek, nolo; mon-k-at-ek, non ero, etc.: 2nd pers. skal-t-at-tu; mon-t-at-tu; gaf-t-at-tu, non dabas: and after a long vowel a tt, mátt-at-tu, sátt-at-tu; so almost invariably in all monosyllabic verbal forms; but not so in bisyllabic ones, máttir-a-þú, non poteras: yet in some instances in the 1st pers. a pronominal g is inserted, e. g. bjargi-g-a-k, verbally servem ego non ego; höggvi-g-a-k, non cædam; stöðvi-g-a-k, quin sistam; vildi-g-a-k, nolui; hafði-g-a-k, non babui; mátti-g-a-k, non potui; görði-g-a-k, non feci: if the verb has gg as final radical consonants, they change into kk, e. g. þikk-at-ek = þigg-k-at-ek, nolo accipere. In the 3rd pers. a and at or t are used indifferently, t being particularly suffixed to bisyllabic verbal flexions ending in a vowel, in order to avoid an hiatus,—skal-at or skal-a, non erit; but skolo-t, non sunto: forms with an hiatus, however, occur,—bíti-a, non mordat; renni-a, ne currat; skríði-a, id.; leti-a, ne retardet; væri-a, ne esset; urðu-a, non erant; but bíti-t, renni-t, skríði-t, urðu-t are more current forms: v. Lex. Poët. The negative suffix is almost peculiar to indic., conj., and imperat. moods; the neg. infin. hardly occurs. Nothing analogous to this form is to be found in any South-Teutonic idiom; neither do there remain any traces of its having been used in Sweden or Denmark. A single exception is the Runic verse on a stone monument in Öland, an old Danish province, now Swedish, where however the inscriptions may proceed from a Norse or Icel. hand. The Runic inscriptions run thus, sa’r aigi flo, who did not fly, old Icel. ‘flo-at,’ Baut. 1169. Neither does it occur in any Norse prose monuments (laws): but its use may yet be inferred from its occurrence in Norse poets of the 10th century, e. g. the poets Eyvind and Thiodolf; some of which instances, however, may be due to their being transmitted through Icel. oral tradition. In Bragi Gamli (9th century) it occurs twice or thrice; in the Haustlöng four times, in Ynglingatal four times, in Hákonarmál once (all Norse poems of the 10th century). In Icel. the suffixed negation was in full force through the whole of the 10th century. A slight difference in idioms, however, may be observed: Völuspá, e. g., prefers the negation by né (using vas-at only once, verse 3). In the old Hávamal the suffix abounds (being used thirty-five times), see the verses 6, 10, 11, 18, 26, 29, 30, 34, 37–39, 49, 51, 52, 68, 74, 88, 113–115, 126–128, 130, 134, 136, 147, 149, 151, 153, 159. In Skírnismál, Harbarðsljóð, Lokasenna—all these poems probably composed by the same author, and not before the 10th century—about thirty times, viz. Hbl. 3, 4, 8, 14, 26, 35, 56; Skm. 5, 18, 22; Ls. 15, 16, 18, 25, 28, 30, 36, 42, 47, 49, 56, 60, 62. Egil (born circa 900, died circa 990) abounds in the use of the suffixed neg. (he most commonly avails himself of -at, -gi, or né): so, too, does Hallfred (born circa 968, died 1008), Einar Skálaglam in Vellekla (circa 940–995), and Thorarin in the Máhlíðingavísur (composed in the year 981); and in the few epigrams relating to the introduction of Christianity in Icel. (995–1000) there occur mon-k-að-ek, tek-k-at-ek, vil-k-at-ek, hlífði-t, mon-a, es-a; cp. the Kristni S. and Njala. From this time, however, its use becomes more rare. Sighvat (born circa 995, died 1040) still makes a frequent but not exclusive use of it. Subsequent poets use it now and then as an epic form, until it disappeared almost entirely in poetry at the middle or end of the 13th century. In the Sólarljóð there is not a single instance. The verses of some of our Sagas are probably later than the Sagas themselves; the greatest part of the Völsungakviður are scarcely older than the 11th century. In all these -at and conj. eigi are used indifferently. In prose the laws continued to employ the old forms long after they were abolished in common prose. The suffixed verbal negation was used,",
        result(0).definitions(0)
    );
    assertEquals("α. in the delivering of the oath in the Icel. Courts, esp. the Fifth Court, instituted about the year 1004; and it seems to have been used through the whole of the Icel. Commonwealth (till the year 1272). The oath of the Fifth (High) Court, as preserved in the Grágás, runs in the 1st pers., hefka ek fé borit í dóm þenna til liðs mér um sök þessa, ok ek monka bjóða, hefka ek fundit, ok monka ek finna, hvárki til laga né ólaga, p. 79; and again p. 81, only different as to ek hefka, ek monka (new Ed.): 3rd pers., hefirat hann fé; borit í dóm þenna ok monat hann bjóða, ok hefirat hann fundit, ok monat hann tinna, 80, 81; cp. also 82, and Nj. l. c. ch. 145, where it is interesting to observe that the author confounds the ist and 3rd persons, a sign of decay in grammatical form.",
        result(0).definitions(1)
    );
    assertEquals("β. the Speaker (lögsögumaðr), in publicly reciting and explaining the law, and speaking in the name of the law, from the Hill of Laws (lögberg), frequently employed the old form, esp. in the legal words of command es and skal (yet seldom in plur.): erat in the dictatorial phrases, erat skyldr (skylt), non esto obligatus; erat landeigandi skyldr, Grág. (Kb.) i. 17; erat hinn skyldr, 21; yngri maðr era skyldr at fasta, 35; enda erat honum þá skylt at …, 48; erat þat sakar spell, 127; era hinn þá skyldr at lýsa, 154; erat hann framar skyldr sakráða, 216; ok erat hann skyldr at ábyrgjask þat fé, 238; ok erat hann skyldr, id.; ok erat sakar aðili ella skyldr, ii. 74; erat hinn skyldr við at taka, 142; erat manni skylt at taka búfé, 143; enda erat heimting til fjár þess, 169; era hann þá skyldr at taka við í öðru fé nema hann vili, 209; ok erat þeim skylt at tíunda fé sitt, 211; ok erat hann skyldr at gjalda tíund af því, 212; erat kirkjudrottinn þá skyldr, 228; ef hann erat landeigandi, i. 136. Skalat: skalat maðr eiga fó óborit, i. 23; skalat homum þat verða optar en um siun, 55; skalat maðr ryðja við sjálfan sik, 62; skalat hann þat svá dvelja, 68; skalat hann til véfangs ganga, 71; skalat aðilja í stefnuvætti hafa, 127; ok skala hann gjalda fyrir þat, 135; ok skalat hann með sök fara, 171; enda skalat hann fleirum baugum bœta, 199; skalat hann skilja félagit, 240; skalat hann meiri skuld eiga en, ii. 4; skalat þeim meðan á brott skipta, 5; skalat hann lögvillr verða, svá, 34; skalat hon at heldr varðveita þat fé, 59; í skalat enn sami maðr þar lengr vera, 71; ok skala honum bæta þat, 79; skalat fyl telja, 89; skalat hann banna fiskför, 123; skalat hann lóga fé því á engi veg, 158; skalat drepa þá menn, 167; skalat svá skipta manneldi, 173; skalat maðr reiðast við fjórðungi vísu, 183. Plur.: skolut menn andvitni bera ok hér á þingi, i. 68; skolut mál hans standast, 71; skolut þeir færi til vefangs ganga en, 75, etc. etc. Other instances are rare: tekrat þar fé er eigi er til (a proverb), i. 9; ok um telrat þat til sakbóta, ok of telrat þá til sakbóta (it does not count), 178; ef hann villat (will not) lýsa sár sitt, 51; ok ræðrat hann öðrum mönnum á hendr þann úmaga, 248; ræðrat sá sínum ómögum á hendr, ii. 18; verðrat honum at sakarspelli and verðrat honum þat at s., i. 63; verðrat honum þat at sakarvörn, 149; kömrat hann öðru við, ii. 141; þarfat hann bíða til þess, i. 70; ok skilrat hann frá aðra aura, ii. 141, i. 136. Reflexive form: kömskat hann til heimtingar um þat fé, he loses the claim to the money, ii. 180, etc. All these instances are taken from the Kb. (Ed. 1853). Remarkable is also the ambiguity in the oath of Glum (see Sir Edm. Head, Viga-Glum, pp. 102, 103, note, I. c.), who, instead of the plain common formal oath—vask-at-ek þar, vák-at-ek þar, rauðk-at-ek þar odd ok egg—said, vask at þar, vák at þar, rauðk at þar. He inverted the sense by dropping the intermediate pronominal ek between the verb and þar, and pronouncing ‒ ‒́ instead of ‒́ ⏑. It further occurs in some few proverbs: varat af vöru, sleikði um þvöru, Fs. 159; veldrat sá er varir, Nj. 61 (now commonly ekki veldr sá er v., so in Grett.); erat héra at borgnara þótt hœna beri skjöld, Fms. vii. 116; era hlums vant kvað refr, dró hörpu á ísi, 19: also in some phrases, referred to as verba ipsissima from the heathen age—erat vinum líft Ingimundar, Fs. 39; erat sjá draumr minni, Ld. 128. Thorodd employs it twice or thrice: því at ek sékk-a þess meiri þörf, because í do not see any more reason for this, Skálda 167; kannka ek til þess meiri ráð en lítil, I do not know, id.; mona (will not) mín móna (my mammy) við mik göra verst hjóna, 163. In sacred translations of the 12th century it occurs now and then. In the Homilies and Dialogues of Gregory the Great: monatþu í því flóði verða, thou shalt not; esa þat undarligt þótt, it is not to be wondered at; hann máttia sofna, he could not sleep; moncaþ ek banna, I shall not mind, Greg. 51, 53; vasal kall heyrt á strætum, was not, Post. 645. 84; nú mona fríðir menn hér koma, Niðrst. 623. 7. In later writers as an archaism; a few times in the Al. (MS. A. M. 519), 3, 5, 6, 44, 108; and about as many times in the MS. Eirspennill (A. M. 47, fol.) [Etymon uncertain; that at is the right form may be inferred from the assimilation in at-tu, and the anastrophe in t, though the reason for the frequent dropping of the t is still unexplained. The coincidence with the Scottish dinna, canna is quite accidental.]",
        result(0).definitions(2)
    );


    assertEquals("af-kymi", result(100).headword);
    assertEquals("a, m. nook, Ísl. ii. 471 (paper MS.); kymi, id., is now freq.", result(100).definitions(0));

    assertEquals("ARINN", result(1000).headword);
    assertEquals("s, m., dat. aarni = árni, Fs. 42, Rm. 2, [a word still freq. in Denmark and in Norway; Dan. arne, arnested; Norse aarstad, Ivar Aasen: in Icel. it is very rare]", result(1000).definitions(0));

    assertEquals("gull-reyfi", result(10000).headword);
    assertEquals("n. a golden fleece, Hb. 732. 17.", result(10000).definitions(0));

    assertEquals("ÖND", result(35000).headword);
    assertEquals("1. f., gen. andar, pl. endr and andir, and so in mod. usage; [A. S. ened; Dutch eend; O. H. G. anut; Germ. ente; Dan. and, pl. ænder; Lat. anas, anatis; Gr. νηττα]:—a duck, Edda (Gl.); flaug mikill fjöldi anda (gen. pl.) … eina öndina, Art. 38; endr ok elptr, Karl. 477; vali, álptir, gæss ok andir, Grág. ii. 346, passim; brim-önd, töpp-önd.", result(35000).definitions(0));
  }
}