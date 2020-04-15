package main

import (
	"fmt"
	"math"
)

func main() {
	var r float64
	const pi float64 = 3.14159

	fmt.Scanf("%f", &r)
	fmt.Printf("A=%0.4f\n", math.Pow(r, 2)*pi)
}
