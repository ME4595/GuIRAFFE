package org.ME4595.ConfigModel.Types;

public enum OnConflicMode {
    //Java interpretiert den Bindestrich als Minus und lässt auch nicht zu, diesen zu escapen, daher dieser Hack mit der integrierten String-Repräsentation der Crawler-Typen, um dem von PFERD verwendeten Format zu entsprechen
    prompt("prompt"), local_first("local-first"), remote_first("remote-first"), no_delete("no-delete");
    private final String stringRepresentation;
    OnConflicMode(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }
}
