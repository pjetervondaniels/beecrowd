package main

import (
	"fmt"
	"math"
)

func calculateVolumn(r float64) float64 {
	return (4.0 / 3.0) * 3.14159 * math.Pow(r, 3)
}

func main() {
	var r float64
	fmt.Scanf("%f\n", &r)
	var volumn float64
	fmt.Printf("VOLUME = %.3f \n", calculateVolumn(r))
}
