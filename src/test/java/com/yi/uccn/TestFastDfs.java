//package com.yi.uccn;
//
//import cn.hutool.core.util.CharUtil;
//import org.csource.fastdfs.*;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class TestFastDfs {
//
//    @Test
//    public void testUpload() throws Exception {
//        // 先创建一个配置文件——fdfs_client.conf，配置文件的内容就是指定TrackerServer的地址
//        // 使用全局方法加载配置文件
//        ClientGlobal.init("fdfs_client.conf");
//        // 创建一个TrackerClient对象
//        TrackerClient trackerClient = new TrackerClient();
//        // 通过TrackerClient对象获得TrackerServer对象
//        TrackerServer trackerServer = trackerClient.getConnection();
//        // 创建StorageServer的引用，null就可以了
//        StorageServer storageServer = null;
//        // 创建一个StorageClient对象，其需要两个参数，一个是TrackerServer，一个是StorageServer
//        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
//        // 使用StorageClient对象上传文件(图片)
//        // 参数1：文件名，参数名：扩展名，不能包含"."，参数3：文件的元数据，保存文件的原始名、大小、尺寸等，如果没有可为null
////        String[] strings = storageClient.upload_file("E:\\图库\\图片\\1 (1).png", "jpg", null);
//        String[] strings = storageClient.upload_file("D:\\图库\\壁纸\\1 (1).jpg", "jpg", null);
//
//        int port = ClientGlobal.getG_tracker_http_port();
//        String serverIp = trackerServer.getInetSocketAddress().getHostString();
//
//        StringBuffer buffer = new StringBuffer();
//
//        buffer.append("http://");
//        buffer.append(serverIp);
//        buffer.append(CharUtil.COLON);
//        buffer.append(port);
//        for (String str : strings) {
//            buffer.append(CharUtil.SLASH);
//            buffer.append(str);
//        }
//
//        System.out.println("图片地址：" + buffer.toString());
//    }
//}
