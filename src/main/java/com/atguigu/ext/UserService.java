package com.atguigu.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @author zhanghao
 * @date 2020/6/22 - 17:56
 */
@Service(value = "userService2")
public class UserService {

    @EventListener(classes = {ApplicationEvent.class})
    public void listen(ApplicationEvent event){
        System.out.println("UserService..监听到的事件:" + event);
    }
}
