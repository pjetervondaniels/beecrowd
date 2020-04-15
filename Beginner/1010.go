package main

import (
	"fmt"
)

func main() {

	var (
		quantidade int
		preco      float32
		precoTotal float32
		z          int
	)

	for i := 0; i < 2; i++ {
		fmt.Scanln(&z, &quantidade, &preco)
		precoTotal += (preco * float32(quantidade))
	}

	fmt.Printf("VALOR A PAGAR: R$ %0.2f\n", precoTotal)
}
