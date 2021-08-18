package co.com.foodbank.message.dto.interfaces;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import co.com.foodbank.message.dto.Message;
import co.com.foodbank.user.dto.response.UserData;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.message.dto 9/08/2021
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({@Type(value = Message.class, name = "Message")})
public interface IMessage {

    String getId();

    Date getDateMessage();

    String getSubject();

    String getDescription();

    UserData getUser();
}
