package com.louis.epay.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alipay.api.AlipayApiException;
import com.louis.epay.alipay.Alipay;
import com.louis.epay.alipay.AlipayBean;
import com.louis.epay.service.PayService;

@Service
public class PayServiceImpl implements PayService {

	@Autowired
	private Alipay alipay;
	
	@Override
	public String aliPay(AlipayBean alipayBean) throws AlipayApiException {
		return alipay.pay(alipayBean);
	}

}
