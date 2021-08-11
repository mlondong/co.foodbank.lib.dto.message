package co.com.foodbank.message.dto;

import java.util.Date;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonFormat;
import co.com.foodbank.user.request.RequestUserData;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author mauricio.londono@gmail.com co.com.foodbank.message.v1.model 9/08/2021
 */
@Data
@NoArgsConstructor
public class MessageDTO {
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateMessage;

    @NotNull
    @NotBlank
    @Size(min = 3, max = 70,
            message = "Complete subject in message, size between 3-20 characters.")
    private String subject;

    @NotNull
    @NotBlank
    @Size(min = 3, max = 200,
            message = "Complete description in message, size between 3-200 characters")
    private String description;

    @NotNull
    @Valid
    private RequestUserData user;

}
