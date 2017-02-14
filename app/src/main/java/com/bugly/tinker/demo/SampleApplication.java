package com.bugly.tinker.demo;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * 这是Tinker推荐的接入方式，一定程度上会增加接入成本，但具有更好的兼容性。
 * 这个类集成TinkerApplication类，这里面不做任何操作，所有Application的代码都会放到ApplicationLike继承类当中
 */
public class SampleApplication extends TinkerApplication {
    public SampleApplication() {
        /**
         参数1：tinkerFlags 表示Tinker支持的类型 dex only、library only or all suuport，default: TINKER_ENABLE_ALL
         参数2：delegateClassName Application代理类 这里填写你自定义的ApplicationLike
         参数3：loaderClassName Tinker的加载器，使用默认即可
         参数4：tinkerLoadVerifyFlag 加载dex或者lib是否验证md5，默认为false
         */
        super(ShareConstants.TINKER_ENABLE_ALL, "com.bugly.tinker.demo.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}