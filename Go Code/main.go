package main

import (
	"fmt"
	"math/rand"
	"strconv"
)

func main() {
	var randomNum = rand.Intn(10)
	for true {
		fmt.Println("Guess a number between 0 to 9:")
		var input string
		fmt.Scanln(&input)
		num, err := strconv.Atoi(input)
		if err != nil {
			fmt.Println("Entered number is invalid!")
		}
		if num == randomNum {
			fmt.Println("That's correct! You won :)")
			break
		} else {
			fmt.Println("You're wrong!")
		}
	}
}