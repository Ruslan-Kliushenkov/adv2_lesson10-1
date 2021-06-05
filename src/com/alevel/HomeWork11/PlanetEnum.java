package com.alevel.HomeWork11;

// Нептун

public enum PlanetEnum {
    TRITON("Тритон"),
    NEREID("Нереида"),
    NAIAD("Наяда"),
    THALASSA("Таласса"),
    DESPINA("Деспина"),
    GALATEA("Галатея"),
    LARISSA("Ларисса"),
    PROTEUS("Протей"),
    HALIMEDE("Галимеда"),
    PSAMATHE("Псамафа"),
    SAO("Сао"),
    LAOMEDEIA("Лаомедея"),
    NESO("Несо"),
    HIPPOCAMP("Гиппокамп");

    private final String title;

    PlanetEnum(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static int getPlanetEnumLength(){
        return PlanetEnum.values().length;
    }
}
