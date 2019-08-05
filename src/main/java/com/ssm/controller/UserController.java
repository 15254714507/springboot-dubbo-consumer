/**
 * 
 */
package com.ssm.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.alibaba.dubbo.config.annotation.Reference;
import com.ssm.pojo.User;
import com.ssm.service.UserService;

/**
 * @author 作者
 * @data 2019年8月1日 
 */
@Controller
public class UserController {
		@Reference(version = "${demo.service.version}")
		private UserService userService;
	
		@RequestMapping("findAll")
		public String findAll(Model model) throws Exception {
			System.out.println("333333");
			List<User> list = userService.getAllUser();
			System.out.println("444444");
			model.addAttribute("list",list);			
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).toString());
			}

			return "index";
			
		}
}
