package com.revature.overknight.utils;
import java.io.File;
import java.io.IOException;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;

public class UploadObject {

	

	public static void uploadFile(String keyName, String file) throws IOException {
        
		String clientRegion = "US East (N. Virginia)";
	    String bucketName = "quickbytes3";
	    String fileObjKeyName = keyName;
	    String fileName = file;
		
		try {
            AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
            		.withRegion(clientRegion)
                    .withCredentials(new ProfileCredentialsProvider())
                    .build();
        
            // Upload a file as a new object with ContentType and title specified.
            PutObjectRequest request = new PutObjectRequest(bucketName, fileObjKeyName, new File(fileName));
            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentType("image/png");
            metadata.addUserMetadata("x-amz-meta-title", "someTitle");
            request.setMetadata(metadata);
            s3Client.putObject(request);
        }
        catch(AmazonServiceException e) {
            // The call was transmitted successfully, but Amazon S3 couldn't process 
            // it, so it returned an error response.
            e.printStackTrace();
        }
        catch(SdkClientException e) {
            // Amazon S3 couldn't be contacted for a response, or the client
            // couldn't parse the response from Amazon S3.
            e.printStackTrace();
        }
    }
}