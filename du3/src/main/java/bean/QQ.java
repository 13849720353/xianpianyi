package bean;

import javax.persistence.*;

@Entity
@Table(name = "t_qq", schema = "网上销售", catalog = "")
public class QQ {
    private int q_id;
    private String q_name;
    private Integer q_price;
    private String q_image;
    private String qTime;

    @Id
    @Column(name = "q_id")
    public int getQ_id() {
        return q_id;
    }

    public void setQ_id(int q_id) {
        this.q_id = q_id;
    }

    @Basic
    @Column(name = "q_name")
    public String getQ_name() {
        return q_name;
    }

    public void setQ_name(String q_name) {
        this.q_name = q_name;
    }

    @Basic
    @Column(name = "q_price")
    public Integer getQ_price() {
        return q_price;
    }

    public void setQ_price(Integer q_price) {
        this.q_price = q_price;
    }

    @Basic
    @Column(name = "q_image")
    public String getQ_image() {
        return q_image;
    }

    public void setQ_image(String q_image) {
        this.q_image = q_image;
    }

    @Basic
    @Column(name = "q_time")
    public String getqTime() {
        return qTime;
    }

    public void setqTime(String qTime) {
        this.qTime = qTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QQ qq = (QQ) o;

        if (q_id != qq.q_id) return false;
        if (q_name != null ? !q_name.equals(qq.q_name) : qq.q_name != null) return false;
        if (q_price != null ? !q_price.equals(qq.q_price) : qq.q_price != null) return false;
        if (q_image != null ? !q_image.equals(qq.q_image) : qq.q_image != null) return false;
        if (qTime != null ? !qTime.equals(qq.qTime) : qq.qTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = q_id;
        result = 31 * result + (q_name != null ? q_name.hashCode() : 0);
        result = 31 * result + (q_price != null ? q_price.hashCode() : 0);
        result = 31 * result + (q_image != null ? q_image.hashCode() : 0);
        result = 31 * result + (qTime != null ? qTime.hashCode() : 0);
        return result;
    }
}
