package com.bayu.transferservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetUserDataResponse implements Serializable {

    private static final long serialVersionUID = -5162048181419050911L;

    private String userProfile;

    private String userInformation;

    private String userDevice;

    private String userNotificationSetting;
}
