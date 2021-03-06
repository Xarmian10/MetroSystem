package com.metro.controller;

import com.alibaba.fastjson.JSON;
import com.metro.pojo.Pay;
import com.metro.service.PayService;
import com.metro.util.Layui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PayController {
    @Autowired
    PayService payService;

    @ResponseBody
    @RequestMapping(value = "/findAllPayByPage",produces="application/json;charset=UTF-8")
    public String findAllPayByPage(@RequestParam("limit") String limit, @RequestParam("page") String page) {
        int start = (Integer.parseInt(page) - 1)*Integer.parseInt(limit);
        int pageSize = Integer.parseInt(limit);
        List<Pay> pays = payService.findAllPayByPage(start,pageSize);
        List<Pay> payAll = payService.findAllPay();
        Layui l = Layui.data(payAll.size(), pays);
        String result = JSON.toJSONString(l);
        return result;
    }

}
