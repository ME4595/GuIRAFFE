package org.ME4595.ConfigModel.Types;

public enum AuthType {
    //Java interpretiert den Bindestrich als Minus und lässt auch nicht zu, diesen zu escapen, daher dieser Hack mit der integrierten String-Repräsentation der Crawler-Typen, um dem von PFERD verwendeten Format zu entsprechen
    simple("simple"), credential_file("credential-file"), keyring("keyring"), pass("pass"), tfa("tfa");
    private final String stringRepresentation;
    AuthType(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }
}
