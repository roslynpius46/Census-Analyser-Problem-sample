package com.bridgelabz.censusanalyser;

/**
 * @desc Represents a data model for state census information from a CSV file.
 */
public class CSVStateCensus {

    private String state;
    private long population;
    private long area;
    private int populationDensity;

    /**
     * @desc Default constructor.
     */
    public CSVStateCensus() {

    }

    /**
     * @desc Parameterized constructor to initialize CSVStateCensus with data.
     * @param state            The state name.
     * @param population       The population of the state.
     * @param area             The area of the state.
     * @param populationDensity The population density of the state.
     */
    public CSVStateCensus(String state, long population, long area, int populationDensity) {
        this.state = state;
        this.population = population;
        this.area = area;
        this.populationDensity = populationDensity;
    }


    /**
     * @desc Get the state name.
     * @return The state name.
     */
    public String getState() {
        return state;
    }

    /**
     * @desc Set the state name.
     * @param state The state name.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @desc Get the population of the state.
     * @return The population of the state.
     */
    public long getPopulation() {
        return population;
    }

    /**
     * @desc Set the population of the state.
     * @param population The population of the state.
     */
    public void setPopulation(long population) {
        this.population = population;
    }

    /**
     * @desc Get the area of the state.
     * @return The area of the state.
     */
    public long getArea() {
        return area;
    }

    /**
     * @desc Set the area of the state.
     * @param area The area of the state.
     */
    public void setArea(long area) {
        this.area = area;
    }

    /**
     * @desc Get the population density of the state.
     * @return The population density of the state.
     */
    public int getPopulationDensity() {
        return populationDensity;
    }

    /**
     * @desc Set the population density of the state.
     * @param populationDensity The population density of the state.
     */
    public void setPopulationDensity(int populationDensity) {
        this.populationDensity = populationDensity;
    }
}
