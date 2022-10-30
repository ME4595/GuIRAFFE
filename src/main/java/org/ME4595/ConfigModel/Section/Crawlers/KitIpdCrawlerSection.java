package org.ME4595.ConfigModel.Section.Crawlers;

import org.ME4595.ConfigModel.Section.CrawlSection;
import org.ME4595.ConfigModel.Types.CrawlerType;

import java.net.URL;

public class KitIpdCrawlerSection extends CrawlSection {
    private URL target;
    private String link_regex;

    public KitIpdCrawlerSection(String crawlerName){
        super(crawlerName);
        crawlerType = CrawlerType.kit_ipd;
    }

    @Override
    public void saveToConfigfile() {
        super.saveToConfigfile();
        //TODO: save subclass-specific fields
    }

    @Override
    public void loadFromConfigFile(String sectionName) {
        super.loadFromConfigFile(sectionName);
        //TODO: load subclass-specific fields
    }
}
