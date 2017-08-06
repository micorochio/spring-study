package com.zing.trace.servicies;


import com.zing.trace.entities.TracedProduct;

public interface ITracedInfoCollectorService {
    void saveTraceInfo(TracedProduct traceInfo);

    TracedProduct findTraceabilityData(String qrcode);

}
