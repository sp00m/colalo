package com.github.sp00m.colalo;

public enum LanguageFamily {

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

        LanguageFamily(String name) {
        this.name = name;
        }

public String getName() {
        return name;
        }

        }
