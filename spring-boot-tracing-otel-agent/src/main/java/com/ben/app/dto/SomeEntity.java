package com.ben.app.dto;

import lombok.Builder;

@Builder
public record SomeEntity(String name, String description) {
}
