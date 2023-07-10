package com.zerobase.fastlms.hisotry.repository;

import com.zerobase.fastlms.hisotry.entity.LoginHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoginHistoryRepository extends JpaRepository<LoginHistory, Long> {
    List<LoginHistory> findLoginHistoriesByUserIdOrderByLoginDateDesc(String userId);

}
