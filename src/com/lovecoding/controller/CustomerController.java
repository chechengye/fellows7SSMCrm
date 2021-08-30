package com.lovecoding.controller;

import com.lovecoding.pojo.BaseDict;
import com.lovecoding.pojo.Customer;
import com.lovecoding.service.BaseDictService;
import com.lovecoding.service.CustomerService;
import com.lovecoding.utils.Page;
import com.lovecoding.vo.CommonResult;
import com.lovecoding.vo.QueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @RequestMapping("/customerEdit.do")
    @ResponseBody
    public CommonResult editCustomer(@RequestParam("id") Long id){
        Customer customer = customerService.getCustomerById(id);
        return new CommonResult("获取成功" , customer);
    }

    @RequestMapping("/customerUpdate.do")
    @ResponseBody
    public CommonResult updateCustomer(Customer customer){
        int rows = customerService.updateCustomer(customer);

        if(rows > 0){
            return new CommonResult("修改客户成功" , null);
        }else{
            return new CommonResult(408 , "修改客户失败" , null);
        }
    }

    @RequestMapping("/customerDelete.do")
    @ResponseBody
    public CommonResult customerDelete(@RequestParam Long id){//@RequestParam 强制ID是前端必传项
        System.out.println("id = " + id);
        int rows = customerService.customerDeleteById(id);
        if(rows > 0){
            return new CommonResult("删除客户成功" , null);
        }else{
            return new CommonResult(408 , "删除客户失败" , null);
        }
    }
}
