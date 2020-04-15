package main

import "fmt"

func main() {
	var nome string
	var salario float64
	var vendas float64

	fmt.Scan(&nome, &salario, &vendas)
	fmt.Printf("TOTAL = R$ %0.2f\n", salario+(vendas*0.150))
}
