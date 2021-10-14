package com.inetbanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		File src = new File("./Configuration//config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (IOException e) {
			System.out.println("Exception is  " + e.getMessage());

		}

	}

	public String getApplicationURl() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getUsername() {
		String username = pro.getProperty("UserID");
		return username;
	}

	public String getPassword() {
		String password = pro.getProperty("Password");
		return password;
	}

	public String getChromePath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}

	public String getIEPath() {
		String IEPath = pro.getProperty("iepath");
		return IEPath;
	}

	public String getfirefoxpath() {
		String FFoxPath = pro.getProperty("firefoxpat");
		return FFoxPath;

	}
}
