package com.zerobase.fastlms.admin.banner.dto;

import com.zerobase.fastlms.admin.banner.entity.Banner;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BannerDto {
    Long id;
    Long openId;
    String bannerName;
    String imagePath;
    String linkAddress;
    String orderSort;
    LocalDateTime regDt;
    LocalDateTime udtDt;

    String filename;
    String urlFilename;

    long totalCount;
    long seq;

    public static List<BannerDto> of(List<Banner> banners) {
        if (banners != null) {
            List<BannerDto> bannerList = new ArrayList<>();
            for (Banner x : banners) {
                bannerList.add(BannerDto.of(x));
            }
            return bannerList;
        }

        return null;
    }

    public static BannerDto of(Banner banner) {
        return BannerDto.builder()
                .id(banner.getId())
                .openId(banner.getOpenId())
                .imagePath(banner.getImagePath())
                .bannerName(banner.getBannerName())
                .linkAddress(banner.getLinkAddress())
                .orderSort(banner.getOrderSort())
                .regDt(banner.getRegDt())
                .udtDt(banner.getUdtDt())
                .filename(banner.getFilename())
                .urlFilename(banner.getUrlFilename())
                .build();
    }
}
