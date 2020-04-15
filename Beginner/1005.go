package main

import (
	"fmt"
)

func main() {
	var n, m float64

	fmt.Scanf("%f\n%f", &n, &m)
	n = n * 3.5
	m = m * 7.5
	fmt.Printf("MEDIA = %0.5f\n", (n+m)/11)
}
