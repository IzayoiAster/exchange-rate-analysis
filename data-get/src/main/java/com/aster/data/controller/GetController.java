package com.aster.data.controller;

import com.alibaba.fastjson.JSON;
import com.aster.data.domain.*;
import com.aster.data.mapper.*;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.util.*;

@RestController
public class GetController {

    @Autowired
    private Per1mMapper per1mMapper;

    @Autowired
    private Per5mMapper per5mMapper;

    @Autowired
    private Per10mMapper per10mMapper;

    @Autowired
    private Per30mMapper per30mMapper;

    @Autowired
    private Per1hMapper per1hMapper;

    @GetMapping("/per1m")
    public String per1m() {
        List<Per1m> list = per1mMapper.selectList(null);
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        ArrayList<Double> l3 = new ArrayList<>();
        ArrayList<Double> l4 = new ArrayList<>();
        ArrayList<Double> l5 = new ArrayList<>();
        ArrayList<Double> l6 = new ArrayList<>();
        ArrayList<Double> l7 = new ArrayList<>();
        for (Per1m per1m : list) {
            l1.add(per1m.getStartTime());
            l2.add(per1m.getEndTime());
            l3.add(per1m.getStartRate());
            l4.add(per1m.getEndRate());
            l5.add(per1m.getMaxRate());
            l6.add(per1m.getMinRate());
            l7.add(per1m.getAveRate());
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("StartTime", l1);
        map.put("EndTime", l2);
        map.put("StartRate", l3);
        map.put("EndRate", l4);
        map.put("MaxRate", l5);
        map.put("MinRate", l6);
        map.put("AveRate", l7);
        return JSON.toJSONString(map);
    }

    @GetMapping("/per5m")
    public String per5m() {
        List<Per5m> list = per5mMapper.selectList(null);
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        ArrayList<Double> l3 = new ArrayList<>();
        ArrayList<Double> l4 = new ArrayList<>();
        ArrayList<Double> l5 = new ArrayList<>();
        ArrayList<Double> l6 = new ArrayList<>();
        ArrayList<Double> l7 = new ArrayList<>();
        for (Per5m per5m : list) {
            l1.add(per5m.getStartTime());
            l2.add(per5m.getEndTime());
            l3.add(per5m.getStartRate());
            l4.add(per5m.getEndRate());
            l5.add(per5m.getMaxRate());
            l6.add(per5m.getMinRate());
            l7.add(per5m.getAveRate());
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("StartTime", l1);
        map.put("EndTime", l2);
        map.put("StartRate", l3);
        map.put("EndRate", l4);
        map.put("MaxRate", l5);
        map.put("MinRate", l6);
        map.put("AveRate", l7);
        return JSON.toJSONString(map);
    }

    @GetMapping("/per10m")
    public String per10m() {
        List<Per10m> list = per10mMapper.selectList(null);
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        ArrayList<Double> l3 = new ArrayList<>();
        ArrayList<Double> l4 = new ArrayList<>();
        ArrayList<Double> l5 = new ArrayList<>();
        ArrayList<Double> l6 = new ArrayList<>();
        ArrayList<Double> l7 = new ArrayList<>();
        for (Per10m per10m : list) {
            l1.add(per10m.getStartTime());
            l2.add(per10m.getEndTime());
            l3.add(per10m.getStartRate());
            l4.add(per10m.getEndRate());
            l5.add(per10m.getMaxRate());
            l6.add(per10m.getMinRate());
            l7.add(per10m.getAveRate());
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("StartTime", l1);
        map.put("EndTime", l2);
        map.put("StartRate", l3);
        map.put("EndRate", l4);
        map.put("MaxRate", l5);
        map.put("MinRate", l6);
        map.put("AveRate", l7);
        return JSON.toJSONString(map);
    }

    @GetMapping("/per30m")
    public String per30m() {
        List<Per30m> list = per30mMapper.selectList(null);
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        ArrayList<Double> l3 = new ArrayList<>();
        ArrayList<Double> l4 = new ArrayList<>();
        ArrayList<Double> l5 = new ArrayList<>();
        ArrayList<Double> l6 = new ArrayList<>();
        ArrayList<Double> l7 = new ArrayList<>();
        for (Per30m per30m : list) {
            l1.add(per30m.getStartTime());
            l2.add(per30m.getEndTime());
            l3.add(per30m.getStartRate());
            l4.add(per30m.getEndRate());
            l5.add(per30m.getMaxRate());
            l6.add(per30m.getMinRate());
            l7.add(per30m.getAveRate());
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("StartTime", l1);
        map.put("EndTime", l2);
        map.put("StartRate", l3);
        map.put("EndRate", l4);
        map.put("MaxRate", l5);
        map.put("MinRate", l6);
        map.put("AveRate", l7);
        return JSON.toJSONString(map);
    }

    @GetMapping("/per1h")
    public String per1h() {
        List<Per1h> list = per1hMapper.selectList(null);
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        ArrayList<Double> l3 = new ArrayList<>();
        ArrayList<Double> l4 = new ArrayList<>();
        ArrayList<Double> l5 = new ArrayList<>();
        ArrayList<Double> l6 = new ArrayList<>();
        ArrayList<Double> l7 = new ArrayList<>();
        for (Per1h per1h : list) {
            l1.add(per1h.getStartTime());
            l2.add(per1h.getEndTime());
            l3.add(per1h.getStartRate());
            l4.add(per1h.getEndRate());
            l5.add(per1h.getMaxRate());
            l6.add(per1h.getMinRate());
            l7.add(per1h.getAveRate());
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("StartTime", l1);
        map.put("EndTime", l2);
        map.put("StartRate", l3);
        map.put("EndRate", l4);
        map.put("MaxRate", l5);
        map.put("MinRate", l6);
        map.put("AveRate", l7);
        return JSON.toJSONString(map);
    }

}
