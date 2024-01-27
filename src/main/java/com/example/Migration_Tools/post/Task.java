package com.example.Migration_Tools.post;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.time.LocalDateTime;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Task implements Serializable {
    private Integer id;
    private String title;
    private String description;
    private String label;
    private LocalDateTime createdAt;
}
