package com.example.tkmybatisdemo.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

import java.util.HashMap;

/**
 * @author pangxin01822
 */
public enum GenderEnum {
    UNKNOWN(0, "未知"),
    MALE(1, "男"),
    FEMALE(2, "女"),
    ;

    @JsonValue
    @EnumValue
    @Getter
    private final int code;

    @Getter
    private final String description;

    GenderEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    private static final HashMap<Integer, GenderEnum> values = new HashMap<>();

    static {
        for (final GenderEnum type : GenderEnum.values()) {
            GenderEnum.values.put(type.getCode(), type);
        }
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static GenderEnum of(int code) {
        return GenderEnum.values.get(code);
    }
}

