package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "help_relation")
public class HelpRelation {
    @Column(name = "help_topic_id")
    private Integer helpTopicId;

    @Column(name = "help_keyword_id")
    private Integer helpKeywordId;

    /**
     * @return help_topic_id
     */
    public Integer getHelpTopicId() {
        return helpTopicId;
    }

    /**
     * @param helpTopicId
     */
    public void setHelpTopicId(Integer helpTopicId) {
        this.helpTopicId = helpTopicId;
    }

    /**
     * @return help_keyword_id
     */
    public Integer getHelpKeywordId() {
        return helpKeywordId;
    }

    /**
     * @param helpKeywordId
     */
    public void setHelpKeywordId(Integer helpKeywordId) {
        this.helpKeywordId = helpKeywordId;
    }
}