package com.xworkz.springComponent;

public class Application {
private String url;
private Server server;
public Application() {
	System.out.println("creted:" + this.getClass().getSimpleName());
}
public void setServer(Server server) {
	  System.out.println("setServer"+ server);
	this.server =server;
}

public void setUrl(String url) {
	  System.out.println("seturl"+url);
	this.url = url;
}
  public boolean run() {
	  System.out.println("*****************************");
	  System.out.println("run at URL:" + url);
	  boolean isDeployed= server.deploy("zomcat");
	  System.out.println("*******************************");
	  if(isDeployed) {
		  
		  System.out.println("app is running on:"+server);
		  return Boolean.TRUE;
		  
	  }else {
		  System.out.println("app is not running");
	  }
	  
	  System.out.println("************************************");
	  return Boolean.FALSE;
  }

}
	



