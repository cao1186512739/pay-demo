package com.louis.epay.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @RequestMapping("/testAliPay")
    private String test(){
        String a = "<form name=\"punchout_form\" method=\"post\" action=\"https://openapi.alipaydev.com/gateway.do?charset=utf-8&method=alipay.trade.page.pay&sign=QMDJBy7gXjpcDjT31pQUV26ZOByLwnnMWlY71zRmkvOoTWod3i2k%2BH8wIrxjEMHalDFK8I2E1e1dNnqTdc4f%2B%2FxFSH3k%2BEy5roTRp4Gsy%2BvCaLBYjrEJL%2B%2FTiR%2BbtT1yHMPTcOfarvdRG9Kwhc8AWQqWjo7uFCVEZzz9IfIF5uImm1pi3BcxxByRgVsbi0tru9uBnGkAquelfbJe%2Bn8H87BBHnnb7IpPHbvlaeVyyItBp3PLiNg%2FWMQMP1Xtao90j3bAs%2Fdbx7%2Bt5M3qDJSBKkenhZV%2B0qhfhEiQfRIBqdoW1hSOKFvqRv4qsJOQ4R4kUTv5VnxLt73Zs96OnPJzAQ%3D%3D&return_url=http%3A%2F%2F%E5%A4%96%E7%BD%91ip%3A%E7%AB%AF%E5%8F%A3%2Fsccess.html&notify_url=http%3A%2F%2F%E5%A4%96%E7%BD%91ip%3A%E7%AB%AF%E5%8F%A3%2Ferror.html&version=1.0&app_id=2016092300579341&sign_type=RSA2&timestamp=2019-11-26+11%3A15%3A20&alipay_sdk=alipay-sdk-java-3.1.0&format=json\">\n" +
                "<input type=\"hidden\" name=\"biz_content\" value=\"{&quot;body&quot;:&quot;红魔手机 努比亚出品游戏手机&quot;,&quot;out_trade_no&quot;:&quot;dzcp1000100010&quot;,&quot;product_code&quot;:&quot;FAST_INSTANT_TRADE_PAY&quot;,&quot;subject&quot;:&quot;红魔手机&quot;,&quot;timeout_express&quot;:&quot;10m&quot;,&quot;total_amount&quot;:&quot;0.1&quot;}\">\n" +
                "<input type=\"submit\" value=\"立即支付\" style=\"display:none\" >\n" +
                "</form>\n" +
                "<script>document.forms[0].submit();</script>";
        return a;
    }
}
