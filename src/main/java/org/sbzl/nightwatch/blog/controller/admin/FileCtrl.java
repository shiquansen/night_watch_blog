package org.sbzl.nightwatch.blog.controller.admin;


import org.sbzl.nightwatch.blog.domain.Info;
import org.sbzl.nightwatch.blog.domain.UploadPic;
import org.sbzl.nightwatch.blog.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FileCtrl {

    private FileUploadService uploadSer;

    @Autowired
    public FileCtrl(FileUploadService uploadSer) {
        this.uploadSer = uploadSer;
    }

    @PostMapping("/admin/file/uplPic.action")
    @ResponseBody
    public UploadPic uploadPic(HttpServletRequest request){
            return uploadSer.uploadPic(request);
    }

    @PostMapping("/admin/file/uplAva.action")
    public String uploadAva(HttpServletRequest request, Model model){
        Info info=uploadSer.updateAvatar(request);
        model.addAttribute("info",info);
        return "admin/info";
    }
}
