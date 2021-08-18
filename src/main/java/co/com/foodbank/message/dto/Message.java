package co.com.foodbank.message.dto;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import co.com.foodbank.message.dto.interfaces.IMessage;
import co.com.foodbank.user.dto.response.UserData;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.message.dto 16/08/2021
 */
@Data
@NoArgsConstructor
@JsonAutoDetect(fieldVisibility = Visibility.DEFAULT)
public class Message implements IMessage {

    private String id;
    private Date dateMessage;
    private String subject;
    private String description;
    private UserData user;


    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return id;
    }

    @Override
    public Date getDateMessage() {
        // TODO Auto-generated method stub
        return dateMessage;
    }

    @Override
    public String getSubject() {
        // TODO Auto-generated method stub
        return subject;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return description;
    }

    @Override
    public UserData getUser() {
        // TODO Auto-generated method stub
        return user;
    }


}
