import pandas as pd

df = pd.read_csv('notas_alunos.csv')
df['media'] = df['nota_1']/2 + df['nota_2']/2
df.loc[(df["faltas"] <= 5) & (df['media'] >= 7), 'status'] = "aprovado"
df.loc[(df["faltas"] > 5) | (df['media'] < 7), 'status'] = "reprovado"

print(df[['aluno', 'media', 'faltas', 'status']])

print('\nmaior numero de faltas: '+str(df["faltas"].max()))

print('media geral: '+str(df["media"].median()))

print('media mais alta: '+str(df["media"].max()))

df.to_csv('alunos_situacao.csv', index=False)
