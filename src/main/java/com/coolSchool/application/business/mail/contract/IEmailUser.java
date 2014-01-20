package com.coolSchool.application.business.mail.contract;

public interface IEmailUser {

	public void sendMail(String from, String to, String subject, String msg);

}
