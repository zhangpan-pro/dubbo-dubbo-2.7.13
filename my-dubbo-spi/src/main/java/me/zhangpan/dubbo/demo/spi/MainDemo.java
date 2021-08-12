package me.zhangpan.dubbo.demo.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

/**
 * TODO
 *
 * @author <a href="mailto:zhangpan252@gmail.com">ZhangPan</a>
 * @date 2021/8/12
 */
public class MainDemo {
    public static void main(String[] args) {
        ExtensionLoader<Protocol> extensionLoader = ExtensionLoader.getExtensionLoader(Protocol.class);
        Protocol protocol = extensionLoader.getExtension("dubbo");
        System.out.println(protocol);
    }

}
