package com.metro.controller;

import com.metro.param.line.LineAddParam;
import com.metro.param.line.LineDeleteParam;
import com.metro.param.line.LinePageParam;
import com.metro.param.line.LineUpdateParam;
import com.metro.pojo.FrankResult;
import com.metro.pojo.Line;
import com.metro.pojo.frank.FrankPageAble;
import com.metro.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Version 1.0
 * @Author:XARMIAN
 * @Date:2022/3/22
 * @Content:
 */
@RestController
@RequestMapping("/line")
public class LineController {

    @Autowired
    LineService lineService;

    @PostMapping("/add")
    public FrankResult<Boolean> addLine(@RequestBody LineAddParam param) {
        return FrankResult.success(lineService.addLine(param));
    }

    @PostMapping("/delete")
    public FrankResult<Boolean> deleteLine(@RequestBody LineDeleteParam param) {
        return FrankResult.success(lineService.deleteLine(param));
    }

    @PostMapping("/edit")
    public FrankResult<Boolean> updateLine(@RequestBody LineUpdateParam param) {
        return FrankResult.success(lineService.updateLine(param));
    }

    @PostMapping("/page")
    @RequestMapping(value = "/page",produces="application/json;charset=UTF-8")
    public FrankResult<FrankPageAble<Line>> pageLine(@RequestBody LinePageParam param) {
        return lineService.pageLine(param);
    }

    @PostMapping("/getName")
    public FrankResult<List<String>> getLineName() {
        return FrankResult.success(lineService.getLineName());
    }



}
