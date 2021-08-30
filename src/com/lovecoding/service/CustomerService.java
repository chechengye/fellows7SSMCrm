package com.lovecoding.service;

import com.lovecoding.pojo.Customer;
import com.lovecoding.utils.Page;
import com.lovecoding.vo.QueryVo;

public interface CustomerService {
    Page getPageByVo(QueryVo vo);

    Customer getCustomerById(Long id);

    int updateCustomer(Customer customer);

    int customerDeleteById(Long id);
}
