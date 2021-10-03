package com.example.demo.common.service;

import com.example.demo.common.entity.CommonEntity;
import com.example.demo.common.model.CommonDto;
import com.example.demo.common.repository.CommonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CommonService {

    private final CommonRepository commonRepository;

    public List<CommonEntity> getCommonList() {
        return commonRepository.findAll();
    }

    public CommonEntity getCommon(Integer id) {
        return commonRepository.findById(id).orElseGet(() -> null);
    }

    public CommonEntity saveCommon(CommonDto commonDto) {
        return commonRepository.save(commonDto.dtoToEntity());
    }

}
