# Obtém uma lista de verbos disponíveis no PowerShell
Get-Verb

# Obtém informações sobre o comando Get-Process
Get-Command -Name Get-Process

# Obtém todos os comandos relacionados a processos
Get-Command -Name *-Process

# Obtém todos os comandos que começam com o verbo 'Get'
Get-Command -Verb 'Get'

# Obtém todos os comandos que têm um nome que começa com 'U'
Get-Command -Noun U*

# Obtém todos os comandos com o verbo 'Get' e o nome que começa com 'U'
Get-Command -Verb Get -Noun U*

# Obtém os cinco primeiros comandos e exibe apenas os nomes e a fonte (origem)
Get-Command | Select-Object -First 5 -Property Name, Source

# Obtém informações sobre o objeto retornado pelo comando Get-Process
Get-Process | Get-Member

# Obtém ajuda sobre o comando Get-Process
Get-Help -Name Get-Process

# Obtém ajuda sobre o comando 'dir' (alias para Get-ChildItem)
Get-Help -Name dir

# Obtém ajuda sobre o comando 'cat' (alias para Get-Content) exibindo todas as informações disponíveis
help -Name cat –Full

# Obtém ajuda sobre o comando Get-Command exibindo todas as informações disponíveis em uma janela de grade (Out-GridView)
help Get-Command -Full | Out-GridView
