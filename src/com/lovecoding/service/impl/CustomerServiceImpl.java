package com.lovecoding.service.impl;

import com.github.pagehelper.PageHelper;
import com.lovecoding.mapper.CustomerMapper;
import com.lovecoding.pojo.Customer;
import com.lovecoding.pojo.CustomerExample;
import com.lovecoding.service.CustomerService;
import com.lovecoding.utils.Page;
import com.lovecoding.vo.QueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{


    @Autowired
    CustomerMapper customerMapper;


    @Override
    public Page getPageByVo(QueryVo vo) {
        Page page = new Page();
        CustomerExample ce = new CustomerExample();
        CustomerExample.Criteria criteria = ce.createCriteria();
        if(null != vo){
            if(null != vo.getPage()){
                page.setPage(vo.getPage());
            }
            vo.setMaxCount(10);
            page.setSize(vo.getMaxCount());

            if(null != vo.getCustName() && !"".equals(vo.getCustName())){
                criteria.andCustNameLike("%" +vo.getCustName()+ "%");
            }
            if(null != vo.getCustSource() && !"".equals(vo.getCustSource())){
                criteria.andCustSourceEqualTo(vo.getCustSource());
            }
            if(null != vo.getCustIndustry() && !"".equals(vo.getCustIndustry())){
                criteria.andCustIndustryEqualTo(vo.getCustIndustry());
            }

            if(null != vo.getCustLevel() && !"".equals(vo.getCustLevel())){
                criteria.andCustLevelEqualTo(vo.getCustLevel());
            }
            page.setTotal(((Long)customerMapper.countByExample(ce)).intValue());

            //会在即将执行的SQL上面 最后位置拼上LIMIT index , count
            PageHelper.startPage(page.getPage() , vo.getMaxCount());
            List<Customer> customerList = customerMapper.selectByExample(ce);
            //LIMIT 0 ,10
            //推荐 使用分页插件来配合逆向工程
            //还没有做分页处理
            page.setRows(customerList);
        }
        return page;
    }

    /**
     * 根据主键获取客户信息用于回显
     * @param id
     * @return
     */
    @Override
    public Customer getCustomerById(Long id) {
        return customerMapper.selectByPrimaryKey(id);
    }

    /**
     * 更新客户信息
     * @param customer
     * @return
     */
    @Override
    public int updateCustomer(Customer customer) {

        return customerMapper.updateByPrimaryKey(customer);
    }

    /**
     * 删除客户信息
     * @param id
     * @return
     */
    @Override
    public int customerDeleteById(Long id) {
        /*
          若是假删除
          Customer customer = customerMapper.selectByPrimaryKey(id);
          customer.setIsDelete(1);
          customerMapper.updateByPrimaryKey(customer);
         */
        return customerMapper.deleteByPrimaryKey(id);
    }
}
