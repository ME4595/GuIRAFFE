package org.ME4595.ConfigModel.Types;

public enum CrawlerType
{
    //Java interpretiert den Bindestrich als Minus und lässt auch nicht zu, diesen zu escapen, daher dieser Hack mit der integrierten String-Repräsentation der Crawler-Typen, um dem von PFERD verwendeten Format zu entsprechen
    local("local"), kit_ipd("kit-ipd"), kit_ilias_web("kit-ilias-web");

    private final String stringRepresentation;
    CrawlerType(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }
}
