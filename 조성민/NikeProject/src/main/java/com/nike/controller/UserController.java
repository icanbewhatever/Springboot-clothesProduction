package com.nike.controller;

import com.nike.domain.UserVO;
import com.nike.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping(value="user")
public class UserController {
    private UserService userService;

    @ResponseBody
    @GetMapping("/idCheck")
    public int checkDuplicateId(@RequestParam String id) {
        return userService.checkDuplicateId(id);
    }

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registerResult")
    public String showResult(Model model, String message, String redirectUrl) {
        model.addAttribute("message", message);
        model.addAttribute("redirectUrl", redirectUrl);
        return "registerResult";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/sign_up_form")
    public String signup() {
        return "sign_up";
    }

    @PostMapping("/sign_up")
    public String signUp(@RequestParam String id,
                         @RequestParam String pw,
                         @RequestParam String name,
                         @RequestParam String phone,
                         @RequestParam String email,
                         Model model) {

        try {
            UserVO userVO = new UserVO();
            userVO.setId(id);
            userVO.setPw(pw);
            userVO.setName(name);
            userVO.setPhone(phone);
            userVO.setEmail(email);

            userService.registerUser(userVO);
            model.addAttribute("message", "가입 완료되었습니다.");
            model.addAttribute("join", "/user/index");
        } catch (Exception e) {
            model.addAttribute("message", "가입 실패하였습니다.");
            model.addAttribute("join", "/user/sign_up_form");
        }
        return "registerResult";
    }

    @PostMapping("/login")
    public String login(HttpServletRequest request, UserVO userVO, Model model) {
        String result = userService.login(userVO);
        if (result.equals("success")) {
            HttpSession session = request.getSession();
            session.setAttribute("id", userVO.getId());
            session.setAttribute("name", userVO.getName());
            session.setAttribute("email", userVO.getEmail());
            session.setAttribute("phone", userVO.getPhone());

            session.setAttribute("successMessage", userVO.getId() + "님 로그인에 성공했습니다.");
            return "redirect:/user/login_header";
        } else {
            request.setAttribute("errorMessage", "아이디 또는 비밀번호가 잘못되었습니다.");
            return "index";
        }
    }

    @GetMapping("/manageredit")
    public String manageredit() {
        return "manageredit";
    }

    @PostMapping("/update_profile")
    public String update_profile() {
        return "update_profile";
    }

    @GetMapping("/main")
    public String main() {
        return "main";
    }

    @GetMapping("/find_id_pw")
    public String find_id_pw() {
        return "find_id_pw";
    }

    @PostMapping("/find_id_process")
    public String find_id_process() {
        return "find_id_process";
    }

    @PostMapping("/find_pw_process")
    public String find_pw_process() {
        return "find_pw_process";
    }

    @GetMapping("/login_header")
    public String login_header() {
        return "login_header";
    }

    @GetMapping("/logout")
    public String logout() {
        return "logout";
    }

    @GetMapping("/menu")
    public String menu() {
        return "menu";
    }

        @PostMapping("/sign_up_insert")
        public String sign_up_insert (UserVO user){
            userService.registerUser(user);
            return "redirect:/user/index";
        }

}
