package com.JobListing.joblisting.Controller;

import com.JobListing.joblisting.Repository.PostRepository;
import com.JobListing.joblisting.Repository.SearchRepository;
import com.JobListing.joblisting.Repository.SearchRepositoryImplementation;
import com.JobListing.joblisting.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controller")
public class PostController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository searchRepository;

    @GetMapping("/posts")
    public List<Post> getAllPosts()
    {
        return repo.findAll();
    }

//    @GetMapping("/posts/{text}")
//    public List<Post> search(@PathVariable String text){
//        return searchRepository.findByText(text);
//    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){
        return repo.save(post);
    }

}
