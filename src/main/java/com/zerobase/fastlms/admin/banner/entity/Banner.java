package com.zerobase.fastlms.admin.banner.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    long openId;

    String bannerName;
    String imagePath;
    String linkAddress;
    String orderSort;

    LocalDateTime regDt;
    LocalDateTime udtDt;

    String filename;
    String urlFilename;
}
