def main():
    numero = 5
    fatorial = 1

    for i in range(1, numero + 1):
        fatorial *= i

    print("O fatorial de", numero, "é:", fatorial)

if __name__ == "__main__":
    main()
