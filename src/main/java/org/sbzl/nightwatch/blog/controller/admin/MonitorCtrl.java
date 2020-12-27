package org.sbzl.nightwatch.blog.controller.admin;

import org.sbzl.nightwatch.blog.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 后台管理中监控页面
 * 目前只包括内存占用的监控
 */
@Controller
public class MonitorCtrl {

    private MonitorService monitorSer;

    @Autowired
    public MonitorCtrl(MonitorService monitorSer) {
        this.monitorSer = monitorSer;
    }

    @GetMapping("/admin")
    public String monitor(Model model) {
        model.addAttribute("freeMemory", monitorSer.getFreeMemory());
        return "admin/monitor";
    }
}
