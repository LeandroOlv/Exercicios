def main():
    ano = 2024

    eh_bissexto = (ano % 4 == 0 and ano % 100 != 0) or (ano % 400 == 0)

    if eh_bissexto:
        print("O ano é bissexto.")
    else:
        print("O ano não é bissexto.")

if __name__ == "__main__":
    main()
 