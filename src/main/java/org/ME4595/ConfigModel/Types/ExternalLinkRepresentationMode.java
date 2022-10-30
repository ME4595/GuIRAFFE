package org.ME4595.ConfigModel.Types;

public enum ExternalLinkRepresentationMode {
    //Java interpretiert den Bindestrich als Minus und lässt auch nicht zu, diesen zu escapen, daher dieser Hack mit der integrierten String-Repräsentation der Crawler-Typen, um dem von PFERD verwendeten Format zu entsprechen
    ignore("ignore"), plaintext("plaintext"), fancy("fancy"), internet_shortcut("internet-shortcut");
    private final String stringRepresentation;
    ExternalLinkRepresentationMode(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }
}
