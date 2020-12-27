package org.sbzl.nightwatch.blog.service.impl;

import com.sun.management.OperatingSystemMXBean;
import org.sbzl.nightwatch.blog.service.MonitorService;
import org.springframework.stereotype.Service;

import java.lang.management.ManagementFactory;

@Service
public class MonitorServiceImpl implements MonitorService {


    @Override
    public int getFreeMemory(){
           OperatingSystemMXBean osmxb = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
           long totalVirtualMemory = osmxb.getTotalPhysicalMemorySize();
           long freePhysicalMemorySize = osmxb.getFreePhysicalMemorySize();
           Double compare = (freePhysicalMemorySize * 1.0 / totalVirtualMemory) * 100;
           return compare.intValue();
    }
}
