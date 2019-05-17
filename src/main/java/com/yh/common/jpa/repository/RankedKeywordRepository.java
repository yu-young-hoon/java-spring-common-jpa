package com.yh.common.jpa.repository;

import com.yh.common.jpa.domain.RankedKeyword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RankedKeywordRepository extends JpaRepository<RankedKeyword, Long> {

}
