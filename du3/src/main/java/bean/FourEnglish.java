package bean;

import javax.persistence.*;

@Entity
@Table(name = "t_fourenglish", schema = "网上销售", catalog = "")
public class FourEnglish {
    private int f_id;
    private String f_name;
    private Integer f_price;
    private String f_image;

    @Id
    @Column(name = "f_id")
    public int getF_id() {
        return f_id;
    }

    public void setF_id(int f_id) {
        this.f_id = f_id;
    }

    @Basic
    @Column(name = "f_name")
    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    @Basic
    @Column(name = "f_price")
    public Integer getF_price() {
        return f_price;
    }

    public void setF_price(Integer f_price) {
        this.f_price = f_price;
    }

    @Basic
    @Column(name = "f_image")
    public String getF_image() {
        return f_image;
    }

    public void setF_image(String f_image) {
        this.f_image = f_image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FourEnglish that = (FourEnglish) o;

        if (f_id != that.f_id) return false;
        if (f_name != null ? !f_name.equals(that.f_name) : that.f_name != null) return false;
        if (f_price != null ? !f_price.equals(that.f_price) : that.f_price != null) return false;
        if (f_image != null ? !f_image.equals(that.f_image) : that.f_image != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = f_id;
        result = 31 * result + (f_name != null ? f_name.hashCode() : 0);
        result = 31 * result + (f_price != null ? f_price.hashCode() : 0);
        result = 31 * result + (f_image != null ? f_image.hashCode() : 0);
        return result;
    }
}
