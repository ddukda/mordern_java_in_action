package com.example.demo.common.entity;

import com.example.demo.common.model.CommonDto;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class CommonEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String desc;

    public CommonEntity updateCommon(CommonDto dto) {
        this.builder()
                .name(dto.getName())
                .desc(dto.getDesc())
                .build();
        return this;
    }
}
