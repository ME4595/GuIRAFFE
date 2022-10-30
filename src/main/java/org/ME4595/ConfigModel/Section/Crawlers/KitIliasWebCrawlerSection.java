package org.ME4595.ConfigModel.Section.Crawlers;

import org.ME4595.ConfigModel.Section.AuthSection;
import org.ME4595.ConfigModel.Section.Authenticators.TfaAuthSection;
import org.ME4595.ConfigModel.Section.CrawlSection;
import org.ME4595.ConfigModel.Types.CrawlerType;
import org.ME4595.ConfigModel.Types.ExternalLinkRepresentationMode;

public class KitIliasWebCrawlerSection extends CrawlSection {
    private String target;
    private AuthSection auth;
    private TfaAuthSection tfa_auth;
    private ExternalLinkRepresentationMode links;
    private double link_redirect_delay;
    private boolean videos;
    private double http_timeout;

    public KitIliasWebCrawlerSection(String crawlerName){
        super(crawlerName);
        type = CrawlerType.kit_ilias_web;
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
