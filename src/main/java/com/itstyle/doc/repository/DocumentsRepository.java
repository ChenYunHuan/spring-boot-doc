package com.itstyle.doc.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.itstyle.doc.model.Documents;
/**
 * 文档管理
 */
public interface DocumentsRepository extends JpaRepository<Documents, Integer> {
	
	@Query(value ="SELECT COUNT(document_id) FROM  md_documents",nativeQuery = true)
	long count();
}
