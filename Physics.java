import javax.swing.*;

public class Physics {
    private double mass;
    private double velocity;

    public Physics(double mass, double velocity) {
        this.mass = mass;
        this.velocity = velocity;
    }
    public double kineticEnergy() {
        return 0.5 * mass * velocity * velocity;
    }
    public double potentialEnergy(double height, double gravity) {
        return mass * gravity * height;
    }
    public double work(double force, double displacement){
        return force * displacement;
    }
    public double power(double work, double time){
        return work / time;
    }
    public double force(double mass, double acceleration){
        return mass * acceleration;
    }
    public static void main(String[]args){
        double mass = Double.parseDouble(JOptionPane.showInputDialog("Enter mass in kg:"));
        double velocity = Double.parseDouble(JOptionPane.showInputDialog("Enter velocity in m/s:"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height in m:"));
        double gravity = Double.parseDouble(JOptionPane.showInputDialog("Enter gravity in m/s^2:"));
        double force = Double.parseDouble(JOptionPane.showInputDialog("Enter force in N:"));
        double displacement = Double.parseDouble(JOptionPane.showInputDialog("Enter displacement in m:"));
        double time = Double.parseDouble(JOptionPane.showInputDialog("Enter time in s:"));
        double acceleration = Double.parseDouble(JOptionPane.showInputDialog("Enter acceleration in m/s^2:"));

        Physics physics = new Physics(mass, velocity);
        double kineticEnergy = physics.kineticEnergy();
        double potentialEnergy = physics.potentialEnergy(height, gravity);
        double work = physics.work(force, displacement);
        double power = physics.power(work, time);
        double forceResult = physics.force(mass, acceleration);

        String message = "Kinetic energy: " + kineticEnergy + " J\n" +
                "Potential energy: " + potentialEnergy + " J\n" +
                "Work: " + work + " J\n" +
                "Power: " + power + " W\n" +
                "Force: " + forceResult + " N";



        JOptionPane.showMessageDialog(null, message, "Results", JOptionPane.PLAIN_MESSAGE);


    }
}