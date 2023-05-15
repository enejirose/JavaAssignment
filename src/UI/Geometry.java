package UI;

public class Geometry extends Physics {
    float Energy(float length,float Breadth){
        return Divide2(length, Breadth);
    }
    float PEnergy(float mass,float gravity,float height){
        return multiply1(mass, gravity, height);
    }
    float Force(float mass,float acceleration){
        return multiply(mass, acceleration);
    }
    float Acceleration(float force,float mass){
        return Divide(force, mass);
    }
    float WorkDone(float force,float distance){
        return multiply(force, distance);
    }
    public double Density(double mass, double volume){
        return Divide(mass, volume);
    }
}
