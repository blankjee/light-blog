package com.blankjee.dao;

import com.blankjee.po.Tag;
import com.blankjee.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String name);
}
