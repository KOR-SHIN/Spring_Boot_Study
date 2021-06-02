package kr.co.h4tech.springboot.web;

import kr.co.h4tech.springboot.config.auth.LoginUser;
import kr.co.h4tech.springboot.config.auth.dto.SessionUser;
import kr.co.h4tech.springboot.service.posts.PostsService;
import kr.co.h4tech.springboot.web.dao.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

/**
 * mustache stater가 있기 때문에
 * Controller에서 반환하는 String에 자동으로 경로가 설정된다.
 * prefix: /src/resources/templates
 * suffix: .mustache
 */
@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;
    private final HttpSession httpSession;

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user) {
        model.addAttribute("posts", postsService.findAllDesc());

        // 기존에 Session에서 정보를 가져오는 코드를 LoginUser Annotation을 이용하여 개선하였다.
        // 어떤 Controller에서든 Annotation을 이용하여 세션 정보를 가져올 수 있다.
        //SessionUser user = (SessionUser) httpSession.getAttribute("user");
        if(user != null) {
            model.addAttribute("userName", user.getName());
        }

        return "index";
    }

    @GetMapping("/posts/save")
    public String postSave() {
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);
        return "posts-update";
    }
}
