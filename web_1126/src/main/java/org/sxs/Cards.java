package org.sxs;

/**
 * @ClassName: Cards
 * @Description: TODO
 * @Author: SXS
 * @date: 2020/11/26 16:02
 * @Version: V1.0
 */
public class Cards {
    private int id;
    private String name;
    private String card;
    private String pwd;

    public Cards() {
    }

    //登录构造方法
    public Cards(String card, String pwd) {
        this.card = card;
        this.pwd = pwd;
    }

    //注册构造方法
    public Cards(String name, String card, String pwd) {
        this.name = name;
        this.card = card;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


    @Override
    public String toString() {
        return "Cards{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Cards='" + card + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}

