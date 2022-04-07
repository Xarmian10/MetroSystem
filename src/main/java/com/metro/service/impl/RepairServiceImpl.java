package com.metro.service.impl;

import com.metro.mapper.RepairMapper;
import com.metro.pojo.Repair;
import com.metro.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RepairServiceImpl implements RepairService {
    @Autowired
    RepairMapper repairMapper;

    @Override
    public int insertRepair(Map map) {
        return repairMapper.insertRepair(map);
    }

    @Override
    public List<Repair> findAllRepair() {
        return repairMapper.findAllRepair();
    }

    @Override
    public List<Repair> findAllRepairByPage(int satrt, int pagesize) {
        return repairMapper.findAllRepairByPage(satrt, pagesize);
    }


}
