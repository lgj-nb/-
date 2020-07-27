package com.lgj.service;

import java.util.List;

import com.lgj.vo.SelectOption;
/**
 * 下拉框
 * @author LGJ
 *
 */
public interface IComboBoxService {

	/**
	 * 负责人下拉框
	 * @return
	 */
	public List<SelectOption> selectEmployee();
	/**
	 * 仓库下拉框
	 * @return
	 */
	public List<SelectOption> selectEntrepot();
	
	/**
	 * 供应商下拉框
	 * @return
	 */
	public List<SelectOption> selectProvider();

	/**
	 * 查询供应商类别
	 * @return
	 */
	public List<SelectOption> selectProvidertype();

	/**
	 * 入库单号下拉框
	 * @return
	 */
	public List<SelectOption> selectEnterWarehou();
}
