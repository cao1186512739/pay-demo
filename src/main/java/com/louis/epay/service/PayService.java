package com.louis.epay.service;

import com.alipay.api.AlipayApiException;
import com.louis.epay.alipay.AlipayBean;

/**
 * 支付服务
 */
public interface PayService {

	/**
	 * 支付宝支付接口
	 * @param alipayBean
	 * @return
	 * @throws AlipayApiException
	 */
	String aliPay(AlipayBean alipayBean) throws AlipayApiException;

}
