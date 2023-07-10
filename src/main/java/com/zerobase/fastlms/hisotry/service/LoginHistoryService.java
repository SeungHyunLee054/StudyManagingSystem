package com.zerobase.fastlms.hisotry.service;

import com.zerobase.fastlms.admin.dto.LoginHistoryDto;
import com.zerobase.fastlms.hisotry.entity.LoginHistory;
import com.zerobase.fastlms.hisotry.repository.LoginHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LoginHistoryService {
    private final LoginHistoryRepository loginHistoryRepository;

    public void saveLoginHistory(LoginHistory loginHistory) {
        loginHistoryRepository.save(loginHistory);
    }

    public List<LoginHistoryDto> getUserLoginHistory(String userId) {
        List<LoginHistory> loginHistories = loginHistoryRepository.findLoginHistoriesByUserIdOrderByLoginDateDesc(userId);

        return loginHistories.stream()
                .map(LoginHistoryDto::fromEntity)
                .collect(Collectors.toList());
    }
}
