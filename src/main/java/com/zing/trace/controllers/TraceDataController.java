package com.zing.trace.controllers;

import com.alibaba.fastjson.JSON;
import com.zing.trace.entities.TracedProduct;
import com.zing.trace.servicies.ITracedInfoCollectorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class TraceDataController {
    private static Logger logger = LoggerFactory.getLogger(TraceDataController.class);

    @Autowired
    ITracedInfoCollectorService tcService;

    @RequestMapping(value = "upload/traceinfo")
    @ResponseBody
    public String uploadTraceInfo(TracedProduct traceInfo) {
        logger.info("IndexController list called.");
        tcService.saveTraceInfo(traceInfo);
        return "ok";
    }

    @ResponseBody
    @GetMapping(value = "/search/{qrcode}")
    public String findAll(@PathVariable String qrcode) {
        return JSON.toJSONString(tcService.findTraceabilityData(qrcode));
    }
}
