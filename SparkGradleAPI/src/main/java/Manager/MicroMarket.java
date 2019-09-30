package Manager;

import java.sql.Date;
import java.util.ArrayList;

public class MicroMarket {

    private ArrayList<Product> ProductList = new ArrayList<Product>();
    private Date OrderHoursStart;
    private Date OrderHoursEnd;
    private Date OpeningHoursStart;
    private Date OpeningHoursEnd;
    private String streetName;
    private String houseNumber;
    private int floorNumber;
    private String phoneNumber;
    private String email;
    private String firstName;
    private String lastName;
    private int Active;

    public MicroMarket() {
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

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getActive() {
        return Active;
    }

    public void setActive(int active) {
        Active = active;
    }
}
