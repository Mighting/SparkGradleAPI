package Manager;

import java.sql.Date;
import java.util.ArrayList;

public class MicroMarket {

    private ArrayList<Product> ProductList = new ArrayList<Product>();
    private Date OrderHoursStart;
    private Date OrderHoursEnd;
    private Date OpeningHoursStart;
    private Date OpeningHoursEnd;


    public MicroMarket(Date orderHoursStart, Date orderHoursEnd, Date openingHoursStart, Date openingHoursEnd) {
        OrderHoursStart = orderHoursStart;
        OrderHoursEnd = orderHoursEnd;
        OpeningHoursStart = openingHoursStart;
        OpeningHoursEnd = openingHoursEnd;
    }

    public Date getOpeningHoursStart() {
        return OpeningHoursStart;
    }

    public void setOpeningHoursStart(Date openingHoursStart) {
        OpeningHoursStart = openingHoursStart;
    }

    public Date getOpeningHoursEnd() {
        return OpeningHoursEnd;
    }

    public void setOpeningHoursEnd(Date openingHoursEnd) {
        OpeningHoursEnd = openingHoursEnd;
    }

    public Date getOrderHoursEnd() {
        return OrderHoursEnd;
    }

    public void setOrderHoursEnd(Date orderHoursEnd) {
        OrderHoursEnd = orderHoursEnd;
    }

    public Date getOrderHoursStart() {
        return OrderHoursStart;
    }

    public void setOrderHoursStart(Date orderHoursStart) {
        OrderHoursStart = orderHoursStart;
    }

    public ArrayList<Product> getProductList() {
        return ProductList;
    }

    public void setProductList(ArrayList<Product> productList) {
        ProductList = productList;
    }

    public void addItem(Product product){

    }

    public void removeItem(Product product){

    }

    public void updateItem(Product product){

    }
}
