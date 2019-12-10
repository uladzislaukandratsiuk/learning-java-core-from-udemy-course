package com.challenge.stock.list;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityInStock;
    private int reserved = 0;

    public StockItem(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int availableQuantity() {
        return this.quantityInStock - this.reserved;
    }

    public int reserveStock(int quantity) {
        if (quantity > 0 && quantity <= (this.quantityInStock - this.reserved)) {
            this.reserved += quantity;
            return quantity;
        }
        return 0;
    }

    public int unReserveStock(int quantity) {
        if (quantity > 0 && quantity <= this.reserved) {
            this.reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityInStock + quantity;
        if (newQuantity >= 0) {
            this.quantityInStock = newQuantity;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem item) {
        if (this == item) {
            return 0;
        }

        if (item != null) {
            return this.name.compareTo(item.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " price: " + this.price + " reserved: " + this.reserved ;
    }
}
