package com.example.demo.common.controller;

import com.example.demo.common.entity.CommonEntity;
import com.example.demo.common.model.CommonDto;
import com.example.demo.common.repository.CommonRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/common")
@AllArgsConstructor
public class CommonController {

    private final CommonRepository commonRepository;


    @GetMapping("")
    public String main() {

        CommonDto commonDto = new CommonDto();
        commonDto.setName("JiNO");
        commonDto.setDesc("test common controller");
        commonRepository.save(commonDto.dtoToEntity());

        Optional<CommonEntity> byId = commonRepository.findById(1);
        System.out.println("byId.get().getName() = " + byId.get().getName());

        commonRepository.findAll().stream().forEach(commonEntity -> System.out.println("commonEntity.getId() = " + commonEntity.getId()));
        
        return "hello world!";
    }
}
