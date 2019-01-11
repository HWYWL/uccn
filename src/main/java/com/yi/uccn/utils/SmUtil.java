package com.yi.uccn.utils;

import cn.hutool.core.io.FileUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.yi.uccn.config.Config;
import com.yi.uccn.model.Sm;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 图床上传工具
 * @author YI
 * @date 2019-1-11 09:32:10
 */
public class SmUtil {
    /**
     * @param multipartFile 表单名称。上传图片用到
     * @param ssl 是否使用 https 输出，强制开启
     * @param format 输出的格式。可选值有 json、xml。默认为 json
     * @return
     */
    public static Sm saveFile(MultipartFile multipartFile, boolean ssl, String format){
        Map<String, Object> map = new HashMap<>(16);
        map.put("smfile", getFile(multipartFile));
        map.put("ssl", ssl);
        map.put("format", format);

        String smStr = HttpUtil.post(Config.SM_URL, map);

        return JSONUtil.toBean(smStr, Sm.class);
    }

    /**
     * @param multipartFile 表单名称。上传图片用到
     * @param format 输出的格式。可选值有 json、xml。默认为 json
     * @return
     */
    public static Sm saveFile(MultipartFile multipartFile, String format){
        Map<String, Object> map = new HashMap<>(16);
        map.put("smfile", getFile(multipartFile));
        map.put("format", format);

        String smStr = HttpUtil.post(Config.SM_URL, map);

        return JSONUtil.toBean(smStr, Sm.class);
    }

    /**
     * @param multipartFile 表单名称。上传图片用到
     * @param ssl 是否使用 https 输出，强制开启
     * @return
     */
    public static Sm saveFile(MultipartFile multipartFile, boolean ssl){
        Map<String, Object> map = new HashMap<>(16);
        map.put("smfile", getFile(multipartFile));
        map.put("ssl", ssl);

        String smStr = HttpUtil.post(Config.SM_URL, map);

        return JSONUtil.toBean(smStr, Sm.class);
    }

    /**
     * @param multipartFile 表单名称。上传图片用到
     * @return
     */
    public static Sm saveFile(MultipartFile multipartFile){
        Map<String, Object> map = new HashMap<>(16);
        map.put("smfile", getFile(multipartFile));

        String smStr = HttpUtil.post(Config.SM_URL, map);

        return JSONUtil.toBean(smStr, Sm.class);
    }

    public static File getFile(MultipartFile multipartFile){
        File file = new File(multipartFile.getName());
        try {
            FileUtil.writeFromStream(multipartFile.getInputStream(), file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return file;
    }
}
