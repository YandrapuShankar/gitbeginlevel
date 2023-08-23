package com.olive.loan.app.service;

import java.util.List;

import org.springframework.web.context.request.async.DeferredResult;

import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.DeviceDetails;
import com.olive.loan.app.vo.LoanHistoryResponse;

public interface LoanHistoryService {

public void getLoanHistory(DeviceDetails req, DeferredResult<Result<List<LoanHistoryResponse>>> dr);

}
