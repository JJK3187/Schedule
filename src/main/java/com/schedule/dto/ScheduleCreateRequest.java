package com.schedule.dto;

import lombok.Getter;

@Getter
public class ScheduleCreateRequest {

    private String title;
    private String contents;
    private String name;
    private String password;
}
