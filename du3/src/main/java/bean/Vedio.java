package bean;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "t_vedio", schema = "网上销售", catalog = "")
public class Vedio {
    private int v_id;
    private String v_name;
    private BigDecimal v_price;
    private String v_image;
    private String v_time;

    @Id
    @Column(name = "v_id")
    public int getV_id() {
        return v_id;
    }

    public void setV_id(int v_id) {
        this.v_id = v_id;
    }

    @Basic
    @Column(name = "v_name")
    public String getV_name() {
        return v_name;
    }

    public void setV_name(String v_name) {
        this.v_name = v_name;
    }

    @Basic
    @Column(name = "v_price")
    public BigDecimal getV_price() {
        return v_price;
    }

    public void setV_price(BigDecimal v_price) {
        this.v_price = v_price;
    }

    @Basic
    @Column(name = "v_image")
    public String getV_image() {
        return v_image;
    }

    public void setV_image(String v_image) {
        this.v_image = v_image;
    }

    @Basic
    @Column(name = "v_time")
    public String getV_time() {
        return v_time;
    }

    public void setV_time(String v_time) {
        this.v_time = v_time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vedio vedio = (Vedio) o;

        if (v_id != vedio.v_id) return false;
        if (v_name != null ? !v_name.equals(vedio.v_name) : vedio.v_name != null) return false;
        if (v_price != null ? !v_price.equals(vedio.v_price) : vedio.v_price != null) return false;
        if (v_image != null ? !v_image.equals(vedio.v_image) : vedio.v_image != null) return false;
        if (v_time != null ? !v_time.equals(vedio.v_time) : vedio.v_time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = v_id;
        result = 31 * result + (v_name != null ? v_name.hashCode() : 0);
        result = 31 * result + (v_price != null ? v_price.hashCode() : 0);
        result = 31 * result + (v_image != null ? v_image.hashCode() : 0);
        result = 31 * result + (v_time != null ? v_time.hashCode() : 0);
        return result;
    }
}
