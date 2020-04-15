package main

import "fmt"

func main() {
	var n1, n2, n3 float64

	fmt.Scan(&n1, &n2, &n3)

	n1 = n1 * 2
	n2 = n2 * 3
	n3 = n3 * 5

	fmt.Printf("MEDIA = %0.1f\n", (n1+n2+n3)/10)
}
