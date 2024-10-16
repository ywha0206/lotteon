package com.lotteon.entity.article;

import com.lotteon.entity.category.CategoryArticle;
import com.lotteon.entity.member.Member;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@ToString
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "qna")
public class Qna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mem_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "qna_cate1")
    private CategoryArticle cate1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "qna_cate2")
    private CategoryArticle cate2;

    @Column(name = "qna_title")
    private String qnaTitle;

    @Column(name = "qna_rdate")
    private Timestamp qnaRdate;

    @Column(name = "qna_content", columnDefinition = "TEXT")
    private String qnaContent;

    @Column(name = "qna_state")
    private int qnaState;

    @Column(name = "qna_type")
    private int qnaType;

    @Column(name = "qna_answer", columnDefinition = "TEXT")
    private String qnaAnswer;

    @Column(name = "qna_views")
    private int qnaViews;
}