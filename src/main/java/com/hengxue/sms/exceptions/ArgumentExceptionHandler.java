package com.hengxue.sms.exceptions;

import com.fasterxml.jackson.core.JsonParseException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Unruly Wind on 2019/4/15/015.
 *
 * @author BlueMelancholy
 * @desc: IllegalArgumentException异常统一处理
 */
@ControllerAdvice
public class ArgumentExceptionHandler {
	@ExceptionHandler(value = IllegalArgumentException.class)
	@ResponseBody
	public String handler(IllegalArgumentException e){
		e.printStackTrace();
		return "非法参数异常";
	}
}
