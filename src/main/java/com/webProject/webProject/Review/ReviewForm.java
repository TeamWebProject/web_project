package com.webProject.webProject.Review;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
class ReviewForm {
    @NotEmpty(message = "내용을 입력하세요.")
    private String content;

    @NotEmpty(message = "평점을 입력하세요.")
    private double rating;

//    private List<MultipartFile> images; //댓글 등록할때 이미지 첨부 받아오는 속성.. 추후수정예정 잘 몰라서 ㅠㅜ
}
