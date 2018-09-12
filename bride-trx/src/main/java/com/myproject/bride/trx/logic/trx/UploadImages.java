package com.myproject.bride.trx.logic.trx;


import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myproject.bride.lib.service.MasterService;
import com.myproject.bride.trx.logic.BaseQueryLogic;


public class UploadImages implements BaseQueryLogic {

	private static final Logger LOG = LoggerFactory.getLogger(UploadImages.class);
	
	@Autowired
	private MasterService masterService;

	
	@Override
	public String process(HttpServletRequest request,HttpServletResponse response,String data, ObjectMapper mapper, String pathInfo) {
		LOG.debug("Start process Query :"+pathInfo);		
		String result = "";
		
		 InputStream is = null;
		  FileItemFactory factory = new DiskFileItemFactory();
		  ServletFileUpload upload = new ServletFileUpload(factory);
		  List items = null;
		try {
			items = upload.parseRequest(request);
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  // here the item size is 0 ,i am not sure why i am not getting my file upload in browser with type="file"
		  // but If inspect request in debugger i can see my file realted info in request--->JakartaMutltiPartRequest----->files attribute
		  Iterator iter = items.iterator();
		  while (iter.hasNext()) {
		    FileItem item = (FileItem) iter.next();

		    if (!item.isFormField()) {
		      try {
				is = item.getInputStream();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    }
		  }
		
//		if (ServletFileUpload.isMultipartContent(request)) {
//			DiskFileItemFactory factory = new DiskFileItemFactory();
//		    factory.setSizeThreshold(512);
//		    factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
//		 
//		    ServletFileUpload upload = new ServletFileUpload(factory);
//		    upload.setFileSizeMax(2048);
//		    upload.setSizeMax(2048);
////		    String uploadPath = getServletContext().getRealPath("") 
////		      + File.separator + UPLOAD_DIRECTORY;
////		    File uploadDir = new File(uploadPath);
////		    if (!uploadDir.exists()) {
////		        uploadDir.mkdir();
////		    }
//		    try {
//                List<FileItem> formItems = upload.parseRequest(request);
//
//                if (formItems != null && formItems.size() > 0) {
//                    for (FileItem item : formItems) {
//                        if (!item.isFormField()) {
//                            String fileName = new File(item.getName()).getName();
//                            String filePath = "aaa" + File.separator + fileName;
//                            File storeFile = new File(filePath);
//                            item.write(storeFile);
//                            request.setAttribute("message", "File " + fileName + " has uploaded successfully!");
//                        }
//                    }
//                }
//            } catch (Exception ex) {
//                request.setAttribute("message", "There was an error: " + ex.getMessage());
//            }
//		}
//		try {						
//			SignUpDataVO signUpDataVO = mapper.readValue(data, SignUpDataVO.class);
//			LOG.debug("Parameter signUpDataVO :"+signUpDataVO);
//			masterService.doSignUp(signUpDataVO);
////			String x = mapper.writeValueAsString(loginDataVO);
//			result = MessageUtils.handleSuccess("Sign Up Berhasil", mapper);
//		} catch (BrideEngineException e) {
//			LOG.error("BrideEngineException when processing " + pathInfo, e);
//			result = MessageUtils.handleException(e, "", mapper);
//		} catch (Exception e) {
//			LOG.error("Unexpected exception when processing " + pathInfo, e);
//			result = MessageUtils.handleException(e, "Unexpected exception when processing "+ e.getMessage(), mapper);
//		}
		return result;
	}

}
