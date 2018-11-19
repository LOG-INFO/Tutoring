package ec.springframework.tutoring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tutee {
    private int idx;
    private String name;
    private String phoneNum;
    private String email;
    private String intro;
    private String school;
    private int age;
    private String profileImgAddr;
}
