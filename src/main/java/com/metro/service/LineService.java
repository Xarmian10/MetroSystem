package com.metro.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.metro.param.line.*;
import com.metro.pojo.FrankResult;
import com.metro.pojo.Line;
import com.metro.pojo.frank.FrankPageAble;

/**
 * @Version 1.0
 * @Author:XARMIAN
 * @Date:2022/2/28
 * @Content:
 */

public interface LineService extends IService<Line> {
    Boolean addLine(LineAddParam param);

    Boolean deleteLine(LineDeleteParam param);

    Boolean updateLine(LineUpdateParam param);

    FrankResult<FrankPageAble<Line>> pageLine(LinePageParam param);

}
