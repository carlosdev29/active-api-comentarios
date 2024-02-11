package com.activeone.api.service.dto;

public class CommentsResponseSavedDTO {
	
	private Integer idComment;
	private StatusResponseDTO statusResponseDTO;

	public Integer getIdComment() {
		return idComment;
	}
	public void setIdComment(Integer idComment) {
		this.idComment = idComment;
	}
	public StatusResponseDTO getStatusResponseDTO() {
		return statusResponseDTO;
	}
	public void setStatusResponseDTO(StatusResponseDTO statusResponseDTO) {
		this.statusResponseDTO = statusResponseDTO;
	}

}
