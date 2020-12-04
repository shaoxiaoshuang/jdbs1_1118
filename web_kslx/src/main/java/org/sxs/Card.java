package org.sxs;

/**
 * @ClassName: Card
 * @Description: 实体类
 * @Author: SXS
 * @date: 2020/11/26 14:55
 * @Version: V1.0
 */
public class Card {
    private int id;
    private String name;
    private String card;
    private String pwd;

    public Card() {
    }

    public Card(int id, String name, String card, String pwd) {
        this.id = id;
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
        return "Card{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", card='" + card + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}

