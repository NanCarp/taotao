package com.taotao.service;

import org.springframework.stereotype.Service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.utils.TaotaoResult;
import com.taotao.pojo.TbItem;

@Service
public interface ItemService {
	
	TbItem getItemById(long itemId);
	
	EUDataGridResult getItemList(int page, int rows);
	
	TaotaoResult createItem(TbItem tbItem);
}
