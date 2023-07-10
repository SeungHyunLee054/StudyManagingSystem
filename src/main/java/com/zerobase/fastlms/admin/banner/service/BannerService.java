package com.zerobase.fastlms.admin.banner.service;

import com.zerobase.fastlms.admin.banner.dto.BannerDto;
import com.zerobase.fastlms.admin.banner.entity.Banner;
import com.zerobase.fastlms.admin.banner.mapper.BannerMapper;
import com.zerobase.fastlms.admin.banner.model.BannerInput;
import com.zerobase.fastlms.admin.banner.repository.BannerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BannerService {
    private final BannerRepository bannerRepository;
    private final BannerMapper bannerMapper;

    public List<BannerDto> list() {
        List<Banner> banners = bannerRepository.findAll();

        return BannerDto.of(banners);
    }

    public boolean add(String bannerName) {
        Banner banner = Banner.builder()
                .bannerName(bannerName)
                .usingYn(true)
                .build();
        bannerRepository.save(banner);

        return true;
    }

    public boolean update(BannerInput parameter) {
        Optional<Banner> optionalBanner =
                bannerRepository.findById(parameter.getId());
        if (optionalBanner.isPresent()) {
            Banner banner = optionalBanner.get();
            banner.setBannerName(parameter.getBannerName());
            banner.setUsingYn(parameter.isUsingYn());
            bannerRepository.save(banner);
        }

        return true;
    }

    public boolean del(long id) {
        bannerRepository.deleteById(id);

        return true;
    }

    public List<BannerDto> frontList(BannerDto parameter) {
        return bannerMapper.select(parameter);
    }
}
