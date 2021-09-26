package com.example.demo.common.model;

import com.example.demo.common.entity.CommonEntity;
import lombok.Data;

@Data
public class CommonDto {
    private String name;
    private String desc;

    public CommonEntity dtoToEntity() {
        return CommonEntity.builder().name(this.name).desc(this.desc).build();
    }
}
