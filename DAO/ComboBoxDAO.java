package com.lgj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lgj.vo.SelectOption;
/**
 * 下拉框
 * @author LGJ
 *
 */
@Repository
public interface ComboBoxDAO {
	
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
	 * 供应商类别下拉框
	 * @return
	 */
	public List<SelectOption> selectProvidertype();
	/**
	 *入库单号下拉框
	 * @return
	 */
	public List<SelectOption> selectEnterWarehou();
	
	
}
