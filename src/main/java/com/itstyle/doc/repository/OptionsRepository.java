package com.itstyle.doc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itstyle.doc.model.Options;

/**
 * 文档选项词典
 */
public interface OptionsRepository extends JpaRepository<Options, Integer> {
    Options findByOptionName(String optionName);
}
