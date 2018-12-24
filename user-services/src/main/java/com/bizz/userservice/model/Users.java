/**
 * 
 */
package com.bizz.userservice.model;

/**
 * @author Rahul Kumar
 *
 */
public class Users {
	private String name;
	private String mobile;
	private String email;
	private String acc_no;
	private String ifsc;
	private String bank_name;
	private String name_bank_acc;
	private String security_ques1;
	private String security_ques2;
	private String password;
	private String reffered_by;
	
	
	
	public Users() {
		// TODO Auto-generated constructor stub
	}



	public Users(String name, String mobile, String email, String acc_no, String ifsc, String bank_name,
			String name_bank_acc, String security_ques1, String security_ques2, String password, String reffered_by) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.acc_no = acc_no;
		this.ifsc = ifsc;
		this.bank_name = bank_name;
		this.name_bank_acc = name_bank_acc;
		this.security_ques1 = security_ques1;
		this.security_ques2 = security_ques2;
		this.password = password;
		this.reffered_by = reffered_by;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}



	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}



	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



	/**
	 * @return the acc_no
	 */
	public String getAcc_no() {
		return acc_no;
	}



	/**
	 * @param acc_no the acc_no to set
	 */
	public void setAcc_no(String acc_no) {
		this.acc_no = acc_no;
	}



	/**
	 * @return the ifsc
	 */
	public String getIfsc() {
		return ifsc;
	}



	/**
	 * @param ifsc the ifsc to set
	 */
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}



	/**
	 * @return the bank_name
	 */
	public String getBank_name() {
		return bank_name;
	}



	/**
	 * @param bank_name the bank_name to set
	 */
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}



	/**
	 * @return the name_bank_acc
	 */
	public String getName_bank_acc() {
		return name_bank_acc;
	}



	/**
	 * @param name_bank_acc the name_bank_acc to set
	 */
	public void setName_bank_acc(String name_bank_acc) {
		this.name_bank_acc = name_bank_acc;
	}



	/**
	 * @return the security_ques1
	 */
	public String getSecurity_ques1() {
		return security_ques1;
	}



	/**
	 * @param security_ques1 the security_ques1 to set
	 */
	public void setSecurity_ques1(String security_ques1) {
		this.security_ques1 = security_ques1;
	}



	/**
	 * @return the security_ques2
	 */
	public String getSecurity_ques2() {
		return security_ques2;
	}



	/**
	 * @param security_ques2 the security_ques2 to set
	 */
	public void setSecurity_ques2(String security_ques2) {
		this.security_ques2 = security_ques2;
	}



	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}



	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}



	/**
	 * @return the reffered_by
	 */
	public String getReffered_by() {
		return reffered_by;
	}



	/**
	 * @param reffered_by the reffered_by to set
	 */
	public void setReffered_by(String reffered_by) {
		this.reffered_by = reffered_by;
	}
	
	

}
