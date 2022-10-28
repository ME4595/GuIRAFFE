package org.ME4595.ConfigModel.Types;

public enum RedownloadMode {
    //Java interpretiert den Bindestrich als Minus und lässt auch nicht zu, diesen zu escapen, daher dieser Hack mit der integrierten String-Repräsentation der Crawler-Typen, um dem von PFERD verwendeten Format zu entsprechen
    never("never"), never_smart("never-smart"), always("always"), always_smart("always-smart");
    private final String stringRepresentation;
    RedownloadMode(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }
}
