package com.qianfeng.market.controller.pages;

import com.qianfeng.market.consts.GoodsConsts;
import com.qianfeng.market.controller.pages.back.GoodsController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author bingqiong.cbb
 * @date 2020-04-27 00:47
 **/
public class BaseController {
    Logger logger = LoggerFactory.getLogger(BaseController.class);
    /**
     * 上传文件
     * @param uploadDir
     * @param f
     * @return
     */
    protected String uploadFile(String uploadDir, MultipartFile f){
        String realPath = GoodsConsts.getUploadPath();
        String uploadPath = uploadDir + UUID.randomUUID()+"."+f.getContentType();
        System.out.println("FILE:"+uploadPath);
        File file = new File(realPath+uploadPath);
        System.out.println("FILE:"+file);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        try{
            if(!f.isEmpty()){
                if(f.getSize() > 0){
                    f.transferTo(file);
                    logger.info("图片已经存储到："+realPath+ uploadPath);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return realPath+ uploadPath;

    }
}
