package org.ME4595.ConfigModel.Section.Crawlers;

import org.ME4595.ConfigModel.Section.CrawlSection;
import org.ME4595.ConfigModel.Types.CrawlerType;

import java.io.File;

public class LocalCrawlerSection extends CrawlSection {
    private File target;
    private double crawl_delay; //TODO verwendet PFERD single, double oder float?
    private double download_delay; //TODO verwendet PFERD single, double oder float?
    private int download_speed;

    public LocalCrawlerSection(String crawlerName){
        super(crawlerName);
        crawlerType = CrawlerType.local;
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
