package co.com.foodbank.message.dto;

import java.util.Date;
import co.com.foodbank.user.model.IUser;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.message.dto 9/08/2021
 */
public interface IMessage {

    String getId();

    IUser getUser();

    Date getDateMessage();

    String getDescription();
}
