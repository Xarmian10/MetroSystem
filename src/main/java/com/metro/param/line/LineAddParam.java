package com.metro.param.line;

import lombok.Data;


import java.util.List;


/**
 * @Version 1.0
 * @Author:XARMIAN
 * @Date:2022/3/11
 * @Content:
 */
@Data
public class LineAddParam {

    /**
     * 线路名
     */
    private String name;

    /**
     * 线路城市
     */
    private String city;

    /**
     * 线路城市代码
     */
    private String cityCode;

    /**
     * 线路颜色
     */
    private String color;

    /**
     * 线路中的站点信息
     */
    private List<String> station;

    /**
     * 起始时间
     */
    private String beginTime;

    /**
     * 结束时间
     */
    private String endTime;

}
