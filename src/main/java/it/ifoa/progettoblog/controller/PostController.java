package it.ifoa.progettoblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import it.ifoa.progettoblog.Repositories.PostRepository;
import it.ifoa.progettoblog.models.Post;

@Controller
public class PostController {

    @Autowired 
    private PostRepository postRepository; 

    @RequestMapping(value="/posts", method=RequestMethod.GET)
    public @ResponseBody List<Post> getAllPosts(){
        return postRepository.findAll();
    }
    
}
