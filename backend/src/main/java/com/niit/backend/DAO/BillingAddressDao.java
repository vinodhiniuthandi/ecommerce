package com.niit.backend.DAO;

import org.springframework.stereotype.Repository;

import com.niit.backend.model.BillingAddress;
@Repository
public interface BillingAddressDao  {

void saveOrUpdate(BillingAddress billingaddress);
void deleteBillingAddress(String BillingAddressid);
BillingAddress getBillingAddress(String BillingAddressid);

}
