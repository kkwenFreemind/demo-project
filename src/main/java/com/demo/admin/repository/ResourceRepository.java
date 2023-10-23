package com.demo.admin.repository;

import com.demo.admin.model.Resources;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @Author : Kevin Chang
 * @create 2023/9/11 上午11:23
 */
@Repository
public interface ResourceRepository  extends JpaRepository<Resources, Long> {


}
