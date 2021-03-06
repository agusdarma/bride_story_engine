package com.myproject.bride.trx.servlet;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLConnection;

import javax.imageio.ImageIO;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myproject.bride.lib.utils.CommonUtil;
import com.myproject.bride.trx.logic.BaseQueryLogic;
import com.myproject.bride.trx.logic.LogicFactory;

public class BrideServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOG = LoggerFactory.getLogger(BrideServiceServlet.class);

	private ObjectMapper mapper;
	
	@Autowired
	private LogicFactory logicFactory;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
				config.getServletContext());
		mapper = new ObjectMapper();
		// faster this way, not default
//		mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);		
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		LOG.debug("Servlet Initialized");
	}
	  
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
		doPost(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		long startTime = (int)System.currentTimeMillis();
		
		String pathInfo = request.getPathInfo();		
		LOG.info("{} START", new String[] {pathInfo});
		LOG.debug("POST PathInfo: {}", new String[] {pathInfo});
		
		BaseQueryLogic logic = logicFactory.getLogic().get(pathInfo);
		if(logic == null){
			LOG.warn("PathInfo {} is not supported.", new String[] {pathInfo});
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
			return;
		}
		
		BufferedReader reader = request.getReader();
		StringBuilder sb = new StringBuilder();
		String line = reader.readLine();
		while (line != null) {
//			sb.append(line + "\n");
			sb.append(line);
			line = reader.readLine();
		}
		reader.close();
		String data = sb.toString();		
//		if(!"/charge".equalsIgnoreCase(pathInfo)&&!"/payment_notif".equalsIgnoreCase(pathInfo)){
//			data = CipherUtil.decryptTripleDES(data, CipherUtil.PASSWORD);
//		}		
		LOG.debug("RequestData: {}", new String[] { data });	
	
		Object respData = logic.process(request,response,data, mapper, pathInfo);
		
		if (respData == null) {
			LOG.warn("PathInfo {} is not supported.", new String[] {pathInfo});
			response.sendError(HttpServletResponse.SC_NOT_FOUND);			
			return;
		}
		if (respData instanceof String) {
			response.setContentType("application/json");
			response.setContentLength(((String) respData).length());
			response.getWriter().write(((String) respData));
			response.getWriter().flush();
		}else if (respData instanceof File) {			
			File f = (File) respData;
			String contentType = URLConnection.guessContentTypeFromName(f.getName());
			LOG.debug("File: {}, contentType: {}", new String[] { f.getName(),contentType });				
			BufferedImage image = ImageIO.read(f);
			ImageIO.write(image, "jpg", response.getOutputStream());
		}
//		if("/userActivate".equalsIgnoreCase(pathInfo)){
////			response.setContentType("text/html;charset=UTF-8");	
////		    request.setAttribute("message", respData);
////		    request.getRequestDispatcher("/response_activated.jsp").forward(request, response);			
//			response.getWriter().write(respData);
//			response.getWriter().flush();
//		}else{
//			response.setContentType("application/json");
//			response.setContentLength(respData.length());
//			response.getWriter().write(respData);
//			response.getWriter().flush();
//		}		
		int delta = (int) (System.currentTimeMillis() - startTime);
		LOG.info("{} FINISH in {}ms", new String[] {pathInfo, 
				CommonUtil.displayNumberNoDecimal(delta) });
	 }
	
//	private void _processImages(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		LOG.info("_processImages with params: {}", request);		
//		String cat = uriParams.get("c");
//		if (StringUtils.isEmpty(cat)) {
//			LOG.warn("Missing parameter c");
//			response.setStatusCode(HttpStatus.SC_BAD_REQUEST);
//			response.setEntity(new StringEntity("Invalid Request!"));
//			return;
//		}
//		int imgCategory = Integer.parseInt(uriParams.get("c"));
//		File f = imageProcessorFactory.findImageByParam(imgCategory, uriParams);
//		
//		// based on http://marxsoftware.blogspot.com/2015/02/determining-file-types-in-java.html
//		String contentType = URLConnection.guessContentTypeFromName(f.getName());
//		//MimetypesFileTypeMap.getDefaultFileTypeMap().getContentType(f);
//		long contentLength = f.length();
//		LOG.debug("File: {}, contentType: {}, Length: {}", f.getName(), contentType, contentLength);
//		response.setStatusCode(HttpStatus.SC_OK);
//		response.addHeader("Content-Type", contentType);
//		response.setEntity(new FileEntity(f));
//	}
	
	
}
