package com.crm.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;

@SpringBootApplication
@Theme(value="CRM")
@PWA(name = "CRM", shortName = "CRM", offlineResources = { "styles/offline.css",
		"js/jquery.js",
		"img/offline.jpg" })
@NpmPackage(value = "line-awesome", version = "1.3.0")
public class CrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmApplication.class, args);
	}

}
