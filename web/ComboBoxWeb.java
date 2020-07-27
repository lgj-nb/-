package com.lgj.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lgj.service.IComboBoxService;
import com.lgj.vo.SelectOption;
/**
 * 下拉框
 * @author LGJ
 *
 */
@Controller
//表示这是一个控制器
@RequestMapping("/ComboBoxWeb")
//@RequestMapping(value="/LoginDemo") //指定控制器的url
public class ComboBoxWeb {
	
	@Autowired
	private IComboBoxService iComboBoxService;
	private Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

	/**
	 * 负责人下拉框
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/employee", produces = "application/json;charset=UTF-8")
	public Object employee() {		
		List<SelectOption> employee = this.iComboBoxService.selectEmployee();
		return gson.toJson(employee);	
	}
	/**
	 * 仓库下拉框
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/entrepot", produces = "application/json;charset=UTF-8")
	public Object entrepot() {		
		List<SelectOption> entrepot = this.iComboBoxService.selectEntrepot();		
		return gson.toJson(entrepot);
		
	}
	/**
	 * 供应商下拉框
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/provider", produces = "application/json;charset=UTF-8")
	public Object provider() {			
		List<SelectOption> provider = this.iComboBoxService.selectProvider();
		return gson.toJson(provider);
	}

	/**
	 * 供应商类别下拉框
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/providertype", produces = "application/json;charset=UTF-8")
	public Object providertype() {
		List<SelectOption> provider = this.iComboBoxService.selectProvidertype();
		return gson.toJson(provider);
	}
	/**
	 * 查询入库单号下拉框
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/enterWarehou", produces = "application/json;charset=UTF-8")
	public Object enterWarehou() {			
		List<SelectOption> provider = this.iComboBoxService.selectEnterWarehou();
		return gson.toJson(provider);
		
	}
	
}
