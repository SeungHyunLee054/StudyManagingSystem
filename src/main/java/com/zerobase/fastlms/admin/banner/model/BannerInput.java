package com.zerobase.fastlms.admin.banner.model;

import lombok.Data;

@Data
public class BannerInput {
    long id;
    String bannerName;
    String linkAddress;
    long openId;
    String oderSort;
    boolean isOpenYn;

    String idList;

    String filename;
    String urlFilename;
}
