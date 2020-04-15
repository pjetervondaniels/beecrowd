package main

import "fmt"

func main() {
	var (
		fNumber int
		nHoras  float64
		vHora   float64
	)

	fmt.Scan(&fNumber, &nHoras, &vHora)
	fmt.Println("NUMBER =", fNumber)
	fmt.Printf("SALARY = U$ %0.2f\n", nHoras*vHora)
}
