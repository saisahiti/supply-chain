package org.supply.chain.Bean;

public class ProductBean extends BaseBean{

    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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
