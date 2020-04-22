package main

import "fmt"

func areaTriang(a, c float64) float64 {
	return (a * c) / 2
}

func areaCircle(c float64) float64 {
	return (3.14159 * (c * c))
}
func areaTrapz(a, b, c float64) float64 {
	return ((a + b) * c) / 2
}
func areaSquad(b float64) float64 {
	return b * b
}
func areaRecta(a, b float64) float64 {
	return a * b
}

func main() {
	var a float64
	var b float64
	var c float64
	fmt.Scanf("%f %f %f \n", &a, &b, &c)
	fmt.Printf("TRIANGULO: %.3f\n", areaTriang(a, c))
	fmt.Printf("CIRCULO:  %.3f\n", areaCircle(c))
	fmt.Printf("TRAPEZIO: %.3f\n", areaTrapz(a, b, c))
	fmt.Printf("QUADRADO:  %.3f\n", areaSquad(b))
	fmt.Printf("RETANGULO:  %.3f\n", areaRecta(a, b))
}
