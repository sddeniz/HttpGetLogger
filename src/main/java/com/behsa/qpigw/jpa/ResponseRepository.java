package com.behsa.qpigw.jpa;

import com.behsa.qpigw.ResponseMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseRepository extends JpaRepository<ResponseMessage,Long> {
}
