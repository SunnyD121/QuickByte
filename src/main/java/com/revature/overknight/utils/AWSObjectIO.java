package com.revature.overknight.utils;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.amazonaws.auth.EnvironmentVariableCredentialsProvider;
import com.amazonaws.services.mediastoredata.model.Item;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;

import gherkin.deps.com.google.gson.Gson;

public class AWSObjectIO {

	

	public static String uploadFile(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
		 ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
	        AmazonS3 s3client = AmazonS3ClientBuilder.standard().withRegion("us-east-1")
	                .withCredentials(new EnvironmentVariableCredentialsProvider())
	                .build();
	        String bucketname = "quickbytes3";
	        //s3client.createBucket(bucketname);
	        response.setContentType("text");
	        String fileKey = UUID.randomUUID().toString();
	        Item jsonItem = null;
	        StringBuilder sb = new StringBuilder();
	        String json = "{";
	        try
	        {
	            List<FileItem> files = sf.parseRequest(request);
	            for(FileItem item: files)
	            {
	                if (item.isFormField())
	                {
	                    String fieldname = item.getFieldName();
	                    String fieldvalue = item.getString();
	                   
	                    if(fieldname.equals("username")||fieldname.equals("postName")||fieldname.equals("recipe")||fieldname.equals("comment"))
	                    {
	                    	sb.append(fieldname + ":" + fieldvalue + ", ");
	                    }

	                }
	                else if(!item.getName().equals("null") && item.getName() != null)
	                {
	                    fileKey = fileKey+item.getName();
	                    System.out.println(fileKey);
	                    InputStream is = item.getInputStream();
	                    s3client.putObject(new PutObjectRequest(bucketname, fileKey,is,new ObjectMetadata())
	                            .withCannedAcl(CannedAccessControlList.PublicRead));
	                    is.close();
	                }
	                sb.append("}");
	                json = sb.toString();
	            }
	        }
	        catch (Exception e)
	        {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	       
	        return json;
    }
}