package com.qianfeng.market.consts;



/**
 * @author bingqiong.cbb
 * @date 2020-04-27 00:22
 **/
public class GoodsConsts {
    /**
     * 可以
     */
    public static final String NO_UPLOAD_IMG = "/images/index/logo.png";
    public static final Double AREA_RANGE = 0.5;
    public static final String YES = "YES";
    public static final String NO = "NO";
    public static final String WINDOM_UPLOAD_PATH="G:\\";
    public static final String LINUX_UPLOAD_PATH="/";
    public static final String WINDOM_CONFIG_UPLOAD_PATH = "file:G:\\upload\\";
    public static final String MAC_CONFIG_UPLOAD_PATH = "/Users/chenbinbin/Downloads/";

    /**
     * 获取上传文件路径配置方法
     * @return
     */
    public static String getConfigUploadPath(){
        String realPath=GoodsConsts.MAC_CONFIG_UPLOAD_PATH;
        String systemType = System.getProperty("os.name");
        if(systemType.toLowerCase().contains("windows")){
            realPath= GoodsConsts.WINDOM_CONFIG_UPLOAD_PATH;
        }
        return realPath;
    }

    /**
     * 获取文件上传路径的范范
     * @return
     */
    public static String getUploadPath(){
        String realPath=GoodsConsts.MAC_CONFIG_UPLOAD_PATH;
        String systemType = System.getProperty("os.name");
        System.out.println(systemType);
        if(systemType.toLowerCase().contains("windows")){
            realPath= GoodsConsts.WINDOM_UPLOAD_PATH;
        }
        return realPath;
    }
}
