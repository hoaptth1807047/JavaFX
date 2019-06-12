package entity;

public class Transfer {
    private String id;
    private String senderId;
    private String receiveId;
    private int amount;
    private String message;
    private String createAt;
    private String updateAt;
    private int status;

    public Transfer() {

    }

    public Transfer(String id, String senderId, String receiveId,
                    int amount, String message, String createAt, String updateAt, int status){
        this.id = id;
        this.senderId = senderId;
        this.receiveId = receiveId;
        this.amount = amount;
        this.message = message;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.status = status;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
