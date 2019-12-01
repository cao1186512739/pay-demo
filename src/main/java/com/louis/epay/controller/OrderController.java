package com.louis.epay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alipay.api.AlipayApiException;
import com.louis.epay.alipay.AlipayBean;
import com.louis.epay.service.PayService;


@RestController()
@RequestMapping("order")
public class OrderController {

	@Autowired
	private PayService payService;

	/**
	 * 阿里支付
	 * @param tradeNo
	 * @param subject
	 * @param amount
	 * @param body
	 * @return
	 * @throws AlipayApiException
	 */
	@PostMapping(value = "alipay")
	public String alipay(String outTradeNo, String subject, String totalAmount, String body) throws AlipayApiException {
		AlipayBean alipayBean = new AlipayBean();
		alipayBean.setOut_trade_no(outTradeNo);
		alipayBean.setSubject(subject);
		alipayBean.setTotal_amount(totalAmount);
		alipayBean.setBody(body);
		return payService.aliPay(alipayBean);
	}
}
