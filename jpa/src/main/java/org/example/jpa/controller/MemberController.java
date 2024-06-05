package org.example.jpa.controller;

import lombok.RequiredArgsConstructor;
import org.example.jpa.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {


    private final MemberService memberService;

    @GetMapping("/member/new")
    public String newMember(Model model) {}
}
