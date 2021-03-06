package com.metro.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.metro.param.line.LineInsert;
import com.metro.param.lineInsert.LineInsertSearchParam;
import com.metro.pojo.FrankResult;
import com.metro.pojo.LineStartAndEnd;
import com.metro.service.LineInsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Version 1.0
 * @Author:XARMIAN
 * @Date:2022/4/5
 * @Content:
 */
@RestController
@RequestMapping("/lineInsert")
public class LineInsertController {

    @Autowired
    LineInsertService lineInsertService;

    @PostMapping("/findStartAndEnd")
    public FrankResult<LineStartAndEnd> findStartAndEndStation(@RequestBody LineInsertSearchParam param) {
        return FrankResult.success(lineInsertService.getStartEnd(param.getLineName()));
    }

    @PostMapping("/findLength")
    public FrankResult<Integer> findLength(@RequestBody LineInsertSearchParam param) {
        return FrankResult.success(lineInsertService.getLength(param.getLineName()));
    }

    @PostMapping("/listAll")
    public FrankResult<List<LineInsert>> listAll() {
        return FrankResult.success(lineInsertService.selectLineInsertAll());
    }

    @PostMapping("/listOne")
    public FrankResult<LineInsert> listOne(@RequestBody LineInsertSearchParam param) {
        return FrankResult.success(lineInsertService.selectLineInsert(param.getLineName()));
    }
}
