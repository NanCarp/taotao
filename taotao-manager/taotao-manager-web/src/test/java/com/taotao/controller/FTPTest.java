package com.taotao.controller;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

public class FTPTest {
	
	@Test
	public void testFtpClient() throws Exception {
		FTPClient ftpClient = new FTPClient();
		
		ftpClient.connect("192.168.0.109", 21);
		
		ftpClient.login("ftpuser", "ftpuser");
		
		FileInputStream inputStream = new FileInputStream(new File("‪D:\\Users\\nanca\\Desktop\\004.jpg"));
		
		ftpClient.changeWorkingDirectory("/home/ftpuser/www/images");
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
		
		ftpClient.storeFile("hello1.jpg", inputStream);
		
		ftpClient.logout();
	}
}
