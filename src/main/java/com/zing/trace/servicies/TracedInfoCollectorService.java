package com.zing.trace.servicies;


import com.zing.trace.dao.TraceabilityData;
import com.zing.trace.entities.ProductAttr;
import com.zing.trace.entities.TracedProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TracedInfoCollectorService implements ITracedInfoCollectorService {
    @Autowired
    TraceabilityData traceabilityData;

    @Override
    public void saveTraceInfo(TracedProduct traceInfo) {
        long tId = traceabilityData.collectTraceProduct(traceInfo);
        List<ProductAttr> attrs = traceInfo.getAttrs();
        attrs.stream().forEach(attr -> attr.setArrId(tId));
        int ok = traceabilityData.collectTraceProductAttr(attrs);
    }

    @Override
    public TracedProduct findTraceabilityData(String qrcode) {
        return traceabilityData.findTraceabilityData(qrcode);
    }
}
