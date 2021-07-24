package com.behsa.qpigw;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponseRepository extends JpaRepository<ResponseMessage,Long> {
}
