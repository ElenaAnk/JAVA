package org.example.sem.cw;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Vector {
    private int x;
    private int y;
    private int z;

    /**
     *
     * @return Длина вектора
     */
    public double lenghtVector(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    /**
     *
     * @param vector2 вектор для умножения
     * @return скалярное произведение
     */
    public double scalar(Vector vector2) {
        return x*vector2.x +y*vector2.y+z*vector2.z;
    }

    /**
     *
     * @param vector2 вектор для вычислений
     * @return векторное произведение
     */
    public Vector vectorProduct(Vector vector2) {
        return new Vector(
                y * vector2.z - z * vector2.y,
                z * vector2.x - x * vector2.z,
                x * vector2.y - y * vector2.x);
    }

    /**
     *
     * @param vector2 вектор для вычислений
     * @return угол между векторами (или косинус угла)
     */
    public double cos(Vector vector2) {
        return scalar(vector2)/(lenghtVector()*vector2.lenghtVector());
    }

    /**
     *
     * @param vector2 вектор для вычислений
     * @return сумма векторов
     */
    public Vector sumVectors(Vector vector2) {
        return new Vector(
                x+vector2.x,
                y+vector2.y,
                z+vector2.z);
    }

    /**
     *
     * @param vector2 вектор для вычислений
     * @return разность векторов
     */
    public Vector diffVectors(Vector vector2) {
        return new Vector(
                x-vector2.x,
                y-vector2.y,
                z-vector2.z);
    }
}
