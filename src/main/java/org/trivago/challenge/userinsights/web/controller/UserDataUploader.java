package org.trivago.challenge.userinsights.web.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.multipart.MultipartFile;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.trivago.challenge.userinsights.processors.UserDataManager;


@Controller
@RequestMapping(value = "/userdata")
public class UserDataUploader {
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String uploadUserDataAndProcess(@RequestParam("file") MultipartFile file,
            RedirectAttributes redirectAttributes) {

        UserDataManager.processUserData(file);
        
        redirectAttributes.addFlashAttribute("message",
                "You successfully uploaded " + file.getOriginalFilename() + "!");

        return "redirect:/";
    }
}
