package com.zkteco.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zkteco.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

//	Page<Course> findByTitleContainingCourse(String title, PageRequest pageRequest);
	
}
