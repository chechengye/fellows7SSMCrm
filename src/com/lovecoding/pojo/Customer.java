package com.lovecoding.pojo;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_id
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    private Long custId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_name
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    private String custName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_user_id
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    private Long custUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_create_id
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    private Long custCreateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_source
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    private String custSource;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_industry
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    private String custIndustry;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_level
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    private String custLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_linkman
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    private String custLinkman;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_phone
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    private String custPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_mobile
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    private String custMobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_zipcode
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    private String custZipcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_address
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    private String custAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_createtime
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    private Date custCreatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_id
     *
     * @return the value of customer.cust_id
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public Long getCustId() {
        return custId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_id
     *
     * @param custId the value for customer.cust_id
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public void setCustId(Long custId) {
        this.custId = custId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_name
     *
     * @return the value of customer.cust_name
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public String getCustName() {
        return custName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_name
     *
     * @param custName the value for customer.cust_name
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_user_id
     *
     * @return the value of customer.cust_user_id
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public Long getCustUserId() {
        return custUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_user_id
     *
     * @param custUserId the value for customer.cust_user_id
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public void setCustUserId(Long custUserId) {
        this.custUserId = custUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_create_id
     *
     * @return the value of customer.cust_create_id
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public Long getCustCreateId() {
        return custCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_create_id
     *
     * @param custCreateId the value for customer.cust_create_id
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public void setCustCreateId(Long custCreateId) {
        this.custCreateId = custCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_source
     *
     * @return the value of customer.cust_source
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public String getCustSource() {
        return custSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_source
     *
     * @param custSource the value for customer.cust_source
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_industry
     *
     * @return the value of customer.cust_industry
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public String getCustIndustry() {
        return custIndustry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_industry
     *
     * @param custIndustry the value for customer.cust_industry
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_level
     *
     * @return the value of customer.cust_level
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public String getCustLevel() {
        return custLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_level
     *
     * @param custLevel the value for customer.cust_level
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_linkman
     *
     * @return the value of customer.cust_linkman
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public String getCustLinkman() {
        return custLinkman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_linkman
     *
     * @param custLinkman the value for customer.cust_linkman
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public void setCustLinkman(String custLinkman) {
        this.custLinkman = custLinkman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_phone
     *
     * @return the value of customer.cust_phone
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public String getCustPhone() {
        return custPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_phone
     *
     * @param custPhone the value for customer.cust_phone
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_mobile
     *
     * @return the value of customer.cust_mobile
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public String getCustMobile() {
        return custMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_mobile
     *
     * @param custMobile the value for customer.cust_mobile
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_zipcode
     *
     * @return the value of customer.cust_zipcode
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public String getCustZipcode() {
        return custZipcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_zipcode
     *
     * @param custZipcode the value for customer.cust_zipcode
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public void setCustZipcode(String custZipcode) {
        this.custZipcode = custZipcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_address
     *
     * @return the value of customer.cust_address
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public String getCustAddress() {
        return custAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_address
     *
     * @param custAddress the value for customer.cust_address
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_createtime
     *
     * @return the value of customer.cust_createtime
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public Date getCustCreatetime() {
        return custCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_createtime
     *
     * @param custCreatetime the value for customer.cust_createtime
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    public void setCustCreatetime(Date custCreatetime) {
        this.custCreatetime = custCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", custId=").append(custId);
        sb.append(", custName=").append(custName);
        sb.append(", custUserId=").append(custUserId);
        sb.append(", custCreateId=").append(custCreateId);
        sb.append(", custSource=").append(custSource);
        sb.append(", custIndustry=").append(custIndustry);
        sb.append(", custLevel=").append(custLevel);
        sb.append(", custLinkman=").append(custLinkman);
        sb.append(", custPhone=").append(custPhone);
        sb.append(", custMobile=").append(custMobile);
        sb.append(", custZipcode=").append(custZipcode);
        sb.append(", custAddress=").append(custAddress);
        sb.append(", custCreatetime=").append(custCreatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}