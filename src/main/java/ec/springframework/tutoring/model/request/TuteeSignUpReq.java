package ec.springframework.tutoring.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TuteeSignUpReq {
    private int idx;
    private String name;
    private String school;
    private String introduction;
    private int age;
    private String profileImgAddr;
}