package com.zerobase.fastlms.admin.banner.mapper;


import com.zerobase.fastlms.admin.banner.dto.BannerDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BannerMapper {

    List<BannerDto> select(BannerDto parameter);

}
