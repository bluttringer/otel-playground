package com.ben.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
public record SomeEntity(String name, String description) {
}
