package com.xworkz.springComponent;

public class Server {
	private String version;

	public Server() {
		System.out.println("created:" + this.getClass().getSimpleName());
		System.out.println("*************************************");

	}

	public void setVersion(String version) {
		this.version = version;
	}

	public boolean deploy(String app) {
		System.out.println("*************************************");

		System.out.println("app to deploy is:" + app);
		if (app != null) {

			System.out.println("app is deployed on server" + version);
			return Boolean.TRUE;

		} else {
			System.out.println("app is not deployed on server :");
		}
		return Boolean.FALSE;

	}

	@Override
	public String toString() {
		return "Server is tomcat";
	}

}
