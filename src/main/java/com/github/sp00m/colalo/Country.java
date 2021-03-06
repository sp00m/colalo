package com.github.sp00m.colalo;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

import static java.util.Arrays.stream;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toMap;

// https://www.wikiwand.com/en/ISO_3166
// https://www.wikiwand.com/en/ISO_3166-1_alpha-2
// https://www.wikiwand.com/en/ISO_3166-1_alpha-3
// https://www.wikiwand.com/en/ISO_3166-1_numeric
public enum Country {

    AFGHANISTAN("Afghanistan", Alpha2.AF, Alpha3.AFG, Numeric.N004),
    ALAND_ISLANDS("Åland Islands", Alpha2.AX, Alpha3.ALA, Numeric.N248),
    ALBANIA("Albania", Alpha2.AL, Alpha3.ALB, Numeric.N008),
    ALGERIA("Algeria", Alpha2.DZ, Alpha3.DZA, Numeric.N012),
    AMERICAN_SAMOA("American Samoa", Alpha2.AS, Alpha3.ASM, Numeric.N016),
    ANDORRA("Andorra", Alpha2.AD, Alpha3.AND, Numeric.N020),
    ANGOLA("Angola", Alpha2.AO, Alpha3.AGO, Numeric.N024),
    ANGUILLA("Anguilla", Alpha2.AI, Alpha3.AIA, Numeric.N660),
    ANTARCTICA("Antarctica", Alpha2.AQ, Alpha3.ATA, Numeric.N010),
    ANTIGUA_AND_BARBUDA("Antigua and Barbuda", Alpha2.AG, Alpha3.ATG, Numeric.N028),
    ARGENTINA("Argentina", Alpha2.AR, Alpha3.ARG, Numeric.N032),
    ARMENIA("Armenia", Alpha2.AM, Alpha3.ARM, Numeric.N051),
    ARUBA("Aruba", Alpha2.AW, Alpha3.ABW, Numeric.N533),
    AUSTRALIA("Australia", Alpha2.AU, Alpha3.AUS, Numeric.N036),
    AUSTRIA("Austria", Alpha2.AT, Alpha3.AUT, Numeric.N040),
    AZERBAIJAN("Azerbaijan", Alpha2.AZ, Alpha3.AZE, Numeric.N031),
    BAHAMAS("Bahamas", Alpha2.BS, Alpha3.BHS, Numeric.N044),
    BAHRAIN("Bahrain", Alpha2.BH, Alpha3.BHR, Numeric.N048),
    BANGLADESH("Bangladesh", Alpha2.BD, Alpha3.BGD, Numeric.N050),
    BARBADOS("Barbados", Alpha2.BB, Alpha3.BRB, Numeric.N052),
    BELARUS("Belarus", Alpha2.BY, Alpha3.BLR, Numeric.N112),
    BELGIUM("Belgium", Alpha2.BE, Alpha3.BEL, Numeric.N056),
    BELIZE("Belize", Alpha2.BZ, Alpha3.BLZ, Numeric.N084),
    BENIN("Benin", Alpha2.BJ, Alpha3.BEN, Numeric.N204),
    BERMUDA("Bermuda", Alpha2.BM, Alpha3.BMU, Numeric.N060),
    BHUTAN("Bhutan", Alpha2.BT, Alpha3.BTN, Numeric.N064),
    BOLIVIA_PLURINATIONAL_STATE_OF("Bolivia, Plurinational State of", Alpha2.BO, Alpha3.BOL, Numeric.N068),
    BONAIRE_SINT_EUSTATIUS_AND_SABA("Bonaire, Sint Eustatius and Saba", Alpha2.BQ, Alpha3.BES, Numeric.N535),
    BOSNIA_AND_HERZEGOVINA("Bosnia and Herzegovina", Alpha2.BA, Alpha3.BIH, Numeric.N070),
    BOTSWANA("Botswana", Alpha2.BW, Alpha3.BWA, Numeric.N072),
    BOUVET_ISLAND("Bouvet Island", Alpha2.BV, Alpha3.BVT, Numeric.N074),
    BRAZIL("Brazil", Alpha2.BR, Alpha3.BRA, Numeric.N076),
    BRITISH_INDIAN_OCEAN_TERRITORY("British Indian Ocean Territory", Alpha2.IO, Alpha3.IOT, Numeric.N086),
    BRUNEI_DARUSSALAM("Brunei Darussalam", Alpha2.BN, Alpha3.BRN, Numeric.N096),
    BULGARIA("Bulgaria", Alpha2.BG, Alpha3.BGR, Numeric.N100),
    BURKINA_FASO("Burkina Faso", Alpha2.BF, Alpha3.BFA, Numeric.N854),
    BURUNDI("Burundi", Alpha2.BI, Alpha3.BDI, Numeric.N108),
    CABO_VERDE("Cabo Verde", Alpha2.CV, Alpha3.CPV, Numeric.N132),
    CAMBODIA("Cambodia", Alpha2.KH, Alpha3.KHM, Numeric.N116),
    CAMEROON("Cameroon", Alpha2.CM, Alpha3.CMR, Numeric.N120),
    CANADA("Canada", Alpha2.CA, Alpha3.CAN, Numeric.N124),
    CAYMAN_ISLANDS("Cayman Islands", Alpha2.KY, Alpha3.CYM, Numeric.N136),
    CENTRAL_AFRICAN_REPUBLIC("Central African Republic", Alpha2.CF, Alpha3.CAF, Numeric.N140),
    CHAD("Chad", Alpha2.TD, Alpha3.TCD, Numeric.N148),
    CHILE("Chile", Alpha2.CL, Alpha3.CHL, Numeric.N152),
    CHINA("China", Alpha2.CN, Alpha3.CHN, Numeric.N156),
    CHRISTMAS_ISLAND("Christmas Island", Alpha2.CX, Alpha3.CXR, Numeric.N162),
    COCOS_KEELING_ISLANDS("Cocos (Keeling) Islands", Alpha2.CC, Alpha3.CCK, Numeric.N166),
    COLOMBIA("Colombia", Alpha2.CO, Alpha3.COL, Numeric.N170),
    COMOROS("Comoros", Alpha2.KM, Alpha3.COM, Numeric.N174),
    CONGO("Congo", Alpha2.CG, Alpha3.COG, Numeric.N178),
    CONGO_THE_DEMOCRATIC_REPUBLIC_OF_THE("Congo, the Democratic Republic of the", Alpha2.CD, Alpha3.COD, Numeric.N180),
    COOK_ISLANDS("Cook Islands", Alpha2.CK, Alpha3.COK, Numeric.N184),
    COSTA_RICA("Costa Rica", Alpha2.CR, Alpha3.CRI, Numeric.N188),
    COTE_D_IVOIRE("Côte d'Ivoire", Alpha2.CI, Alpha3.CIV, Numeric.N384),
    CROATIA("Croatia", Alpha2.HR, Alpha3.HRV, Numeric.N191),
    CUBA("Cuba", Alpha2.CU, Alpha3.CUB, Numeric.N192),
    CURACAO("Curaçao", Alpha2.CW, Alpha3.CUW, Numeric.N531),
    CYPRUS("Cyprus", Alpha2.CY, Alpha3.CYP, Numeric.N196),
    CZECHIA("Czechia", Alpha2.CZ, Alpha3.CZE, Numeric.N203),
    DENMARK("Denmark", Alpha2.DK, Alpha3.DNK, Numeric.N208),
    DJIBOUTI("Djibouti", Alpha2.DJ, Alpha3.DJI, Numeric.N262),
    DOMINICA("Dominica", Alpha2.DM, Alpha3.DMA, Numeric.N212),
    DOMINICAN_REPUBLIC("Dominican Republic", Alpha2.DO, Alpha3.DOM, Numeric.N214),
    ECUADOR("Ecuador", Alpha2.EC, Alpha3.ECU, Numeric.N218),
    EGYPT("Egypt", Alpha2.EG, Alpha3.EGY, Numeric.N818),
    EL_SALVADOR("El Salvador", Alpha2.SV, Alpha3.SLV, Numeric.N222),
    EQUATORIAL_GUINEA("Equatorial Guinea", Alpha2.GQ, Alpha3.GNQ, Numeric.N226),
    ERITREA("Eritrea", Alpha2.ER, Alpha3.ERI, Numeric.N232),
    ESTONIA("Estonia", Alpha2.EE, Alpha3.EST, Numeric.N233),
    ETHIOPIA("Ethiopia", Alpha2.ET, Alpha3.ETH, Numeric.N231),
    FALKLAND_ISLANDS_MALVINAS("Falkland Islands (Malvinas)", Alpha2.FK, Alpha3.FLK, Numeric.N238),
    FAROE_ISLANDS("Faroe Islands", Alpha2.FO, Alpha3.FRO, Numeric.N234),
    FIJI("Fiji", Alpha2.FJ, Alpha3.FJI, Numeric.N242),
    FINLAND("Finland", Alpha2.FI, Alpha3.FIN, Numeric.N246),
    FRANCE("France", Alpha2.FR, Alpha3.FRA, Numeric.N250),
    FRENCH_GUIANA("French Guiana", Alpha2.GF, Alpha3.GUF, Numeric.N254),
    FRENCH_POLYNESIA("French Polynesia", Alpha2.PF, Alpha3.PYF, Numeric.N258),
    FRENCH_SOUTHERN_TERRITORIES("French Southern Territories", Alpha2.TF, Alpha3.ATF, Numeric.N260),
    GABON("Gabon", Alpha2.GA, Alpha3.GAB, Numeric.N266),
    GAMBIA("Gambia", Alpha2.GM, Alpha3.GMB, Numeric.N270),
    GEORGIA("Georgia", Alpha2.GE, Alpha3.GEO, Numeric.N268),
    GERMANY("Germany", Alpha2.DE, Alpha3.DEU, Numeric.N276),
    GHANA("Ghana", Alpha2.GH, Alpha3.GHA, Numeric.N288),
    GIBRALTAR("Gibraltar", Alpha2.GI, Alpha3.GIB, Numeric.N292),
    GREECE("Greece", Alpha2.GR, Alpha3.GRC, Numeric.N300),
    GREENLAND("Greenland", Alpha2.GL, Alpha3.GRL, Numeric.N304),
    GRENADA("Grenada", Alpha2.GD, Alpha3.GRD, Numeric.N308),
    GUADELOUPE("Guadeloupe", Alpha2.GP, Alpha3.GLP, Numeric.N312),
    GUAM("Guam", Alpha2.GU, Alpha3.GUM, Numeric.N316),
    GUATEMALA("Guatemala", Alpha2.GT, Alpha3.GTM, Numeric.N320),
    GUERNSEY("Guernsey", Alpha2.GG, Alpha3.GGY, Numeric.N831),
    GUINEA("Guinea", Alpha2.GN, Alpha3.GIN, Numeric.N324),
    GUINEA_BISSAU("Guinea-Bissau", Alpha2.GW, Alpha3.GNB, Numeric.N624),
    GUYANA("Guyana", Alpha2.GY, Alpha3.GUY, Numeric.N328),
    HAITI("Haiti", Alpha2.HT, Alpha3.HTI, Numeric.N332),
    HEARD_ISLAND_AND_MCDONALD_ISLANDS("Heard Island and McDonald Islands", Alpha2.HM, Alpha3.HMD, Numeric.N334),
    HOLY_SEE("Holy See", Alpha2.VA, Alpha3.VAT, Numeric.N336),
    HONDURAS("Honduras", Alpha2.HN, Alpha3.HND, Numeric.N340),
    HONG_KONG("Hong Kong", Alpha2.HK, Alpha3.HKG, Numeric.N344),
    HUNGARY("Hungary", Alpha2.HU, Alpha3.HUN, Numeric.N348),
    ICELAND("Iceland", Alpha2.IS, Alpha3.ISL, Numeric.N352),
    INDIA("India", Alpha2.IN, Alpha3.IND, Numeric.N356),
    INDONESIA("Indonesia", Alpha2.ID, Alpha3.IDN, Numeric.N360),
    IRAN_ISLAMIC_REPUBLIC_OF("Iran, Islamic Republic of", Alpha2.IR, Alpha3.IRN, Numeric.N364),
    IRAQ("Iraq", Alpha2.IQ, Alpha3.IRQ, Numeric.N368),
    IRELAND("Ireland", Alpha2.IE, Alpha3.IRL, Numeric.N372),
    ISLE_OF_MAN("Isle of Man", Alpha2.IM, Alpha3.IMN, Numeric.N833),
    ISRAEL("Israel", Alpha2.IL, Alpha3.ISR, Numeric.N376),
    ITALY("Italy", Alpha2.IT, Alpha3.ITA, Numeric.N380),
    JAMAICA("Jamaica", Alpha2.JM, Alpha3.JAM, Numeric.N388),
    JAPAN("Japan", Alpha2.JP, Alpha3.JPN, Numeric.N392),
    JERSEY("Jersey", Alpha2.JE, Alpha3.JEY, Numeric.N832),
    JORDAN("Jordan", Alpha2.JO, Alpha3.JOR, Numeric.N400),
    KAZAKHSTAN("Kazakhstan", Alpha2.KZ, Alpha3.KAZ, Numeric.N398),
    KENYA("Kenya", Alpha2.KE, Alpha3.KEN, Numeric.N404),
    KIRIBATI("Kiribati", Alpha2.KI, Alpha3.KIR, Numeric.N296),
    KOREA_DEMOCRATIC_PEOPLE_S_REPUBLIC_OF("Korea, Democratic People's Republic of", Alpha2.KP, Alpha3.PRK, Numeric.N408),
    KOREA_REPUBLIC_OF("Korea, Republic of", Alpha2.KR, Alpha3.KOR, Numeric.N410),
    KUWAIT("Kuwait", Alpha2.KW, Alpha3.KWT, Numeric.N414),
    KYRGYZSTAN("Kyrgyzstan", Alpha2.KG, Alpha3.KGZ, Numeric.N417),
    LAO_PEOPLE_S_DEMOCRATIC_REPUBLIC("Lao People's Democratic Republic", Alpha2.LA, Alpha3.LAO, Numeric.N418),
    LATVIA("Latvia", Alpha2.LV, Alpha3.LVA, Numeric.N428),
    LEBANON("Lebanon", Alpha2.LB, Alpha3.LBN, Numeric.N422),
    LESOTHO("Lesotho", Alpha2.LS, Alpha3.LSO, Numeric.N426),
    LIBERIA("Liberia", Alpha2.LR, Alpha3.LBR, Numeric.N430),
    LIBYA("Libya", Alpha2.LY, Alpha3.LBY, Numeric.N434),
    LIECHTENSTEIN("Liechtenstein", Alpha2.LI, Alpha3.LIE, Numeric.N438),
    LITHUANIA("Lithuania", Alpha2.LT, Alpha3.LTU, Numeric.N440),
    LUXEMBOURG("Luxembourg", Alpha2.LU, Alpha3.LUX, Numeric.N442),
    MACAO("Macao", Alpha2.MO, Alpha3.MAC, Numeric.N446),
    MACEDONIA_THE_FORMER_YUGOSLAV_REPUBLIC_OF("Macedonia, the former Yugoslav Republic of", Alpha2.MK, Alpha3.MKD, Numeric.N807),
    MADAGASCAR("Madagascar", Alpha2.MG, Alpha3.MDG, Numeric.N450),
    MALAWI("Malawi", Alpha2.MW, Alpha3.MWI, Numeric.N454),
    MALAYSIA("Malaysia", Alpha2.MY, Alpha3.MYS, Numeric.N458),
    MALDIVES("Maldives", Alpha2.MV, Alpha3.MDV, Numeric.N462),
    MALI("Mali", Alpha2.ML, Alpha3.MLI, Numeric.N466),
    MALTA("Malta", Alpha2.MT, Alpha3.MLT, Numeric.N470),
    MARSHALL_ISLANDS("Marshall Islands", Alpha2.MH, Alpha3.MHL, Numeric.N584),
    MARTINIQUE("Martinique", Alpha2.MQ, Alpha3.MTQ, Numeric.N474),
    MAURITANIA("Mauritania", Alpha2.MR, Alpha3.MRT, Numeric.N478),
    MAURITIUS("Mauritius", Alpha2.MU, Alpha3.MUS, Numeric.N480),
    MAYOTTE("Mayotte", Alpha2.YT, Alpha3.MYT, Numeric.N175),
    MEXICO("Mexico", Alpha2.MX, Alpha3.MEX, Numeric.N484),
    MICRONESIA_FEDERATED_STATES_OF("Micronesia, Federated States of", Alpha2.FM, Alpha3.FSM, Numeric.N583),
    MOLDOVA_REPUBLIC_OF("Moldova, Republic of", Alpha2.MD, Alpha3.MDA, Numeric.N498),
    MONACO("Monaco", Alpha2.MC, Alpha3.MCO, Numeric.N492),
    MONGOLIA("Mongolia", Alpha2.MN, Alpha3.MNG, Numeric.N496),
    MONTENEGRO("Montenegro", Alpha2.ME, Alpha3.MNE, Numeric.N499),
    MONTSERRAT("Montserrat", Alpha2.MS, Alpha3.MSR, Numeric.N500),
    MOROCCO("Morocco", Alpha2.MA, Alpha3.MAR, Numeric.N504),
    MOZAMBIQUE("Mozambique", Alpha2.MZ, Alpha3.MOZ, Numeric.N508),
    MYANMAR("Myanmar", Alpha2.MM, Alpha3.MMR, Numeric.N104),
    NAMIBIA("Namibia", Alpha2.NA, Alpha3.NAM, Numeric.N516),
    NAURU("Nauru", Alpha2.NR, Alpha3.NRU, Numeric.N520),
    NEPAL("Nepal", Alpha2.NP, Alpha3.NPL, Numeric.N524),
    NETHERLANDS("Netherlands", Alpha2.NL, Alpha3.NLD, Numeric.N528),
    NEW_CALEDONIA("New Caledonia", Alpha2.NC, Alpha3.NCL, Numeric.N540),
    NEW_ZEALAND("New Zealand", Alpha2.NZ, Alpha3.NZL, Numeric.N554),
    NICARAGUA("Nicaragua", Alpha2.NI, Alpha3.NIC, Numeric.N558),
    NIGER("Niger", Alpha2.NE, Alpha3.NER, Numeric.N562),
    NIGERIA("Nigeria", Alpha2.NG, Alpha3.NGA, Numeric.N566),
    NIUE("Niue", Alpha2.NU, Alpha3.NIU, Numeric.N570),
    NORFOLK_ISLAND("Norfolk Island", Alpha2.NF, Alpha3.NFK, Numeric.N574),
    NORTHERN_MARIANA_ISLANDS("Northern Mariana Islands", Alpha2.MP, Alpha3.MNP, Numeric.N580),
    NORWAY("Norway", Alpha2.NO, Alpha3.NOR, Numeric.N578),
    OMAN("Oman", Alpha2.OM, Alpha3.OMN, Numeric.N512),
    PAKISTAN("Pakistan", Alpha2.PK, Alpha3.PAK, Numeric.N586),
    PALAU("Palau", Alpha2.PW, Alpha3.PLW, Numeric.N585),
    PALESTINE_STATE_OF("Palestine, State of", Alpha2.PS, Alpha3.PSE, Numeric.N275),
    PANAMA("Panama", Alpha2.PA, Alpha3.PAN, Numeric.N591),
    PAPUA_NEW_GUINEA("Papua New Guinea", Alpha2.PG, Alpha3.PNG, Numeric.N598),
    PARAGUAY("Paraguay", Alpha2.PY, Alpha3.PRY, Numeric.N600),
    PERU("Peru", Alpha2.PE, Alpha3.PER, Numeric.N604),
    PHILIPPINES("Philippines", Alpha2.PH, Alpha3.PHL, Numeric.N608),
    PITCAIRN("Pitcairn", Alpha2.PN, Alpha3.PCN, Numeric.N612),
    POLAND("Poland", Alpha2.PL, Alpha3.POL, Numeric.N616),
    PORTUGAL("Portugal", Alpha2.PT, Alpha3.PRT, Numeric.N620),
    PUERTO_RICO("Puerto Rico", Alpha2.PR, Alpha3.PRI, Numeric.N630),
    QATAR("Qatar", Alpha2.QA, Alpha3.QAT, Numeric.N634),
    REUNION("Réunion", Alpha2.RE, Alpha3.REU, Numeric.N638),
    ROMANIA("Romania", Alpha2.RO, Alpha3.ROU, Numeric.N642),
    RUSSIAN_FEDERATION("Russian Federation", Alpha2.RU, Alpha3.RUS, Numeric.N643),
    RWANDA("Rwanda", Alpha2.RW, Alpha3.RWA, Numeric.N646),
    SAINT_BARTHELEMY("Saint Barthélemy", Alpha2.BL, Alpha3.BLM, Numeric.N652),
    SAINT_HELENA_ASCENSION_AND_TRISTAN_DA_CUNHA("Saint Helena, Ascension and Tristan da Cunha", Alpha2.SH, Alpha3.SHN, Numeric.N654),
    SAINT_KITTS_AND_NEVIS("Saint Kitts and Nevis", Alpha2.KN, Alpha3.KNA, Numeric.N659),
    SAINT_LUCIA("Saint Lucia", Alpha2.LC, Alpha3.LCA, Numeric.N662),
    SAINT_MARTIN_FRENCH_PART("Saint Martin (French part)", Alpha2.MF, Alpha3.MAF, Numeric.N663),
    SAINT_PIERRE_AND_MIQUELON("Saint Pierre and Miquelon", Alpha2.PM, Alpha3.SPM, Numeric.N666),
    SAINT_VINCENT_AND_THE_GRENADINES("Saint Vincent and the Grenadines", Alpha2.VC, Alpha3.VCT, Numeric.N670),
    SAMOA("Samoa", Alpha2.WS, Alpha3.WSM, Numeric.N882),
    SAN_MARINO("San Marino", Alpha2.SM, Alpha3.SMR, Numeric.N674),
    SAO_TOME_AND_PRINCIPE("Sao Tome and Principe", Alpha2.ST, Alpha3.STP, Numeric.N678),
    SAUDI_ARABIA("Saudi Arabia", Alpha2.SA, Alpha3.SAU, Numeric.N682),
    SENEGAL("Senegal", Alpha2.SN, Alpha3.SEN, Numeric.N686),
    SERBIA("Serbia", Alpha2.RS, Alpha3.SRB, Numeric.N688),
    SEYCHELLES("Seychelles", Alpha2.SC, Alpha3.SYC, Numeric.N690),
    SIERRA_LEONE("Sierra Leone", Alpha2.SL, Alpha3.SLE, Numeric.N694),
    SINGAPORE("Singapore", Alpha2.SG, Alpha3.SGP, Numeric.N702),
    SINT_MAARTEN_DUTCH_PART("Sint Maarten (Dutch part)", Alpha2.SX, Alpha3.SXM, Numeric.N534),
    SLOVAKIA("Slovakia", Alpha2.SK, Alpha3.SVK, Numeric.N703),
    SLOVENIA("Slovenia", Alpha2.SI, Alpha3.SVN, Numeric.N705),
    SOLOMON_ISLANDS("Solomon Islands", Alpha2.SB, Alpha3.SLB, Numeric.N090),
    SOMALIA("Somalia", Alpha2.SO, Alpha3.SOM, Numeric.N706),
    SOUTH_AFRICA("South Africa", Alpha2.ZA, Alpha3.ZAF, Numeric.N710),
    SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS("South Georgia and the South Sandwich Islands", Alpha2.GS, Alpha3.SGS, Numeric.N239),
    SOUTH_SUDAN("South Sudan", Alpha2.SS, Alpha3.SSD, Numeric.N728),
    SPAIN("Spain", Alpha2.ES, Alpha3.ESP, Numeric.N724),
    SRI_LANKA("Sri Lanka", Alpha2.LK, Alpha3.LKA, Numeric.N144),
    SUDAN("Sudan", Alpha2.SD, Alpha3.SDN, Numeric.N729),
    SURINAME("Suriname", Alpha2.SR, Alpha3.SUR, Numeric.N740),
    SVALBARD_AND_JAN_MAYEN("Svalbard and Jan Mayen", Alpha2.SJ, Alpha3.SJM, Numeric.N744),
    SWAZILAND("Swaziland", Alpha2.SZ, Alpha3.SWZ, Numeric.N748),
    SWEDEN("Sweden", Alpha2.SE, Alpha3.SWE, Numeric.N752),
    SWITZERLAND("Switzerland", Alpha2.CH, Alpha3.CHE, Numeric.N756),
    SYRIAN_ARAB_REPUBLIC("Syrian Arab Republic", Alpha2.SY, Alpha3.SYR, Numeric.N760),
    TAIWAN_PROVINCE_OF_CHINA("Taiwan, Province of China", Alpha2.TW, Alpha3.TWN, Numeric.N158),
    TAJIKISTAN("Tajikistan", Alpha2.TJ, Alpha3.TJK, Numeric.N762),
    TANZANIA_UNITED_REPUBLIC_OF("Tanzania, United Republic of", Alpha2.TZ, Alpha3.TZA, Numeric.N834),
    THAILAND("Thailand", Alpha2.TH, Alpha3.THA, Numeric.N764),
    TIMOR_LESTE("Timor-Leste", Alpha2.TL, Alpha3.TLS, Numeric.N626),
    TOGO("Togo", Alpha2.TG, Alpha3.TGO, Numeric.N768),
    TOKELAU("Tokelau", Alpha2.TK, Alpha3.TKL, Numeric.N772),
    TONGA("Tonga", Alpha2.TO, Alpha3.TON, Numeric.N776),
    TRINIDAD_AND_TOBAGO("Trinidad and Tobago", Alpha2.TT, Alpha3.TTO, Numeric.N780),
    TUNISIA("Tunisia", Alpha2.TN, Alpha3.TUN, Numeric.N788),
    TURKEY("Turkey", Alpha2.TR, Alpha3.TUR, Numeric.N792),
    TURKMENISTAN("Turkmenistan", Alpha2.TM, Alpha3.TKM, Numeric.N795),
    TURKS_AND_CAICOS_ISLANDS("Turks and Caicos Islands", Alpha2.TC, Alpha3.TCA, Numeric.N796),
    TUVALU("Tuvalu", Alpha2.TV, Alpha3.TUV, Numeric.N798),
    UGANDA("Uganda", Alpha2.UG, Alpha3.UGA, Numeric.N800),
    UKRAINE("Ukraine", Alpha2.UA, Alpha3.UKR, Numeric.N804),
    UNITED_ARAB_EMIRATES("United Arab Emirates", Alpha2.AE, Alpha3.ARE, Numeric.N784),
    UNITED_KINGDOM("United Kingdom", Alpha2.GB, Alpha3.GBR, Numeric.N826),
    UNITED_STATES_MINOR_OUTLYING_ISLANDS("United States Minor Outlying Islands", Alpha2.UM, Alpha3.UMI, Numeric.N581),
    UNITED_STATES_OF_AMERICA("United States of America", Alpha2.US, Alpha3.USA, Numeric.N840),
    URUGUAY("Uruguay", Alpha2.UY, Alpha3.URY, Numeric.N858),
    UZBEKISTAN("Uzbekistan", Alpha2.UZ, Alpha3.UZB, Numeric.N860),
    VANUATU("Vanuatu", Alpha2.VU, Alpha3.VUT, Numeric.N548),
    VENEZUELA_BOLIVARIAN_REPUBLIC_OF("Venezuela, Bolivarian Republic of", Alpha2.VE, Alpha3.VEN, Numeric.N862),
    VIET_NAM("Viet Nam", Alpha2.VN, Alpha3.VNM, Numeric.N704),
    VIRGIN_ISLANDS_BRITISH("Virgin Islands, British", Alpha2.VG, Alpha3.VGB, Numeric.N092),
    VIRGIN_ISLANDS_US("Virgin Islands, U.S.", Alpha2.VI, Alpha3.VIR, Numeric.N850),
    WALLIS_AND_FUTUNA("Wallis and Futuna", Alpha2.WF, Alpha3.WLF, Numeric.N876),
    WESTERN_SAHARA("Western Sahara", Alpha2.EH, Alpha3.ESH, Numeric.N732),
    YEMEN("Yemen", Alpha2.YE, Alpha3.YEM, Numeric.N887),
    ZAMBIA("Zambia", Alpha2.ZM, Alpha3.ZMB, Numeric.N894),
    ZIMBABWE("Zimbabwe", Alpha2.ZW, Alpha3.ZWE, Numeric.N716);

    public enum Alpha2 {

        AD,
        AE,
        AF,
        AG,
        AI,
        AL,
        AM,
        AO,
        AQ,
        AR,
        AS,
        AT,
        AU,
        AW,
        AX,
        AZ,
        BA,
        BB,
        BD,
        BE,
        BF,
        BG,
        BH,
        BI,
        BJ,
        BL,
        BM,
        BN,
        BO,
        BQ,
        BR,
        BS,
        BT,
        BV,
        BW,
        BY,
        BZ,
        CA,
        CC,
        CD,
        CF,
        CG,
        CH,
        CI,
        CK,
        CL,
        CM,
        CN,
        CO,
        CR,
        CU,
        CV,
        CW,
        CX,
        CY,
        CZ,
        DE,
        DJ,
        DK,
        DM,
        DO,
        DZ,
        EC,
        EE,
        EG,
        EH,
        ER,
        ES,
        ET,
        FI,
        FJ,
        FK,
        FM,
        FO,
        FR,
        GA,
        GB,
        GD,
        GE,
        GF,
        GG,
        GH,
        GI,
        GL,
        GM,
        GN,
        GP,
        GQ,
        GR,
        GS,
        GT,
        GU,
        GW,
        GY,
        HK,
        HM,
        HN,
        HR,
        HT,
        HU,
        ID,
        IE,
        IL,
        IM,
        IN,
        IO,
        IQ,
        IR,
        IS,
        IT,
        JE,
        JM,
        JO,
        JP,
        KE,
        KG,
        KH,
        KI,
        KM,
        KN,
        KP,
        KR,
        KW,
        KY,
        KZ,
        LA,
        LB,
        LC,
        LI,
        LK,
        LR,
        LS,
        LT,
        LU,
        LV,
        LY,
        MA,
        MC,
        MD,
        ME,
        MF,
        MG,
        MH,
        MK,
        ML,
        MM,
        MN,
        MO,
        MP,
        MQ,
        MR,
        MS,
        MT,
        MU,
        MV,
        MW,
        MX,
        MY,
        MZ,
        NA,
        NC,
        NE,
        NF,
        NG,
        NI,
        NL,
        NO,
        NP,
        NR,
        NU,
        NZ,
        OM,
        PA,
        PE,
        PF,
        PG,
        PH,
        PK,
        PL,
        PM,
        PN,
        PR,
        PS,
        PT,
        PW,
        PY,
        QA,
        RE,
        RO,
        RS,
        RU,
        RW,
        SA,
        SB,
        SC,
        SD,
        SE,
        SG,
        SH,
        SI,
        SJ,
        SK,
        SL,
        SM,
        SN,
        SO,
        SR,
        SS,
        ST,
        SV,
        SX,
        SY,
        SZ,
        TC,
        TD,
        TF,
        TG,
        TH,
        TJ,
        TK,
        TL,
        TM,
        TN,
        TO,
        TR,
        TT,
        TV,
        TW,
        TZ,
        UA,
        UG,
        UM,
        US,
        UY,
        UZ,
        VA,
        VC,
        VE,
        VG,
        VI,
        VN,
        VU,
        WF,
        WS,
        YE,
        YT,
        ZA,
        ZM,
        ZW;

        private static final Map<String, Alpha2> BY_CODE = stream(values())
                .collect(collectingAndThen(toMap(Alpha2::getCode, identity()), Collections::unmodifiableMap));

        private final String code;

        Alpha2() {
            this.code = name();
        }

        public final String getCode() {
            return code;
        }

        public final Country getCountry() {
            return Country.getByAlpha2(this);
        }

        public static Optional<Alpha2> getByCode(String code) {
            return Optional.ofNullable(BY_CODE.get(code.toUpperCase()));
        }

    }

    public enum Alpha3 {

        ABW,
        AFG,
        AGO,
        AIA,
        ALA,
        ALB,
        AND,
        ARE,
        ARG,
        ARM,
        ASM,
        ATA,
        ATF,
        ATG,
        AUS,
        AUT,
        AZE,
        BDI,
        BEL,
        BEN,
        BES,
        BFA,
        BGD,
        BGR,
        BHR,
        BHS,
        BIH,
        BLM,
        BLR,
        BLZ,
        BMU,
        BOL,
        BRA,
        BRB,
        BRN,
        BTN,
        BVT,
        BWA,
        CAF,
        CAN,
        CCK,
        CHE,
        CHL,
        CHN,
        CIV,
        CMR,
        COD,
        COG,
        COK,
        COL,
        COM,
        CPV,
        CRI,
        CUB,
        CUW,
        CXR,
        CYM,
        CYP,
        CZE,
        DEU,
        DJI,
        DMA,
        DNK,
        DOM,
        DZA,
        ECU,
        EGY,
        ERI,
        ESH,
        ESP,
        EST,
        ETH,
        FIN,
        FJI,
        FLK,
        FRA,
        FRO,
        FSM,
        GAB,
        GBR,
        GEO,
        GGY,
        GHA,
        GIB,
        GIN,
        GLP,
        GMB,
        GNB,
        GNQ,
        GRC,
        GRD,
        GRL,
        GTM,
        GUF,
        GUM,
        GUY,
        HKG,
        HMD,
        HND,
        HRV,
        HTI,
        HUN,
        IDN,
        IMN,
        IND,
        IOT,
        IRL,
        IRN,
        IRQ,
        ISL,
        ISR,
        ITA,
        JAM,
        JEY,
        JOR,
        JPN,
        KAZ,
        KEN,
        KGZ,
        KHM,
        KIR,
        KNA,
        KOR,
        KWT,
        LAO,
        LBN,
        LBR,
        LBY,
        LCA,
        LIE,
        LKA,
        LSO,
        LTU,
        LUX,
        LVA,
        MAC,
        MAF,
        MAR,
        MCO,
        MDA,
        MDG,
        MDV,
        MEX,
        MHL,
        MKD,
        MLI,
        MLT,
        MMR,
        MNE,
        MNG,
        MNP,
        MOZ,
        MRT,
        MSR,
        MTQ,
        MUS,
        MWI,
        MYS,
        MYT,
        NAM,
        NCL,
        NER,
        NFK,
        NGA,
        NIC,
        NIU,
        NLD,
        NOR,
        NPL,
        NRU,
        NZL,
        OMN,
        PAK,
        PAN,
        PCN,
        PER,
        PHL,
        PLW,
        PNG,
        POL,
        PRI,
        PRK,
        PRT,
        PRY,
        PSE,
        PYF,
        QAT,
        REU,
        ROU,
        RUS,
        RWA,
        SAU,
        SDN,
        SEN,
        SGP,
        SGS,
        SHN,
        SJM,
        SLB,
        SLE,
        SLV,
        SMR,
        SOM,
        SPM,
        SRB,
        SSD,
        STP,
        SUR,
        SVK,
        SVN,
        SWE,
        SWZ,
        SXM,
        SYC,
        SYR,
        TCA,
        TCD,
        TGO,
        THA,
        TJK,
        TKL,
        TKM,
        TLS,
        TON,
        TTO,
        TUN,
        TUR,
        TUV,
        TWN,
        TZA,
        UGA,
        UKR,
        UMI,
        URY,
        USA,
        UZB,
        VAT,
        VCT,
        VEN,
        VGB,
        VIR,
        VNM,
        VUT,
        WLF,
        WSM,
        YEM,
        ZAF,
        ZMB,
        ZWE;

        private static final Map<String, Alpha3> BY_CODE = stream(values())
                .collect(collectingAndThen(toMap(Alpha3::getCode, identity()), Collections::unmodifiableMap));

        private final String code;

        Alpha3() {
            this.code = name();
        }

        public final String getCode() {
            return code;
        }

        public final Country getCountry() {
            return Country.getByAlpha3(this);
        }

        public static Optional<Alpha3> getByCode(String code) {
            return Optional.ofNullable(BY_CODE.get(code.toUpperCase()));
        }

    }

    public enum Numeric {

        N004,
        N008,
        N010,
        N012,
        N016,
        N020,
        N024,
        N028,
        N031,
        N032,
        N036,
        N040,
        N044,
        N048,
        N050,
        N051,
        N052,
        N056,
        N060,
        N064,
        N068,
        N070,
        N072,
        N074,
        N076,
        N084,
        N086,
        N090,
        N092,
        N096,
        N100,
        N104,
        N108,
        N112,
        N116,
        N120,
        N124,
        N132,
        N136,
        N140,
        N144,
        N148,
        N152,
        N156,
        N158,
        N162,
        N166,
        N170,
        N174,
        N175,
        N178,
        N180,
        N184,
        N188,
        N191,
        N192,
        N196,
        N203,
        N204,
        N208,
        N212,
        N214,
        N218,
        N222,
        N226,
        N231,
        N232,
        N233,
        N234,
        N238,
        N239,
        N242,
        N246,
        N248,
        N250,
        N254,
        N258,
        N260,
        N262,
        N266,
        N268,
        N270,
        N275,
        N276,
        N288,
        N292,
        N296,
        N300,
        N304,
        N308,
        N312,
        N316,
        N320,
        N324,
        N328,
        N332,
        N334,
        N336,
        N340,
        N344,
        N348,
        N352,
        N356,
        N360,
        N364,
        N368,
        N372,
        N376,
        N380,
        N384,
        N388,
        N392,
        N398,
        N400,
        N404,
        N408,
        N410,
        N414,
        N417,
        N418,
        N422,
        N426,
        N428,
        N430,
        N434,
        N438,
        N440,
        N442,
        N446,
        N450,
        N454,
        N458,
        N462,
        N466,
        N470,
        N474,
        N478,
        N480,
        N484,
        N492,
        N496,
        N498,
        N499,
        N500,
        N504,
        N508,
        N512,
        N516,
        N520,
        N524,
        N528,
        N531,
        N533,
        N534,
        N535,
        N540,
        N548,
        N554,
        N558,
        N562,
        N566,
        N570,
        N574,
        N578,
        N580,
        N581,
        N583,
        N584,
        N585,
        N586,
        N591,
        N598,
        N600,
        N604,
        N608,
        N612,
        N616,
        N620,
        N624,
        N626,
        N630,
        N634,
        N638,
        N642,
        N643,
        N646,
        N652,
        N654,
        N659,
        N660,
        N662,
        N663,
        N666,
        N670,
        N674,
        N678,
        N682,
        N686,
        N688,
        N690,
        N694,
        N702,
        N703,
        N704,
        N705,
        N706,
        N710,
        N716,
        N724,
        N728,
        N729,
        N732,
        N740,
        N744,
        N748,
        N752,
        N756,
        N760,
        N762,
        N764,
        N768,
        N772,
        N776,
        N780,
        N784,
        N788,
        N792,
        N795,
        N796,
        N798,
        N800,
        N804,
        N807,
        N818,
        N826,
        N831,
        N832,
        N833,
        N834,
        N840,
        N850,
        N854,
        N858,
        N860,
        N862,
        N876,
        N882,
        N887,
        N894;

        private static final Map<String, Numeric> BY_CODE = stream(values())
                .collect(collectingAndThen(toMap(Numeric::getCode, identity()), Collections::unmodifiableMap));

        private final String code;

        Numeric() {
            this.code = name().substring(1);
        }

        public final String getCode() {
            return code;
        }

        public final Country getCountry() {
            return Country.getByNumeric(this);
        }

        public static Optional<Numeric> getByCode(String code) {
            return Optional.ofNullable(BY_CODE.get(code.toUpperCase()));
        }

    }

    private static final Map<Alpha2, Country> BY_ALPHA2 = stream(values())
            .collect(collectingAndThen(toMap(Country::getAlpha2, identity()), Collections::unmodifiableMap));

    private static final Map<Alpha3, Country> BY_ALPHA3 = stream(values())
            .collect(collectingAndThen(toMap(Country::getAlpha3, identity()), Collections::unmodifiableMap));

    private static final Map<Numeric, Country> BY_NUMERIC = stream(values())
            .collect(collectingAndThen(toMap(Country::getNumeric, identity()), Collections::unmodifiableMap));

    private final String name;

    private final Alpha2 alpha2;

    private final Alpha3 alpha3;

    private final Numeric numeric;

    Country(String name, Alpha2 alpha2, Alpha3 alpha3, Numeric numeric) {
        this.name = name;
        this.alpha2 = alpha2;
        this.alpha3 = alpha3;
        this.numeric = numeric;
    }

    public final String getName() {
        return name;
    }

    public final Alpha2 getAlpha2() {
        return alpha2;
    }

    public final Alpha3 getAlpha3() {
        return alpha3;
    }

    public final Numeric getNumeric() {
        return numeric;
    }

    public static Country getByAlpha2(Alpha2 alpha2) {
        return BY_ALPHA2.get(alpha2);
    }

    public static Country getByAlpha3(Alpha3 alpha3) {
        return BY_ALPHA3.get(alpha3);
    }

    public static Country getByNumeric(Numeric numeric) {
        return BY_NUMERIC.get(numeric);
    }

}
