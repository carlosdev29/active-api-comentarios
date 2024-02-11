package com.activeone.api.service;

import java.util.List;

import com.activeone.api.service.dto.CommentsRequestByDTO;
import com.activeone.api.service.dto.CommentsRequestUpdDTO;
import com.activeone.api.service.dto.CommentsResponseByDTO;
import com.activeone.api.service.dto.CommentsResponseSavedDTO;




public interface ICommentsService {
	
	public CommentsResponseByDTO getCommentByIdServ(Integer id);
	
	public List<CommentsResponseByDTO> getAllCommentServ();
	
	public CommentsResponseSavedDTO saveComment(
			CommentsRequestByDTO commentRequestByDTO);
	
	public CommentsResponseSavedDTO updateComment(
			CommentsRequestUpdDTO CommentRequestUpdDTO, Integer id);

}
