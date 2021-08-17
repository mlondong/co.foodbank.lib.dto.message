package co.com.foodbank.message.dto.interfaces;

import java.util.Date;
import co.com.foodbank.user.dto.request.RequestUserData;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.message.dto 9/08/2021
 */
public interface IMessage {

    String getId();

    Date getDateMessage();

    String getSubject();

    String getDescription();

    RequestUserData getUser();
}
