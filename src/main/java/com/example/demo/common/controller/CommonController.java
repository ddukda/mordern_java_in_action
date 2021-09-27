package com.example.demo.common.controller;

import com.example.demo.common.entity.CommonEntity;
import com.example.demo.common.model.CommonDto;
import com.example.demo.common.service.CommonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/common")
@AllArgsConstructor
public class CommonController {

    private final CommonService commonService;


    @GetMapping("")
    public List<CommonEntity> getCommonList() {
        return commonService.getCommonList();
    }

    @GetMapping("/{id}")
    public CommonEntity getCommon(@PathVariable Integer id) {
        return commonService.getCommon(id);
    }

    @PostMapping("")
    public CommonEntity saveCommon(@RequestBody CommonDto commonDto) {
        return commonService.saveCommon(commonDto);
    }
}
