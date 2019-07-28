package com.gphw.starter.springboot.zookeeper;

import com.gphw.starter.zookeeper.ZookeeperTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Jiang
 * @Date: 2019/7/27 17:37
 */
@RestController
public class ZookeeperController {

    @Autowired
    ZookeeperTemplate zookeeperTemplate;

    @GetMapping("/createZk")
    public String createZkNode(){
        try {
            zookeeperTemplate.createData("/springZkNode","springNode111");
        } catch (Exception e) {
            e.printStackTrace();
            return "create zknode error! ErrMsg:</br>"+e.getMessage();
        }
        return "create zknode success!";
    }
}
