package com.youxuan.eu.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * 用于接收文件
 * @author zl
 *
 */
@Controller
@RequestMapping("/upload")
public class FileController {

	@RequestMapping("UploadAction")
	public void UPload(HttpServletRequest request,HttpServletResponse response) throws Exception {  
        
		 PrintWriter out=response.getWriter();
		//创建一个通用的多部分解析器  
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());  
        //判断 request 是否有文件上传,即多部分请求  
        if(multipartResolver.isMultipart(request)){  
            //转换成多部分request    
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;  
            //取得request中的所有文件名  
            Iterator<String> iter = multiRequest.getFileNames();  
            while(iter.hasNext()){  
                //取得上传文件  
                MultipartFile file = multiRequest.getFile(iter.next());  
                if(file != null){  
                    //取得当前上传文件的文件名称  
                    String myFileName = file.getOriginalFilename();  
                    //如果名称不为“”,说明该文件存在，否则说明该文件不存在  
                    if(myFileName.trim() !=""){  
                        System.out.println(myFileName);  
                        //重命名上传后的文件名  
                        String fileName = file.getOriginalFilename();  
                        //定义上传路径  
                        UUID uuid = UUID.randomUUID();
                        String path = request.getSession().getServletContext().getRealPath("/")+"fileUp/"+uuid.toString()+fileName;  
                        File localFile = new File(path); 
                        File parentFile=new File(request.getSession().getServletContext().getRealPath("/")+"fileUp");
                        if(!parentFile .exists()  && !parentFile .isDirectory())
                        	parentFile.mkdir();
                        file.transferTo(localFile); 
                        out.write(path);
                    }  
                }  
                //记录上传该文件后的时间  
                out.flush();
                out.close();
            }  
              
        }  
    } 
	@RequestMapping("deleteFile")
	public void Filedelete(String file,HttpServletResponse response){
		PrintWriter out=null;
		try {
			 out=response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(file);
		File deleteFile=new File(file);
		deleteFile.delete();
		out.write("完成");
	}
}
