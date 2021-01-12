package com.itstyle.doc.threadSafe.interfacepackage;

/**
 *
 */
public class SellTicket extends ParentTickets {

    /**
     * 默认值100
     */
    private Integer totalTicket = 100;

    public void setTotalTicket(Integer totalTicket) {
        this.totalTicket = totalTicket;
    }

    @Override
    public void run() {
        System.out.println("卖出第" + totalTicket + "");
        totalTicket--;
    }
}
