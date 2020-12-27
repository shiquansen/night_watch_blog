package org.sbzl.nightwatch.blog.service;


import org.sbzl.nightwatch.blog.domain.Info;
import org.sbzl.nightwatch.blog.domain.UploadPic;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;

public interface FileUploadService {

    UploadPic uploadPic(HttpServletRequest request);

    Info updateAvatar(HttpServletRequest request);

    ResponseEntity<byte[]> gainPic(String dir, String picName);
}
