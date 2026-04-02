class ContaBancaria:
    def __init__(self, nome, conta, agencia, saldo):
        self.nome = nome
        self.conta = conta
        self.agencia = agencia
        self.saldo = saldo

    def exibir_dados(self):
        print("-" * 30)
        print("      DADOS DO CLIENTE")
        print("-" * 30)
        print(f"Sr(a): {self.nome}")
        print(f"Número da Conta Corrente: {self.conta}")
        print(f"Número da Agência Bancária: {self.agencia}")
        print(f"O valor do saldo atual é de R${self.saldo:,.2f}".replace(",", "X").replace(".", ",").replace("X", "."))
        print("-" * 30)

# Criando a instância com os dados fornecidos
cliente = ContaBancaria("ClienteMaster", "5555", "4567", 40000.00)