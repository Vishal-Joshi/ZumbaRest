package com.zumba;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

@Path("hellos")
public class SurveyResource {
	private static final Logger logger = Logger.getLogger(SurveyResource.class);

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayhello() {
		logger.debug("sample debug message");
		logger.info("sample info message");
		logger.warn("sample warning message");
		logger.error("sample error message");
		return "hello";
	}

}
