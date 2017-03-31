package com.cput.tristan.BadPrinciples;

/**
 * This class shows violation of the Seven Software Design Principles
 */
public class Creature
{

    public String creatureType;
    public String cry;
    public String defense;
    public double height;
    public double weight;
    public int noOfLegs;

    Creature()
    {

    }

    Creature(String creatureType, String cry, String defense, double height, double weight, int noOfLegs) {
        this.creatureType = creatureType;
        this.cry = cry;
        this.defense = defense;
        this.height = height;
        this.weight = weight;
        this.noOfLegs = noOfLegs;
    }

    public String fightFrightOrFlight(String response)
    {
        if(response == "fight")
        {
            return defense;
        }
        else
            if(response == "fright")
            {
                return cry;
            }
            else
            {
                return String.format("Run with %d legs", noOfLegs);
            }
    }

    public String getCreatureType() {
        return creatureType;
    }

    public void setCreatureType(String creatureType) {
        this.creatureType = creatureType;
    }

    public String getCry() {
        return cry;
    }

    public void setCry(String cry) {
        this.cry = cry;
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

}
