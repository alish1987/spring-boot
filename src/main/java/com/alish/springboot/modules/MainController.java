package com.alish.springboot.modules;

import com.alish.springboot.modules.posts.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    private final PostsService postsService;

    @Autowired
    public MainController(PostsService postsService) {
        this.postsService = postsService;
    }

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("posts", postsService.findAllPosts());
        return "index";
    }
}
