package com.yh.common.jpa.domain;

import com.yh.common.jpa.type.RankedKeywordType;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Entity
public class RankedKeyword {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long rankedKeywordId;

    @Enumerated(value = EnumType.STRING)
    private RankedKeywordType rankedKeywordType;

    private LocalDate startAt;

    private LocalDate endAt;

    private String keyword;

    private Integer value;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime modifiedAt;

    @Builder
    public RankedKeyword(RankedKeywordType rankedKeywordType, LocalDate startAt, LocalDate endAt, String keyword, Integer value, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.rankedKeywordType = rankedKeywordType;
        this.startAt = startAt;
        this.endAt = endAt;
        this.keyword = keyword;
        this.value = value;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public RankedKeyword() {

    }

}
