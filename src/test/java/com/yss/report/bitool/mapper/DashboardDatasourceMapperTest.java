package com.yss.report.bitool.mapper;

import com.google.gson.Gson;
import com.yss.report.bitool.entity.DashboardDatasource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DashboardDatasourceMapperTest {
    @Autowired
    DashboardDatasourceMapper dashboardDatasourceMapper;
    @Test
    public void test(){
        List<DashboardDatasource> dashboardDatasources = dashboardDatasourceMapper.selectAll();
        System.out.println(new Gson().toJson(dashboardDatasources));
    }
}