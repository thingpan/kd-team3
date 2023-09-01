package com.web.team3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.team3.service.ParamService;
import com.web.team3.vo.ParamVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ParamController {
	@Autowired
	private ParamService paramService;

	@RequestMapping(value = "/param", method = RequestMethod.GET)
	public String get(@ModelAttribute ParamVO param, Model m) {
		log.info("param=>{}", param);
		log.info("name=>{}", param.getName());
		m.addAttribute("param", param);
		return "views/test/param-form-res";
	}

	@RequestMapping(value = "/param", method = RequestMethod.POST)
	public String post(@ModelAttribute ParamVO param, Model m) {
		log.info("param=>{}", param);
		log.info("name=>{}", param.getName());
		m.addAttribute("param", param);
		return "views/test/param-form-res";
	}

	@RequestMapping(value = "/ajax/param", method = RequestMethod.POST)
	@ResponseBody
	public ParamVO ajaxpost(@RequestBody ParamVO param) {

		return param;
	}

	@RequestMapping(value = "/params", method = RequestMethod.POST)
	@ResponseBody
	public int insertParam(@RequestBody ParamVO param) {
		return paramService.insertParam(param);
	}

    @RequestMapping(value="/params",method=RequestMethod.GET)
    @ResponseBody
	public List<ParamVO> getParams(ParamVO  param){

		return paramService.getParams();
	}
}
