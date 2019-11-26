package cn.itcase.mapper;

import cn.itcase.Item;

import java.util.List;

public interface ItemMapper {

    List<Item> findById(Integer id);
}
