package org.supply.chain.Bean;

import java.sql.Timestamp;

public abstract class BaseBean implements DropDownListBean{

    protected long id;
    protected String createdBy;
    protected String modifiedBy;
    protected Timestamp createdDateTime;
    protected Timestamp modifiedDateTime;

    public Timestamp getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Timestamp createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public Timestamp getModifiedDateTime() {
        return modifiedDateTime;
    }

    public void setModifiedDateTime(Timestamp modifiedDateTime) {
        this.modifiedDateTime = modifiedDateTime;
    }

    public String getCreatedBy(){
        return createdBy;
    }
    public void setCreatedBy(String createdBy){
        this.createdBy = createdBy;
    }
    public String getModifiedBy(){
        return modifiedBy;
    }
    public void setModifiedBy(String modifiedBy){
        this.modifiedBy = modifiedBy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int compareTo(BaseBean next){
        return getValue().compareTo(next.getValue());
    }

}
