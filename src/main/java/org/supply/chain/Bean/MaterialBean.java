package org.supply.chain.Bean;

public class MaterialBean extends BaseBean{

    private String productId;
    private String productName;
    private String totalCost;
    private String companyName;
    private String quantity;
    private String totalQuantity;
    private String lessQuantity;
    private String status;
    private long Id;
    private String invqun;
    private String pName;
    private long userId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(String totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public String getLessQuantity() {
        return lessQuantity;
    }

    public void setLessQuantity(String lessQuantity) {
        this.lessQuantity = lessQuantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public long getId() {
        return Id;
    }

    @Override
    public void setId(long id) {
        Id = id;
    }

    public String getInvqun() {
        return invqun;
    }

    public void setInvqun(String invqun) {
        this.invqun = invqun;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public String getKey(){
        return null;
    }

    @Override
    public String getValue(){
        return null;
    }
}
