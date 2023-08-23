package com.olive.loan.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olive.loan.app.entity.DeviceInfo;

public interface DeviceInfoRepository extends JpaRepository<DeviceInfo, Long> {

}
