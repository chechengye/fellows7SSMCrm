package com.lovecoding.service;

import com.lovecoding.utils.Page;
import com.lovecoding.vo.QueryVo;

public interface CustomerService {
    Page getPageByVo(QueryVo vo);
}
