package com.ekunt.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport{
	
	private File image; //上传的文件
    private String imageFileName; //文件名称
    
    public String input() {
    	return INPUT;
    }

    public String upload() {
        try {
			String realpath = ServletActionContext.getServletContext().getRealPath("/images");
			System.out.println("realpath: "+realpath);
			if (image != null) {
			    File savefile = new File(new File(realpath), imageFileName);
			    if (!savefile.getParentFile().exists())
			        savefile.getParentFile().mkdirs();
			    //此句重点，完成上传。
			    FileUtils.copyFile(image, savefile);
			    ActionContext.getContext().put("message", "文件上传成功");
			}
		} catch (RuntimeException | IOException e) {
			e.printStackTrace();
		}
        return SUCCESS;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }



}
