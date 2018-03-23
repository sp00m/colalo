package com.github.sp00m.colalo;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

import static java.util.Arrays.stream;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toMap;

// https://www.wikiwand.com/en/ISO_639
// https://www.wikiwand.com/en/List_of_ISO_639-1_codes
public enum Language {

    ;

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

        public static Optional<Alpha2> getByCode(String code) {
            return Optional.ofNullable(BY_CODE.get(code.toLowerCase()));
        }

    }

}
