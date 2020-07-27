package com.lgj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lgj.dao.ComboBoxDAO;
import com.lgj.service.IComboBoxService;
import com.lgj.vo.SelectOption;

@Transactional
//事务的注解
@Service("/iComboBoxService")
//service层的注解
public class ComboBoxServiceImpl implements IComboBoxService {

	@Autowired
	private ComboBoxDAO dao;

	@Override
	public List<SelectOption> selectEmployee() {
		// TODO Auto-generated method stub
		return dao.selectEmployee();
	}

	@Override
	public List<SelectOption> selectEntrepot() {
		// TODO Auto-generated method stub
		return dao.selectEntrepot();
	}

	@Override
	public List<SelectOption> selectProvider() {
		// TODO Auto-generated method stub
		return dao.selectProvider();
	}

	@Override
	public List<SelectOption> selectProvidertype() {
		return dao.selectProvidertype();
	}

	@Override
	public List<SelectOption> selectEnterWarehou() {
		// TODO Auto-generated method stub
		return dao.selectEnterWarehou();
	}

	
}
