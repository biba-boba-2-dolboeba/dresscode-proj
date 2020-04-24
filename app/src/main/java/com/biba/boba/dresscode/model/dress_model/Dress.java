package com.biba.boba.dresscode.model.dress_model;

import android.graphics.drawable.Drawable;

public class Dress
{
    private enum DressClasses
    {
        SHIRT("shirt"),
        T_SHIRT("t-shirt"),
        PANTS("pants"),
        JACKET("jacket"),
        HAT("hat");

        DressClasses(String className)
        {

        }

        public static DressClasses getInstance(String className)
        {
            switch (className)
            {
                case "t-shirt":
                    return T_SHIRT;
                case "pants":
                    return PANTS;
                case "jacket":
                    return JACKET;
                case "hat":
                    return HAT;
                default: return SHIRT;
            }

        }
    }

    private int weight;
    private int price;
    private DressBrands dressBrand;
    private DressClasses dressClass;
    private Drawable image;
    private String color;
    private String name;

    Dress()
    {
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public DressBrands getDressBrand() {
        return dressBrand;
    }

    public DressClasses getDressClass() {
        return dressClass;
    }

    public Drawable getImage() {
        return image;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public static Builder newBuilder()
    {
        return new Dress().new Builder();
    }

    public class Builder
    {
        private  Builder(){}

        public Builder setWeight(int weight)
        {
            if (weight < 0)
                weight = 0;

            Dress.this.weight = weight;

            return this;
        }

        public Builder setPrice(int price)
        {
            if (price < 0)
                price = 0;

            Dress.this.price = price;

            return this;
        }

        public Builder setDressBrand(DressBrands dressBrand)
        {
            Dress.this.dressBrand = dressBrand;

            return this;
        }

        public Builder setDressClass(String className)
        {
            Dress.this.dressClass = DressClasses.getInstance(className);

            return this;
        }

        public Builder setImage(Drawable image)
        {
            Dress.this.image = image;

            return this;
        }

        public Builder setColor(String color)
        {
            Dress.this.color = color;

            return this;
        }

        public Builder setName(String name)
        {
            Dress.this.name = name;

            return this;
        }

        public Dress build()
        {
            return Dress.this;
        }

    }
}
