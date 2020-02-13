package com.neu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.neu.gmall.bean.PmsProductSaleAttr;
import com.neu.gmall.bean.PmsSkuImage;
import com.neu.gmall.bean.PmsSkuInfo;
import com.neu.gmall.bean.PmsSkuSaleAttrValue;
import com.neu.gmall.service.SkuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class SkuController {

    @Reference
    private SkuService skuService;

    @RequestMapping("saveSkuInfo")
    @ResponseBody
    public String saveSkuInfo(@RequestBody PmsSkuInfo pmsSkuInfo){
        skuService.saveSkuInfo(pmsSkuInfo);
        return "Success";
    }




}
