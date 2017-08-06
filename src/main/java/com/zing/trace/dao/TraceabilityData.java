package com.zing.trace.dao;

import com.zing.trace.entities.ProductAttr;
import com.zing.trace.entities.TracedProduct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TraceabilityData {
    long collectTraceProduct(TracedProduct product);

    int collectTraceProductAttr(List<ProductAttr> attrs);

    TracedProduct findTraceabilityData(String qrcode);
}
