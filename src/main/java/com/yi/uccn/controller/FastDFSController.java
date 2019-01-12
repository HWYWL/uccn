package com.yi.uccn.controller;

import com.yi.uccn.model.Banner;
import com.yi.uccn.model.Sm;
import com.yi.uccn.service.BannerService;
import com.yi.uccn.utils.MessageResult;
import com.yi.uccn.utils.SmUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;

/**
 * FastDFS文件系统操作(现已改为图床)
 * @author YI
 * @date 2018-8-7 10:37:27
 */
@Controller
@RequestMapping("/fastdfs")
public class FastDFSController {
    private static Logger logger = LoggerFactory.getLogger(FastDFSController.class);

    @Autowired
    BannerService bannerService;

    /**
     * banner图片文件上传
     * @param file 文件
     * @return
     */
    @RequestMapping("/banner")
    @ResponseBody
    public MessageResult banner(@RequestParam("file") MultipartFile file) {
        HashMap<Object, Object> map = new HashMap<>(16);
        MessageResult messageResult = MessageResult.ok();
        Banner banner = new Banner();

        if (file.isEmpty()) {
            return MessageResult.errorMsg("请选择要上传的文件！");
        }

        try {
//            String path = saveFile(file);
            Sm sm = SmUtil.saveFile(file, false, "json");
            if (sm.getCode().equals("success")){
                map.put("data", sm.getData().getUrl());
                banner.setImgOptions(sm.getData().getUrl());

                bannerService.saveSelective(banner);
            }else {
                messageResult = MessageResult.errorMsg("上传失败！" + sm.getMsg());
            }
        } catch (Exception e) {
            logger.error("上传失败！", e);
            messageResult = MessageResult.errorMsg("上传失败！" + e.getMessage());
        }
        messageResult.setData(map);

        return messageResult;
    }

    /**
     * 文章图片或视频文件上传
     * @param file 文件
     * @return
     */
    @RequestMapping("/article")
    @ResponseBody
    public MessageResult article(@RequestParam("file") MultipartFile file) {
        HashMap<Object, Object> map = new HashMap<>(16);
        MessageResult messageResult = MessageResult.ok();

        if (file.isEmpty()) {
            return MessageResult.errorMsg("请选择要上传的文件！");
        }

        try {
            Sm sm = SmUtil.saveFile(file, false, "json");
            if (sm.getCode().equals("success")){
                map.put("data", sm.getData().getUrl());
            }else {
                messageResult = MessageResult.errorMsg("上传失败！" + sm.getMsg());
            }

        } catch (Exception e) {
            logger.error("上传失败！", e);
            messageResult = MessageResult.errorMsg("上传失败！" + e.getMessage());
        }
        messageResult.setData(map);

        return messageResult;
    }
}
