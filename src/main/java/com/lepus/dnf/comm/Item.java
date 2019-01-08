package com.lepus.dnf.comm;

/**
 *
 */
public class Item {

    public static final int DEFAULT_ATTRS_LEN = 13;

    public static Item NEW(){
		return new Item();
    }

    public static Item NEW(String name){
        Item item = Item.NEW();
        item.name = name;
        return item;
    }

    private String name;

    private int[] attrs = new int[DEFAULT_ATTRS_LEN];

    /**
     * 0/inte,1/intePrec,2/yell,3/whit,4/crit
     * 5/yellAdd,6/whitAdd,7/critAdd,8/stre,9/inde
     * 10/thre,11/fina,12/skil
     */
    public Item setAttr(int index, int attr){
        if(index < 0 || index > DEFAULT_ATTRS_LEN) {
            System.out.println("index out of bounds");
            return this;
        }
        if(attr < 0) {
            System.out.println("attr is negative");
            return this;
        }
        attrs[index] = attr;
        return this;
    }

    public Item addAttr(int index, int attr){
	    if(index < 0 || index > DEFAULT_ATTRS_LEN) {
		    System.out.println("index out of bounds");
		    return this;
	    }
	    if(attr < 0) {
		    System.out.println("attr is negative");
		    return this;
	    }
	    attrs[index] += attr;
	    return this;
    }

    public int getAttr(int index){
        if(index < 0 || index > DEFAULT_ATTRS_LEN) {
            System.out.println("index out of bounds");
            return 0;
        }
        return attrs[index];
    }

    public double getAttrDouble(int index){
    	int attr = getAttr(index);
    	return attr * 1d;
    }

}
