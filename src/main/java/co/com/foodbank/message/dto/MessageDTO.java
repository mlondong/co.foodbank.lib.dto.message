package co.com.foodbank.message.dto;

import java.util.Date;
import co.com.foodbank.user.model.IUser;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.message.v1.model 9/08/2021
 */
public class MessageDTO {

    private Date dateMessage;

    private String description;

    private IUser user;


    /**
     * Default constructor.
     */
    public MessageDTO() {}


    public Date getDateMessage() {
        return dateMessage;
    }


    public void setDateMessage(Date dateMessage) {
        this.dateMessage = dateMessage;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public IUser getUser() {
        return user;
    }


    public void setUser(IUser user) {
        this.user = user;
    }



}
