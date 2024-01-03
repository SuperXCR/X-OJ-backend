package com.yupi.xoj.judge.codesandbox.impl;

import com.yupi.xoj.judge.codesandbox.CodeSandbox;
import com.yupi.xoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.xoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 第三方代码沙箱（调用网上现成的沙箱）
 * @Author : SuperXCR
 * @Create 2024-01-03
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}