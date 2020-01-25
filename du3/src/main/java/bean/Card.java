package bean;

import javax.persistence.*;

@Entity
@Table(name = "t_card", schema = "网上销售", catalog = "")
public class Card {
    private int c_id;
    private String c_name;
    private Integer c_price;
    private String c_image;

    @Id
    @Column(name = "c_id")
    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    @Basic
    @Column(name = "c_name")
    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    @Basic
    @Column(name = "c_price")
    public Integer getC_price() {
        return c_price;
    }

    public void setC_price(Integer c_price) {
        this.c_price = c_price;
    }

    @Basic
    @Column(name = "c_image")
    public String getC_image() {
        return c_image;
    }

    public void setC_image(String c_image) {
        this.c_image = c_image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (c_id != card.c_id) return false;
        if (c_name != null ? !c_name.equals(card.c_name) : card.c_name != null) return false;
        if (c_price != null ? !c_price.equals(card.c_price) : card.c_price != null) return false;
        if (c_image != null ? !c_image.equals(card.c_image) : card.c_image != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = c_id;
        result = 31 * result + (c_name != null ? c_name.hashCode() : 0);
        result = 31 * result + (c_price != null ? c_price.hashCode() : 0);
        result = 31 * result + (c_image != null ? c_image.hashCode() : 0);
        return result;
    }
}
