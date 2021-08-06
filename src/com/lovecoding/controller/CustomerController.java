package com.lovecoding.controller;

import com.lovecoding.pojo.BaseDict;
import com.lovecoding.service.BaseDictService;
import com.lovecoding.service.CustomerService;
import com.lovecoding.utils.Page;
import com.lovecoding.vo.QueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    BaseDictService baseDictService;

    @Autowired
    CustomerService customerService;
    @RequestMapping(value = "/getCustomerList.do" , method = {RequestMethod.POST , RequestMethod.GET})
    public String getCustomerList(QueryVo vo , Model model){
        List<BaseDict> fromType =  baseDictService.getDictTypeName("002");//代表查询客户来源列表
        model.addAttribute("fromType" , fromType);
        List<BaseDict> industryType =  baseDictService.getDictTypeName("001");//客户所属行业
        model.addAttribute("industryType" , industryType);
        List<BaseDict> levelType = baseDictService.getDictTypeName("006");//客户级别
        model.addAttribute("levelType" , levelType);
        Page page = customerService.getPageByVo(vo);

        System.out.println("vo = " + vo);
        model.addAttribute("vo" , vo);
        model.addAttribute("page" , page);
        return "customer";
    }
}
