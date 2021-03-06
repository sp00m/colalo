package com.github.sp00m.colalo;

import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static java.util.Arrays.stream;
import static java.util.Collections.unmodifiableMap;
import static java.util.Collections.unmodifiableSet;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

// https://www.wikiwand.com/en/ISO_639
// https://www.wikiwand.com/en/List_of_ISO_639-1_codes
public enum Language {

    ABKHAZIAN("Abkhazian", Family.NORTHWEST_CAUCASIAN, Alpha2.AB, Alpha3T.ABK, Alpha3B.ABK),
    AFAR("Afar", Family.AFRO_ASIATIC, Alpha2.AA, Alpha3T.AAR, Alpha3B.AAR),
    AFRIKAANS("Afrikaans", Family.INDO_EUROPEAN, Alpha2.AF, Alpha3T.AFR, Alpha3B.AFR),
    AKAN("Akan", Family.NIGER_CONGO, Alpha2.AK, Alpha3T.AKA, Alpha3B.AKA),
    ALBANIAN("Albanian", Family.INDO_EUROPEAN, Alpha2.SQ, Alpha3T.SQI, Alpha3B.ALB),
    AMHARIC("Amharic", Family.AFRO_ASIATIC, Alpha2.AM, Alpha3T.AMH, Alpha3B.AMH),
    ARABIC("Arabic", Family.AFRO_ASIATIC, Alpha2.AR, Alpha3T.ARA, Alpha3B.ARA),
    ARAGONESE("Aragonese", Family.INDO_EUROPEAN, Alpha2.AN, Alpha3T.ARG, Alpha3B.ARG),
    ARMENIAN("Armenian", Family.INDO_EUROPEAN, Alpha2.HY, Alpha3T.HYE, Alpha3B.ARM),
    ASSAMESE("Assamese", Family.INDO_EUROPEAN, Alpha2.AS, Alpha3T.ASM, Alpha3B.ASM),
    AVARIC("Avaric", Family.NORTHEAST_CAUCASIAN, Alpha2.AV, Alpha3T.AVA, Alpha3B.AVA),
    AVESTAN("Avestan", Family.INDO_EUROPEAN, Alpha2.AE, Alpha3T.AVE, Alpha3B.AVE),
    AYMARA("Aymara", Family.AYMARAN, Alpha2.AY, Alpha3T.AYM, Alpha3B.AYM),
    AZERBAIJANI("Azerbaijani", Family.TURKIC, Alpha2.AZ, Alpha3T.AZE, Alpha3B.AZE),
    BAMBARA("Bambara", Family.NIGER_CONGO, Alpha2.BM, Alpha3T.BAM, Alpha3B.BAM),
    BASHKIR("Bashkir", Family.TURKIC, Alpha2.BA, Alpha3T.BAK, Alpha3B.BAK),
    BASQUE("Basque", Family.LANGUAGE_ISOLATE, Alpha2.EU, Alpha3T.EUS, Alpha3B.BAQ),
    BELARUSIAN("Belarusian", Family.INDO_EUROPEAN, Alpha2.BE, Alpha3T.BEL, Alpha3B.BEL),
    BENGALI("Bengali", Family.INDO_EUROPEAN, Alpha2.BN, Alpha3T.BEN, Alpha3B.BEN),
    BIHARI_LANGUAGES("Bihari languages", Family.INDO_EUROPEAN, Alpha2.BH, Alpha3T.BIH, Alpha3B.BIH),
    BISLAMA("Bislama", Family.CREOLE, Alpha2.BI, Alpha3T.BIS, Alpha3B.BIS),
    BOSNIAN("Bosnian", Family.INDO_EUROPEAN, Alpha2.BS, Alpha3T.BOS, Alpha3B.BOS),
    BRETON("Breton", Family.INDO_EUROPEAN, Alpha2.BR, Alpha3T.BRE, Alpha3B.BRE),
    BULGARIAN("Bulgarian", Family.INDO_EUROPEAN, Alpha2.BG, Alpha3T.BUL, Alpha3B.BUL),
    BURMESE("Burmese", Family.SINO_TIBETAN, Alpha2.MY, Alpha3T.MYA, Alpha3B.BUR),
    CASTILIAN("Castilian", Family.INDO_EUROPEAN, Alpha2.ES, Alpha3T.SPA, Alpha3B.SPA),
    CATALAN("Catalan", Family.INDO_EUROPEAN, Alpha2.CA, Alpha3T.CAT, Alpha3B.CAT),
    CENTRAL_KHMER("Central Khmer", Family.AUSTROASIATIC, Alpha2.KM, Alpha3T.KHM, Alpha3B.KHM),
    CHAMORRO("Chamorro", Family.AUSTRONESIAN, Alpha2.CH, Alpha3T.CHA, Alpha3B.CHA),
    CHECHEN("Chechen", Family.NORTHEAST_CAUCASIAN, Alpha2.CE, Alpha3T.CHE, Alpha3B.CHE),
    CHEWA("Chewa", Family.NIGER_CONGO, Alpha2.NY, Alpha3T.NYA, Alpha3B.NYA),
    CHICHEWA("Chichewa", Family.NIGER_CONGO, Alpha2.NY, Alpha3T.NYA, Alpha3B.NYA),
    CHINESE("Chinese", Family.SINO_TIBETAN, Alpha2.ZH, Alpha3T.ZHO, Alpha3B.CHI),
    CHUANG("Chuang", Family.TAI_KADAI, Alpha2.ZA, Alpha3T.ZHA, Alpha3B.ZHA),
    CHURCH_SLAVIC("Church Slavic", Family.INDO_EUROPEAN, Alpha2.CU, Alpha3T.CHU, Alpha3B.CHU),
    CHURCH_SLAVONIC("Church Slavonic", Family.INDO_EUROPEAN, Alpha2.CU, Alpha3T.CHU, Alpha3B.CHU),
    CHUVASH("Chuvash", Family.TURKIC, Alpha2.CV, Alpha3T.CHV, Alpha3B.CHV),
    CORNISH("Cornish", Family.INDO_EUROPEAN, Alpha2.KW, Alpha3T.COR, Alpha3B.COR),
    CORSICAN("Corsican", Family.INDO_EUROPEAN, Alpha2.CO, Alpha3T.COS, Alpha3B.COS),
    CREE("Cree", Family.ALGONQUIAN, Alpha2.CR, Alpha3T.CRE, Alpha3B.CRE),
    CROATIAN("Croatian", Family.INDO_EUROPEAN, Alpha2.HR, Alpha3T.HRV, Alpha3B.HRV),
    CZECH("Czech", Family.INDO_EUROPEAN, Alpha2.CS, Alpha3T.CES, Alpha3B.CZE),
    DANISH("Danish", Family.INDO_EUROPEAN, Alpha2.DA, Alpha3T.DAN, Alpha3B.DAN),
    DHIVEHI("Dhivehi", Family.INDO_EUROPEAN, Alpha2.DV, Alpha3T.DIV, Alpha3B.DIV),
    DIVEHI("Divehi", Family.INDO_EUROPEAN, Alpha2.DV, Alpha3T.DIV, Alpha3B.DIV),
    DUTCH("Dutch", Family.INDO_EUROPEAN, Alpha2.NL, Alpha3T.NLD, Alpha3B.DUT),
    DZONGKHA("Dzongkha", Family.SINO_TIBETAN, Alpha2.DZ, Alpha3T.DZO, Alpha3B.DZO),
    ENGLISH("English", Family.INDO_EUROPEAN, Alpha2.EN, Alpha3T.ENG, Alpha3B.ENG),
    ESPERANTO("Esperanto", Family.CONSTRUCTED, Alpha2.EO, Alpha3T.EPO, Alpha3B.EPO),
    ESTONIAN("Estonian", Family.URALIC, Alpha2.ET, Alpha3T.EST, Alpha3B.EST),
    EWE("Ewe", Family.NIGER_CONGO, Alpha2.EE, Alpha3T.EWE, Alpha3B.EWE),
    FAROESE("Faroese", Family.INDO_EUROPEAN, Alpha2.FO, Alpha3T.FAO, Alpha3B.FAO),
    FIJIAN("Fijian", Family.AUSTRONESIAN, Alpha2.FJ, Alpha3T.FIJ, Alpha3B.FIJ),
    FINNISH("Finnish", Family.URALIC, Alpha2.FI, Alpha3T.FIN, Alpha3B.FIN),
    FLEMISH("Flemish", Family.INDO_EUROPEAN, Alpha2.NL, Alpha3T.NLD, Alpha3B.DUT),
    FRENCH("French", Family.INDO_EUROPEAN, Alpha2.FR, Alpha3T.FRA, Alpha3B.FRE),
    FULAH("Fulah", Family.NIGER_CONGO, Alpha2.FF, Alpha3T.FUL, Alpha3B.FUL),
    GAELIC("Gaelic", Family.INDO_EUROPEAN, Alpha2.GD, Alpha3T.GLA, Alpha3B.GLA),
    GALICIAN("Galician", Family.INDO_EUROPEAN, Alpha2.GL, Alpha3T.GLG, Alpha3B.GLG),
    GANDA("Ganda", Family.NIGER_CONGO, Alpha2.LG, Alpha3T.LUG, Alpha3B.LUG),
    GEORGIAN("Georgian", Family.SOUTH_CAUCASIAN, Alpha2.KA, Alpha3T.KAT, Alpha3B.GEO),
    GERMAN("German", Family.INDO_EUROPEAN, Alpha2.DE, Alpha3T.DEU, Alpha3B.GER),
    GIKUYU("Gikuyu", Family.NIGER_CONGO, Alpha2.KI, Alpha3T.KIK, Alpha3B.KIK),
    GREEK("Greek", Family.INDO_EUROPEAN, Alpha2.EL, Alpha3T.ELL, Alpha3B.GRE),
    GREENLANDIC("Greenlandic", Family.ESKIMO_ALEUT, Alpha2.KL, Alpha3T.KAL, Alpha3B.KAL),
    GUARANI("Guaraní", Family.TUPIAN, Alpha2.GN, Alpha3T.GRN, Alpha3B.GRN),
    GUJARATI("Gujarati", Family.INDO_EUROPEAN, Alpha2.GU, Alpha3T.GUJ, Alpha3B.GUJ),
    HAITIAN("Haitian", Family.CREOLE, Alpha2.HT, Alpha3T.HAT, Alpha3B.HAT),
    HAITIAN_CREOLE("Haitian Creole", Family.CREOLE, Alpha2.HT, Alpha3T.HAT, Alpha3B.HAT),
    HAUSA("Hausa", Family.AFRO_ASIATIC, Alpha2.HA, Alpha3T.HAU, Alpha3B.HAU),
    HEBREW("Hebrew", Family.AFRO_ASIATIC, Alpha2.HE, Alpha3T.HEB, Alpha3B.HEB),
    HERERO("Herero", Family.NIGER_CONGO, Alpha2.HZ, Alpha3T.HER, Alpha3B.HER),
    HINDI("Hindi", Family.INDO_EUROPEAN, Alpha2.HI, Alpha3T.HIN, Alpha3B.HIN),
    HIRI_MOTU("Hiri Motu", Family.AUSTRONESIAN, Alpha2.HO, Alpha3T.HMO, Alpha3B.HMO),
    HUNGARIAN("Hungarian", Family.URALIC, Alpha2.HU, Alpha3T.HUN, Alpha3B.HUN),
    ICELANDIC("Icelandic", Family.INDO_EUROPEAN, Alpha2.IS, Alpha3T.ISL, Alpha3B.ICE),
    IDO("Ido", Family.CONSTRUCTED, Alpha2.IO, Alpha3T.IDO, Alpha3B.IDO),
    IGBO("Igbo", Family.NIGER_CONGO, Alpha2.IG, Alpha3T.IBO, Alpha3B.IBO),
    INDONESIAN("Indonesian", Family.AUSTRONESIAN, Alpha2.ID, Alpha3T.IND, Alpha3B.IND),
    INTERLINGUA("Interlingua", Family.CONSTRUCTED, Alpha2.IA, Alpha3T.INA, Alpha3B.INA),
    INTERLINGUE("Interlingue", Family.CONSTRUCTED, Alpha2.IE, Alpha3T.ILE, Alpha3B.ILE),
    INUKTITUT("Inuktitut", Family.ESKIMO_ALEUT, Alpha2.IU, Alpha3T.IKU, Alpha3B.IKU),
    INUPIAQ("Inupiaq", Family.ESKIMO_ALEUT, Alpha2.IK, Alpha3T.IPK, Alpha3B.IPK),
    IRISH("Irish", Family.INDO_EUROPEAN, Alpha2.GA, Alpha3T.GLE, Alpha3B.GLE),
    ITALIAN("Italian", Family.INDO_EUROPEAN, Alpha2.IT, Alpha3T.ITA, Alpha3B.ITA),
    JAPANESE("Japanese", Family.JAPONIC, Alpha2.JA, Alpha3T.JPN, Alpha3B.JPN),
    JAVANESE("Javanese", Family.AUSTRONESIAN, Alpha2.JV, Alpha3T.JAV, Alpha3B.JAV),
    KALAALLISUT("Kalaallisut", Family.ESKIMO_ALEUT, Alpha2.KL, Alpha3T.KAL, Alpha3B.KAL),
    KANNADA("Kannada", Family.DRAVIDIAN, Alpha2.KN, Alpha3T.KAN, Alpha3B.KAN),
    KANURI("Kanuri", Family.NILO_SAHARAN, Alpha2.KR, Alpha3T.KAU, Alpha3B.KAU),
    KASHMIRI("Kashmiri", Family.INDO_EUROPEAN, Alpha2.KS, Alpha3T.KAS, Alpha3B.KAS),
    KAZAKH("Kazakh", Family.TURKIC, Alpha2.KK, Alpha3T.KAZ, Alpha3B.KAZ),
    KIKUYU("Kikuyu", Family.NIGER_CONGO, Alpha2.KI, Alpha3T.KIK, Alpha3B.KIK),
    KINYARWANDA("Kinyarwanda", Family.NIGER_CONGO, Alpha2.RW, Alpha3T.KIN, Alpha3B.KIN),
    KIRGHIZ("Kirghiz", Family.TURKIC, Alpha2.KY, Alpha3T.KIR, Alpha3B.KIR),
    KOMI("Komi", Family.URALIC, Alpha2.KV, Alpha3T.KOM, Alpha3B.KOM),
    KONGO("Kongo", Family.NIGER_CONGO, Alpha2.KG, Alpha3T.KON, Alpha3B.KON),
    KOREAN("Korean", Family.KOREANIC, Alpha2.KO, Alpha3T.KOR, Alpha3B.KOR),
    KUANYAMA("Kuanyama", Family.NIGER_CONGO, Alpha2.KJ, Alpha3T.KUA, Alpha3B.KUA),
    KURDISH("Kurdish", Family.INDO_EUROPEAN, Alpha2.KU, Alpha3T.KUR, Alpha3B.KUR),
    KWANYAMA("Kwanyama", Family.NIGER_CONGO, Alpha2.KJ, Alpha3T.KUA, Alpha3B.KUA),
    KYRGYZ("Kyrgyz", Family.TURKIC, Alpha2.KY, Alpha3T.KIR, Alpha3B.KIR),
    LAO("Lao", Family.TAI_KADAI, Alpha2.LO, Alpha3T.LAO, Alpha3B.LAO),
    LATIN("Latin", Family.INDO_EUROPEAN, Alpha2.LA, Alpha3T.LAT, Alpha3B.LAT),
    LATVIAN("Latvian", Family.INDO_EUROPEAN, Alpha2.LV, Alpha3T.LAV, Alpha3B.LAV),
    LETZEBURGESCH("Letzeburgesch", Family.INDO_EUROPEAN, Alpha2.LB, Alpha3T.LTZ, Alpha3B.LTZ),
    LIMBURGAN("Limburgan", Family.INDO_EUROPEAN, Alpha2.LI, Alpha3T.LIM, Alpha3B.LIM),
    LIMBURGER("Limburger", Family.INDO_EUROPEAN, Alpha2.LI, Alpha3T.LIM, Alpha3B.LIM),
    LIMBURGISH("Limburgish", Family.INDO_EUROPEAN, Alpha2.LI, Alpha3T.LIM, Alpha3B.LIM),
    LINGALA("Lingala", Family.NIGER_CONGO, Alpha2.LN, Alpha3T.LIN, Alpha3B.LIN),
    LITHUANIAN("Lithuanian", Family.INDO_EUROPEAN, Alpha2.LT, Alpha3T.LIT, Alpha3B.LIT),
    LUBA_KATANGA("Luba-Katanga", Family.NIGER_CONGO, Alpha2.LU, Alpha3T.LUB, Alpha3B.LUB),
    LUXEMBOURGISH("Luxembourgish", Family.INDO_EUROPEAN, Alpha2.LB, Alpha3T.LTZ, Alpha3B.LTZ),
    MACEDONIAN("Macedonian", Family.INDO_EUROPEAN, Alpha2.MK, Alpha3T.MKD, Alpha3B.MAC),
    MALAGASY("Malagasy", Family.AUSTRONESIAN, Alpha2.MG, Alpha3T.MLG, Alpha3B.MLG),
    MALAY("Malay", Family.AUSTRONESIAN, Alpha2.MS, Alpha3T.MSA, Alpha3B.MAY),
    MALAYALAM("Malayalam", Family.DRAVIDIAN, Alpha2.ML, Alpha3T.MAL, Alpha3B.MAL),
    MALDIVIAN("Maldivian", Family.INDO_EUROPEAN, Alpha2.DV, Alpha3T.DIV, Alpha3B.DIV),
    MALTESE("Maltese", Family.AFRO_ASIATIC, Alpha2.MT, Alpha3T.MLT, Alpha3B.MLT),
    MANX("Manx", Family.INDO_EUROPEAN, Alpha2.GV, Alpha3T.GLV, Alpha3B.GLV),
    MAORI("Maori", Family.AUSTRONESIAN, Alpha2.MI, Alpha3T.MRI, Alpha3B.MAO),
    MARATHI("Marathi", Family.INDO_EUROPEAN, Alpha2.MR, Alpha3T.MAR, Alpha3B.MAR),
    MARSHALLESE("Marshallese", Family.AUSTRONESIAN, Alpha2.MH, Alpha3T.MAH, Alpha3B.MAH),
    MOLDAVIAN("Moldavian", Family.INDO_EUROPEAN, Alpha2.RO, Alpha3T.RON, Alpha3B.RUM),
    MOLDOVAN("Moldovan", Family.INDO_EUROPEAN, Alpha2.RO, Alpha3T.RON, Alpha3B.RUM),
    MONGOLIAN("Mongolian", Family.MONGOLIC, Alpha2.MN, Alpha3T.MON, Alpha3B.MON),
    NAURU("Nauru", Family.AUSTRONESIAN, Alpha2.NA, Alpha3T.NAU, Alpha3B.NAU),
    NAVAHO("Navaho", Family.DENE_YENISEIAN, Alpha2.NV, Alpha3T.NAV, Alpha3B.NAV),
    NAVAJO("Navajo", Family.DENE_YENISEIAN, Alpha2.NV, Alpha3T.NAV, Alpha3B.NAV),
    NDONGA("Ndonga", Family.NIGER_CONGO, Alpha2.NG, Alpha3T.NDO, Alpha3B.NDO),
    NEPALI("Nepali", Family.INDO_EUROPEAN, Alpha2.NE, Alpha3T.NEP, Alpha3B.NEP),
    NORTH_NDEBELE("North Ndebele", Family.NIGER_CONGO, Alpha2.ND, Alpha3T.NDE, Alpha3B.NDE),
    NORTHERN_SAMI("Northern Sami", Family.URALIC, Alpha2.SE, Alpha3T.SME, Alpha3B.SME),
    NORWEGIAN("Norwegian", Family.INDO_EUROPEAN, Alpha2.NO, Alpha3T.NOR, Alpha3B.NOR),
    NORWEGIAN_BOKMAL("Norwegian Bokmål", Family.INDO_EUROPEAN, Alpha2.NB, Alpha3T.NOB, Alpha3B.NOB),
    NORWEGIAN_NYNORSK("Norwegian Nynorsk", Family.INDO_EUROPEAN, Alpha2.NN, Alpha3T.NNO, Alpha3B.NNO),
    NUOSU("Nuosu", Family.SINO_TIBETAN, Alpha2.II, Alpha3T.III, Alpha3B.III),
    NYANJA("Nyanja", Family.NIGER_CONGO, Alpha2.NY, Alpha3T.NYA, Alpha3B.NYA),
    OCCITAN("Occitan", Family.INDO_EUROPEAN, Alpha2.OC, Alpha3T.OCI, Alpha3B.OCI),
    OJIBWA("Ojibwa", Family.ALGONQUIAN, Alpha2.OJ, Alpha3T.OJI, Alpha3B.OJI),
    OLD_BULGARIAN("Old Bulgarian", Family.INDO_EUROPEAN, Alpha2.CU, Alpha3T.CHU, Alpha3B.CHU),
    OLD_CHURCH_SLAVONIC("Old Church Slavonic", Family.INDO_EUROPEAN, Alpha2.CU, Alpha3T.CHU, Alpha3B.CHU),
    OLD_SLAVONIC("Old Slavonic", Family.INDO_EUROPEAN, Alpha2.CU, Alpha3T.CHU, Alpha3B.CHU),
    ORIYA("Oriya", Family.INDO_EUROPEAN, Alpha2.OR, Alpha3T.ORI, Alpha3B.ORI),
    OROMO("Oromo", Family.AFRO_ASIATIC, Alpha2.OM, Alpha3T.ORM, Alpha3B.ORM),
    OSSETIAN("Ossetian", Family.INDO_EUROPEAN, Alpha2.OS, Alpha3T.OSS, Alpha3B.OSS),
    OSSETIC("Ossetic", Family.INDO_EUROPEAN, Alpha2.OS, Alpha3T.OSS, Alpha3B.OSS),
    PALI("Pali", Family.INDO_EUROPEAN, Alpha2.PI, Alpha3T.PLI, Alpha3B.PLI),
    PANJABI("Panjabi", Family.INDO_EUROPEAN, Alpha2.PA, Alpha3T.PAN, Alpha3B.PAN),
    PASHTO("Pashto", Family.INDO_EUROPEAN, Alpha2.PS, Alpha3T.PUS, Alpha3B.PUS),
    PERSIAN("Persian", Family.INDO_EUROPEAN, Alpha2.FA, Alpha3T.FAS, Alpha3B.PER),
    POLABIAN("Polabian", Family.INDO_EUROPEAN, Alpha2.POX, Alpha3T.SLA, Alpha3B.SLA),
    POLISH("Polish", Family.INDO_EUROPEAN, Alpha2.PL, Alpha3T.POL, Alpha3B.POL),
    PORTUGUESE("Portuguese", Family.INDO_EUROPEAN, Alpha2.PT, Alpha3T.POR, Alpha3B.POR),
    PUNJABI("Punjabi", Family.INDO_EUROPEAN, Alpha2.PA, Alpha3T.PAN, Alpha3B.PAN),
    PUSHTO("Pushto", Family.INDO_EUROPEAN, Alpha2.PS, Alpha3T.PUS, Alpha3B.PUS),
    QUECHUA("Quechua", Family.QUECHUAN, Alpha2.QU, Alpha3T.QUE, Alpha3B.QUE),
    ROMANIAN("Romanian", Family.INDO_EUROPEAN, Alpha2.RO, Alpha3T.RON, Alpha3B.RUM),
    ROMANSH("Romansh", Family.INDO_EUROPEAN, Alpha2.RM, Alpha3T.ROH, Alpha3B.ROH),
    RUNDI("Rundi", Family.NIGER_CONGO, Alpha2.RN, Alpha3T.RUN, Alpha3B.RUN),
    RUSSIAN("Russian", Family.INDO_EUROPEAN, Alpha2.RU, Alpha3T.RUS, Alpha3B.RUS),
    SAMOAN("Samoan", Family.AUSTRONESIAN, Alpha2.SM, Alpha3T.SMO, Alpha3B.SMO),
    SANGO("Sango", Family.CREOLE, Alpha2.SG, Alpha3T.SAG, Alpha3B.SAG),
    SANSKRIT("Sanskrit", Family.INDO_EUROPEAN, Alpha2.SA, Alpha3T.SAN, Alpha3B.SAN),
    SARDINIAN("Sardinian", Family.INDO_EUROPEAN, Alpha2.SC, Alpha3T.SRD, Alpha3B.SRD),
    SCOTTISH_GAELIC("Scottish Gaelic", Family.INDO_EUROPEAN, Alpha2.GD, Alpha3T.GLA, Alpha3B.GLA),
    SERBIAN("Serbian", Family.INDO_EUROPEAN, Alpha2.SR, Alpha3T.SRP, Alpha3B.SRP),
    SHONA("Shona", Family.NIGER_CONGO, Alpha2.SN, Alpha3T.SNA, Alpha3B.SNA),
    SICHUAN_YI("Sichuan Yi", Family.SINO_TIBETAN, Alpha2.II, Alpha3T.III, Alpha3B.III),
    SINDHI("Sindhi", Family.INDO_EUROPEAN, Alpha2.SD, Alpha3T.SND, Alpha3B.SND),
    SINHALA("Sinhala", Family.INDO_EUROPEAN, Alpha2.SI, Alpha3T.SIN, Alpha3B.SIN),
    SINHALESE("Sinhalese", Family.INDO_EUROPEAN, Alpha2.SI, Alpha3T.SIN, Alpha3B.SIN),
    SLOVAK("Slovak", Family.INDO_EUROPEAN, Alpha2.SK, Alpha3T.SLK, Alpha3B.SLO),
    SLOVENIAN("Slovenian", Family.INDO_EUROPEAN, Alpha2.SL, Alpha3T.SLV, Alpha3B.SLV),
    SOMALI("Somali", Family.AFRO_ASIATIC, Alpha2.SO, Alpha3T.SOM, Alpha3B.SOM),
    SOUTH_NDEBELE("South Ndebele", Family.NIGER_CONGO, Alpha2.NR, Alpha3T.NBL, Alpha3B.NBL),
    SOUTHERN_SOTHO("Southern Sotho", Family.NIGER_CONGO, Alpha2.ST, Alpha3T.SOT, Alpha3B.SOT),
    SPANISH("Spanish", Family.INDO_EUROPEAN, Alpha2.ES, Alpha3T.SPA, Alpha3B.SPA),
    SUNDANESE("Sundanese", Family.AUSTRONESIAN, Alpha2.SU, Alpha3T.SUN, Alpha3B.SUN),
    SWAHILI("Swahili", Family.NIGER_CONGO, Alpha2.SW, Alpha3T.SWA, Alpha3B.SWA),
    SWATI("Swati", Family.NIGER_CONGO, Alpha2.SS, Alpha3T.SSW, Alpha3B.SSW),
    SWEDISH("Swedish", Family.INDO_EUROPEAN, Alpha2.SV, Alpha3T.SWE, Alpha3B.SWE),
    TAGALOG("Tagalog", Family.AUSTRONESIAN, Alpha2.TL, Alpha3T.TGL, Alpha3B.TGL),
    TAHITIAN("Tahitian", Family.AUSTRONESIAN, Alpha2.TY, Alpha3T.TAH, Alpha3B.TAH),
    TAJIK("Tajik", Family.INDO_EUROPEAN, Alpha2.TG, Alpha3T.TGK, Alpha3B.TGK),
    TAMIL("Tamil", Family.DRAVIDIAN, Alpha2.TA, Alpha3T.TAM, Alpha3B.TAM),
    TATAR("Tatar", Family.TURKIC, Alpha2.TT, Alpha3T.TAT, Alpha3B.TAT),
    TELUGU("Telugu", Family.DRAVIDIAN, Alpha2.TE, Alpha3T.TEL, Alpha3B.TEL),
    THAI("Thai", Family.TAI_KADAI, Alpha2.TH, Alpha3T.THA, Alpha3B.THA),
    TIBETAN("Tibetan", Family.SINO_TIBETAN, Alpha2.BO, Alpha3T.BOD, Alpha3B.TIB),
    TIGRINYA("Tigrinya", Family.AFRO_ASIATIC, Alpha2.TI, Alpha3T.TIR, Alpha3B.TIR),
    TONGA("Tonga", Family.AUSTRONESIAN, Alpha2.TO, Alpha3T.TON, Alpha3B.TON),
    TSONGA("Tsonga", Family.NIGER_CONGO, Alpha2.TS, Alpha3T.TSO, Alpha3B.TSO),
    TSWANA("Tswana", Family.NIGER_CONGO, Alpha2.TN, Alpha3T.TSN, Alpha3B.TSN),
    TURKISH("Turkish", Family.TURKIC, Alpha2.TR, Alpha3T.TUR, Alpha3B.TUR),
    TURKMEN("Turkmen", Family.TURKIC, Alpha2.TK, Alpha3T.TUK, Alpha3B.TUK),
    TWI("Twi", Family.NIGER_CONGO, Alpha2.TW, Alpha3T.TWI, Alpha3B.TWI),
    UIGHUR("Uighur", Family.TURKIC, Alpha2.UG, Alpha3T.UIG, Alpha3B.UIG),
    UKRAINIAN("Ukrainian", Family.INDO_EUROPEAN, Alpha2.UK, Alpha3T.UKR, Alpha3B.UKR),
    URDU("Urdu", Family.INDO_EUROPEAN, Alpha2.UR, Alpha3T.URD, Alpha3B.URD),
    UYGHUR("Uyghur", Family.TURKIC, Alpha2.UG, Alpha3T.UIG, Alpha3B.UIG),
    UZBEK("Uzbek", Family.TURKIC, Alpha2.UZ, Alpha3T.UZB, Alpha3B.UZB),
    VALENCIAN("Valencian", Family.INDO_EUROPEAN, Alpha2.CA, Alpha3T.CAT, Alpha3B.CAT),
    VENDA("Venda", Family.NIGER_CONGO, Alpha2.VE, Alpha3T.VEN, Alpha3B.VEN),
    VIETNAMESE("Vietnamese", Family.AUSTROASIATIC, Alpha2.VI, Alpha3T.VIE, Alpha3B.VIE),
    VOLAPUK("Volapük", Family.CONSTRUCTED, Alpha2.VO, Alpha3T.VOL, Alpha3B.VOL),
    WALLOON("Walloon", Family.INDO_EUROPEAN, Alpha2.WA, Alpha3T.WLN, Alpha3B.WLN),
    WELSH("Welsh", Family.INDO_EUROPEAN, Alpha2.CY, Alpha3T.CYM, Alpha3B.WEL),
    WESTERN_FRISIAN("Western Frisian", Family.INDO_EUROPEAN, Alpha2.FY, Alpha3T.FRY, Alpha3B.FRY),
    WOLOF("Wolof", Family.NIGER_CONGO, Alpha2.WO, Alpha3T.WOL, Alpha3B.WOL),
    XHOSA("Xhosa", Family.NIGER_CONGO, Alpha2.XH, Alpha3T.XHO, Alpha3B.XHO),
    YIDDISH("Yiddish", Family.INDO_EUROPEAN, Alpha2.YI, Alpha3T.YID, Alpha3B.YID),
    YORUBA("Yoruba", Family.NIGER_CONGO, Alpha2.YO, Alpha3T.YOR, Alpha3B.YOR),
    ZHUANG("Zhuang", Family.TAI_KADAI, Alpha2.ZA, Alpha3T.ZHA, Alpha3B.ZHA),
    ZULU("Zulu", Family.NIGER_CONGO, Alpha2.ZU, Alpha3T.ZUL, Alpha3B.ZUL);

    public enum Family {

        AFRO_ASIATIC("Afro-Asiatic"),
        ALGONQUIAN("Algonquian"),
        AUSTROASIATIC("Austroasiatic"),
        AUSTRONESIAN("Austronesian"),
        AYMARAN("Aymaran"),
        CONSTRUCTED("Constructed"),
        CREOLE("Creole"),
        DENE_YENISEIAN("Dené–Yeniseian"),
        DRAVIDIAN("Dravidian"),
        ESKIMO_ALEUT("Eskimo–Aleut"),
        INDO_EUROPEAN("Indo-European"),
        JAPONIC("Japonic"),
        KOREANIC("Koreanic"),
        LANGUAGE_ISOLATE("Language isolate"),
        MONGOLIC("Mongolic"),
        NIGER_CONGO("Niger–Congo"),
        NILO_SAHARAN("Nilo-Saharan"),
        NORTHEAST_CAUCASIAN("Northeast Caucasian"),
        NORTHWEST_CAUCASIAN("Northwest Caucasian"),
        QUECHUAN("Quechuan"),
        SINO_TIBETAN("Sino-Tibetan"),
        SOUTH_CAUCASIAN("South Caucasian"),
        TAI_KADAI("Tai–Kadai"),
        TUPIAN("Tupian"),
        TURKIC("Turkic"),
        URALIC("Uralic");

        private final String name;

        Family(String name) {
            this.name = name;
        }

        public final String getName() {
            return name;
        }

        public final Set<Language> getLanguages() {
            return Language.getByFamily(this);
        }

    }

    public enum Alpha2 {

        AA,
        AB,
        AE,
        AF,
        AK,
        AM,
        AN,
        AR,
        AS,
        AV,
        AY,
        AZ,
        BA,
        BE,
        BG,
        BH,
        BI,
        BM,
        BN,
        BO,
        BR,
        BS,
        CA,
        CE,
        CH,
        CO,
        CR,
        CS,
        CU,
        CV,
        CY,
        DA,
        DE,
        DV,
        DZ,
        EE,
        EL,
        EN,
        EO,
        ES,
        ET,
        EU,
        FA,
        FF,
        FI,
        FJ,
        FO,
        FR,
        FY,
        GA,
        GD,
        GL,
        GN,
        GU,
        GV,
        HA,
        HE,
        HI,
        HO,
        HR,
        HT,
        HU,
        HY,
        HZ,
        IA,
        ID,
        IE,
        IG,
        II,
        IK,
        IO,
        IS,
        IT,
        IU,
        JA,
        JV,
        KA,
        KG,
        KI,
        KJ,
        KK,
        KL,
        KM,
        KN,
        KO,
        KR,
        KS,
        KU,
        KV,
        KW,
        KY,
        LA,
        LB,
        LG,
        LI,
        LN,
        LO,
        LT,
        LU,
        LV,
        MG,
        MH,
        MI,
        MK,
        ML,
        MN,
        MR,
        MS,
        MT,
        MY,
        NA,
        NB,
        ND,
        NE,
        NG,
        NL,
        NN,
        NO,
        NR,
        NV,
        NY,
        OC,
        OJ,
        OM,
        OR,
        OS,
        PA,
        PI,
        PL,
        POX,
        PS,
        PT,
        QU,
        RM,
        RN,
        RO,
        RU,
        RW,
        SA,
        SC,
        SD,
        SE,
        SG,
        SI,
        SK,
        SL,
        SM,
        SN,
        SO,
        SQ,
        SR,
        SS,
        ST,
        SU,
        SV,
        SW,
        TA,
        TE,
        TG,
        TH,
        TI,
        TK,
        TL,
        TN,
        TO,
        TR,
        TS,
        TT,
        TW,
        TY,
        UG,
        UK,
        UR,
        UZ,
        VE,
        VI,
        VO,
        WA,
        WO,
        XH,
        YI,
        YO,
        ZA,
        ZH,
        ZU;

        private static final Map<String, Alpha2> BY_CODE = stream(values())
                .collect(collectingAndThen(toMap(Alpha2::getCode, identity()), Collections::unmodifiableMap));

        private final String code;

        Alpha2() {
            this.code = name().toLowerCase();
        }

        public final String getCode() {
            return code;
        }

        public final Set<Language> getLanguages() {
            return Language.getByAlpha2(this);
        }

        public static Optional<Alpha2> getByCode(String code) {
            return Optional.ofNullable(BY_CODE.get(code.toLowerCase()));
        }

    }

    public enum Alpha3T {

        AAR,
        ABK,
        AFR,
        AKA,
        AMH,
        ARA,
        ARG,
        ASM,
        AVA,
        AVE,
        AYM,
        AZE,
        BAK,
        BAM,
        BEL,
        BEN,
        BIH,
        BIS,
        BOD,
        BOS,
        BRE,
        BUL,
        CAT,
        CES,
        CHA,
        CHE,
        CHU,
        CHV,
        COR,
        COS,
        CRE,
        CYM,
        DAN,
        DEU,
        DIV,
        DZO,
        ELL,
        ENG,
        EPO,
        EST,
        EUS,
        EWE,
        FAO,
        FAS,
        FIJ,
        FIN,
        FRA,
        FRY,
        FUL,
        GLA,
        GLE,
        GLG,
        GLV,
        GRN,
        GUJ,
        HAT,
        HAU,
        HEB,
        HER,
        HIN,
        HMO,
        HRV,
        HUN,
        HYE,
        IBO,
        IDO,
        III,
        IKU,
        ILE,
        INA,
        IND,
        IPK,
        ISL,
        ITA,
        JAV,
        JPN,
        KAL,
        KAN,
        KAS,
        KAT,
        KAU,
        KAZ,
        KHM,
        KIK,
        KIN,
        KIR,
        KOM,
        KON,
        KOR,
        KUA,
        KUR,
        LAO,
        LAT,
        LAV,
        LIM,
        LIN,
        LIT,
        LTZ,
        LUB,
        LUG,
        MAH,
        MAL,
        MAR,
        MKD,
        MLG,
        MLT,
        MON,
        MRI,
        MSA,
        MYA,
        NAU,
        NAV,
        NBL,
        NDE,
        NDO,
        NEP,
        NLD,
        NNO,
        NOB,
        NOR,
        NYA,
        OCI,
        OJI,
        ORI,
        ORM,
        OSS,
        PAN,
        PLI,
        POL,
        POR,
        PUS,
        QUE,
        ROH,
        RON,
        RUN,
        RUS,
        SAG,
        SAN,
        SIN,
        SLA,
        SLK,
        SLV,
        SME,
        SMO,
        SNA,
        SND,
        SOM,
        SOT,
        SPA,
        SQI,
        SRD,
        SRP,
        SSW,
        SUN,
        SWA,
        SWE,
        TAH,
        TAM,
        TAT,
        TEL,
        TGK,
        TGL,
        THA,
        TIR,
        TON,
        TSN,
        TSO,
        TUK,
        TUR,
        TWI,
        UIG,
        UKR,
        URD,
        UZB,
        VEN,
        VIE,
        VOL,
        WLN,
        WOL,
        XHO,
        YID,
        YOR,
        ZHA,
        ZHO,
        ZUL;

        private static final Map<String, Alpha3T> BY_CODE = stream(values())
                .collect(collectingAndThen(toMap(Alpha3T::getCode, identity()), Collections::unmodifiableMap));

        private final String code;

        Alpha3T() {
            this.code = name().toLowerCase();
        }

        public final String getCode() {
            return code;
        }

        public final Set<Language> getLanguages() {
            return Language.getByAlpha3T(this);
        }

        public static Optional<Alpha3T> getByCode(String code) {
            return Optional.ofNullable(BY_CODE.get(code.toLowerCase()));
        }

    }

    public enum Alpha3B {

        AAR,
        ABK,
        AFR,
        AKA,
        ALB,
        AMH,
        ARA,
        ARG,
        ARM,
        ASM,
        AVA,
        AVE,
        AYM,
        AZE,
        BAK,
        BAM,
        BAQ,
        BEL,
        BEN,
        BIH,
        BIS,
        BOS,
        BRE,
        BUL,
        BUR,
        CAT,
        CHA,
        CHE,
        CHI,
        CHU,
        CHV,
        COR,
        COS,
        CRE,
        CZE,
        DAN,
        DIV,
        DUT,
        DZO,
        ENG,
        EPO,
        EST,
        EWE,
        FAO,
        FIJ,
        FIN,
        FRE,
        FRY,
        FUL,
        GEO,
        GER,
        GLA,
        GLE,
        GLG,
        GLV,
        GRE,
        GRN,
        GUJ,
        HAT,
        HAU,
        HEB,
        HER,
        HIN,
        HMO,
        HRV,
        HUN,
        IBO,
        ICE,
        IDO,
        III,
        IKU,
        ILE,
        INA,
        IND,
        IPK,
        ITA,
        JAV,
        JPN,
        KAL,
        KAN,
        KAS,
        KAU,
        KAZ,
        KHM,
        KIK,
        KIN,
        KIR,
        KOM,
        KON,
        KOR,
        KUA,
        KUR,
        LAO,
        LAT,
        LAV,
        LIM,
        LIN,
        LIT,
        LTZ,
        LUB,
        LUG,
        MAC,
        MAH,
        MAL,
        MAO,
        MAR,
        MAY,
        MLG,
        MLT,
        MON,
        NAU,
        NAV,
        NBL,
        NDE,
        NDO,
        NEP,
        NNO,
        NOB,
        NOR,
        NYA,
        OCI,
        OJI,
        ORI,
        ORM,
        OSS,
        PAN,
        PER,
        PLI,
        POL,
        POR,
        PUS,
        QUE,
        ROH,
        RUM,
        RUN,
        RUS,
        SAG,
        SAN,
        SIN,
        SLA,
        SLO,
        SLV,
        SME,
        SMO,
        SNA,
        SND,
        SOM,
        SOT,
        SPA,
        SRD,
        SRP,
        SSW,
        SUN,
        SWA,
        SWE,
        TAH,
        TAM,
        TAT,
        TEL,
        TGK,
        TGL,
        THA,
        TIB,
        TIR,
        TON,
        TSN,
        TSO,
        TUK,
        TUR,
        TWI,
        UIG,
        UKR,
        URD,
        UZB,
        VEN,
        VIE,
        VOL,
        WEL,
        WLN,
        WOL,
        XHO,
        YID,
        YOR,
        ZHA,
        ZUL;

        private static final Map<String, Alpha3B> BY_CODE = stream(values())
                .collect(collectingAndThen(toMap(Alpha3B::getCode, identity()), Collections::unmodifiableMap));

        private final String code;

        Alpha3B() {
            this.code = name().toLowerCase();
        }

        public final String getCode() {
            return code;
        }

        public final Set<Language> getLanguages() {
            return Language.getByAlpha3B(this);
        }

        public static Optional<Alpha3B> getByCode(String code) {
            return Optional.ofNullable(BY_CODE.get(code.toLowerCase()));
        }

    }

    private static <V extends Enum<V>> Set<V> toImmutableSet(List<V> mutableList) {
        return unmodifiableSet(EnumSet.copyOf(mutableList));
    }

    private static <K extends Enum<K>, V extends Enum<V>> Map<K, Set<V>> freeze(Map<K, List<V>> mutableMap, Class<K> keyType) {
        Map<K, Set<V>> outputMap = new EnumMap<>(keyType);
        mutableMap.forEach((key, mutableValues) -> outputMap.put(key, toImmutableSet(mutableValues)));
        return unmodifiableMap(outputMap);
    }

    private static final Map<Family, Set<Language>> BY_FAMILY = stream(values())
            .collect(collectingAndThen(groupingBy(Language::getFamily), byFamily -> freeze(byFamily, Family.class)));

    private static final Map<Alpha2, Set<Language>> BY_ALPHA2 = stream(values())
            .collect(collectingAndThen(groupingBy(Language::getAlpha2), byAlpha2 -> freeze(byAlpha2, Alpha2.class)));

    private static final Map<Alpha3T, Set<Language>> BY_ALPHA3T = stream(values())
            .collect(collectingAndThen(groupingBy(Language::getAlpha3T), byAlpha3T -> freeze(byAlpha3T, Alpha3T.class)));

    private static final Map<Alpha3B, Set<Language>> BY_ALPHA3B = stream(values())
            .collect(collectingAndThen(groupingBy(Language::getAlpha3B), byAlpha3B -> freeze(byAlpha3B, Alpha3B.class)));

    private final String name;

    private final Family family;

    private final Alpha2 alpha2;

    private final Alpha3T alpha3T;

    private final Alpha3B alpha3B;

    Language(String name, Family family, Alpha2 alpha2, Alpha3T alpha3T, Alpha3B alpha3B) {
        this.name = name;
        this.family = family;
        this.alpha2 = alpha2;
        this.alpha3T = alpha3T;
        this.alpha3B = alpha3B;
    }

    public final String getName() {
        return name;
    }

    public final Family getFamily() {
        return family;
    }

    public final Alpha2 getAlpha2() {
        return alpha2;
    }

    public final Alpha3T getAlpha3T() {
        return alpha3T;
    }

    public final Alpha3B getAlpha3B() {
        return alpha3B;
    }

    public static Set<Language> getByFamily(Family family) {
        return BY_FAMILY.get(family);
    }

    public static Set<Language> getByAlpha2(Alpha2 alpha2) {
        return BY_ALPHA2.get(alpha2);
    }

    public static Set<Language> getByAlpha3T(Alpha3T alpha3T) {
        return BY_ALPHA3T.get(alpha3T);
    }

    public static Set<Language> getByAlpha3B(Alpha3B alpha3B) {
        return BY_ALPHA3B.get(alpha3B);
    }

}
