package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "users_car")
public class Car {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @Column (name = "model")
    private String model;

    @Column (name = "series")
    private int series;

    @OneToOne(mappedBy="car")
    private User user;


    public Car () {
    }

    public Car (String model, int series) {
        this.model = model;
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
