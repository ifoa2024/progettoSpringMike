package it.ifoa.progettoblog.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import it.ifoa.progettoblog.Repositories.CommentRepository;
import it.ifoa.progettoblog.models.Comment;

@Controller
@RequestMapping("/comments")
public class CommentController {

@Autowired 
CommentRepository commentRepository;

@RequestMapping(method = RequestMethod.GET)
public @ResponseBody List<Comment> getAllComments(){
        return commentRepository.findAll();
    }
}
