package bean;

import javax.persistence.*;

@Entity
@Table(name = "t_sixenglish", schema = "网上销售", catalog = "")
public class SixEnglish {
    private int s_id;
    private String s_name;
    private Integer s_price;
    private String s_image;

    @Id
    @Column(name = "s_id")
    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    @Basic
    @Column(name = "s_name")
    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    @Basic
    @Column(name = "s_price")
    public Integer getS_price() {
        return s_price;
    }

    public void setS_price(Integer s_price) {
        this.s_price = s_price;
    }

    @Basic
    @Column(name = "s_image")
    public String getS_image() {
        return s_image;
    }

    public void setS_image(String s_image) {
        this.s_image = s_image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SixEnglish that = (SixEnglish) o;

        if (s_id != that.s_id) return false;
        if (s_name != null ? !s_name.equals(that.s_name) : that.s_name != null) return false;
        if (s_price != null ? !s_price.equals(that.s_price) : that.s_price != null) return false;
        if (s_image != null ? !s_image.equals(that.s_image) : that.s_image != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = s_id;
        result = 31 * result + (s_name != null ? s_name.hashCode() : 0);
        result = 31 * result + (s_price != null ? s_price.hashCode() : 0);
        result = 31 * result + (s_image != null ? s_image.hashCode() : 0);
        return result;
    }
}
