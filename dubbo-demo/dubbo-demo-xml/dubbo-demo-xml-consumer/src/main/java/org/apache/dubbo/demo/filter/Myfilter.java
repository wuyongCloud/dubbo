package org.apache.dubbo.demo.filter;

import org.apache.dubbo.demo.consumer.MyServiceImpl;
import org.apache.dubbo.rpc.*;

/**
 * @author yong.wu
 * @ProjectName
 * @Description
 * @date 2022/1/20 18:15
 */
public class Myfilter implements Filter {

    private MyServiceImpl myService;

    public Myfilter() {
        System.out.printf("111");
    }

    public MyServiceImpl getMyService() {
        return myService;
    }

    public void setMyService(MyServiceImpl myService) {
        this.myService = myService;
    }

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {

        System.out.printf("调用自定义filter");

        return invoker.invoke(invocation);
    }
}
