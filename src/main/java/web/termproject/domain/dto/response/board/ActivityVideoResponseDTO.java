package web.termproject.domain.dto.response.board;

import lombok.*;
import web.termproject.domain.entity.Member;
import web.termproject.domain.status.BoardType;

@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityVideoResponseDTO {
    private Long id;
    private String title;
    private String writer; // Member 엔티티 대신 String writer로 대체
    private String videoUrl;
    private BoardType boardType;
}
