package org.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.tech.model.Comment;

@RepositoryRestResource
public interface CommentRepository extends JpaRepository<Comment, Long>{

}
