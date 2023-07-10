package com.zerobase.fastlms.admin.dto;

import com.zerobase.fastlms.hisotry.entity.LoginHistory;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginHistoryDto {
    private Long id;
    private String userId;
    private LocalDateTime loginDate;
    private String clientIp;
    private String userAgent;

    public static LoginHistoryDto fromEntity(LoginHistory loginHistory) {
        return LoginHistoryDto.builder()
                .id(loginHistory.getId())
                .userId(loginHistory.getUserId())
                .loginDate(loginHistory.getLoginDate())
                .clientIp(loginHistory.getClientIp())
                .userAgent(loginHistory.getUserAgent())
                .build();
    }
}
