finalizar = "nao"
candidato_X = 0
candidato_Y = 0
candidato_Z = 0
brancos = 0

def contaVoto():
    if voto == 889:
        candidato_X += 1
    elif voto == 847:
        candidato_Y += 1
    elif voto == 515:
        candidato_Z += 1
    elif voto == 0:
        brancos += 1
    else:
        brancos += 1


def vencedor():
    if candidato_X > candidato_Y and candidato_X > candidato_Z:
        return f'O Candidato X venceu com {candidato_X} votos'
    elif candidato_Y > candidato_X and candidato_Y > candidato_Z:
        return f'O Candidato Y venceu com {candidato_Y} votos'
    elif candidato_Z > candidato_X and candidato_Z > candidato_Y:
        return f'O Candidato Z venceu com {candidato_Z} votos'


# programa principal:
while finalizar == "nao":

    try:
        voto = int(input('digite o numero do seu candidato: '))
    except(KeyError, ValueError):
        voto = int(input("seu voto não pode ser uma letra, digite um numero: "))
        contaVoto()
        finalizar = str(input('para finalizar a eleicao digite "sim"\npara prosseguir digite "nao"\n'))

        continue

    contaVoto()

    finalizar = str(input('para finalizar a eleicao digite "sim"\npara prosseguir digite "nao"\n'))

print(f'\ncandidato Z teve: {candidato_Z} votos\ncandidato Y teve: {candidato_Y} votos\n'
      f'candidato X teve: {candidato_X} votos\nBrancos e Nulos: {brancos} votos\n\n {vencedor()} ')
