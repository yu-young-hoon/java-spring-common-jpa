package com.yh.common.jpa.repository;

import com.yh.common.jpa.domain.RankedKeyword;
import com.yh.common.jpa.type.RankedKeywordType;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@DataJpaTest
public class RankedKeywordRepositoryTest  {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private RankedKeywordRepository rankedKeywordRepository;

    @Test
    @Rollback(false)
    public void TEST_01_생성() {

        String startAt = "2019-05-10";
        String endAt = "2019-05-10";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        RankedKeyword rankedKeyword = new RankedKeyword(RankedKeywordType.SEARCH,
                LocalDate.parse(startAt, dateTimeFormatter)
                , LocalDate.parse(endAt, dateTimeFormatter)
                , "keyword"
                , 1000
                , LocalDateTime.now()
                , LocalDateTime.now());

        rankedKeywordRepository.save(rankedKeyword);

    }

    @Test
    public void TEST_02_읽기() {
        List<RankedKeyword> rankedKeyword = rankedKeywordRepository.findAll();
        Assert.assertEquals(rankedKeyword.size(), 1);
    }

}
