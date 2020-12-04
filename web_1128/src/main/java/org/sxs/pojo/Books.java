package org.sxs.pojo;

/**
 * @ClassName: Books
 * @Description: TODO
 * @Author: SXS
 * @date: 2020/11/28 9:08
 * @Version: V1.0
 */
public class Books {
    //   属性均小写
    private int BID;
    private String BOOKNAME;
    private String B_PRICE;
    private String IMAGE;
    private String STOCK;


    //无参构造
    public Books() {
    }

    //有参构造

    //登录方法
    public Books(String BOOKNAME, String STOCK) {
        this.BOOKNAME = BOOKNAME;
        this.STOCK = STOCK;
    }

    //注册方法
    public Books(String BOOKNAME, String b_PRICE, String IMAGE, String STOCK) {
        this.BOOKNAME = BOOKNAME;
        B_PRICE = b_PRICE;
        this.IMAGE = IMAGE;
        this.STOCK = STOCK;
    }

    public Books(int BID, String BOOKNAME, String b_PRICE, String IMAGE, String STOCK) {
        this.BID = BID;
        this.BOOKNAME = BOOKNAME;
        B_PRICE = b_PRICE;
        this.IMAGE = IMAGE;
        this.STOCK = STOCK;
    }


    //封装
    public int getBID() {
        return BID;
    }

    public void setBID(int BID) {
        this.BID = BID;
    }

    public String getBOOKNAME() {
        return BOOKNAME;
    }

    public void setBOOKNAME(String BOOKNAME) {
        this.BOOKNAME = BOOKNAME;
    }

    public String getB_PRICE() {
        return B_PRICE;
    }

    public void setB_PRICE(String b_PRICE) {
        B_PRICE = b_PRICE;
    }

    public String getIMAGE() {
        return IMAGE;
    }

    public void setIMAGE(String IMAGE) {
        this.IMAGE = IMAGE;
    }

    public String getSTOCK() {
        return STOCK;
    }

    public void setSTOCK(String STOCK) {
        this.STOCK = STOCK;
    }


    //显示数据
    @Override
    public String toString() {
        return "Books{" +
                "BID=" + BID +
                ", BOOKNAME='" + BOOKNAME + '\'' +
                ", B_PRICE='" + B_PRICE + '\'' +
                ", IMAGE='" + IMAGE + '\'' +
                ", STOCK='" + STOCK + '\'' +
                '}';
    }
}

