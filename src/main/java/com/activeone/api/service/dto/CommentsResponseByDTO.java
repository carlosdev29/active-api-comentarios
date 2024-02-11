package com.activeone.api.service.dto;

import java.util.Date;

public class CommentsResponseByDTO {
	
	private Integer commentId;
	private String ommentName;
	private Date creationDate;
	private Date updateDate;
	
	private StatusResponseDTO statusResponse;
	
	public Integer getCommentId() {
		return commentId;
	}
	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}
	public String getOmmentName() {
		return ommentName;
	}
	public void setOmmentName(String ommentName) {
		this.ommentName = ommentName;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public StatusResponseDTO getStatusResponse() {
		return statusResponse;
	}
	public void setStatusResponse(StatusResponseDTO statusResponse) {
		this.statusResponse = statusResponse;
	}
	

}
