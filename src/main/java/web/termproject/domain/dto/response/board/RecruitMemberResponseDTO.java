package web.termproject.domain.dto.response.board;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;
import web.termproject.domain.entity.Member;
import web.termproject.domain.status.BoardType;
import web.termproject.domain.status.RoleType;

@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecruitMemberResponseDTO {
    private Long id;
    private String title;
    private String content;
    private String writer;
    private Member member;
    private BoardType boardType;
    private Long memberId;
    private String imageRoute;
    private MultipartFile image;
    private RoleType roleType;
    private String photoBase64;
}
